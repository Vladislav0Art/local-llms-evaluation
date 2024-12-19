package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.nodes.Document;

public class GeneratedTestBuildWithEmptyInputUrl {

    @Test
    public void testBuildWithEmptyInputUrl() {
        final Document document = new Document();
        String urlString = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(urlString);
        URL actualUrl = urlBuilder.build();
        Assert.assertEquals("https://example.com", actualUrl.toString());
    }

}