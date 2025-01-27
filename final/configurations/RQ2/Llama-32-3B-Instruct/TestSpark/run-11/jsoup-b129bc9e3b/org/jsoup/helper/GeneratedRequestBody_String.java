package org.jsoup.helper;

public class GeneratedRequestBody_String {

    @Test
    public void requestBody_String() {
        String body = "value";
        HttpConnection connection = new HttpConnection();
        assertEquals(body, connection.requestBody(body));
    }

}