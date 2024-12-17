package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.util.function.Function;

public class GeneratedTest_splitText_nonEmpty {

    @Test
    public void test_splitText_nonEmpty() {
        Document document = new Document();
        String[] expected = {"<p>This is a sample text.</p>", "<p>and this is another one.</p>"};
        Function<TextNode, TextNode> split = createSplitFunction();
        for (String str : expected) {
            result = document.createTextNode(split.apply(str));
            assertEquals(expected.length, result.text().length());
        }
    }

}