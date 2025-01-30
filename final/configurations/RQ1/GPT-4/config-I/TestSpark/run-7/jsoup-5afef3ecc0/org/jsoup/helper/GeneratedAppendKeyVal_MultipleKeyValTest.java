package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedAppendKeyVal_MultipleKeyValTest {

    @Test
    public void appendKeyVal_MultipleKeyValTest() throws Exception {
        URL inputUrl = new URL("http://google.com?key=val");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);

        Mockito.when(keyVal.key()).thenReturn("key2");
        Mockito.when(keyVal.value()).thenReturn("val2");

        urlBuilder.appendKeyVal(keyVal);
        URL outputURL = urlBuilder.build();

        assertNotNull(outputURL);
        assertEquals("http://google.com?key=val&key2=val2", outputURL.toString());
    }

}