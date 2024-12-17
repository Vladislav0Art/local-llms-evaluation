package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedUrlBuilderAppendMultipleKeyValsTests {

    @Test
    public void urlBuilderAppendMultipleKeyValsTests() {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path/to/resource"));
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertEquals("?key1=value1&key2=value2", builder.q.toString());
    }

}