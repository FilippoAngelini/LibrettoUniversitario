package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class Esame {
	
	private String codice;
	private String titolo;
	private String docente;
	
	private boolean superato;
	private int voto;
	private LocalDate dataSuperamento;
	
	
	/**
	 * Nuovo esame non ancora superato
	 * @param codice codice dell'esame
	 * @param titolo titolo dell'esame
	 * @param docente docente dell'esame
	 */
	public Esame(String codice, String titolo, String docente) {
		this.codice = codice;
		this.titolo = titolo;
		this.docente = docente;
		this.superato = false;
	}


	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}


	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}


	/**
	 * @return the titolo
	 */
	public String getTitolo() {
		return titolo;
	}


	/**
	 * @param titolo the titolo to set
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	/**
	 * @return the docente
	 */
	public String getDocente() {
		return docente;
	}


	/**
	 * @param docente the docente to set
	 */
	public void setDocente(String docente) {
		this.docente = docente;
	}


	/**
	 * @return the superato
	 */
	public boolean isSuperato() {
		return superato;
	}


	/**
	 * @param superato the superato to set
	 */

	/**
	 * @return the dataSuperamento
	 */
	public LocalDate getDataSuperamento() {
		if(this.superato)
			return dataSuperamento;
		else
			throw new IllegalStateException("Esame " + codice + " non ancora superato.");
	}


	/**
	 * @return the voto
	 */
	public int getVoto() {
		if(this.superato)
			return voto;
		else
			throw new IllegalStateException("Esame " + codice + " non ancora superato.");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Esame [codice=" + codice + ", titolo=" + titolo + ", docente=" + docente + ", superato=" + superato
				+ ", dataSuperamento=" + dataSuperamento + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Esame other = (Esame) obj;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		return true;
	}
	
	
	/**
	 * Se l'esame non è ancora superato allora lo considera superato con data e voto, altrimenti scatena eccezione
	 * @param voto
	 * @param data
	 */
	public void supera (int voto, LocalDate data){
		if(!this.superato){
			this.superato = true;
			this.voto = voto;
			this.dataSuperamento = data;
		}else
			throw new IllegalStateException ("Esame " + codice + " già superato.");
	}

}
