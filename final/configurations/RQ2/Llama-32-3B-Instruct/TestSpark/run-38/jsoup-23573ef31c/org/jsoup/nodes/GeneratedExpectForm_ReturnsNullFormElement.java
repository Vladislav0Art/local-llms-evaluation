package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedExpectForm_ReturnsNullFormElement {

    @Test
    public void expectForm_ReturnsNullFormElement() {
        String cssQuery = "div";
        Document document = new Document("");
        FormElement formElement = document.expectForm(cssQuery);
        assertNull(formElement);
    }

}