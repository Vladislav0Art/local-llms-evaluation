package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testGetParams() {
        // setup
        String[] params = {"param1", "param2"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "<input type='hidden' name='param1' value='value1'>";
        assertEquals(expectedOutput, request.getParams(params));
    }

    @Test
    public void testGetValues() {
        // setup
        String[] values = {"value1", "value2"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "<input type='hidden' name='param1' value='value1'>";
        assertEquals(expectedOutput, request.getValues(values));
    }

    @Test
    public void testGetAllParams() {
        // setup
        String[] params = {"param1", "param2"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "<input type='hidden' name='param1' value='value1'><input type='hidden' name='param2' value='value2'>";
        assertEquals(expectedOutput, request.getAllParams(params));
    }

    @Test
    public void testGetAllValues() {
        // setup
        String[] values = {"value1", "value2"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "<input type='hidden' name='param1' value='value1'><input type='hidden' name='param2' value='value2'>";
        assertEquals(expectedOutput, request.getAllValues(values));
    }

    @Test
    public void testGetParam() {
        // setup
        String[] params = {"param1"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "param1";
        assertEquals(expectedOutput, request.getParam("param1"));
    }

    @Test
    public void testGetValuesForParam() {
        // setup
        String[] values = {"value1", "value2"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "value1";
        assertEquals(expectedOutput, request.getValuesForParam("param1"));
    }

    @Test
    public void testGetAllParamsForParam() {
        // setup
        String[] params = {"param1", "param2"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "<input type='hidden' name='param1' value='value1'><input type='hidden' name='param2' value='value2'>";
        assertEquals(expectedOutput, request.getAllParamsForParam("param1"));
    }

    @Test
    public void testGetAllValuesForParam() {
        // setup
        String[] values = {"value1", "value2"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "<input type='hidden' name='param1' value='value1'><input type='hidden' name='param2' value='value2'>";
        assertEquals(expectedOutput, request.getAllValuesForParam("param1"));
    }

    @Test
    public void testGetAllParams() {
        // setup
        String[] params = {"param1", "param2"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "<input type='hidden' name='param1' value='value1'><input type='hidden' name='param2' value='value2'>";
        assertEquals(expectedOutput, request.getAllParams(params));
    }

    @Test
    public void testGetAllValues() {
        // setup
        String[] values = {"value1", "value2"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "<input type='hidden' name='param1' value='value1'><input type='hidden' name='param2' value='value2'>";
        assertEquals(expectedOutput, request.getAllValues(values));
    }

    @Test
    public void testGetAllParamsForParam() {
        // setup
        String[] params = {"param1", "param2"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "<input type='hidden' name='param1' value='value1'><input type='hidden' name='param2' value='value2'>";
        assertEquals(expectedOutput, request.getAllParamsForParam("param1"));
    }

    @Test
    public void testGetAllValuesForParam() {
        // setup
        String[] values = {"value1", "value2"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "<input type='hidden' name='param1' value='value1'><input type='hidden' name='param2' value='value2'>";
        assertEquals(expectedOutput, request.getAllValuesForParam("param1"));
    }

    @Test
    public void testGetAllParams() {
        // setup
        String[] params = {"param1", "param2"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "<input type='hidden' name='param1' value='value1'><input type='hidden' name='param2' value='value2'>";
        assertEquals(expectedOutput, request.getAllParams(params));
    }
}

class PublicRequest {
    private Map<String, Object> params;
    private Map<String, Object> values;

    public Request getParam(String param) {
        return new Request(param, null);
    }

    public Request getValues(String[] values) {
        this.values = values;
        return new Request(null, values);
    }

    public String getAllParams(String[] params) {
        return "";
    }

    public void setAllParams(Map<String, Object> params) {
        this.params = params;
    }

    public Map<String, Object> getAllValues(String[] values) {
        return null;
    }

    public Request getParams(String[] params) {
        return new PublicRequest();
    }

    public Map<String, Object> getAllValues() {
        return null;
    }
}

class Request {
    private String value;

    public Request(String value, String... paramNames) {
        this.value = value;
        for (String paramName : paramNames) {
            setParam(paramName);
        }
    }

    public Request getParam(String param) {
        if (!param.equals("value")) {
            throw new RuntimeException("Invalid parameter name");
        }
        return this;
    }

    private void setParam(String paramName) {
        if (this.params == null || !this.params.containsKey(paramName)) {
            this.params = new HashMap<>();
            System.out.println("Setting param: " + paramName);
        } else {
            System.out.println("Parameter already exists");
        }
    }

    public String getValues() {
        return values;
    }

    private void setValues(Map<String, Object> values) {
        this.values = values;
    }

    public Map<String, Object> getAllParams(String[] params) {
        if (this.params == null || !params.everyMatch(param -> this.params.containsKey(param))) {
            throw new RuntimeException("Invalid parameter name");
        }
        return this.params;
    }

    private void setAllParams(Map<String, Object> params) {
        this.params = params;
    }

}