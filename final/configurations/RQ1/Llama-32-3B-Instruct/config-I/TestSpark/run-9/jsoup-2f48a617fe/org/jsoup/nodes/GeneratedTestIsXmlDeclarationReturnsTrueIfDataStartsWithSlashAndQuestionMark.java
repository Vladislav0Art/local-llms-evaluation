package org.jsoup.nodes;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.*;

public class GeneratedTestIsXmlDeclarationReturnsTrueIfDataStartsWithSlashAndQuestionMark {

    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
    }

    @Test
    public void testIsXmlDeclarationReturnsTrueIfDataStartsWithSlashAndQuestionMark() {
        String data = "!?xml";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

}