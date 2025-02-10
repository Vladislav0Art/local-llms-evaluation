package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.jsoup.helper.Validate;

public class GeneratedTestSplitText {

    private static Document document = new Document();

    @Test
    public void testSplitText() {
        // Test split this text node into two nodes at the specified string offset. After splitting, this node will contain
        // the original text up to the offset, and will have a new text node sibling containing the text after the offset.
        document = new Document();
        TextNode textNode = new TextNode("Hello World");
        textNode.splitText(5);
        assertEquals("Hello\nWorld", document.text());
    }

}