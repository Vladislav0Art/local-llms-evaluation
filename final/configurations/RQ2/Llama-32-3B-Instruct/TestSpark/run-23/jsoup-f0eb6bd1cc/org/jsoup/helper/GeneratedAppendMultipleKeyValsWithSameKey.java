package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedAppendMultipleKeyValsWithSameKey {

    @Test
    public void appendMultipleKeyValsWithSameKey() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv1 = Collections.singletonMap("key", "value1");
        Connection.KeyVal kv2 = Collections.singletonMap("key", "value2");
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertNotNull(builder.build());
        assertTrue(builder.build().getQuery().contains("key=value1") && builder.build().getQuery().contains("key=value2"));
    }

}