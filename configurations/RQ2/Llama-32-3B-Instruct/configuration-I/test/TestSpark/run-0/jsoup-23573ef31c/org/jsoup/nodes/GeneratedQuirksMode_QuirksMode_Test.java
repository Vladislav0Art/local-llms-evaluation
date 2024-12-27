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

public class GeneratedQuirksMode_QuirksMode_Test {

    @Test
    public void quirksMode_QuirksMode_Test() {
        QuirksMode quirksMode = Mockito.mock(QuirksMode.class);
        Document document = new Document("https://example.com");
        Document quirksModeDocument = document.quirksMode(quirksMode);
        assertNotNull(quirksModeDocument);
    }

}