package com.formation.idao;

import java.util.List;

public interface IGenericDao<G> {
	
	public void add(G g);
	public void update(G g);
	public void delete(G g);
	public G getById(int id);
	public List<G> findAll();

}
