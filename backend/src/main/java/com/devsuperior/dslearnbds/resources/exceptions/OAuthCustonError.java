package com.devsuperior.dslearnbds.resources.exceptions;

import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

public class OAuthCustonError implements Serializable {
    private static final long serialVersionUID = 1L;

    private String error;

    @JsonProperty("error_description")
    private String errorDescription;

    public OAuthCustonError() {
    }

    public OAuthCustonError(String error, String errorDescription) {
        this.error = error;
        this.errorDescription = errorDescription;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }


}
