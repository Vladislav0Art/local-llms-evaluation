package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.jsoup.helper.Validate;

public class GeneratedTestIsBlank {

    private static Document document = new Document();

    @Test
    public void testIsBlank() {
        // Test that this text node is blank -- that is, empty or only whitespace (including newlines).
        assertFalse(document.text().isBlank());
    }

}