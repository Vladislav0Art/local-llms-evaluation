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

public class GeneratedTestAppendKeyVal_Null {

    @Test
    public void testAppendKeyVal_Null() {
        UrlBuilder builder = new UrlBuilder("https://example.com/path/to/resource");
        assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(new java.net.KeyValue(null, null)));
    }

}