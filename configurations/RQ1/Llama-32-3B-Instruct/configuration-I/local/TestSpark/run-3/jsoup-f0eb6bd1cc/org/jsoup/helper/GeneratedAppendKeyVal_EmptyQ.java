package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedAppendKeyVal_EmptyQ {

    @Test
    public void appendKeyVal_EmptyQ() {
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("name", "John");
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);
        assertEquals("?name=John", builder.q.toString());
    }

}