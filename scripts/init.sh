#!/usr/bin/env bash

docker exec -u postgres codechallenge_postgres_1 psql -U codechallengeapp codechallenge -c "insert into data (content) select left(md5(random()::text),6)from generate_series(1, 16777216) s(i);"
