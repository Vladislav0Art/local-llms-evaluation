package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.jsoup.Connection;
import org.jsoup.ConnectionBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.BeforeEach;
import org.junit.Test;

public class GeneratedTest_build_url_without_params {

    private Document document;
    private String inputUrl;

    @BeforeEach
    public void setup() {
        URL url = new URL("http://example.com");
        document = Jsoup.parse(url.toString());
        inputUrl = url.toString();
    }

    @Test
    public void test_build_url_without_params() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
    }

}