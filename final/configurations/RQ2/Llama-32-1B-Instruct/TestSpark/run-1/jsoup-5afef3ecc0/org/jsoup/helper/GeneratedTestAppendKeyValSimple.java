package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.ConnectionBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestAppendKeyValSimple {

    @Test
    public void testAppendKeyValSimple() {
        URLBuilder builder = new UrlBuilder(new URL("https://example.com/path?param=value"));
        builder.appendKeyVal(new KeyVal("key", "value"));
        assertEquals(2, URLBuilder.class.getInterfaces().length);
    }

}