psql:
	docker exec -ti -u postgres codechallenge_postgres_1 psql -U codechallengeapp codechallenge

updb:
	docker-compose up -d postgres

run:
	scripts/run.sh

init:
	scripts/init.sh
