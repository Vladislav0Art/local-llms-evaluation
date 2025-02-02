package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_GivenTextNode_ReturnsEncodedText {

    @Test
    public void text_GivenTextNode_ReturnsEncodedText() throws IOException {
        Document document = new Document("<html><body>" + new TextNode("Hello World").outerHtml());
        assert (document.body().children().get(0).text().equals("Hello World"));
    }

}