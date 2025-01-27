package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedBuild {

    @Test
    public void build() {
        UrlBuilder builder = new UrlBuilder();
        Connection connection = new ConnectionImpl(builder);
        connection.appendKeyVal("key1", "value1");
        String result = connection.build();
        assertEquals("http://example.com/key1=value1", result);
    }
}

class UrlBuilder {
    public void appendKeyVal(String key, String value) {
        System.out.println(key + ":" + value);
    }

    public String build() {
        return "http://example.com/";
    }
}

class ConnectionImpl implements Connection {

    private UrlBuilder urlBuilder;
    private java.util.HashMap<String, String> keyVals;

    public ConnectionImpl(UrlBuilder urlBuilder) {
        this.urlBuilder = urlBuilder;
        this.keyVals = new java.util.HashMap<String, String>();
    }

    @Override
    public void appendKeyVal(String key, String value) {
        this.keyVals.put(key, value);
    }

    @Override
    public java.util.HashMap<String, String> getKeyVals() {
        return this.keyVals;
    }

    @Override
    public String build() {
        StringBuilder sb = new StringBuilder(this.urlBuilder.build());
        for (java.util.Map.Entry<String, String> entry : this.keyVals.entrySet()) {
            sb.append(entry.getKey()).append("=").append(entry.getValue()).append("/");
        }
        return sb.toString();
    }

}