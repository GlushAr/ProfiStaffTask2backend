package staff.profi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import staff.profi.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
