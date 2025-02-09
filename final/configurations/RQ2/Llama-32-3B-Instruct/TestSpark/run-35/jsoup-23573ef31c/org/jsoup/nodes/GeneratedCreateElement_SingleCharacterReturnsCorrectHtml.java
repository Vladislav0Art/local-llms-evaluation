package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateElement_SingleCharacterReturnsCorrectHtml {

    @Mock
    private Connection connection;

    public Document document = new Document("https://www.example.com");

    @Test
    public void createElement_SingleCharacterReturnsCorrectHtml() {
        Element element = new Document("https://www.example.com").text("a");
        org.junit.Assert.assertEquals("<a>", element.outerHtml());
    }

}