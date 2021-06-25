CREATE TABLE sos.cliente (
	id serial NOT NULL,
	nome varchar(100) NOT NULL,
	cpfcnpj varchar(14) NOT NULL,
	ativo boolean NOT NULL DEFAULT true,
	CONSTRAINT cliente_pk PRIMARY KEY (id)
);
GRANT SELECT ON TABLE sos.cliente TO sos;
GRANT INSERT ON TABLE sos.cliente TO sos;
GRANT UPDATE ON TABLE sos.cliente TO sos;
GRANT DELETE ON TABLE sos.cliente TO sos;
