package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

public class GeneratedConnection_ConnectionReturnedCorrectly {

    @Test
    public void connection_ConnectionReturnedCorrectly() {
        // Given
        Connection connection = new Connection();

        // When
        Document document = new Document("https://www.example.com");

        // Then
        assertEquals(connection, document.connection());
    }

}