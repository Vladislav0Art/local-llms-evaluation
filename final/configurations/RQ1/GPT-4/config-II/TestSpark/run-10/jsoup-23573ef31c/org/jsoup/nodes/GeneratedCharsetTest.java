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

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document document = new Document("http://example.com");
        Charset utf8 = Charsets.UTF_8;
        document.charset(utf8);
        assertEquals(utf8, document.charset());
    }

}