package org.jsoup.helper;

public class GeneratedTestGetResponse {

    private static final String HTTP_VERSION = "HTTP/1.1";

    @Test
    public void testGetResponse() throws IOException {
        HttpConnection connection = HttpConnection.connect("https://example.com");
        Response response = connection.getResponse();
        Assert.assertNotNull(response);
        Assert.assertTrue(response.getContent().isEmpty());
    }

}