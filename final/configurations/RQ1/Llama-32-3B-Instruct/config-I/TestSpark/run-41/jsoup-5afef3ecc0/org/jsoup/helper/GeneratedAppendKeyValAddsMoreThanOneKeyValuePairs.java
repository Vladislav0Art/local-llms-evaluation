package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import javax.annotation.Nullable;

public class GeneratedAppendKeyValAddsMoreThanOneKeyValuePairs {

    @Test
    public void appendKeyValAddsMoreThanOneKeyValuePairs() throws MalformedURLException {
        URL u = new URL("http://example.com/path");
        Connection.KeyVal[] kv = new Connection.KeyVal[]{new Connection.KeyVal("key1", "value1"), new Connection.KeyVal("key2", "value2")};
        UrlBuilder builder = new UrlBuilder(u);
        builder.appendKeyVal(kv[0]);
        builder.appendKeyVal(kv[1]);
        assertNotNull(builder.q);
        assertEquals(3, kv.length);
    }

}