package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateTextNode_EmptyText {

    @Test
    public void createTextNode_EmptyText() {
        TextNode node = new TextNode("");
        assert node.text().isEmpty();
    }

}