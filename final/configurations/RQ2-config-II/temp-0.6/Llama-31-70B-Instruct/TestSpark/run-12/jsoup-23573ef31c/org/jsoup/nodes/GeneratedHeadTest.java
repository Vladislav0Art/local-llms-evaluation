package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedHeadTest {

    @Test
    public void headTest() {
        Document document = Mockito.mock(Document.class);
        Mockito.when(document.head()).thenReturn(Mockito.mock(Element.class));
        Element head = document.head();
        Assert.assertNotNull(head);
    }

}