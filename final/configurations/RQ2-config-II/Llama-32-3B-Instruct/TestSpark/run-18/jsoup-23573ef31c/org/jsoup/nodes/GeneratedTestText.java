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
public class GeneratedTestText {

    @Mock
    private Connection connection;

    @Test
    public void testText() {
        String text = "Example Text";
        Document document = new Document("https://www.example.com");
        when(document.getTextContent()).thenReturn(text);
        Element element = document.text(text);
        assertEquals(text, element.getText());
    }

}