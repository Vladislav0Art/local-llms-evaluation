package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class GeneratedBuild_url_withParams {

    public void createUrlBuilder_fromNull_url() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void build_url_withParams() throws MalformedURLException, URISyntaxException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://localhost:8080/path?a=1&b=2"));
        assertEquals("http://localhost:8080/path?a=1&b=2", urlBuilder.build().toString());
    }

    public void appendKeyVal_key_value() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://localhost:8080"));
        KeyValue keyValue = new KeyValue("key", "value");
        urlBuilder.appendKeyValue(keyValue);
        assertEquals("http://localhost:8080?key=value", urlBuilder.build().toString());
    }

    public void appendKeyVal_key_value_multiple() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://localhost:8080"));
        KeyValue keyValue1 = new KeyValue("key1", "value1");
        KeyValue keyValue2 = new KeyValue("key2", "value2");
        urlBuilder.appendKeyValue(keyValue1);
        urlBuilder.appendKeyValue(keyValue2);
        assertEquals("http://localhost:8080?key1=value1&key2=value2", urlBuilder.build().toString());
    }

    public void assertThrowsUnsupportedEncoding() {
        UrlBuilder urlBuilder = new UrlBuilder();
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(new KeyValue()));
    }
}

class UrlBuilder {

    private URL url;

    public UrlBuilder(URL url) {
        this.url = url;
    }

    public void appendKeyValue(KeyValue keyValue) throws UnsupportedEncodingException {
        // implement logic to append key-value pair
    }

    public String build() throws URISyntaxException {
        return new URI(url.toString()).toString();
    }
}

class KeyValue {

    private String key;
    private String value;

    public KeyValue(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "key=" + key + "&value=" + value;
    }

}