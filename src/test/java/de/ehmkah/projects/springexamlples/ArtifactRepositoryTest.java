package de.ehmkah.projects.springexamlples;

import de.ehmkah.projects.springexamlples.persistence.Artifact;
import de.ehmkah.projects.springexamlples.persistence.ArtifactRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArtifactRepositoryTest {

    @Autowired
    ArtifactRepository sut;

    @BeforeEach
    void setUp() {
        sut.deleteAll();
    }

    @Test
    void assuresSaveIsWorking() {
        // GIVEN
        Artifact givenArtifact = new Artifact();
        givenArtifact.setGroupId("de.ehmkah");
        givenArtifact.setArtifactId("springexample");

        // WHEN
        sut.save(givenArtifact);

        // THEN
        long actualCount = sut.count();
        Assertions.assertEquals(1, actualCount);
    }
}
