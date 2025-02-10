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

public class GeneratedMethod_request_method_test {

    @Test
    public void method_request_method_test() {
        Method method = Method.GET;
        Connection conn = HttpConnection.method(method);
        assertNotNull(conn);
    }

}