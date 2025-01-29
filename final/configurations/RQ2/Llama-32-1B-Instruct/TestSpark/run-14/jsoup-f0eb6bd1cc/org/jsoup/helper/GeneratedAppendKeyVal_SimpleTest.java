package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class GeneratedAppendKeyVal_SimpleTest {

    public String build() {
        return "http://example.com";
    }

    @Test
    public void appendKeyVal_SimpleTest() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        assertEquals("", urlBuilder.appendKeyVal(Arrays.asList(new String[][]{{"key", "value"}})));
        assertEquals(null, urlBuilder.appendKeyVal(Arrays.asList(new String[][]{{"non-existent-key", "value"}})));
    }

}