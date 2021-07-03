package de.ehmkah.projects.springexamlples.persistence;

import javax.persistence.*;

@Entity
@Table(name = "artifact")
public class Artifact {

    @Id
    @Column(name = "artifact_name")
    private String artifactName;


    public void setArtifactName(String artifactId) {
        this.artifactName = artifactId;
    }
}
