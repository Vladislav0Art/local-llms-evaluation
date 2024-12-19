package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.regex.Pattern;

public class GeneratedAppendKeyValWithValidInput_AppendsToQuery {

    @Test
    public void appendKeyValWithValidInput_AppendsToQuery() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://test.com/path?query=value#fragment"));
        Connection.KeyVal kv = Connection.KeyVal.newString("key", "value");
        builder.appendKeyVal(kv);
        assertEquals("http://test.com/path?query=value&key=value", builder.u.toString());
    }

}