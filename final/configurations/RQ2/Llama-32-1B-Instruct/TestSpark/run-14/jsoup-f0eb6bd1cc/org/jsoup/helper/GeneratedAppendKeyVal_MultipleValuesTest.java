package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class GeneratedAppendKeyVal_MultipleValuesTest {

    public String build() {
        return "http://example.com";
    }

    @Test
    public void appendKeyVal_MultipleValuesTest() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        String[] kv = {"key1=value1&key2=value2", "key3=value3"};
        assertEquals(Arrays.asList(kv), urlBuilder.appendKeyVal(Arrays.asList(kv)));
    }

}