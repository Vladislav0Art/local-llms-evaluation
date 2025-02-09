package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyValNormalUseTest {

    @Test
    public void appendKeyValNormalUseTest() {
        try {
            URL inputUrl = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(kv.key()).thenReturn("key");
            Mockito.when(kv.value()).thenReturn("value");
            urlBuilder.appendKeyVal(kv);
            URL resultUrl = urlBuilder.build();
            Assert.assertEquals(new URL("http://example.com/?key=value"), resultUrl);
        } catch (Exception e) {
            e.printStackTrace();
            assert (false);
        }
    }

}