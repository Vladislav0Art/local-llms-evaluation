package org.jsoup.helper;

import org.jsoup.helper.KeyVal;
import org.jsoup.helper.URLBuilder;
import org.junit.jupiter.api.BeforeEach;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTestBuildWithConnection {

    @BeforeEach
    public void setup() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testBuildWithConnection() throws UnsupportedEncodingException {
        urlBuilder = new UrlBuilder(new Connection());
        URL outputUrl = urlBuilder.build();
        assert !outputUrl.toString().isEmpty();
    }

}