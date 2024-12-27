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

public class GeneratedUpdateMetaCharsetElement_Boolean_Test {

    @Test
    public void updateMetaCharsetElement_Boolean_Test() {
        boolean update = true;
        Document document = new Document("https://example.com");
        document.updateMetaCharsetElement(update);
        assertTrue(document.updateMetaCharsetElement());
    }

}