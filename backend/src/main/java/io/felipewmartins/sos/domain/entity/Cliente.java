package io.felipewmartins.sos.domain.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "cliente", schema = "sos")
@Data
public class Cliente implements Serializable {

	private static final long serialVersionUID = -6660388905082904603L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String nome;
	private String cpfCnpj;
	private Boolean ativo;
}
