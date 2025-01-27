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
public class GeneratedAppendFragment {

    @Mock
    private Connection connection;

    @Mock
    private URI uri;

    public static final String UTF_8 = "UTF-8";

    @Test
    public void appendFragment() throws UnsupportedEncodingException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(connection.getBaseUri());
        String fragment = "#fragment";
        builder.appendFragment(fragment);
        URL url = builder.build();
        Mockito.verifyNoMoreInteractions(builder);
    }

}