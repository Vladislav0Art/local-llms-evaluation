package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.jsoup.helper.DataUtil.UTF_8;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValWithValidKeyValuePairsShouldNotThrowException {

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Mock
    private Connection connection;

    @Test
    public void appendKeyValWithValidKeyValuePairsShouldNotThrowException() throws UnsupportedEncodingException {
        urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
        connection.keyVal(URI.create("http://example.com/path"));
        connection.keyVal(URI.create("key=value"));
        assertThat(urlBuilder.build(), is("https://www.example.com?http%3A//example.com%2Fpath&key%3Dvalue"));
    }

}