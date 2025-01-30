package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        try {
            Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(kv.key()).thenReturn("key");
            Mockito.when(kv.value()).thenReturn("value");
            URL url1 = new URL("https://www.google.com/");
            UrlBuilder urlBuilder = new UrlBuilder(url1);
            try {
                urlBuilder.appendKeyVal(kv);
            } catch (Exception e) {
                e.printStackTrace();
            }
            assertEquals(url1.getQuery(), StringUtil.borrowBuilder().append(url1.getQuery()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}