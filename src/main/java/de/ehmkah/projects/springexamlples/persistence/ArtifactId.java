package de.ehmkah.projects.springexamlples.persistence;

import java.io.Serializable;
import java.util.Objects;

public class ArtifactId implements Serializable {

    static final long serialVersionUID = 1L;

    private String groupId;

    private String artifactId;

    public ArtifactId() {
    }

    public ArtifactId(String groupId, String artifactId) {
        this.groupId = groupId;
        this.artifactId = artifactId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArtifactId that = (ArtifactId) o;
        return Objects.equals(groupId, that.groupId) && Objects.equals(artifactId, that.artifactId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, artifactId);
    }

    public String getGroupId() {
        return groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }
}
