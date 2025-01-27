package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.jsoup.Connection.Method.HEAD;
import static org.jsoup.Connection.Method.GET;
import static org.jsoup.Connection.Method.POST;
import static org.jsoup.Connection.Method.PATCH;
import static org.jsoup.Connection.Method.PUT;
import static org.jsoup.Connection.Method.DELETE;
import static org.jsoup.Connection.Method.TRACK;
import static org.jsoup.Connection.Method.OTHER;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestData_list_data {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private CookieManager cookieManager;

    @Mock
    private Proxy proxy;

    public void setupMocks() {
        Mockito.when(sslSocketFactory.getSocketFactory()).thenReturn(Mockito.anySSLSocketFactory());
        Mockito.when(cookieManager.getCookieStore()).thenReturn(Mockito.any(CookieStore.class ()));
    }

    @Test
    public void testData_list_data() {
        List<Connection.KeyVal> data = new ArrayList<>();
        data.add(Connection.KeyVal.create("key1", "value1"));
        data.add(Connection.KeyVal.create("key2", "value2"));
        Connection connection = HttpConnection.data(data);
        assertNotNull(connection);
    }

}