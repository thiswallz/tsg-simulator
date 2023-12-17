-- truncate all tables
truncate table seed;

-- reset sequences
select setval('seed_id_seq', 1, true);
