package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

public class GeneratedAppendUrlParamsDoesNotAppendValuesWithNonAlphaNumericCharacters {

    @Test
    public void appendUrlParamsDoesNotAppendValuesWithNonAlphaNumericCharacters() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        // Arrange & Act
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        String key = "!@#$";
        Connection.KeyVal kv = Connection.KeyVal.of(key, "val");
        urlBuilder.appendKeyVal(kv);

        String url = urlBuilder.build().toString();
        assertEquals("http://example.com", url);
    }

}