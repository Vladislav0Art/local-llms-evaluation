package org.jsoup.helper;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValTest {

    @Mock
    private URL inputUrl;

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        assertNotNull(urlBuilder.q);
    }

}