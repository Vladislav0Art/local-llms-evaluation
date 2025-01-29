package org.jsoup.helper;

public class GeneratedTestRequestBody {

    @Test
    public void testRequestBody() {
        HttpConnection connection = new HttpConnection();
        String body = "{\"key\":\"value\"}";
        connection.request(new Request(Request.Method.POST, URL.create("http://example.com"), null, body));
        assertEquals(200, connection.getResponseCode());
    }

}