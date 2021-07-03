package de.ehmkah.projects.springexamlples.persistence;

import javax.persistence.*;

@Entity
@Table(name = "artifact")
@IdClass(ArtifactId.class)
public class Artifact {

    @Id
    @Column(name = "groupid")
    private String groupId;

    @Id
    @Column(name = "artifactid")
    private String artifactId;


    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }
}
