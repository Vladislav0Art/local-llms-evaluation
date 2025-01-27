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
public class GeneratedTest {

    @Mock
    private Connection connection;

    @Mock
    private URI uri;

    public static final String UTF_8 = "UTF-8";

    @Test
    public void newUrlBuilder() {
        UrlBuilder builder = new UrlBuilder(uri);
        Mockito.verify(builder).build();
    }

    @Test
    public void buildWithoutKeyVal() throws UnsupportedEncodingException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(connection.getBaseUri());
        URL url = builder.build();
        Mockito.verifyNoMoreInteractions(builder);
    }

    @Test
    public void buildWithKeyVal() throws UnsupportedEncodingException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(connection.getBaseUri());
        builder.appendKeyVal(Connection.KeyVal.newKeyVal("key", "value"));
        URL url = builder.build();
        Mockito.verifyNoMoreInteractions(builder);
    }

    @Test
    public void appendKeyValWithEmptyKey() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(connection.getBaseUri());
        builder.appendKeyVal(Connection.KeyVal.newKeyVal("", "value"));
        Mockito.verifyNoMoreInteractions(builder);
    }

    @Test
    public void appendKeyValWithNullValue() {
        UrlBuilder builder = new UrlBuilder(connection.getBaseUri());
        Connection.KeyVal kv = Connection.KeyVal.newKeyVal("key", null);
        builder.appendKeyVal(kv);
        Mockito.verifyNoMoreInteractions(builder);
    }

    @Test
    public void appendKeyValWithInvalidEncoding() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(connection.getBaseUri());
        builder.appendKeyVal(Connection.KeyVal.newKeyVal("key", UTF_8));
        Mockito.verifyNoMoreInteractions(builder);
    }

    @Test
    public void appendKeyValWithSpacesInValue() throws UnsupportedEncodingException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(connection.getBaseUri());
        Connection.KeyVal kv = Connection.KeyVal.newKeyVal("key", "value with spaces");
        builder.appendKeyVal(kv);
        Mockito.verifyNoMoreInteractions(builder);
    }

    @Test
    public void appendKeyValWithNonAsciiCharactersInValue() throws UnsupportedEncodingException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(connection.getBaseUri());
        Connection.KeyVal kv = Connection.KeyVal.newKeyVal("key", "value with non ascii characters");
        builder.appendKeyVal(kv);
        Mockito.verifyNoMoreInteractions(builder);
    }

    @Test
    public void appendQuery() throws UnsupportedEncodingException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(connection.getBaseUri());
        URI query = new URI("key=value");
        builder.appendQuery(query);
        URL url = builder.build();
        Mockito.verifyNoMoreInteractions(builder);
    }

    @Test
    public void appendFragment() throws UnsupportedEncodingException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(connection.getBaseUri());
        String fragment = "#fragment";
        builder.appendFragment(fragment);
        URL url = builder.build();
        Mockito.verifyNoMoreInteractions(builder);
    }

}