package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.FormElement;
import org.jsoup.Connection;
import org.jsoup.select.Elements;

import java.util.List;
import java.nio.charset.Charset;

public class GeneratedHeadTest {

    @Test
    public void headTest() {
        Document document = new Document("https://example.com");
        Element head = Mockito.mock(Element.class);
        document.head(head);
        Assert.assertEquals(head, document.head());
    }

}