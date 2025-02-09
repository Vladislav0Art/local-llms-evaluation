package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class GeneratedConnection_connectionReturned {

    @Test
    public void connection_connectionReturned() {
        Connection connection = Jsoup.connect("https://example.com");
        Document document = Document.createShell(connection.getUri().toString());
        assertEquals(connection, document.connection());
    }

}