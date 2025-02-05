package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.URL;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void urlBuilderInitTest() throws MalformedURLException {
        new UrlBuilder(new URL("http://test.com"));
    }

    @Test
    public void urlBuilderBuildTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://test.com"));
        urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://test.com"));
        Connection.KeyVal mockKeyVal = mock(Connection.KeyVal.class);
        urlBuilder.appendKeyVal(mockKeyVal);
    }

    @Test
    public void appendKeyValNullTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://test.com"));
        urlBuilder.appendKeyVal(null);
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://test.com"));
        Connection.KeyVal keyVal = Connection.KeyVal.create("test", "тест", "ISO-8859-1");
        urlBuilder.appendKeyVal(keyVal);
    }

}