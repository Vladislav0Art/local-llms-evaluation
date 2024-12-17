package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Base64;

public class GeneratedBuildUrlWithNonASCIIPath {

    @Test
    public void buildUrlWithNonASCIIPath() throws MalformedURLException, URISyntaxException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://a.com/path/to/resource?b=1#c"));
        builder.appendKeyVal(kv);
        URI uri = builder.u.getURI();
        assertTrue(uri.getPath().contains("%5C")); // \ to \
    }

}