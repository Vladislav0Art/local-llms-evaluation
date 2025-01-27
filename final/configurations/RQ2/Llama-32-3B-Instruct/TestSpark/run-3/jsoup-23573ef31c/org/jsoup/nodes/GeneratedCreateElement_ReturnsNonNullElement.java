package org.jsoup.nodes;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.jsoup.Jsoup.connect;

public class GeneratedCreateElement_ReturnsNonNullElement {

    private Connection connectionMock = Mockito.mock(Connection.class);

    @Test
    public void createElement_ReturnsNonNullElement() {
        Document document = new Document();
        Element element = document.createElement("div");
        assertNotNull(element);
    }

}