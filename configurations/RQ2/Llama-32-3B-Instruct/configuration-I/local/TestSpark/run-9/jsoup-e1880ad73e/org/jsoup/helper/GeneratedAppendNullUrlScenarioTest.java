package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GeneratedAppendNullUrlScenarioTest {

    @Test
    public void appendNullUrlScenarioTest() {
        // given
        UrlBuilder urlBuilder = new UrlBuilder(null);

        // when
        try {
            urlBuilder.build();
            fail("Expected exception not thrown");
        } catch (NullPointerException e) {
            // expected
        }
    }

}