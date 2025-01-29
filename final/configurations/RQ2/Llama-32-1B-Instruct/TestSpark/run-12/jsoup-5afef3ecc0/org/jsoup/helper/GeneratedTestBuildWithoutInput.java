package org.jsoup.helper;

import org.jsoup.helper.KeyVal;
import org.jsoup.helper.URLBuilder;
import org.junit.jupiter.api.BeforeEach;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTestBuildWithoutInput {

    @BeforeEach
    public void setup() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testBuildWithoutInput() throws UnsupportedEncodingException {
        String inputUrl = "";
        URLBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assert !outputUrl.toString().isEmpty();
    }

}