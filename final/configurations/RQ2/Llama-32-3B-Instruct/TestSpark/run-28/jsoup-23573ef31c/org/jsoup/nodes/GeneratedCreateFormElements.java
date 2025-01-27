package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateFormElements {

    @Test
    public void createFormElements() {
        Document document = new Document("https://www.example.com");
        List<FormElement> forms = document.forms();
        assertNotNull(forms);
    }

}