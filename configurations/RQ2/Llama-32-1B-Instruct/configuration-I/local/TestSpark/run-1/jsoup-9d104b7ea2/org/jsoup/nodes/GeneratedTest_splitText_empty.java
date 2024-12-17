package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.util.function.Function;

public class GeneratedTest_splitText_empty {

    @Test
    public void test_splitText_empty() {
        Document document = new Document();
        String[] expected = {"", ""};
        Function<TextNode, TextNode> split = createSplitFunction();
        TextNode result = document.createTextNode(split.apply(document.getText()));
        assertEquals(expected[0], result.text());
        assertEquals(expected[1], split.apply(result));
    }

}