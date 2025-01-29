package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.nio.charset.CharsetEncoder;
import java.nio.charset.CharsetEncoderCompat;

public class GeneratedTestForms {

    private static final String BASE_URI = "https://example.com";

    @Test
    public void testForms() {
        // Arrange
        String uri = BASE_URI + "/test.html";
        Element head = new Document(uri).head();
        Elements forms = head.getElementsByTag("form");

        // Act
        List<FormElement> formElements = new ArrayList<>();
        for (Element form : forms) {
            FormElement formElement = document.expectForm(form.attr("id"));
            formElements.add(formElement);
        }

        // Assert
        assertEquals(1, formElements.size());
    }

}