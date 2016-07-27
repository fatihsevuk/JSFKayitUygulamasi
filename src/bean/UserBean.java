package bean;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UICommand;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.xml.bind.ValidationException;



@ManagedBean
@SessionScoped
public class UserBean {
	protected String ad;
	protected String soyad;
	protected String dogumTarihi;
	protected String cinsiyet;
	protected String email;
	protected String serviceLevel="medium";
	/**
	 * @return the ad
	 */
	public String getAd() {
		return ad;
	}
	/**
	 * @param ad the ad to set
	 */
	public void setAd(String ad) {
		this.ad = ad;
	}
	/**
	 * @return the soyad
	 */
	public String getSoyad() {
		return soyad;
	}
	/**
	 * @param soyad the soyad to set
	 */
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	/**
	 * @return the dogumTarihi
	 */
	public String getDogumTarihi() {
		return dogumTarihi;
	}
	/**
	 * @param dogumTarihi the dogumTarihi to set
	 */
	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	/**
	 * @return the cinsiyet
	 */
	public String getCinsiyet() {
		return cinsiyet;
	}
	/**
	 * @param cinsiyet the cinsiyet to set
	 */
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the serviceLevel
	 */
	public String getServiceLevel() {
		return serviceLevel;
	}
	/**
	 * @param serviceLevel the serviceLevel to set
	 */
	public void setServiceLevel(String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}
	
	
	
	public void validateEmail(FacesContext context,UIComponent toValidate , Object value) throws ValidatorException{
		
		String emailStr=(String) value;
		if(-1==emailStr.indexOf("@")){
			FacesMessage message=new FacesMessage("Geçersiz Email Adresi");
			throw new ValidatorException(message);
		}
	}
	
	public String addConfirmedUser() {
		boolean added = true; // actual application may fail to add user
		FacesMessage doneMessage = null;
		String outcome = null;
		if (added) {
		    doneMessage = new FacesMessage("Yeni Kullanýcý Baþarýyla Eklendi");
		    outcome = "done";
		} else {
		    doneMessage = new FacesMessage("Kullanýcý Ekleme Baþarýsýz");
		    outcome = "register";
		}
	        FacesContext.getCurrentInstance().addMessage(null, doneMessage);
	        return outcome;
	    }
	
}
