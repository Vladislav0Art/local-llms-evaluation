package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.mockito.Mockito;

public class GeneratedDocumentTypeTest {

    @Test
    public void documentTypeTest() {
        Document document = new Document("http://baseUri");
        assertNull(document.documentType());
    }

}