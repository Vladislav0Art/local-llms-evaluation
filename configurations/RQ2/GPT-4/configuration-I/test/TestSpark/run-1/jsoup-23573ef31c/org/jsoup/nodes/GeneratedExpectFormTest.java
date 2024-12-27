package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.mockito.Mockito;

public class GeneratedExpectFormTest {

    @Test
    public void expectFormTest() {
        Document document = new Document("http://baseUri");
        FormElement formElement = document.expectForm("form");
        assertNull(formElement);
    }

}