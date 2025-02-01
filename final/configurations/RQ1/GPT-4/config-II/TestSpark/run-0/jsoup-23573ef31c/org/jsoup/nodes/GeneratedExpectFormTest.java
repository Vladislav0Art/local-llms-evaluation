package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedExpectFormTest {

    @Test
    public void expectFormTest() {
        Document doc = Mockito.mock(Document.class);
        Mockito.when(doc.select("form")).thenReturn(new Elements());
        doc.expectForm("form");
    }

}