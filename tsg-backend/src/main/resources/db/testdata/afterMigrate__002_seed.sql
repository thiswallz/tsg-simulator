

insert into seed (id, name, description, data) values (${seed1Id}, 'Seed ${seed1Id}', 'description', '${seed1Data}');

insert into seed_nodes (seed_id, node_key, node_data) values (${seed1Id}, '${seed1Node1Key}', '${seed1Node1Data}');

insert into seed_nodes (seed_id, node_key, node_data) values (${seed1Id}, '${seed1Node2Key}', '${seed1Node2Data}');
