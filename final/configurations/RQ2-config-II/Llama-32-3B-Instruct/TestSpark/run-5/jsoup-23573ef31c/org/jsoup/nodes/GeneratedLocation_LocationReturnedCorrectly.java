package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

public class GeneratedLocation_LocationReturnedCorrectly {

    @Test
    public void location_LocationReturnedCorrectly() {
        // Given
        Document document = new Document("https://www.example.com");

        // When
        String location = document.location();

        // Then
        assertNotEquals(location, "");
    }

}