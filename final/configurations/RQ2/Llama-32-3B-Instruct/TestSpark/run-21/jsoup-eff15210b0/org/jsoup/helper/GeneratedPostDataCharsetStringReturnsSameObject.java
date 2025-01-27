package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedPostDataCharsetStringReturnsSameObject {

    @Mock
    private Connection connectionMock;

    @Test
    public void postDataCharsetStringReturnsSameObject() {
        String charset = "UTF-8";
        Connection newRequest = HttpConnection.connect("http://example.com", charset);
        Mockito.verify(connectionMock, Mockito.times(1)).postDataCharset(charset);
    }

}