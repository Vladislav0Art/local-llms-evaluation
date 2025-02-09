package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedExpectFormReturnsNull FormNotFound DocumentNoForm {

    @Test
    public void expectFormReturnsNull

    FormNotFound DocumentNoForm() {
        Document document = new Document("https://example.com");
        String cssQuery = "div";
        FormElement form = null;
        assertEquals(form, document.expectForm(cssQuery));
    }

}