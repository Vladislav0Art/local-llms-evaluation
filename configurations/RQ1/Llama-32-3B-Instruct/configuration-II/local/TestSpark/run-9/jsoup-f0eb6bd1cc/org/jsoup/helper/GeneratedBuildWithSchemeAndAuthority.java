package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildWithSchemeAndAuthority {

    @Test
    public void buildWithSchemeAndAuthority() throws URISyntaxException, MalformedURLException {
        URI uri = new URI("http://example.com/path/to/resource");
        assertEquals(uri.toString(), new UrlBuilder(uri).build().toString());
    }

}