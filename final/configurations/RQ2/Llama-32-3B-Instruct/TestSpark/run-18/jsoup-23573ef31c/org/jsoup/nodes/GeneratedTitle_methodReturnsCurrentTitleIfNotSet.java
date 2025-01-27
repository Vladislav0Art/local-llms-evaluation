package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTitle_methodReturnsCurrentTitleIfNotSet {

    @BeforeClass
    public static void setup() {
        Document.document = null;
    }

    private static Document document = new Document("");

    @Test
    public void title_methodReturnsCurrentTitleIfNotSet() {
        assertNotNull(document.title());
        assertEquals(document.title(), "title");
    }

}