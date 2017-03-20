package it.polito.tdp.libretto.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
	
	private List <Esame> esami;

	public Model() {
		esami = new ArrayList <Esame>();
	}
	
	public boolean addEsame (Esame e){
		if(!esami.contains(e)){
			esami.add(e);
			return true; //Inserimento andato a buon fine
		}else
			return false; //Esisteva già
	}
	
	public Esame trovaEsame (String codice){
		
		int pos = this.esami.indexOf(new Esame (codice,null,null));
		
		if(pos == -1)
			return null; //Esame non trovato
		else
			return esami.get(pos); //Esame trovato e restituito
	}

}
