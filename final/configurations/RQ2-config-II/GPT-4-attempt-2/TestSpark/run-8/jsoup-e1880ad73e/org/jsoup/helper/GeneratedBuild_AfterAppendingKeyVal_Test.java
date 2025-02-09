package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_AfterAppendingKeyVal_Test {

    @Mock
    private Connection.KeyVal mockKeyVal;

    @Test
    public void build_AfterAppendingKeyVal_Test() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        when(mockKeyVal.key()).thenReturn("key");
        when(mockKeyVal.value()).thenReturn("value");
        builder.appendKeyVal(mockKeyVal);

        URL result = builder.build();
        String expectedUrl = "http://example.com?key=value";

        assertEquals(result.toString(), expectedUrl);
    }

}