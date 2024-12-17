package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URI;
import java.util.Map;

public class GeneratedUrlBuilder_noAppendKeyVal {

    @Test
    public void urlBuilder_noAppendKeyVal() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        try (Connection.KeyVal kv = urlBuilder.appendKeyVal(null)) {
            // test implementation
        }
    }

}