package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.net.URL;
import java.util.List;

public class GeneratedTestFail {

    @Test
    public void testFail() {
        String url = "http://example.com";

        UrlBuilder builder = new UrlBuilder(url);
        List<UrlBuilder.KeyVal> kvList = List.of(
                new UrlBuilder.KeyVal("", "")
        );
        builder.appendKeyAndValue(kvList);

        try {
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    public static class KeyVal {
        public String key;
        public String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public static class UrlBuilder {
        private URL url;
        private List<UrlBuilder.KeyVal> kvList;

        public UrlBuilder(URL url) {
            this.url = url;
        }

        public void appendKeyAndValue(List<UrlBuilder.KeyVal> kvList) {
            this.kvList = kvList;
        }

        public URL build() {
            // implementation
            return null; // replace with actual implementation
        }
    }

}