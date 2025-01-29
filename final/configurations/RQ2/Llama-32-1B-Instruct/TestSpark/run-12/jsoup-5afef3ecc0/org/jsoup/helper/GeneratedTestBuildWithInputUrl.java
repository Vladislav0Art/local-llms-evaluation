package org.jsoup.helper;

import org.jsoup.helper.KeyVal;
import org.jsoup.helper.URLBuilder;
import org.junit.jupiter.api.BeforeEach;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTestBuildWithInputUrl {

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

}