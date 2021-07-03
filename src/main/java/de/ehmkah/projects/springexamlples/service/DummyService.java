package de.ehmkah.projects.springexamlples.service;

import de.ehmkah.projects.springexamlples.persistence.Artifact;
import de.ehmkah.projects.springexamlples.persistence.ArtifactRepository;
import de.ehmkah.projects.springexamlples.persistence.Dependency;
import de.ehmkah.projects.springexamlples.persistence.DependencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DummyService {

    @Autowired
    ArtifactRepository artifactRepository;


    @Autowired
    DependencyRepository dependencyRepository;

    /**
     * Writes in the database some stuff
     */
    public void write() {
        Artifact artifact = new Artifact();
        artifact.setArtifactName("krausse");
        artifactRepository.save(artifact);

        Dependency dependency = new Dependency("artifact1", "artifact2", "dependsOn");

        dependencyRepository.save(dependency);

    }
}
