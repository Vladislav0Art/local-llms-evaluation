package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.Objects;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValSingleKeyValTest {

    @Test
    public void appendKeyValSingleKeyValTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/?"));
        urlBuilder.appendKeyVal(createMockKeyVal("name", "value"));
        assertEquals("name=value", urlBuilder.q.toString());
    }

}