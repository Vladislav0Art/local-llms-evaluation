package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.jsoup.Connection;
import org.jsoup.Document;
import org.jsoup.Element;
import org.jsoup.Selector;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedTestCreateElement {

    @Mock
    private Connection connection;

    @Test
    public void testCreateElement() {
        Element element = new Element();
        when(connection.createElement("div")).thenReturn(element);
        Document document = new Document("https://www.example.com");
        Element createdElement = document.createElement("div");
        assertEquals(element, createdElement);
    }

}