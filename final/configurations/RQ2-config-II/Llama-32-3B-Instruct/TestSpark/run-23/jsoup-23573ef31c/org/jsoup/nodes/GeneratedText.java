package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedText {

    @Test
    public void text() {
        String expectedText = "Hello World!";
        Document document = Jsoup.parse("<p>Hello World!</p>");
        Element element = mock(Element.class);
        document.text(expectedText, element);
        String actualText = element.text();
        assertThat(actualText, is(expectedText));
    }

}