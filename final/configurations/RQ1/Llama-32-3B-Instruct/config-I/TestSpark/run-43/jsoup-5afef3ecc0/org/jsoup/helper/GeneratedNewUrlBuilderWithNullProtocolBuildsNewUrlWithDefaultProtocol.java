package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNewUrlBuilderWithNullProtocolBuildsNewUrlWithDefaultProtocol {

    @Test
    public void newUrlBuilderWithNullProtocolBuildsNewUrlWithDefaultProtocol() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL(null, "user", "pass", null, "path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder.u);
        assertEquals("http://user:pass@example.com/path", ((URL) urlBuilder.u).toString());
    }

}