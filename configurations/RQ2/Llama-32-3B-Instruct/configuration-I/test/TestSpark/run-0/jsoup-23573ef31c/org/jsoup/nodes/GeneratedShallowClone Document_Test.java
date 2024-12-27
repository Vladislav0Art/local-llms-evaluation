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

public class GeneratedShallowClone Document_Test {

    @Test
    public void shallowClone

    Document_Test() {
        Document document = new Document("https://example.com");
        Document shallowClonedDocument = document.shallowClone();
        assertNotNull(shallowClonedDocument);
    }

}