package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.mockito.Mockito.*;

public class GeneratedAppendKeyVal_doesNotAppendEmptyKeyValues {

    @Test
    public void appendKeyVal_doesNotAppendEmptyKeyValues() {
        String original = "path/to/resource";
        Connection.KeyVal kv1 = new Connection.KeyVal("", "");
        UrlBuilder builder = UrlBuilder.fromValidUrl(original);
        assertNotNull(builder.appendKeyVal(kv1));
        assertEquals(original, builder.appendKeyVal(kv1).get());
    }

}