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

public class GeneratedBuilderUrlWithoutBaseUriTest {

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

    public static class GeneratedTest {

        @Test
        public void builderUrlWithoutBaseUriTest() {
            String inputUri = "/path/to/resource";
            UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUri));
            URL builtUrl = urlBuilder.build();
            assertNotNull(builtUrl);
            assertEquals("https://www.example.com" + inputUri, builtUrl.toString());
        }

    }