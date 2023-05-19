package tn.esprit.persistance.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Stage")
public class Stage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idStage")
	private int idStage;
	private int nbrLike;
	
	@Temporal(TemporalType.DATE)
	private Date dateDebutStage;
	
	@Temporal(TemporalType.DATE)
	private Date dateFinStage;
	
	@Enumerated(EnumType.STRING)
	private TypeStage typeStage;
	
	private String resumeStage;  
	
	@JsonIgnore
	@ManyToOne
	private Etudiant etudiant;

	@Override
	public String toString() {
		return "Stage [idStage=" + idStage + ", dateDebutStage=" + dateDebutStage + ", dateFinStage=" + dateFinStage
				+ ", typeStage=" + typeStage + ", resumeStage=" + resumeStage + "]";
	}
	
	
	
	
	

}
