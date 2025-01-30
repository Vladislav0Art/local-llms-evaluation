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

public class GeneratedExpectFormTest {

    @Test
    public void expectFormTest() {
        Document doc = mock(Document.class);
        when(doc.expectForm("form")).thenCallRealMethod();
        Elements elements = mock(Elements.class);
        when(doc.select("form")).thenReturn(elements);
        doc.expectForm("form");
        verify(doc).select("form");
    }

}