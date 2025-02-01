package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.FormElement;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;
import javax.annotation.Nullable;

public class GeneratedExpectFormTest {

    @Test
    public void expectFormTest() {
        Document doc = Document.createShell("http://example.com");
        try {
            doc.expectForm("");
            Assert.fail("Exception not thrown on invalid expectForm call");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("No form elements matched the query '' in the document.", e.getMessage());
        }
    }

}