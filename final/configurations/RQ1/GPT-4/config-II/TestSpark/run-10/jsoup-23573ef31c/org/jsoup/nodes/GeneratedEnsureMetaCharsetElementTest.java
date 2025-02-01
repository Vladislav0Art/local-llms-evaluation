package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import com.google.common.base.Charsets;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedEnsureMetaCharsetElementTest {

    @Test
    public void ensureMetaCharsetElementTest() {
        Document document = new Document("http://example.com");
        document.charset(Charsets.ISO_8859_1);
        document.updateMetaCharsetElement(true);
        String expectedHtml = "<!DOCTYPE html>\n" +
                "<html>\n" +
                " <head>\n" +
                "  <meta charset=\"ISO-8859-1\">\n" +
                " </head>\n" +
                " <body></body>\n" +
                "</html>";
        assertEquals(expectedHtml, document.outerHtml());
    }

}