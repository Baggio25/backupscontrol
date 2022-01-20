/*PACKAGE*/
INSERT INTO tb_package (number, description, opening_date, end_date, package_status) VALUES ('243', 'PACOTE 243', TIMESTAMP WITH TIME ZONE '2021-12-22T03:00:00Z', null, 'PENDING');

/*RELEASE*/
INSERT INTO tb_release (version_number, delivery_date, release_status, package_id) VALUES ('6.0.30.35', TIMESTAMP WITH TIME ZONE '2021-12-22T03:00:00Z', 'PENDING', 1);