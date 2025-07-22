package com.example.apitest.dto;

import java.util.HashMap;
import java.util.Map;

public record SsoResponse(
        String responseCode,
        String responseMessage,
        Map<String,String> responseData) {

}
