package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Connection;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.OutputSettings;
import org.jsoup.nodes.QirksMode;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedText_String_Test {

    @Test
    public void text_String_Test() {
        String text = "Hello World!";
        Document document = new Document("https://example.com");
        Element element = Mockito.mock(Element.class);
        Element textElement = document.text(text) (element);
        assertNotNull(textElement);
    }

}