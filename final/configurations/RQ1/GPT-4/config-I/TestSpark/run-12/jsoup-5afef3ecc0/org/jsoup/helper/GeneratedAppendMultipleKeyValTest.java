package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendMultipleKeyValTest {

    @Test
    public void appendMultipleKeyValTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com/test");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyValue1 = mock(Connection.KeyVal.class);
        Connection.KeyVal keyValue2 = mock(Connection.KeyVal.class);
        when(keyValue1.key()).thenReturn("param");
        when(keyValue1.value()).thenReturn("value");
        when(keyValue2.key()).thenReturn("key");
        when(keyValue2.value()).thenReturn("val");
        builder.appendKeyVal(keyValue1);
        builder.appendKeyVal(keyValue2);
        URL result = builder.build();
        assertEquals("https://www.example.com/test?param=value&key=val", result.toString());
    }

}