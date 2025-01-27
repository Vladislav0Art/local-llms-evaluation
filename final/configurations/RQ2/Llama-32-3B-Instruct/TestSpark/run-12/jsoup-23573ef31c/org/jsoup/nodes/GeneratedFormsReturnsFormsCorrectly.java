package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class GeneratedFormsReturnsFormsCorrectly {

    @Test
    public void formsReturnsFormsCorrectly() {
        String cssQuery = "div";
        List<FormElement> forms = new Document().forms(cssQuery);
        assertNotNull(forms);
    }

}