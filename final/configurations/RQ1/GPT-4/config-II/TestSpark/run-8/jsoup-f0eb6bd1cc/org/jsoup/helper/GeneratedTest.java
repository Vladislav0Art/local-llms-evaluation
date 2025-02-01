package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.nio.charset.Charset;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws Exception {
        URL url = new URL("http://www.google.com?search=test");

        UrlBuilder urlBuilder = new UrlBuilder(url);

        Assert.assertEquals(urlBuilder.u, url);
    }

    @Test
    public void buildTest() throws Exception {
        URL url = new URL("http://www.google.com");

        UrlBuilder urlBuilder = new UrlBuilder(url);

        URL newUrl = urlBuilder.build();

        Assert.assertEquals(newUrl.getHost(), url.getHost());
    }

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

    @Test
    public void decodePartInvalidInputTest() throws Exception {
        String encoded = new String(new byte[]{(byte) 0xC3, (byte) 0x28}, Charset.forName("UTF-8"));
        UrlBuilder.decodePart(encoded);
    }

    @Test
    public void decodePartValidInputTest() throws Exception {
        String encoded = "test";
        String result = UrlBuilder.decodePart(encoded);
        Assert.assertEquals(result, encoded);
    }

    @Test
    public void appendToAsciiTest() throws Exception {
        StringBuilder sb = new StringBuilder();

        UrlBuilder.appendToAscii("Hello World!", false, sb);

        Assert.assertTrue(sb.toString().contains("Hello%20World%21"));
    }

}