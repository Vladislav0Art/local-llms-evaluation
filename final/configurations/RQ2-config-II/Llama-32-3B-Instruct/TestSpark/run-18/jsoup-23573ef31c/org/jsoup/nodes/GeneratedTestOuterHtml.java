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
public class GeneratedTestOuterHtml {

    @Mock
    private Connection connection;

    @Test
    public void testOuterHtml() {
        Document document = new Document("https://www.example.com");
        when(document.getXml()).thenReturn("<html>Example Content</html>");
        assertEquals("<html>Example Content</html>", document.outerHtml());
    }

}