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
public class GeneratedBuildWithHostTest {

    @Mock
    Connection.KeyVal keyVal;

    @Test
    public void buildWithHostTest() throws Exception {
        URL url = new URL("http://localhost/path?query=value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL resultUrl = urlBuilder.build();

        assertEquals("http://localhost/path?query=value", resultUrl.toString());
    }

}