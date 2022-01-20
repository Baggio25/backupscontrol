/*STATE*/
INSERT INTO tb_state (name, uf) VALUES ('PARANÁ', 'PR');
INSERT INTO tb_state (name, uf) VALUES ('SANTA CATARINA', 'SC');
INSERT INTO tb_state (name, uf) VALUES ('RIO GRANDE DO SUL', 'RS');
INSERT INTO tb_state (name, uf) VALUES ('SÃO PAULO', 'SP');
INSERT INTO tb_state (name, uf) VALUES ('MATO GROSSO', 'MT');

/*CITY*/
INSERT INTO tb_city (name, state_id) VALUES ('Dois Vizinhos', 1);
INSERT INTO tb_city (name, state_id) VALUES ('Francisco Beltrão', 1);
INSERT INTO tb_city (name, state_id) VALUES ('Pato Branco', 1);
INSERT INTO tb_city (name, state_id) VALUES ('Quedas do Iguaçu', 1);

/*CLIENT*/
INSERT INTO tb_client (id_centrun, fantasy, corporate_name, city_id) VALUES ('606', 'TECSUI', 'TECSUI PRODUTOS AGROPECUARIOS LTDA', 4);

/*PACKAGE*/
INSERT INTO tb_package (number, description, opening_date, end_date, package_status) VALUES ('243', 'PACOTE 243', TIMESTAMP WITH TIME ZONE '2021-12-22T03:00:00Z', null, 'PENDING');

/*RELEASE*/
INSERT INTO tb_release (version_number, delivery_date, release_status, package_id) VALUES ('6.0.30.35', TIMESTAMP WITH TIME ZONE '2021-12-22T03:00:00Z', 'PENDING', 1);

/*CALL*/
INSERT INTO tb_call (number, link_centrun, summary, release_id, client_id) VALUES ('171418', 'http://ts.precisasoftware.com:8081/centrun/public/chamado-consulta/171418', 'Cliente entrou em contato pois ao fazer a entrega dos pedidos do frigobox esta gerando um ERRO', 1, 1);

/*SYSTEM*/
INSERT INTO tb_system (name) VALUES ('SOLUTION');
INSERT INTO tb_system (name) VALUES ('SOLUTION START');
INSERT INTO tb_system (name) VALUES ('MARKETBOX');
INSERT INTO tb_system (name) VALUES ('DATASNAP');

/*CALL_SYSTEM*/
INSERT INTO tb_call_system (call_id, system_id) VALUES (1, 1);
INSERT INTO tb_call_system (call_id, system_id) VALUES (1, 3);

/*USER*/
INSERT INTO tb_user (name, email, password) VALUES ('Rodrigo Baggio', 'rodrigobaggio.precisa@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Joao da Silva', 'joao.precisa@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

/*ROLE*/
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');
INSERT INTO tb_role (authority) VALUES ('ROLE_TEST');


/*USER_ROLE*/
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);