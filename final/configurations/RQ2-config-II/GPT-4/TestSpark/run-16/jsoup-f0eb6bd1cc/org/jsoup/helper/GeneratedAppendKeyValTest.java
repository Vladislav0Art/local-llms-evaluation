package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyValue = mock(Connection.KeyVal.class);
        when(keyValue.key()).thenReturn("key");
        when(keyValue.value()).thenReturn("value");

        urlBuilder.appendKeyVal(keyValue);
        URL outputUrl = urlBuilder.build();

        assertThat(outputUrl.toString(), containsString("?key=value"));
    }

}