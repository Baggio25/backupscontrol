/*PACKAGE*/
INSERT INTO tb_package (number, description, opening_date, end_date, package_status) VALUES ('243', 'PACOTE 243', TIMESTAMP WITH TIME ZONE '2021-12-22T03:00:00Z', null, 'PENDING');

/*RELEASE*/
INSERT INTO tb_release (version_number, delivery_date, release_status, package_id) VALUES ('6.0.30.35', TIMESTAMP WITH TIME ZONE '2021-12-22T03:00:00Z', 'PENDING', 1);

/*CALL*/
INSERT INTO tb_call (number, link_centrun, summary, release_id) VALUES ('171418', 'http://ts.precisasoftware.com:8081/centrun/public/chamado-consulta/171418', 'Cliente entrou em contato pois ao fazer a entrega dos pedidos do frigobox esta gerando um ERRO', 1);

/*SYSTEM*/
INSERT INTO tb_system (name) VALUES ('SOLUTION');
INSERT INTO tb_system (name) VALUES ('SOLUTION START');
INSERT INTO tb_system (name) VALUES ('MARKETBOX');
INSERT INTO tb_system (name) VALUES ('DATASNAP');

/*CALL_SYSTEM*/
INSERT INTO tb_call_system (call_id, system_id) VALUES (1, 1);
INSERT INTO tb_call_system (call_id, system_id) VALUES (1, 3);
