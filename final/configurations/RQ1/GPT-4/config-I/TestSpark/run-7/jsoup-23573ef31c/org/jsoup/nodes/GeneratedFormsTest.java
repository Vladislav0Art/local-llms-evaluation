package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document document = Jsoup.parse("<form id='form1'><input name='city' /></form><form id='form2'></form>");
        List<FormElement> forms = document.forms();
        assertEquals(2, forms.size());
        assertEquals("form1", forms.get(0).id());
        assertEquals("form2", forms.get(1).id());
    }

}