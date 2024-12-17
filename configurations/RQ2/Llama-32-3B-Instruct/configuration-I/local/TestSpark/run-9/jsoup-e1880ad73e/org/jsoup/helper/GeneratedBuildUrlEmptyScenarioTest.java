package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GeneratedBuildUrlEmptyScenarioTest {

    @Test
    public void buildUrlEmptyScenarioTest() {
        // given
        UrlBuilder urlBuilder = new UrlBuilder(null);

        // when
        URL url = urlBuilder.build();

        // then
        assertNull(url);
    }

}