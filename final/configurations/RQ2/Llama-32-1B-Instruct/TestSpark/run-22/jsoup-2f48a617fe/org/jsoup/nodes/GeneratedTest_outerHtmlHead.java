package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTest_outerHtmlHead {

    public static void testNodeName() {
        String expected = "Comment";
        Element comment = new Comment().outerHtmlHead(parserSettings, 0, null).join();
        assertEquals(expected, comment.toString());
    }

    @Test
    public void test_outerHtmlHead() throws IOException {
        Document document = new Document();
        Element root = (Element) new Comment().outerHtmlHead(parserSettings, 0, null).join();
        String expected = "<Comment>";
        element = new Comment(root.toString()).outerHtmlHead(parserSettings, 0, null);
        assertEquals(expected, element.outerHtml);
    }
}

private static ParseSettings parserSettings = new ParseSettings();

public static void main(String[] args) {
    TestSpark.run();
}

}