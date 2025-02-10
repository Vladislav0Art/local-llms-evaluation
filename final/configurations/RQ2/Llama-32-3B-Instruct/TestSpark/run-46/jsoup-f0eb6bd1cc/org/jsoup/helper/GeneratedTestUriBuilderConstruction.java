package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

public class GeneratedTestUriBuilderConstruction {

    @Test
    public void testUriBuilderConstruction() {
        try {
            UrlBuilder builder = new UrlBuilder(new java.net.URI("/path/to/resource"));
            System.out.println(builder);
        } catch (java.net.UnsupportedSocketException e) {
            System.out.println("UnsupportedEncodingException");
        }
    }

}