package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

public class GeneratedHeadTest {

    @Test
    public void headTest() {
        Document document = Mockito.mock(Document.class);
        Element element = Mockito.mock(Element.class);
        when(document.head()).thenReturn(element);
        Assert.assertEquals(element, document.head());
    }

}