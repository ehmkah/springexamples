package de.ehmkah.projects.springexamlples.service;

import de.ehmkah.projects.springexamlples.persistence.ArtifactRepository;
import de.ehmkah.projects.springexamlples.persistence.DependencyRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DummyServiceTest {

    @Autowired
    DummyService sut;

    @Autowired
    ArtifactRepository artifactRepository;

    @Autowired
    DependencyRepository dependencyRepository;

    @BeforeEach
    void setUp() {
        dependencyRepository.deleteAll();
        artifactRepository.deleteAll();
    }

    @Test
    void assureServiceWritesThrough() {
        // GIVEN
        // WHEN
        sut.write();
        // THEN
        Assertions.assertEquals(2, artifactRepository.count());
        Assertions.assertEquals(1, dependencyRepository.count());
    }
}