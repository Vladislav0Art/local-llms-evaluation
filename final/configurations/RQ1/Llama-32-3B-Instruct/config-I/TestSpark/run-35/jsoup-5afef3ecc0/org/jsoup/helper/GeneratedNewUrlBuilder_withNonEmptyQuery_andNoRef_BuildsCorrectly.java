package org.jsoup.helper;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNewUrlBuilder_withNonEmptyQuery_andNoRef_BuildsCorrectly {

    public String decodePart(String encoded) {
        return IDN.decode(encoded);
    }

    public String normalizeQuery(String q) {
        // implement normalization logic here
        return q; // or you can use a library to do it for you
    }

    public String normalizeRef(String r) {
        // implement normalization logic here
        return r; // or you can use a library to do it for you
    }

    @Test
    public void newUrlBuilder_withNonEmptyQuery_andNoRef_BuildsCorrectly() {
        URL inputUrl = new URL("http://example.com?query=foo");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder.u);
        assertTrue(builder.q != null && !builder.q.toString().isEmpty());
    }

}