package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedIsBlank_Test {

    @Test
    public void isBlank_Test() {
        Document document = new Document();
        Element element = document.createElement("p");
        element.setText("");
        assertTrue(document.body.html().contains(" "));
    }

}