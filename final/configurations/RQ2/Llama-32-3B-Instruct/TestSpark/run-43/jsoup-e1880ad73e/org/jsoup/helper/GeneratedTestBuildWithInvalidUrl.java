package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTestBuildWithInvalidUrl {

    @Mock
    private Connection connection;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testBuildWithInvalidUrl() throws UnsupportedEncodingException, URISyntaxException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("invalid://www.example.com"));
        urlBuilder.build();
    }

}