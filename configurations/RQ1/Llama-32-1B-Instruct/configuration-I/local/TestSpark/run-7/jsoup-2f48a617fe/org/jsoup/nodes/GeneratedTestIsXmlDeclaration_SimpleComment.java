package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTestIsXmlDeclaration_SimpleComment {

    private static final String XML_DECLARATION_DATA = "<!xml version=\"1.0\" encoding=\"utf-8\"?><!DOCTYPE comment SYSTEM \"http://www.w3.org/1999/xhtml\"><comment>Some text</comment>";

    public CommentTest() {
        // Mocking for xmlDeclaration asXmlDeclaration method
        Mockito.mock(XmlDeclaration.class);
    }

    @Test
    public void testIsXmlDeclaration_SimpleComment() throws IOException, NoSuchMethodException {
        Comment comment = new Comment(XML_DECLARATION_DATA);
        assertTrue(comment.isXmlDeclaration());
    }

}