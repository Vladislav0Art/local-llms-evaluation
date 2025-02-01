package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.mockito.Mockito;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        try {
            URL url = new URL("https://test.com");
            UrlBuilder builder = new UrlBuilder(url);
            Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(kv.key()).thenReturn("newparam");
            Mockito.when(kv.value()).thenReturn("newvalue");

            builder.appendKeyVal(kv);
            assertEquals("newparam=newvalue", builder.q.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}