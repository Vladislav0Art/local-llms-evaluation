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
public class GeneratedAppendKeyValAppendToExistingQuery {

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void appendKeyValAppendToExistingQuery() {
        //Arrange
        UrlBuilder builder = new UrlBuilder(null);
        when(builder.q).thenReturn(StringUtil.borrowBuilder().append("c=3"));

        //Act
        builder.appendKeyVal(kv);

        //Assert
        assertEquals("a=value&c=3", builder.q.toString());
    }

}