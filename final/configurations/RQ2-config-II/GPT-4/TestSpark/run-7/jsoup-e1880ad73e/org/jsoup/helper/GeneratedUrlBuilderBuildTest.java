package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.URL;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUrlBuilderBuildTest {

    @Test
    public void urlBuilderBuildTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://test.com"));
        urlBuilder.build();
    }

}