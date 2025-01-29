package org.jsoup.helper;

public class GeneratedTestResponse {

    @Test
    public void testResponse() throws Exception {
        HttpConnection connection = new HttpConnection(Request.empty());
        Response response = connection.getResponse();
        assert response != null;
    }

}