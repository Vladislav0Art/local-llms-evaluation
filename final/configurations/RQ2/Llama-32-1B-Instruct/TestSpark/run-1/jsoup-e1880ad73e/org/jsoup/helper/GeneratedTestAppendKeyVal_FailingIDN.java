package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendKeyVal_FailingIDN {

    @Test
    public void testAppendKeyVal_FailingIDN() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        java.util.HashMap<String, String> map = new java.util.HashMap<>();
        map.put("test1", "value1");
        map.put("test2", "value2");
        URL idnUrl = new URI("http://example.com/test1=value1/test2=value2", null);
        urlBuilder.appendKeyVal(idnUrl.toKeyVal());
        assertEquals("http://example.com/test1=value1/test2=value2", urlBuilder.build().toString());
    }

}