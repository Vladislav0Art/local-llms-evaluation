package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.Objects;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValMultipleKeyValTest {

    @Test
    public void appendKeyValMultipleKeyValTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/?"));
        urlBuilder.appendKeyVal(createMockKeyVal("name1", "value1"));
        urlBuilder.appendKeyVal(createMockKeyVal("name2", "value2"));
        assertEquals("name1=value1&name2=value2", urlBuilder.q.toString());
    }

}