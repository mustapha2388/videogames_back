package com.edugroup.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @ToString
@Entity
public class Plateforme {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String marque;
	
	@ManyToMany (mappedBy = "plateformes") @JsonIgnore
	private Set<JeuxVideo> jeuxVideos;

}
