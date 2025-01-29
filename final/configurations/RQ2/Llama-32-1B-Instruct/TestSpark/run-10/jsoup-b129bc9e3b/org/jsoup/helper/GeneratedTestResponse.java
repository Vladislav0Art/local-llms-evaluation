package org.jsoup.helper;

public class GeneratedTestResponse {

    public static String getResponseCode() {
        return request().responseCode();
    }

    public static String readUtf8(int length) {
        return request().readUtf8(length);
    }
}

public class Request {
    public static String method() {
        return Method.class.getSimpleName();
    }

    private static final Map<String, String> responseData = new HashMap<>();

    static {
        responseData.put("status_code", "200");
        // Add other data
    }

    public static String getData() {
        return responseData.get("status_code") + ": " + request().readUtf8(1024);
    }
}

public class TestNG {
    private Connection connection;

    @BeforeMethod
    public void init() {
        this.connection = new Request();
    }

    @Test
    public void testResponse() {
        assertEquals(connection.getData(), "HTTP/1.1 200 OK\r\nContent-Type: application/json\r\n\r\n{");
    }

}