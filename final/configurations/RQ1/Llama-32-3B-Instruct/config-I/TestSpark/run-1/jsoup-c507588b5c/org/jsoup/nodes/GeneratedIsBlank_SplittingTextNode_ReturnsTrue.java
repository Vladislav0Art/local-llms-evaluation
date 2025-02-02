package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlank_SplittingTextNode_ReturnsTrue {

    @Test
    public void isBlank_SplittingTextNode_ReturnsTrue() throws IOException {
        String encodedText = "&lt;Hello&gt; &amp; ";
        Document document = new Document(encodedText);
        TextNode textNode = (TextNode) document.body().children().get(0);
        assert (textNode.isBlank());
    }

}