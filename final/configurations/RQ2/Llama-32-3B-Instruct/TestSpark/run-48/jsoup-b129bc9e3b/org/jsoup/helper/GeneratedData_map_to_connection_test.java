package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.nio.charset.Charset;

public class GeneratedData_map_to_connection_test {

    @Test
    public void data_map_to_connection_test() {
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        Connection conn = HttpConnection.data(data);
        assertNotNull(conn);
    }

}