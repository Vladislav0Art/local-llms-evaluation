package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

public class GeneratedAppendKeyValAppendsKeyValToUrl {

    @Test
    public void appendKeyValAppendsKeyValToUrl() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        // Arrange & Act
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(Connection.KeyVal.of("key", "val"));

        String url = urlBuilder.build().toString();
        assertEquals("http://example.com/key=val", url);
    }

}