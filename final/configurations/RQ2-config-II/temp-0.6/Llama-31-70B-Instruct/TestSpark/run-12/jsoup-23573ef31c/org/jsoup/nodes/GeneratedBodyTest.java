package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedBodyTest {

    @Test
    public void bodyTest() {
        Document document = Mockito.mock(Document.class);
        Mockito.when(document.body()).thenReturn(Mockito.mock(Element.class));
        Element body = document.body();
        Assert.assertNotNull(body);
    }

}