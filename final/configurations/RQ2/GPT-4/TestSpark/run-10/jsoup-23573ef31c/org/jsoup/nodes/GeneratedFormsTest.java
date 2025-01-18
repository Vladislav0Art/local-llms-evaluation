package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document document = new Document("https://www.google.com");
        List<FormElement> forms = document.forms();
        Assert.assertTrue(forms.isEmpty());
    }

}