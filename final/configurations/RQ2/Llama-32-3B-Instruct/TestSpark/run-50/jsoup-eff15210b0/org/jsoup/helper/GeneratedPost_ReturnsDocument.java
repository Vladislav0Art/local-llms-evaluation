package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Document;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedPost_ReturnsDocument {

    @Test
    public void post_ReturnsDocument() throws IOException {
        Document document = new org.jsoup.nodes.Document();
        List<String> data = new ArrayList<>();
        data.add("<html><body>Hello World!</body></html>");
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data.get(0).getBytes());
        HttpURLConnection connection = (HttpURLConnection) inputStream.getInputStream();
        Connection request = HttpConnection.request().url("http://example.com").requestBody(String.valueOf(document));
        request.post().connect();
        assertEquals(document, ((org.jsoup.nodes.Document) request.execute().response()).get());
    }

}