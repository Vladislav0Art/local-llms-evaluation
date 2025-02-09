package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedFormsMethodTest {

    @Test
    public void formsMethodTest() {
        List<FormElement> forms = new ArrayList<>();
        Document document = new Document();
        FormElement form = document.forms().get(0);
        assertNotNull(form);
    }

}