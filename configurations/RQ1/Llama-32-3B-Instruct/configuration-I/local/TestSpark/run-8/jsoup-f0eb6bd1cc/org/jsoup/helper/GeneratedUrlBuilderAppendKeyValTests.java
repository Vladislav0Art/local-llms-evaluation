package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedUrlBuilderAppendKeyValTests {

    @Test
    public void urlBuilderAppendKeyValTests() {
        Connection.KeyVal kv = new Connection.KeyVal("key1", "value1");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path/to/resource"));
        builder.appendKeyVal(kv);
        assertEquals("?key1=value1", builder.q.toString());
    }

}