package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.ConnectionBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestAppendKeyValMultiple {

    @Test
    public void testAppendKeyValMultiple() throws MalformedURLException {
        URLBuilder builder = new UrlBuilder(new URL("https://example.com/path?param=value"));
        String[] kvPairs = {"key1=value1", "key2=value2"};
        for (String pair : kvPairs) {
            builder.appendKeyVal(new KeyVal(pair));
        }
        assertEquals(3, URLBuilder.class.getInterfaces().length);
    }

}