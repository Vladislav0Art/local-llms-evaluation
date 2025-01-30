package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValToNewQueryTest {

    @Test
    public void appendKeyValToNewQueryTest() throws Exception {
        URL inputUrl = new URL("http://example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal("param1", "value1");
        assertEquals("Query should have new key value pair", "param1=value1", urlBuilder.q.toString());
    }

}