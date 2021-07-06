CREATE TABLE sos.tipo_servico (
	id serial NOT NULL,
	descricao varchar(100) NOT NULL,
	ativo boolean NOT NULL DEFAULT true,
	CONSTRAINT tipo_servico_pk PRIMARY KEY (id)
);
GRANT SELECT ON TABLE sos.tipo_servico TO sos;
GRANT INSERT ON TABLE sos.tipo_servico TO sos;
GRANT UPDATE ON TABLE sos.tipo_servico TO sos;
GRANT DELETE ON TABLE sos.tipo_servico TO sos;
