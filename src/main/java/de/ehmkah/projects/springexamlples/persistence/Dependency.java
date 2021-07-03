package de.ehmkah.projects.springexamlples.persistence;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(DependencyId.class)
public class Dependency {

    @Id
    private String artifact1;

    @Id
    private String artifact2;

    @Id
    private String direction;

    public Dependency() {
    }

    public Dependency(String artifakt1, String artifact2, String direction) {
        this.artifact1 = artifakt1;
        this.artifact2 = artifact2;
        this.direction = direction;
    }

    public String getArtifact1() {
        return artifact1;
    }

    public String getArtifact2() {
        return artifact2;
    }

    public String getDirection() {
        return direction;
    }
}
