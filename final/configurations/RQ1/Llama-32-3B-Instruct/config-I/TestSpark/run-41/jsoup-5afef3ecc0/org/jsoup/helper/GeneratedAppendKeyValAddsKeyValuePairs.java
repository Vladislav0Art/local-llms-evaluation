package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import javax.annotation.Nullable;

public class GeneratedAppendKeyValAddsKeyValuePairs {

    @Test
    public void appendKeyValAddsKeyValuePairs() throws MalformedURLException {
        URL u = new URL("http://example.com/path");
        Connection.KeyVal[] kv = new Connection.KeyVal[]{new Connection.KeyVal("key", "value")};
        UrlBuilder builder = new UrlBuilder(u);
        builder.appendKeyVal(kv[0]);
        assertNotNull(builder.q);
        assertEquals(2, kv.length);
    }

}