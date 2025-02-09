package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.hamcrest.core.IsEqual.equalTo;

public class GeneratedAppendKeyValWithValidConnectionTest {

    @Test
    public void appendKeyValWithValidConnectionTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("key");
        Mockito.when(kv.value()).thenReturn("value");

        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(kv);

        URL url = urlBuilder.build();
        Assert.assertThat(url.toString(), equalTo("http://example.com/?key=value"));
    }

}