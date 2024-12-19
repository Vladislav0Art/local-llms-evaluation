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
public class GeneratedAppendKeyValNewQuery {

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void appendKeyValNewQuery() {
        //Arrange
        UrlBuilder builder = new UrlBuilder(null);

        //Act
        builder.appendKeyVal(kv);

        //Assert
        assertNotNull(builder.q);
        assertEquals("a=value", builder.q.toString());
    }

}