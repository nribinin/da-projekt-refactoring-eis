package at.ribinin.repository;
import at.ribinin.model.Hitclass;
import at.ribinin.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HitclassRepository extends JpaRepository<Hitclass, Long> {
    Optional<Hitclass> findByName(String name);
    List<Hitclass> findAllByKlassenvorstand(Teacher teacher);
}