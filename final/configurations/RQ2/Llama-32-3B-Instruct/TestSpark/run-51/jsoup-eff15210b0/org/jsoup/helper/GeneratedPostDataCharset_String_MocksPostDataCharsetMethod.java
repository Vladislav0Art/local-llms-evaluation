package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedPostDataCharset_String_MocksPostDataCharsetMethod {

    @Mock
    private HttpURLConnection mockHttpURLConnection;

    @Test
    public void postDataCharset_String_MocksPostDataCharsetMethod() {
        String charset = "UTF-8";
        HttpConnection.connect(charset);
        Mockito.verify(mockHttpURLConnection).setRequestProperty("Content-Type", "application/json; charset=" + charset);
    }

}