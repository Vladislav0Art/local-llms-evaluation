package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValToExistingQueryTest {

    @Test
    public void appendKeyValToExistingQueryTest() throws Exception {
        URL inputUrl = new URL("http://example.com/path?param1=value1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal("param2", "value2");
        assertEquals("Query should have new key value pair appended", "param1=value1&param2=value2", urlBuilder.q.toString());
    }

}