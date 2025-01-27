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

public class GeneratedMethod_Method_method_ReturnsInstanceOfHttpConnection {

    @Test
    public void method_Method_method_ReturnsInstanceOfHttpConnection() {
        org.jsoup.helper.Method method = org.jsoup.helper.Method.GET;
        Connection connection = HttpConnection.method(method);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

}