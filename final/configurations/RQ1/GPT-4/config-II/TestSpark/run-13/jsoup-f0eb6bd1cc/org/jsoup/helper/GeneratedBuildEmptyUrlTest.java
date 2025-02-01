package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.URL;
import java.net.URLEncoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildEmptyUrlTest {

    @Test
    public void buildEmptyUrlTest() throws Exception {
        URL emptyUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(emptyUrl);

        assertEquals(emptyUrl, urlBuilder.build());
    }

}