package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document doc = new Document("http://example.com");
        List<FormElement> forms = doc.forms();
        assertNotNull(forms);
    }

}