package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedExpectFormByCssQuery {

    @Test
    public void expectFormByCssQuery() {
        Document document = new Document("https://www.example.com");
        FormElement form = document.expectForm("form");
        assertNotNull(form);
    }

}