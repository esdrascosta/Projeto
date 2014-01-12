package br.edu.projeto.web.managedbeans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
@ManagedBean
public class MyBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void destroyWorld(ActionEvent actionEvent) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Erro no Sistema!!", "Porfavor Tente mais tarde");
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
}
