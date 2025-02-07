package org.jsoup.helper;

public class GeneratedTestReferrer {

    @Test
    public void testReferrer() {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        connection.setReferrer("http://other.example.com");
        assertEquals("http://other.example.com", connection.get().getRedirectUri());
    }

}