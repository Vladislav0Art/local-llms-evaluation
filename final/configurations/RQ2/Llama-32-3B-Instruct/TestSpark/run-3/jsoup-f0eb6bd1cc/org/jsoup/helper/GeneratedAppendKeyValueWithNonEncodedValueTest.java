package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.net.URL;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class GeneratedAppendKeyValueWithNonEncodedValueTest {

    public static class Connection {
        public static class KeyVal {
            private final List<String> keyValues = new ArrayList<>();

            public void addValue(String value) {
                keyValues.add(value);
            }

            public String toString() {
                return String.join("=", keyValues);
            }
        }
    }

    @Test
    public void appendKeyValueWithNonEncodedValueTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.addValue("key");
        kv.addValue("value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
        urlBuilder.appendKeyVal(kv);
        assertEquals("https://www.example.com?key=value", urlBuilder.build().toString());
    }

}