package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedTextString_test {

    @Test
    public void textString_test() {
        String text = "Hello World!";
        Element element = new Element("p");
        Document document = Document.createShell("http://example.com").text(text).element(element);
        assertEquals(text, document.text());
    }

}