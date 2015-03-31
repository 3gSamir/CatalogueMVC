package com.rimas.sid.metier;

import java.util.List;

import com.rimas.sid.dao.Produit;

public interface ICatalogueMetier {

	public void addProduit(Produit p);
	public List<Produit> getAllProduit();
	public List<Produit> getProduitsParMC(String mc);
	public Produit getProduit(String ref);
	public void deleteProduit(String ref);
	public void updateProduit(Produit p);
}
