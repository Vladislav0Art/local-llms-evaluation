package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class GeneratedExpectFormSelectsFormCorrectly {

    @Test
    public void expectFormSelectsFormCorrectly() {
        String cssQuery = "div";
        FormElement form = new Document().expectForm(cssQuery);
        assertNotNull(form);
    }

}