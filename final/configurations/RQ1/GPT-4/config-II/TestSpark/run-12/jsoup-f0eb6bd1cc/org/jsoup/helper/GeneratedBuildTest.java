package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildTest {


    @Mock
    Connection.KeyVal keyVal;

    @Test
    public void buildTest() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL expectedURL = new URL("http://example.com");
        assertEquals(expectedURL, urlBuilder.build());
    }

}