package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.jsoup.Jsoup.connect;

public class GeneratedCreateElement_returnsNonNullElement {

    private Connection connectionMock = Mockito.mock(Connection.class);

    @Test
    public void createElement_returnsNonNullElement() {
        Document document = new Document();
        Element element = document.createElement("div");
        assertNotNull(element);
    }

}