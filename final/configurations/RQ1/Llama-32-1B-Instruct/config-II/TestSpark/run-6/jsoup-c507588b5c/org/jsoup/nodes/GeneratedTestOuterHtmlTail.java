package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.jsoup.helper.Validate;

public class GeneratedTestOuterHtmlTail {

    private static Document document = new Document();

    @Test
    public void testOuterHtmlTail() {
        // Test outer Html tail method. It checks that the output is HTML and it's pretty-printed.
        String html = "<p>Hello <span>World!</span></p>";
        Appendable appendable = new StringBuilder();
        int depth = 0;
        document.html(html, appendable, depth);
        assertEquals("<p><span>Hello World!</span></p>", appendable.toString());
        assertEquals(HTMLPrettifier.PRETTY_PRINT, document.OutputSettings.prettyPrint());
    }

}