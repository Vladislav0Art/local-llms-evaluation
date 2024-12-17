package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URI;
import java.util.Map;

public class GeneratedBuild_noAppendKeyVal {

    @Test
    public void build_noAppendKeyVal() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        URL result = urlBuilder.build();
        try (Connection.KeyVal kv = urlBuilder.appendKeyVal(null)) {
            // test implementation
        }
    }

}