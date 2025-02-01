package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDocumentCloneTest {

    @Test
    public void DocumentCloneTest() {
        Document doc = new Document("http://example.com");
        Document clone = doc.clone();
        assertNotSame(doc, clone);
        assertEquals(doc.location(), clone.location());
    }

}