package org.jboss.as.quickstarts.picketlink.authentication.jsf;

import java.util.Calendar;
import java.util.Date;

import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 * @author Edward P. Legaspi
 **/
@Model
public class PropertyBean {

	public String getProperty(String key) {
		return System.getProperty(key);
	}

	public Date getDate() {
		return Calendar.getInstance().getTime();
	}

	public String getSessionId() {
		FacesContext fCtx = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) fCtx.getExternalContext()
				.getSession(false);
		String sessionId = session.getId();
		return sessionId;
	}
}
