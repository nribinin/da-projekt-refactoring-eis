package at.ribinin.dto;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateTeacherDto {
    private String name;
    private List<Long> lessonIds;
}

