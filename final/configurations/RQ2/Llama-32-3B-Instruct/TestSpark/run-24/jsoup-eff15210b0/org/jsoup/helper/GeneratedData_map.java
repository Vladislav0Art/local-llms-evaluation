package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.Method;
import org.jsoup.Request;
import org.jsoup.Response;
import org.jsoup.KeyVal;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedData_map {

    @Test
    public void data_map() {
        Map<String, String> data = Mockito.mock(Map.class);
        Connection connection = new HttpConnection();
        assert connection.data(data).equals(connection);
    }

}