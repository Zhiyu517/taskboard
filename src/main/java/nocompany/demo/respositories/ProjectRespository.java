package nocompany.demo.respositories;

import nocompany.demo.domain.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRespository extends CrudRepository<Project, Long> {
    @Override
    Iterable<Project> findAllById(Iterable<Long> iterable);
}
