package org.jsoup.helper;

public class GeneratedTestBuild_url {

    @Test
    public void testBuild_url() {
        String url = "https://example.com";
        URLBuilder builder = new UrlBuilder(new URI(url));
        URL actualUrl = builder.build();
        assertEquals("https://example.com", actualUrl.toString());
    }

}