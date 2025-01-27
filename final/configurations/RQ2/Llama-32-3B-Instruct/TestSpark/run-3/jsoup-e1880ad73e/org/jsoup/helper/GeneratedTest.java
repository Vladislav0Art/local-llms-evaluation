package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.net.MalformedURLException;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void constructor_with_inputUrl() {
        String inputUrl = "http://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        assertThat(urlBuilder, is(null));
    }

    @Test
    public void build_without_appendKeyVal() throws MalformedURLException {
        String inputUrl = "http://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        URL result = urlBuilder.build();
        assertThat(result.toString(), is(inputUrl));
    }

    @Test
    public void append_key_val_with_key_value_string() throws MalformedURLException, UnsupportedEncodingException {
        String inputUrl = "http://example.com";
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        urlBuilder.appendKeyVal(kv);
        URL result = urlBuilder.build();
        assertThat(result.toString(), is(inputUrl + "?key=value"));
    }

    @Test
    public void append_key_val_with_url_value() throws MalformedURLException, UnsupportedEncodingException {
        String inputUrl = "http://example.com";
        Connection.KeyVal kv = new Connection.KeyVal("key", new URL("http://example.net"));
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        urlBuilder.appendKeyVal(kv);
        URL result = urlBuilder.build();
        assertThat(result.toString(), is(inputUrl + "?key=http%3A%2F%2Fexample.net"));
    }

    @Test
    public void append_key_val_with_idn_value() throws MalformedURLException, UnsupportedEncodingException {
        String inputUrl = "http://example.com";
        Connection.KeyVal kv = new Connection.KeyVal("key", new URL(IDN.toUTF8("http%3A%2F%2Fexample.net")));
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        urlBuilder.appendKeyVal(kv);
        URL result = urlBuilder.build();
        assertThat(result.toString(), is(inputUrl + "?key=http%3A%2F%2Fexample.net"));
    }

    @Test
    public void append_key_val_with_malformed_url() {
        String inputUrl = "http://example.com";
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        java.lang.IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> urlBuilder.appendKeyVal(kv));
        assertThat(e.getMessage(), is("Value cannot be null"));
    }

    @Test
    public void append_key_val_with_null_key() {
        String inputUrl = "http://example.com";
        Connection.KeyVal kv = new Connection.KeyVal(null, "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        java.lang.IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> urlBuilder.appendKeyVal(kv));
        assertThat(e.getMessage(), is("Key cannot be null"));
    }

}