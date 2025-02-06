package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedCreateElement {

    @Test
    public void createElement() {
        String tagName = "p";
        Element element = mock(Element.class);
        Document document = new Document("");
        Element createdElement = document.createElement(tagName);
        assertThat(createdElement, is(element));
    }

}