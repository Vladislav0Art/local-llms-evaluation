package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        try {
            URL url = new URL("https://www.google.com");
            UrlBuilder ub = new UrlBuilder(url);
            Connection.KeyVal kv = mock(Connection.KeyVal.class);

            when(kv.key()).thenReturn("keyTest");
            when(kv.value()).thenReturn("valueTest");

            ub.appendKeyVal(kv);

            String encodedUrl = ub.build().toString();

            assertTrue(encodedUrl.contains("keyTest=valueTest"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}