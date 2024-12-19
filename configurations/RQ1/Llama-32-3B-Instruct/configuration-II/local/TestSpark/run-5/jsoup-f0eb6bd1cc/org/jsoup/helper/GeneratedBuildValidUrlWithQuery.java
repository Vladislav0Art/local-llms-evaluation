package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildValidUrlWithQuery {

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void buildValidUrlWithQuery() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        //Arrange
        URL u = new URL("http://example.com/path?a=1&b=2");
        Mockito.when(kv.key()).thenReturn("a");
        Mockito.when(kv.value()).thenReturn("value");

        UrlBuilder builder = new UrlBuilder(u);
        when(builder.q).thenReturn(StringUtil.borrowBuilder().append("c=3"));

        //Act
        builder.build();

        //Assert
        verify(builder, times(1)).build();
    }

}