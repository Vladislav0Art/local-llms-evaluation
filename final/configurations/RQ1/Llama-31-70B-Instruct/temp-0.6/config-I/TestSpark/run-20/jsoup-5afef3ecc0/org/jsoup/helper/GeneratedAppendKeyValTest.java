package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        //given
        URL inputUrl = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        //when
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));

        //then
        assertEquals("key=value", urlBuilder.q.toString());
    }

}