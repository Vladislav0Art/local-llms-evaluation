package org.jsoup.helper;

public class GeneratedNewRequestTest {

    @Test
    public void newRequestTest() {
        Connection connection = HttpConnection.connect("https://example.com");
        Connection request = connection.newRequest();
        assertNotNull(request);
    }

}