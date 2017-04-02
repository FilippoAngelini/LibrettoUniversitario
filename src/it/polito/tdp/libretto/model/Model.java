package it.polito.tdp.libretto.model;

//import java.util.ArrayList;
//import java.util.List;

import it.polito.tdp.libretto.db.EsameDAO;

public class Model {
	
	//private List <Esame> esami;  Versione senza DAO

	public Model() {
		//esami = new ArrayList <Esame>();  Versione senza DAO
	}
	
	public boolean addEsame (Esame e){
		
		EsameDAO dao = new EsameDAO();
		
		return dao.create(e);
		
		/*
		 *   Versione senza DAO
		if(!esami.contains(e)){
			esami.add(e);
			return true; //Inserimento andato a buon fine
		}else
			return false; //Esisteva già
		*/
	}
	
	public Esame trovaEsame (String codice){
		
		EsameDAO dao = new EsameDAO();
		
		Esame e = dao.find(codice);
		
		return e;
		
		/*  Versione senza DAO
		 * 
		int pos = this.esami.indexOf(new Esame (codice,null,null));
		
		if(pos == -1)
			return null; //Esame non trovato
		else
			return esami.get(pos); //Esame trovato e restituito
		*/
	}

}
