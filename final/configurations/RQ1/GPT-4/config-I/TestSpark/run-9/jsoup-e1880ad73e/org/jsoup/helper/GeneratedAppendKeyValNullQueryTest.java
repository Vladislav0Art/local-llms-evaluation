package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValNullQueryTest {

    @Test
    public void appendKeyValNullQueryTest() {
        try {
            URL url = new URL("https://test.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal kv = mock(Connection.KeyVal.class);
            when(kv.key()).thenReturn("newKey");
            when(kv.value()).thenReturn("newValue");
            urlBuilder.appendKeyVal(kv);
            assertEquals(java.net.URLEncoder.encode("newKey", StandardCharsets.UTF_8.name()) + "=" +
                    java.net.URLEncoder.encode("newValue", StandardCharsets.UTF_8.name()), urlBuilder.q.toString());
        } catch (Exception ex) {
            fail("No exception should be thrown.");
        }
    }

}