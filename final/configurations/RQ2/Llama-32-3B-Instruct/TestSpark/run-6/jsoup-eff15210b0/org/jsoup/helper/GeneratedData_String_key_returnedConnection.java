package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.DataUtil;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class GeneratedData_String_key_returnedConnection {

    @Test
    public void data_String_key_returnedConnection() {
        String key = "key";
        Connection connection = HttpConnection.data(key, null, null);
        assertNotNull(connection);
        assertEquals(key, ((HttpConnection) connection).data().getKey());
    }

}