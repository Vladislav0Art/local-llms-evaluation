package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.regex.Pattern;

public class GeneratedAppendKeyValWithNonAsciiValue_AppendsToQuery {

    @Test
    public void appendKeyValWithNonAsciiValue_AppendsToQuery() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://test.com/path?query=value#fragment"));
        Connection.KeyVal kv = Connection.KeyVal.newString("key", "äöü");
        builder.appendKeyVal(kv);
        assertEquals("http://test.com/path?query=value&key=%C3%A4%C3%B6%C3%BC", builder.u.toString());
    }

}