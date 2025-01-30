package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
public class GeneratedAppendKeyValWithNullQueryTest {

    Connection.KeyVal .class,UrlBuilder .class
})

public class UrlBuilderTest {

    @Mock
    Connection.KeyVal kv;

    @Test
    public void appendKeyValWithNullQueryTest() {
        try {
            URL url = new URL("https://test.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
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