package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.mock;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document document = new Document("");
        List<FormElement> formElementList = document.forms();
        Assert.assertTrue(formElementList instanceof ArrayList);
    }

}