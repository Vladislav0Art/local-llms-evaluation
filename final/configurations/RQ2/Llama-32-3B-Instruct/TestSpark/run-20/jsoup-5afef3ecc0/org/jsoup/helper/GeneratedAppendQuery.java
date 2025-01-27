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
import java.net.URLEncoder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendQuery {

    @Mock
    private Connection connection;

    @Mock
    private URI uri;

    public static final String UTF_8 = "UTF-8";

    @Test
    public void appendQuery() throws UnsupportedEncodingException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(connection.getBaseUri());
        URI query = new URI("key=value");
        builder.appendQuery(query);
        URL url = builder.build();
        Mockito.verifyNoMoreInteractions(builder);
    }

}