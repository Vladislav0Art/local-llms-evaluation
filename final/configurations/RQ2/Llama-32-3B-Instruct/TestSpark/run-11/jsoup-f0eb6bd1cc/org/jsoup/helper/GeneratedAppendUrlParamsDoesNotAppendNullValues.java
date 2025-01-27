package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

public class GeneratedAppendUrlParamsDoesNotAppendNullValues {

    @Test
    public void appendUrlParamsDoesNotAppendNullValues() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        // Arrange & Act
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = Connection.KeyVal.of(null, "val");
        urlBuilder.appendKeyVal(kv);

        String url = urlBuilder.build().toString();
        assertEquals("http://example.com", url);
    }

}