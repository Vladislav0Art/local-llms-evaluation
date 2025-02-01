package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.nio.charset.Charset;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://www.google.com");
        String key = "id";
        String value = "123";

        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal keyValMock = Mockito.mock(Connection.KeyVal.class);

        Mockito.stub(keyValMock.key()).toReturn(key);
        Mockito.stub(keyValMock.value()).toReturn(value);

        urlBuilder.appendKeyVal(keyValMock);

        String queryString = urlBuilder.q.toString();

        Assert.assertTrue(queryString.contains(key));
        Assert.assertTrue(queryString.contains(value));
    }

}