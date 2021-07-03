CREATE table artifact
(
    artifact_name varchar(255),
    PRIMARY KEY (artifact_name)
);

CREATE table dependency
(
    artifact1   varchar(255),
    artifact2   varchar(255),
    direction   varchar(255),
    description varchar(255),

    PRIMARY KEY (artifact1, artifact2, direction)
);