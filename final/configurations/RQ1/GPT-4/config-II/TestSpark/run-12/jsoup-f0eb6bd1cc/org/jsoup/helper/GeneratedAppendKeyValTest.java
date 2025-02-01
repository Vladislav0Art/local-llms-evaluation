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
public class GeneratedAppendKeyValTest {


    @Mock
    Connection.KeyVal keyVal;

    @Test
    public void appendKeyValTest() throws Exception {
        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn("value");

        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(keyVal);

        URL expectedURL = new URL("http://example.com?key=value");
        assertEquals(expectedURL, urlBuilder.build());
    }

}