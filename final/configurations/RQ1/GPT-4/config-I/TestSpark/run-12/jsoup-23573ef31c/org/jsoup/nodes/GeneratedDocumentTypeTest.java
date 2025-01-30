package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.*;

public class GeneratedDocumentTypeTest {

    @Test
    public void documentTypeTest() {
        Document doc = Jsoup.parse("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
        assertNotNull(doc.documentType());
    }

}