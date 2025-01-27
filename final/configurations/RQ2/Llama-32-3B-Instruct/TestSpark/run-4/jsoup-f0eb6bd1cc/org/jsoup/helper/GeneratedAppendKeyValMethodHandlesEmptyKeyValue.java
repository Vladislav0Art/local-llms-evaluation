package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedAppendKeyValMethodHandlesEmptyKeyValue {

    @Test
    public void appendKeyValMethodHandlesEmptyKeyValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(kv);
    }

}