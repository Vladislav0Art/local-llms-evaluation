package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() {
        // Create URL object manually as it's not available in JUnit
        String url = "http://example.com";
        try {
            java.net.URL parsedUrl = new java.net.URL(url);
            System.out.println(parsedUrl);
        } catch (Exception e) {
            System.out.println("Invalid URL");
        }
    }

}