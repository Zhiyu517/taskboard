package nocompany.demo.services;

import nocompany.demo.domain.Project;
import nocompany.demo.respositories.ProjectRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRespository projectRespository;

    public Project saveOrUpdateProject(Project project) {

        //Logic
        return projectRespository.save(project);
    }
}
