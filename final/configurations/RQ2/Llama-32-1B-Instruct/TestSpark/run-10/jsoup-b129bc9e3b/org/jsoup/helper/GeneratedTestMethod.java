package org.jsoup.helper;

public class GeneratedTestMethod {

    public static String getStatusCode() {
        return request().responseCode();
    }

    public static String getData(int length) {
        return request().readUtf8(length);
    }
}

class Request {
    public static String method() {
        return Method.class.getSimpleName();
    }

    private static final Map<String, String> responseData = new HashMap<>();

    static {
        responseData.put("status_code", "200");
        // Add other data
    }

    public static Response getData() {
        return new Response();
    }
}

class TestNG {
    public static void init() {
        System.out.println(Request.getData());
    }

    @Test
    public void testMethod() {
        assertEquals(Response.getResponseCode(), 200);
    }

}