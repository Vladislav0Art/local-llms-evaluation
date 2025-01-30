package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedExpectFormTest {

    @Test
    public void expectFormTest() {
        Document document = Jsoup.parse("<form id='form1'><input name='city' /></form><form id='form2'></form>");
        FormElement formElement = document.expectForm("#form1");
        assertNotNull(formElement);
        assertEquals("form1", formElement.id());
    }

}