package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import javax.annotation.Nullable;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    private Document document;

    @Before
    public void setUp() {
        document = new Document("http://www.example.com");
    }

    @Test
    public void createDocumentTest() {
        assertNotNull(document);
    }

    @Test
    public void createShellTest() {
        Document shell = Document.createShell("http://www.example.com");
        assertNotNull(shell);
        assertEquals("http://www.example.com", shell.location());
        assertNull(shell.connection());
    }

    @Test
    public void locationTest() {
        assertEquals("http://www.example.com", document.location());
    }

    @Test
    public void connectionTest() {
        Document document = new Document("http://www.example.com");
        assertNull(document.connection());
    }

}