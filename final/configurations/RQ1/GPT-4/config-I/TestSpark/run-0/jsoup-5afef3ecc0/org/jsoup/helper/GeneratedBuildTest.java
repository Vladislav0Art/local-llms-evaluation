package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildTest {

    @Mock
    Connection.KeyVal keyVal;

    @Test
    public void buildTest() throws Exception {
        URL url = new URL("http://127.0.0.1/path?query=value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL resultUrl = urlBuilder.build();

        assertEquals("http://127.0.0.1/path?query=value", resultUrl.toString());
    }

}