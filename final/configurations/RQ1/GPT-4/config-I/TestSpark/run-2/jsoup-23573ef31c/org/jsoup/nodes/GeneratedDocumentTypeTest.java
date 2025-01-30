package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDocumentTypeTest {

    @Test
    public void documentTypeTest() {
        Document doc = mock(Document.class);
        doCallRealMethod().when(doc).documentType();
        assertNull(doc.documentType());
    }

}