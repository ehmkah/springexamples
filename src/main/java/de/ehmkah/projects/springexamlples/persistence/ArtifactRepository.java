package de.ehmkah.projects.springexamlples.persistence;

import org.springframework.data.repository.CrudRepository;

/**
 * Used for reading and storing.
 */
public interface ArtifactRepository extends CrudRepository<Artifact, String> {
}
