package org.jsoup.helper;

public class GeneratedTestConnectsWithRedirect {

    @Test
    public void testConnectsWithRedirect() {
        String url = "http://example.com";
        HttpConnection connection = new HttpConnection(false);
        assert connection.followRedirects(false).connect(url) != null;
    }

}