package org.jsoup.helper;

import org.jsoup.helper.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendNonStringValuesTest {

    @Test
    public void AppendNonStringValuesTest() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        int[] nonStringValue = {1, 2, 3};
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(Connection.KeyVal.create("key", nonStringValue)));
    }

}