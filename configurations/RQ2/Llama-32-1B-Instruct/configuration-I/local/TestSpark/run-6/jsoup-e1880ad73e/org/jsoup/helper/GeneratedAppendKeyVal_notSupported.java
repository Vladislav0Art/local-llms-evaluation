package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URI;
import java.util.Map;

public class GeneratedAppendKeyVal_notSupported {

    @Test
    public void appendKeyVal_notSupported() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        UriBuilder uriBuilder = new UriBuilder();
        try (Connection.KeyVal kv = urlBuilder.appendKeyVal(uriBuilder)) {
            // test implementation
        }
    }

}