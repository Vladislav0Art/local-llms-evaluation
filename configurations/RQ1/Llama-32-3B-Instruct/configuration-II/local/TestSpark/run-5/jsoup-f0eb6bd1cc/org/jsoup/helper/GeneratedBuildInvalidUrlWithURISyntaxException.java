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
public class GeneratedBuildInvalidUrlWithURISyntaxException {

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void buildInvalidUrlWithURISyntaxException() throws URISyntaxException, UnsupportedEncodingException {
        //Arrange
        URL u = new URL("http://example.com/invalid");

        UrlBuilder builder = new UrlBuilder(u);
        when(builder.u).thenReturn(u);

        //Act
        builder.build();
    }

}