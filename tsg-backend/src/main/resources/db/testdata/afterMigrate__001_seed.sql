-- truncate all tables
truncate table seed CASCADE;

-- reset sequences
select setval('seed_id_seq', 1, true);
select setval('seed_nodes_id_seq', 1, true);
