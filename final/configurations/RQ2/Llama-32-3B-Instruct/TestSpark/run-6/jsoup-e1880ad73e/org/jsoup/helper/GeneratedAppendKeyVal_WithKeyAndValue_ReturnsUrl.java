package org.jsoup.helper;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

public class GeneratedAppendKeyVal_WithKeyAndValue_ReturnsUrl {

    @Test
    public void appendKeyVal_WithKeyAndValue_ReturnsUrl() {
        String encodedKey = Base64.getEncoder().encodeToString("key".getBytes());
        String encodedQuery = Base64.getEncoder().encodeToString("query".getBytes());
        URL url = new URL("http://example.com", 8080);
        url.appendKeyVal(Connection.KeyVal.of(encodedKey, encodedQuery));
        assert url.toExternalForm().equals("http://example.com:8080?query=eyJhbGciOiJlZGVuYXV0aCIsIm9hdXMiOnsiYXRva2luIjoiMSIsIm1ldmVudHMiOHRvIiwiY3RvcyI6MCwicmVzcGluZWQiLCJuYXRvcml0eSI6MDt9");
    }

}