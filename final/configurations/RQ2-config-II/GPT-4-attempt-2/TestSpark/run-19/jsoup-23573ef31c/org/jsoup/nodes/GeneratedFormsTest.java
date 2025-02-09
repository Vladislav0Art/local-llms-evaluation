package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document document = new Document("http://example.com");
        List<FormElement> formElements = document.forms();
        assertNotNull(formElements);
    }

}