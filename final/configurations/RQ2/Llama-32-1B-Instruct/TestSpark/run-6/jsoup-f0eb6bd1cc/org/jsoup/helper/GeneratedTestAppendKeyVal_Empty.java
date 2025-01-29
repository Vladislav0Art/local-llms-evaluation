package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Locale;

public class GeneratedTestAppendKeyVal_Empty {

    @Test
    public void testAppendKeyVal_Empty() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder("https://example.com/path/to/resource");
        assertTrue(builder.appendKeyVal(null) == null);
        assertFalse(builder.appendKeyVal(java.util.Map.of()).toString().equals(builder.toString()));
    }

}