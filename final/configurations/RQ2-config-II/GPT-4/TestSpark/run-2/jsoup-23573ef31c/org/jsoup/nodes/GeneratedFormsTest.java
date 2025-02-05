package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.nodes.*;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document document = Document.createShell("http://example.com");
        List<FormElement> formElements = document.forms();
        Assert.assertNotNull(formElements);
    }

}