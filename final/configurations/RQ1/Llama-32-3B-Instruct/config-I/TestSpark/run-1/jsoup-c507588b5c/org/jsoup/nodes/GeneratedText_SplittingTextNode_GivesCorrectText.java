package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_SplittingTextNode_GivesCorrectText {

    @Test
    public void text_SplittingTextNode_GivesCorrectText() throws IOException {
        String encodedText = "&lt;Hello&gt; &amp; World";
        Document document = new Document(encodedText);
        TextNode textNode = (TextNode) document.body().children().get(0);
        assert (textNode.text().equals("&lt;Hello&gt; "));
    }

}