package at.ribinin.repository;


import at.ribinin.model.Ampel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AmpelRepository extends JpaRepository<Ampel, Long> {

    List<Ampel> findByStudentId(Long studentId);
    Optional<Ampel> findByLessonIdAndStudentIdAndTeacherId(Long lessonId, Long studentId, Long teacherId);
    List<Ampel> findByStudentStudentKennzahl(String studentKennzahl);
    List<Ampel> findByTeacherId(Long teacherId);
    Optional<Ampel> findByTeacherIdAndStudentId(Long teacherId, Long studentId);
    List<Ampel> findAllByStudentId(Long studentId);

}
