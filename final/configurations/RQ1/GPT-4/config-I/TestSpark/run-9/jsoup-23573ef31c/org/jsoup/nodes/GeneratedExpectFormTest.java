package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class GeneratedExpectFormTest {

    @Test
    public void expectFormTest() {
        Document doc = Document.createShell("http://example.com");
        doc.expectForm("form[name=testForm]");
    }

}