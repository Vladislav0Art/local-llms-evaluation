package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

public class GeneratedCreateShell_ShellDocumentCreated {

    @Test
    public void createShell_ShellDocumentCreated() {
        // Given
        String baseUri = "https://www.example.com";

        // When
        Document document = Document.createShell(baseUri);

        // Then
        assertNotNull(document);
    }

}