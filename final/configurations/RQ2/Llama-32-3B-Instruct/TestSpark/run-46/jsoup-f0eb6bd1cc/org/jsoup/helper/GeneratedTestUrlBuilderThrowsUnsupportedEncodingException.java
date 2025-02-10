package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

public class GeneratedTestUrlBuilderThrowsUnsupportedEncodingException {

    @Test
    public void testUrlBuilderThrowsUnsupportedEncodingException() {
        try {
            UrlBuilder builder = new UrlBuilder(new java.net.URL("http://example.com"));
            System.out.println(builder);
        } catch (java.net.UnsupportedSocketException e) {
            System.out.println("UnsupportedEncodingException");
        }
    }

}