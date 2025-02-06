package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedConnection_ReturnsCorrectConnection {

    @Test
    public void connection_ReturnsCorrectConnection() {
        Connection connection = Jsoup.connect("https://example.com");
        Document document = new Document(connection.baseUrl());
        assertNotNull(document.connection());
    }

}