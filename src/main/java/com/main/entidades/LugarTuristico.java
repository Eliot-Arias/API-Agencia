package com.main.entidades;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "lugares_turisticos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LugarTuristico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nombre;
	@Column(name = "descripcion", length = 555)
	private String descripcion;
	private String imagen;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "departamento_id", nullable = false)
	@JsonIgnore
	private Departamentos departamento;
	@OneToMany(mappedBy = "lugar", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Evento> listaEventos;

}
