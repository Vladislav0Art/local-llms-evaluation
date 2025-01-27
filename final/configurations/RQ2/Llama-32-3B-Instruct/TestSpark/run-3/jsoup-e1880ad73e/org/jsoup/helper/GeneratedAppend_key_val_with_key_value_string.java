package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.net.MalformedURLException;
import java.util.Map;

public class GeneratedAppend_key_val_with_key_value_string {

    @Test
    public void append_key_val_with_key_value_string() throws MalformedURLException, UnsupportedEncodingException {
        String inputUrl = "http://example.com";
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        urlBuilder.appendKeyVal(kv);
        URL result = urlBuilder.build();
        assertThat(result.toString(), is(inputUrl + "?key=value"));
    }

}