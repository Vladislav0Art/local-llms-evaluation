package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.StringBuilder;

public class GeneratedTestBuild_WithNullInput_ThrowsURISyntaxException {

    public String build() {
        return new URL("https://www.example.com").toString();
    }

    @Test
    public void testBuild_WithNullInput_ThrowsURISyntaxException() {
        try {
            new UrlBuilder(null).build();
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
            // expected exception
        }
    }

}