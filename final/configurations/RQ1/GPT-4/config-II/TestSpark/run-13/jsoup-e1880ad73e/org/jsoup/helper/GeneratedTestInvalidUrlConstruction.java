package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTestInvalidUrlConstruction {

    @Test
    public void testInvalidUrlConstruction() {
        try {
            URL url = new URL("http://www.invalid-.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            urlBuilder.build();
        } catch (Exception ex) {
            assertTrue(ex.getMessage().contains("assertFail"));
        }
    }

}