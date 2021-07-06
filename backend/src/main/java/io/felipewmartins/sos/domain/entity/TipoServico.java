package io.felipewmartins.sos.domain.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tipo_servico", schema = "sos")
@Data
public class TipoServico implements Serializable {

	private static final long serialVersionUID = -6929082546795937318L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String descricao;
	private Boolean ativo;

}
