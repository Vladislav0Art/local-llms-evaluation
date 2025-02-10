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

public class GeneratedPost_document_to_document_test {

    @Test
    public void post_document_to_document_test() throws IOException {
        URL url = new URL("http://example.com");
        Connection conn = HttpConnection.connect(url);
        Document document = conn.post();
        assertNotNull(document);
    }

}