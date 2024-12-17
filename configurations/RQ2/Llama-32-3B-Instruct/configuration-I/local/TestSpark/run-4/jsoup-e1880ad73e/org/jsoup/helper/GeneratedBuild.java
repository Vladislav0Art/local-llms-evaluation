package org.jsoup.helper;

public class GeneratedBuild {

    @Test
    public void build() {
        String url = "https://www.example.com";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
        assert url.equals(urlBuilder.build());
    }

}