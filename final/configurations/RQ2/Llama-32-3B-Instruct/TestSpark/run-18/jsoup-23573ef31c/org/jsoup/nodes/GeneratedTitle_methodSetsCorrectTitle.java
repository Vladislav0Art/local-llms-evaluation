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
public class GeneratedTitle_methodSetsCorrectTitle {

    @BeforeClass
    public static void setup() {
        Document.document = null;
    }

    private static Document document = new Document("");

    @Test
    public void title_methodSetsCorrectTitle() {
        document.title("newTitle");
        assertEquals("newTitle", document.title());
    }

}