package de.ehmkah.projects.springexamlples.persistence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DependencyRepositoryTest {

    @Autowired
    DependencyRepository sut;

    @Test
    void assureWriteDependecyWorks() {
        // GIVEN
        // WHEN
        Dependency dependency = new Dependency("de.artifakt1", "de.artifakt2", "dependsOn");
        sut.save(dependency);
        // THEN
        Assertions.assertEquals(1, sut.count());
    }
}