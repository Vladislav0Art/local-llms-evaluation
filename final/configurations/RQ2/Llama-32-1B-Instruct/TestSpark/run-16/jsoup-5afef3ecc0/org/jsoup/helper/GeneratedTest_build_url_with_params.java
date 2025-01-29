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

public class GeneratedTest_build_url_with_params {

    private Document document;
    private String inputUrl;

    @BeforeEach
    public void setup() {
        URL url = new URL("http://example.com");
        document = Jsoup.parse(url.toString());
        inputUrl = url.toString();
    }

    @Test
    public void test_build_url_with_params() throws UnsupportedEncodingException {
        String[] params = {"key1=value1", "key2=value2"};
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com?param1=value1&param2=value2"));
        URL result = urlBuilder.build();
        assertNotNull(result);
    }

}