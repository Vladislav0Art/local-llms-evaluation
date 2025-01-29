package org.jsoup.helper;

public class GeneratedTestExecuteResponse {

    private static final String URL = "https://example.com";
    private static final String USER_AGENT = "Mozilla/5.0";

    @Test
    public void testExecuteResponse() throws IOException {
        HttpConnection connection = HttpConnection.connect(new URL("https://example.com"));
        Connection.Response response = connection.execute();
        assert response != null;
    }

}