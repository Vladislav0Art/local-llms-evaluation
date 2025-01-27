package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.net.URL;
import java.util.List;

public class GeneratedTest {

    @Test
    public void testBuildUrlWithKeyAndValue() {
        String url = "http://example.com";
        String key1 = "key1";
        String value1 = "value1";
        String key2 = "key2";
        String value2 = "value2";

        UrlBuilder builder = new UrlBuilder(url);
        List<UrlBuilder.KeyVal> kvList = List.of(
                new UrlBuilder.KeyVal(key1, value1),
                new UrlBuilder.KeyVal(key2, value2)
        );
        builder.appendKeyAndValue(kvList);

        URL expectedUrl = new URL("http://example.com?key1=value1&key2=value2");
        assertThat(builder.build(), is(expectedUrl));
    }

    @Test
    public void testBuildUrlWithEmptyString() {
        String url = "http://example.com";

        UrlBuilder builder = new UrlBuilder(url);
        List<UrlBuilder.KeyVal> kvList = List.of(
                new UrlBuilder.KeyVal("", "")
        );
        builder.appendKeyAndValue(kvList);

        URL expectedUrl = new URL("");
        assertThat(builder.build(), is(expectedUrl));
    }

    @Test
    public void testBuildUrlWithNullKey() {
        String url = "http://example.com";
        String key1 = null;
        String value1 = "value1";
        String key2 = "key2";
        String value2 = "value2";

        UrlBuilder builder = new UrlBuilder(url);
        List<UrlBuilder.KeyVal> kvList = List.of(
                new UrlBuilder.KeyVal(key1, value1),
                new UrlBuilder.KeyVal(key2, value2)
        );
        builder.appendKeyAndValue(kvList);

        URL expectedUrl = new URL("http://example.com?key2=value2");
        assertThat(builder.build(), is(expectedUrl));
    }

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