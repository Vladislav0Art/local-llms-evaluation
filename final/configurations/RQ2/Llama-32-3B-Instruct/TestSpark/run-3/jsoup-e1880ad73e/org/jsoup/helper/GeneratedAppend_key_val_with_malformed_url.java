package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.net.MalformedURLException;
import java.util.Map;

public class GeneratedAppend_key_val_with_malformed_url {

    @Test
    public void append_key_val_with_malformed_url() {
        String inputUrl = "http://example.com";
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        java.lang.IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> urlBuilder.appendKeyVal(kv));
        assertThat(e.getMessage(), is("Value cannot be null"));
    }

}