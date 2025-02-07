package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;

public class GeneratedTestIsXmlDeclaration {

    @Test
    public void testIsXmlDeclaration() {
        String htmlString = "<html><body>This is a comment</body></html>";
        Document document = parse(htmlString);
        Assert.assertTrue(comment.isXmlDeclaration(), comment.asXmlDeclaration().isPresent());
    }

}