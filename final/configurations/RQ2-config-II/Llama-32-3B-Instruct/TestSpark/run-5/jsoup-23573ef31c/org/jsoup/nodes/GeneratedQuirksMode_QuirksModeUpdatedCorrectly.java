package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

public class GeneratedQuirksMode_QuirksModeUpdatedCorrectly {

    @Test
    public void quirksMode_QuirksModeUpdatedCorrectly() {
        // Given
        QuirksMode quirksMode = QuirksMode.CLOSE_STRICT;

        // When
        Document document = new Document("https://www.example.com");
        Document updatedDocument = document.quirksMode(quirksMode);

        // Then
        assertEquals(quirksMode, updatedDocument.quirksMode());
    }

}