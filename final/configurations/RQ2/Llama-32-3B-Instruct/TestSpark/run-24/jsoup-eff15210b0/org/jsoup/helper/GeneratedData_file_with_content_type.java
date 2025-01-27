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

public class GeneratedData_file_with_content_type {

    @Test
    public void data_file_with_content_type() {
        String filename = "test.html";
        String contentType = "text/html";
        InputStream inputStream = Mockito.mock(InputStream.class);
        Connection connection = new HttpConnection();
        assert connection.data("key", filename, inputStream, contentType).equals(connection);
    }

}