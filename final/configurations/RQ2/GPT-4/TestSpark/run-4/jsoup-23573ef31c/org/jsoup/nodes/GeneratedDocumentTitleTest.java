package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedDocumentTitleTest {

    @Test
    public void documentTitleTest() {
        Document document = new Document("http://test.url");
        document.title("Test Title");
        assertEquals("Test Title", document.title());
    }

}