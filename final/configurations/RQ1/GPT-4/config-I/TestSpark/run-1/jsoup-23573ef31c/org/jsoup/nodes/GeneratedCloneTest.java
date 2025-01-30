package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Parser;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document document = new Document("http://example.com");
        Document clone = document.clone();

        assertNotNull(clone);
        assertEquals(document.html(), clone.html());
        assertNotSame(document, clone);
    }

}