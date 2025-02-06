package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedConnection_returnsCorrectConnection {

    @Test
    public void connection_returnsCorrectConnection() {
        Connection connection = new Connection();
        Document document = new Document("http://example.com");
        document.connection(connection);
        assertEquals(connection, document.connection());
    }

}