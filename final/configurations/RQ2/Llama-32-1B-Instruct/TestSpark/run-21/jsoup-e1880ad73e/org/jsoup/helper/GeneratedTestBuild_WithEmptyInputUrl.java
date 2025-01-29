package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestBuild_WithEmptyInputUrl {

    @Test
    public void testBuild_WithEmptyInputUrl() {
        String inputUrl = "";
        URLBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNull(result);
    }

}