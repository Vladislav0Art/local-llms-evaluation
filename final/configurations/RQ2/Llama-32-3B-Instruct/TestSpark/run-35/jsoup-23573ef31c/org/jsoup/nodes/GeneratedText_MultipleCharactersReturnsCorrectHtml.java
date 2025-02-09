package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedText_MultipleCharactersReturnsCorrectHtml {

    @Mock
    private Connection connection;

    @Test
    public void text_MultipleCharactersReturnsCorrectHtml() {
        String text = "abc";
        Element element = new Document("https://www.example.com").text(text);
        org.junit.Assert.assertEquals("<abc>", element.outerHtml());
    }

}