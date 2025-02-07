package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        String htmlString = "<html><body>This is a comment</body></html>";
        Document document = parse(htmlString);
        Appendable accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, document.getOutputSettings());
        assertEquals("<p>This is a comment</p>", accum.toString());
    }

}