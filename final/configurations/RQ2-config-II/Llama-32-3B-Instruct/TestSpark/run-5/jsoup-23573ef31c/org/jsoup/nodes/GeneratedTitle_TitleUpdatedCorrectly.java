package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

public class GeneratedTitle_TitleUpdatedCorrectly {

    @Test
    public void title_TitleUpdatedCorrectly() {
        // Given
        Document document = new Document("https://www.example.com");
        String title = "Example Title";

        // When
        document.title(title);

        // Then
        assertEquals(title, document.title());
    }

}