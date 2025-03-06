package at.ribinin.model;

import at.ribinin.Consts;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = Consts.EIS_TABLE_PREFIX + "LESSONEIS")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Referenz auf Subject
    @ManyToOne() // Add cascade here
    private Subject subject;

    // Referenz auf Hitclass
    @ManyToOne() // Add cascade here
    private Hitclass hitclass;

    // Ein Unterricht kann mehrere Lehrer haben
    // und umgekehrt kann ein Lehrer mehrere Unterrichtseinheiten abdecken
    @ManyToMany
    @JoinTable(
            name = "lesson_teacher",
            joinColumns = @JoinColumn(name = "lesson_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id")
    )
    private Set<Teacher> teachers = new HashSet<>();
}

