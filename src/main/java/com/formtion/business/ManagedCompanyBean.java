package com.formtion.business;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.formation.dao.CompanyDao;
import com.formation.idao.IGenericDao;
import com.formation.idao.ICompanyDao;
import com.formation.models.Address;
import com.formation.models.Company;

@ManagedBean(name="companyBean")
@SessionScoped
public class ManagedCompanyBean {
	

		private IGenericDao<Company> daoCmG = new CompanyDao();
		private ICompanyDao daoCm = new CompanyDao();
		private Company company = new Company();
		private List<Company> companies;
		private Address address = new Address();
		public ManagedCompanyBean() {
			super();
		}
		
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		
		public void create() {
			System.out.println("Address:" + address);
			company.setAddress(address);
			daoCmG.add(company);
		}
		
		public IGenericDao<Company> getDaoCmG() {
			return daoCmG;
		}
		public void setDaoCmG(IGenericDao<Company> daoCmG) {
			this.daoCmG = daoCmG;
		}
		public ICompanyDao getDaoCm() {
			return daoCm;
		}
		public void setDaoCm(ICompanyDao daoCm) {
			this.daoCm = daoCm;
		}
		public Company getCompany() {
			return company;
		}
		public void setCompany(Company company) {
			this.company = company;
		}
		public List<Company> getCompanies() {
			return daoCm.getAll();
		}
		public void setCompanies(List<Company> companies) {
			this.companies = companies;
		}
		
		

}
