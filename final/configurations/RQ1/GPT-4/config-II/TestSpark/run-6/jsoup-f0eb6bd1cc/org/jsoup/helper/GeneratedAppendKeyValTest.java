package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("https://www.google.com/search");
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal kv = Connection.KeyVal.create("q", "unit+testing");
        builder.appendKeyVal(kv);
        URL newUrl = builder.build();
        assertEquals(new URL("https://www.google.com/search?q=unit%2Btesting"), newUrl);
    }

}