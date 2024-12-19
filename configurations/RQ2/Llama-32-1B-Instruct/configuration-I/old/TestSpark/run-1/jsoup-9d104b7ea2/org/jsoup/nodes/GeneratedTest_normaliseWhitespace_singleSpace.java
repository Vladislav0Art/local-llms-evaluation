package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.util.function.Function;

public class GeneratedTest_normaliseWhitespace_singleSpace {

    @Test
    public void test_normaliseWhitespace_singleSpace() {
        String string = "  ";
        String normalised = normaliseWhitespace(string);
        assertEquals(" ", normalised);
    }

    private static Function<TextNode, TextNode> createSplitFunction() {
        return (TextNode textNode) -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < textNode.text().length(); i++) {
                if (i == textNode.text().length() - 1 || textNode.text().charAt(i) != ' ') {
                    sb.append(textNode.text().charAt(i));
                }
            }
            return new TextNode(sb.toString());
        };
    }

}