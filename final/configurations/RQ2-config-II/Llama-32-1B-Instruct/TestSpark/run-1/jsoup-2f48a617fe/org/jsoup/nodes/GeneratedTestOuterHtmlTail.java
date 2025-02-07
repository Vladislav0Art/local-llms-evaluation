package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() throws IOException {
        String htmlString = "<html><body>This is a comment</body></html>";
        Document document = parse(htmlString);
        Appendable accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, document.getOutputSettings());
        assertEquals("<p></p>", accum.toString());
    }

}