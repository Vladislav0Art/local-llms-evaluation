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
public class GeneratedData_StringString_MocksDataMethod {

    @Mock
    private HttpURLConnection mockHttpURLConnection;

    @Test
    public void data_StringString_MocksDataMethod() {
        String key = "test";
        String value = "example";
        HttpConnection.connect(key, value);
        Mockito.verify(mockHttpURLConnection).addRequestProperty(key, value);
    }

}