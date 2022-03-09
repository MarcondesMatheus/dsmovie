package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")

public class Score {

	@EmbeddedId
	//chave pk composta
	private ScorePK id = new ScorePK();
	
	private Double value;
	
	public Score() {
		
	}
	
	public void setMOvie(Movie movie) {
		id.setMovie(movie); //salvar o score com o movie
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
}
