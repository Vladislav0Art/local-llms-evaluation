package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.net.MalformedURLException;
import java.util.Map;

public class GeneratedAppend_key_val_with_idn_value {

    @Test
    public void append_key_val_with_idn_value() throws MalformedURLException, UnsupportedEncodingException {
        String inputUrl = "http://example.com";
        Connection.KeyVal kv = new Connection.KeyVal("key", new URL(IDN.toUTF8("http%3A%2F%2Fexample.net")));
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        urlBuilder.appendKeyVal(kv);
        URL result = urlBuilder.build();
        assertThat(result.toString(), is(inputUrl + "?key=http%3A%2F%2Fexample.net"));
    }

}