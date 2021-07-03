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
        var artifact1 = new Artifact("artifact1");
        artifactRepository.save(artifact1);
        var artifact2 = new Artifact("artifact2");
        artifactRepository.save(artifact2);

        Dependency dependency = new Dependency("artifact1", "artifact2", "dependsOn");

        dependencyRepository.save(dependency);

    }
}
