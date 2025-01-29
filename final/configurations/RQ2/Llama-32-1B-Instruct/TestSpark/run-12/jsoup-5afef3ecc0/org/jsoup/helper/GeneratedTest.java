package org.jsoup.helper;

import org.jsoup.helper.KeyVal;
import org.jsoup.helper.URLBuilder;
import org.junit.jupiter.api.BeforeEach;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTest {

    @BeforeEach
    public void setup() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testBuildWithInputUrl() throws UnsupportedEncodingException {
        String inputUrl = "http://example.com/path?query=value#fragment";
        URLBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assert !outputUrl.toString().isEmpty();
    }

    @Test
    public void testBuildWithoutInput() throws UnsupportedEncodingException {
        String inputUrl = "";
        URLBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assert !outputUrl.toString().isEmpty();
    }

    @Test
    public void testAppendKeyValWithInputUrl() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        KeyVal kv = new KeyVal(key, value);
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path?query=value#fragment");
        urlBuilder.appendKeyVal(kv);
        URL outputUrl = urlBuilder.build();
        assert !outputUrl.toString().isEmpty();
    }

    @Test
    public void testAppendKeyValWithoutInput() throws UnsupportedEncodingException {
        KeyVal kv = new KeyVal("key", "value");
        urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(kv);
        URL outputUrl = urlBuilder.build();
        assert !outputUrl.toString().isEmpty();
    }

    @Test
    public void testBuildWithConnection() throws UnsupportedEncodingException {
        urlBuilder = new UrlBuilder(new Connection());
        URL outputUrl = urlBuilder.build();
        assert !outputUrl.toString().isEmpty();
    }

}