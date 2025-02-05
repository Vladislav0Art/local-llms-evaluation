package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValNullKeyValTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void appendKeyValNullKeyValTest() throws UnsupportedEncodingException, MalformedURLException {
        thrown.expect(NullPointerException.class);
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        urlBuilder.appendKeyVal(null);
    }

}