package nocompany.demo.domain;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
public class project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectName;
    private String projectIdentifer;
    private String description;
    private Date startDate;
    private Date endDate;

    private Date createAd;
    private Date updateAt;

    public project() {

    }

    @PrePersist
    protected void onCreate() {
        this.createAd = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updateAt = new Date();
    }
}
