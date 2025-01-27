package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest {

    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public Connection.KeyVal toKeyVal() {
            return new org.jsoup.Connection.KeyVal(key, value);
        }
    }

    public static class UrlBuilder {
        private Document document;

        public UrlBuilder(Document document) {
            this.document = document;
        }

        public void appendKeyVal(Connection.KeyVal keyVal) throws UnsupportedEncodingException {
            Element formElement = document.selectFirst("form");
            if (formElement != null) {
                formElement.appendChild(document.createElement("input").attr("name", keyVal.key).attr("value", keyVal.value));
            }
        }

        public URL build() throws MalformedURLException, URISyntaxException {
            return new URL(document.url());
        }

        public static UrlBuilder create(String url) throws MalformedURLException, URISyntaxException {
            Document document = new org.jsoup.Jsoup()
                    .connect(url)
                    .get();

            return new UrlBuilder(document);
        }
    }

    @Test
    public void ofValidUrl() throws MalformedURLException, URISyntaxException {
        URL url = new URL("http://example.com");
        UrlBuilder builder = UrlBuilder.create(url.toURI().toString());
        assertEquals(url, builder.build());
    }

    @Test
    public void appendKeyVal() throws UnsupportedEncodingException {
        UrlBuilder builder = UrlBuilder.create(new URL("http://example.com"));
        KeyVal kv = new KeyVal("key", "value");
        builder.appendKeyVal(kv.toKeyVal());
        assertNotNull(builder.build());
        assertTrue(builder.build().getQuery().contains("key=value"));
    }

    @Test
    public void appendKeyValWithNullValue() throws UnsupportedEncodingException {
        UrlBuilder builder = UrlBuilder.create(new URL("http://example.com"));
        KeyVal kv = new KeyVal("key", null);
        try {
            builder.appendKeyVal(kv.toKeyVal());
            assert false;
        } catch (UnsupportedEncodingException e) {
        }
    }

    @Test
    public void appendKeyVals() throws UnsupportedEncodingException {
        UrlBuilder builder = UrlBuilder.create(new URL("http://example.com"));
        KeyVal kv1 = new KeyVal("key1", "value1");
        KeyVal kv2 = new KeyVal("key2", "value2");
        builder.appendKeyVal(kv1.toKeyVal());
        builder.appendKeyVal(kv2.toKeyVal());
        assertNotNull(builder.build());
        assertTrue(builder.build().getQuery().contains("key1=value1"));
    }

}