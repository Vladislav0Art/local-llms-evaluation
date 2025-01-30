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
public class GeneratedAppendKeyValTest {

    @Mock
    Connection.KeyVal keyVal;

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://127.0.0.1");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Mockito.when(keyVal.key()).thenReturn("newKey");
        Mockito.when(keyVal.value()).thenReturn("newValue");
        urlBuilder.appendKeyVal(keyVal);

        URL resultUrl = urlBuilder.build();

        assertEquals("http://127.0.0.1?newKey=newValue", resultUrl.toString());
    }

}