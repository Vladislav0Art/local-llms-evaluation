package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetJsonResponse {

    private static final String[] EXPECTED_RESPONSES = {"{'id': 1, 'name': 'John'}", "{\"id\": 2, \"name\": \"Jane\"}"};

    @Test
    public void testGetJsonResponse() {
        for (int i = 0; i < EXPECTED_RESPONSES.length; i++) {
            String json = EXPECTED_RESPONSES[i];
            Testable test = new Testable();
            test.addTest(getExpectedJson(json), "getExpectedJson");
            try {
                Object result = test.test();
                assertEquals(EXPECTED_RESPONSES[i].replaceAll("\\[|\\]", "").split(",")[0], (int) result);
            } catch (Exception e) {
                fail("Unexpected exception: " + e.getMessage());
            }
        }
    }

    private String getExpectedJson(String json) {
        return "{\"id\": " + Long.parseLong(json.substring(1, json.length() - 1)) + ", \"name\": \"" + json.substring(json.indexOf("\"") + 1, json.indexOf("\",\") + "\"" + "\"";
    }

    public static class Testable {
        private String expectedJson;
        private String funcName;

        public void addTest(String expectedJson, String funcName) {
            this.expectedJson = expectedJson;
            this.funcName = funcName;
        }

        public void test() {
            if (expectedJson.contains("id")) {
                System.out.println(funcName + " should return an integer.");
            } else {
                System.out.println(funcName + " does not contain 'id'.");
            }
        }
    }

}