package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document document = new Document("http://justforfun.com");
        List<FormElement> forms = document.forms();
        Assert.assertNotNull(forms);
    }

}