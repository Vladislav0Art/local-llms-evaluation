package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.util.function.Supplier;

public class GeneratedAsXmlDeclaration_test {

    @Test
    public void asXmlDeclaration_test() {
        Comment comment = new Comment("This is a test");
        XmlDeclaration xmlDeclaration = (XmlDeclaration) comment.asXmlDeclaration();
        assertEquals("<comment>", xmlDeclaration.toString());
    }

}