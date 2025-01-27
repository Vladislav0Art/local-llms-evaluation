package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValWithMultipleQueryParameters {

    @Test
    public void appendKeyValWithMultipleQueryParameters() throws MalformedURLException, URISyntaxException {
        String queryValue = "query1=value1&query2=value2";
        URI uri = new URI("http://example.com/path").resolve(queryValue);
        new UrlBuilder(new URL(uri)).appendKeyVal(Connection.KeyVal.valueOf("_", queryValue)).build().toString();
    }

}