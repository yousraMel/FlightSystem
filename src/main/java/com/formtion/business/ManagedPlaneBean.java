package com.formtion.business;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.formation.dao.PlaneDao;
import com.formation.idao.IGenericDao;
import com.formation.idao.IPlaneDao;
import com.formation.models.Plane;

@ManagedBean(name="planeBean")
@SessionScoped
public class ManagedPlaneBean {

	private IGenericDao<Plane> daoPLG = new PlaneDao();
	private IPlaneDao daoPL = new PlaneDao();
	private Plane plane = new Plane();
	private List<Plane> planes;

	public ManagedPlaneBean() {
		super();
	}

	
	public String create() {
		System.out.println("From plane form:" + plane );
		daoPLG.add(plane);
		return ("admin_index");
	}


	public IGenericDao<Plane> getDaoPLG() {
		return daoPLG;
	}


	public void setDaoPLG(IGenericDao<Plane> daoPLG) {
		this.daoPLG = daoPLG;
	}


	public Plane getPlane() {
		return plane;
	}


	public void setPlane(Plane plane) {
		this.plane = plane;
	}


	public List<Plane> getPlanes() {
		return daoPL.getAll();
	}


	public void setPlanes(List<Plane> planes) {
		this.planes = planes;
	}
	
	

}
