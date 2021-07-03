package de.ehmkah.projects.springexamlples.service;

import de.ehmkah.projects.springexamlples.persistence.Artifact;
import de.ehmkah.projects.springexamlples.persistence.ArtifactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DummyService {

    @Autowired
    ArtifactRepository artifactRepository;

    /**
     * Writes in the database some stuff
     */
    public void write() {
        Artifact artifact = new Artifact();
        artifact.setArtifactName("krausse");
        artifactRepository.save(artifact);

    }
}
