package de.ehmkah.projects.springexamlples.persistence;

import org.springframework.data.repository.CrudRepository;

public interface DependencyRepository extends CrudRepository<Dependency, DependencyId> {
}
