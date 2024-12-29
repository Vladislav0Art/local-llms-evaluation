package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.ConnectionBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestAppendKeyValMultipleWithRedirect {

    @Test
    public void testAppendKeyValMultipleWithRedirect() throws MalformedURLException {
        URI uri = new URI("https://example.com/path");
        String[] kvPairs = {"key1=value1", "key2=value2"};
        for (String pair : kvPairs) {
            builder.appendKeyVal(new KeyVal(pair));
        }
        assertEquals(3, URLBuilder.class.getInterfaces().length);
    }

}