package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTestUrlBuilderWithNonAsciiChar {

    @Test
    public void testUrlBuilderWithNonAsciiChar() {
        String PROTOCOL = "http";
        String PATH = "/api/endpoint";
        char NON_ASCII_CHAR = '\u00A0'; // non-ASCII space character
        String SPACE = String.valueOf(NON_ASCII_CHAR);

        UrlBuilder builder = new UrlBuilder(PROTOCOL, PATH);
        StringBuilder sb = StringUtil.borrowBuilder();
        builder.appendAscii(SPACE, false, sb);
        assertEquals(PROTOCOL + PATH, builder.toString());
    }

    public static class UrlBuilder {
        private String protocol;
        private String path;

        public UrlBuilder(String protocol, String path) {
            this.protocol = protocol;
            this.path = path;
        }

        public void appendQuery(String query) {
            // implement logic to append query parameter
        }

        public void appendAscii(String charStr, boolean isParam, StringBuilder sb) {
            // implement logic to append non-ASCII character
        }

        public String toString() throws MalformedURLException {
            return new URL(protocol + "://" + path).toString();
        }
    }

    public static class StringUtil {
        public static StringBuilder borrowBuilder() {
            // implement logic to borrow builder
            return null;
        }
    }

}