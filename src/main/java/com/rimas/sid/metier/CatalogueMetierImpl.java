package com.rimas.sid.metier;

import java.util.List;

import com.rimas.sid.dao.ICatalogue;
import com.rimas.sid.dao.Produit;

public class CatalogueMetierImpl implements ICatalogueMetier{
	
	private ICatalogue dao;
	
	
	public void setDao(ICatalogue dao) {
		this.dao = dao;
	}

	@Override
	public void addProduit(Produit p) {
		// TODO Auto-generated method stub
		dao.addProduit(p);
	}

	@Override
	public List<Produit> getAllProduit() {
		return dao.getAllProduit();
	}

	@Override
	public List<Produit> getProduitsParMC(String mc) {
		return dao.getProduitsParMC(mc);
	}

	@Override
	public Produit getProduit(String ref) {
		return dao.getProduit(ref);
	}

	@Override
	public void deleteProduit(String ref) {
		dao.deleteProduit(ref);
	}

	@Override
	public void updateProduit(Produit p) {
		dao.updateProduit(p);
	}

}
