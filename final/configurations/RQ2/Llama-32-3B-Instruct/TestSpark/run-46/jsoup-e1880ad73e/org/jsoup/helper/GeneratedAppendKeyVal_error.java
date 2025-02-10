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

public class GeneratedAppendKeyVal_error {

    public void createUrlBuilder_fromNull_url() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void appendKeyVal_error() {
        UrlBuilder urlBuilder = new UrlBuilder();
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(new org.jsoup.helper.Connection.KeyVal()));
    }
}

class UrlBuilder {
    private URL url;

    public UrlBuilder(URL url) {
        this.url = url;
    }

    public void appendKeyVal(org.jsoup.helper.Connection.KeyVal kv) {
        // Implementation for appending key-value pair to the URL
    }

    public String build() {
        return "http://localhost:8080";
    }
}

class Connection {
    public static class KeyVal {
        public String key;
        public String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

}