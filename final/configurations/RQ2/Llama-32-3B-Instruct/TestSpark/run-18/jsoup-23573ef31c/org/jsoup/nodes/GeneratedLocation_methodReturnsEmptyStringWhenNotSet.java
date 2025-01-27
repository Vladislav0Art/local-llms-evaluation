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
public class GeneratedLocation_methodReturnsEmptyStringWhenNotSet {

    @BeforeClass
    public static void setup() {
        Document.document = null;
    }

    private static Document document = new Document("");

    @Test
    public void location_methodReturnsEmptyStringWhenNotSet() {
        assertNotNull(document.location());
        assertNull(document.location().getUrl());
    }

}