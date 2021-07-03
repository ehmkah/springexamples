#!/bin/sh
docker-compose down
rm -rf mysql_data
docker-compose up -d db