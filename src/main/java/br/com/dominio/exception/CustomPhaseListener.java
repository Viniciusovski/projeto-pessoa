package br.com.dominio.exception;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class CustomPhaseListener implements PhaseListener {
    @Override
    public void afterPhase(PhaseEvent event) {}

    @Override
    public void beforePhase(PhaseEvent event) {
        Exception ex = (Exception) FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get("jakarta.servlet.error.exception");
        if (ex != null) {
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ocorreu um erro inesperado: " + ex.getMessage(), null));
        }
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.RENDER_RESPONSE;
    }
}