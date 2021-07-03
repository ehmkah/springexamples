package de.ehmkah.projects.springexamlples.persistence;

import java.io.Serializable;
import java.util.Objects;

public class DependencyId implements Serializable {

    static final long serialVersionUID = 1L;

    String artifact1;

    String artifact2;

    String direction;

    public DependencyId() {
    }

    public DependencyId(String artifact1, String artifact2, String direction) {
        this.artifact1 = artifact1;
        this.artifact2 = artifact2;
        this.direction = direction;
    }

    public String getArtifact1() {
        return artifact1;
    }

    public void setArtifact1(String artifakt1) {
        this.artifact1 = artifakt1;
    }

    public String getArtifact2() {
        return artifact2;
    }

    public void setArtifact2(String artifakt2) {
        this.artifact2 = artifakt2;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DependencyId that = (DependencyId) o;
        return Objects.equals(artifact1, that.artifact1) && Objects.equals(artifact2, that.artifact2) && Objects.equals(direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artifact1, artifact2, direction);
    }
}
