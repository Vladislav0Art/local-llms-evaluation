package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.net.MalformedURLException;

public class GeneratedBuildWithNullProtocolSchemeTest {

    @Test
    public void buildWithNullProtocolSchemeTest() {
        UrlBuilder builder = new UrlBuilder(new URL(null, "http://example.com"));
        assertNull(builder.build().getProtocol());
    }

}