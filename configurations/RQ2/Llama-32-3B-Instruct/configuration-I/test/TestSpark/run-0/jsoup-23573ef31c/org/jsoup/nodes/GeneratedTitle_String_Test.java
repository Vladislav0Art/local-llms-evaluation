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

public class GeneratedTitle_String_Test {

    @Test
    public void title_String_Test() {
        String title = "Example Title";
        Document document = new Document("https://example.com");
        document.title(title);
        assertEquals(title, document.title());
    }

}