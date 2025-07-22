package com.example.apitest.dto;

public class SsoResponse {
    private String responseCode;
    private String responseMessage;
    private String userId;
    private String tokenId;

    public SsoResponse(String responseCode,String responseMessage, String userId, String tokenId) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.userId = userId;
        this.tokenId = tokenId;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }
}
