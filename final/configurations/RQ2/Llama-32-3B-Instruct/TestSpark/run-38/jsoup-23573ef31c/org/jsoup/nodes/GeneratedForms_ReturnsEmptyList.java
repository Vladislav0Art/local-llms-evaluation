package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedForms_ReturnsEmptyList {

    @Test
    public void forms_ReturnsEmptyList() {
        Document document = new Document("");
        List<FormElement> list = document.forms();
        assertTrue(list.isEmpty());
    }

}