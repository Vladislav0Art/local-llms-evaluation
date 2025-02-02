package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlank_GivenTextNode_ReturnsFalse {

    @Test
    public void isBlank_GivenTextNode_ReturnsFalse() throws IOException {
        Document document = new Document("<html><body>" + new TextNode("Hello World").outerHtml());
        assert (!((TextNode) document.body().children().get(0))..isBlank());
    }

}