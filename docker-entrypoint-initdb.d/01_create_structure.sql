CREATE table artifact
(
    groupid    varchar(255),
    artifactid varchar(255),
    PRIMARY KEY (groupid, artifactid)
);

CREATE table dependency
(
    artifact1   varchar(255),
    artifact2   varchar(255),
    direction   varchar(255),
    description varchar(255),

    PRIMARY KEY (artifact1, artifact2, direction)
);