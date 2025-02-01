package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        try {
            URL inputUrl = new URL("http://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = mock(Connection.KeyVal.class);
            when(kv.key()).thenReturn("key");
            when(kv.value()).thenReturn("value");
            urlBuilder.appendKeyVal(kv);
            assertTrue(urlBuilder.u.toString().equals("http://www.google.com?query=test"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}