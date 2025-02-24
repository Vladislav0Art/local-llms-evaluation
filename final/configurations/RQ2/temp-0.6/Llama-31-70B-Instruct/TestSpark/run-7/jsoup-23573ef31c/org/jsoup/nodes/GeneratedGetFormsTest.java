package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetFormsTest {

    @Test
    public void getFormsTest() {
        // Arrange
        Document document = new Document("baseUri");

        // Act
        List<FormElement> forms = document.forms();

        // Assert
        assertNotNull(forms);
        assertEquals(0, forms.size());
    }

}