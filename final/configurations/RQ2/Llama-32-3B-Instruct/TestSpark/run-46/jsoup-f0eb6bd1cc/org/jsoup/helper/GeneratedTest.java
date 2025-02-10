package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

public class GeneratedTest {

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

    @Test
    public void testUriBuilder() {
        // Create URI object manually as it's not available in JUnit
        String uri = "/path/to/resource";
        try {
            java.net.URI parsedUri = new java.net.URI(uri);
            System.out.println(parsedUri);
        } catch (Exception e) {
            System.out.println("Invalid URI");
        }
    }

    @Test
    public void testConnectionKeyVal() {
        // Create KeyVal object manually as it's not available in JUnit
        String param1 = "param1";
        String value1 = "value1";
        String param2 = "newParam";
        String value2 = "newValue";

        class KeyVal {
            public static Connection.KeyVal of(String param, String value) {
                return new Connection.KeyVal(param, value);
            }
        }

        System.out.println(KeyVal.of(param1, value1));
        System.out.println(KeyVal.of(param2, value2));
    }

    @Test
    public void testConnectionQuery() {
        // Create query method manually as it's not available in JUnit
        class Connection {
            public static Object query() {
                return "query";
            }
        }

        System.out.println(Connection.query());
    }

    @Test
    public void testUnsupportedEncodingException() {
        try {
            String param1 = "param1";
            String value1 = "value with invalid encoding";
            Connection.KeyVal kv = Connection.KeyVal.of(param1, value1);
            System.out.println(kv);
        } catch (Exception e) {
            System.out.println("UnsupportedEncodingException");
        }
    }

    @Test
    public void testUrlBuilderThrowsUnsupportedEncodingException() {
        try {
            UrlBuilder builder = new UrlBuilder(new java.net.URL("http://example.com"));
            System.out.println(builder);
        } catch (java.net.UnsupportedSocketException e) {
            System.out.println("UnsupportedEncodingException");
        }
    }

    @Test
    public void testUriBuilderThrowsUnsupportedEncodingException() {
        try {
            UrlBuilder builder = new UrlBuilder(new java.net.URI("/path/to/resource"));
            System.out.println(builder);
        } catch (java.net.UnsupportedSocketException e) {
            System.out.println("UnsupportedEncodingException");
        }
    }

    @Test
    public void testConnectionKeyValThrowsUnsupportedEncodingException() {
        try {
            String param1 = "param1";
            String value1 = "value with invalid encoding";
            Connection.KeyVal kv = Connection.KeyVal.of(param1, value1);
            System.out.println(kv);
        } catch (java.net.UnsupportedSocketException e) {
            System.out.println("UnsupportedEncodingException");
        }
    }

    @Test
    public void testUrlBuilderConstruction() {
        try {
            UrlBuilder builder = new UrlBuilder(new java.net.URL("http://example.com"));
            System.out.println(builder);
        } catch (java.net.UnsupportedSocketException e) {
            System.out.println("UnsupportedEncodingException");
        }
    }

    @Test
    public void testUriBuilderConstruction() {
        try {
            UrlBuilder builder = new UrlBuilder(new java.net.URI("/path/to/resource"));
            System.out.println(builder);
        } catch (java.net.UnsupportedSocketException e) {
            System.out.println("UnsupportedEncodingException");
        }
    }

    @Test
    public void testConnectionKeyValConstruction() {
        try {
            String param1 = "param1";
            String value1 = "value with invalid encoding";
            Connection.KeyVal kv = Connection.KeyVal.of(param1, value1);
            System.out.println(kv);
        } catch (java.net.UnsupportedSocketException e) {
            System.out.println("UnsupportedEncodingException");
        }
    }

}