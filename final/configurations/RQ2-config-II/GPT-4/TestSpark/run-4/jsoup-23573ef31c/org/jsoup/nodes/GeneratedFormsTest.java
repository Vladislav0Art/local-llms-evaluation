package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document document = new Document("https://www.example.com");
        List<FormElement> forms = document.forms();
        Assert.assertNotNull(forms);
    }

}