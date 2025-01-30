package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedAppendKeyVal_KeyValTest {

    @Test
    public void appendKeyVal_KeyValTest() throws Exception {
        URL inputUrl = new URL("http://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);

        Mockito.when(keyVal.key()).thenReturn("key");
        Mockito.when(keyVal.value()).thenReturn("val");

        urlBuilder.appendKeyVal(keyVal);
        URL outputURL = urlBuilder.build();

        assertNotNull(outputURL);
        assertEquals("http://google.com?key=val", outputURL.toString());
    }

}