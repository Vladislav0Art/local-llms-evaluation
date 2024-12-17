package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTestAsXmlDeclaration_NoXMLDeclaration {

    private static final String XML_DECLARATION_DATA = "<!xml version=\"1.0\" encoding=\"utf-8\"?><!DOCTYPE comment SYSTEM \"http://www.w3.org/1999/xhtml\"><comment>Some text</comment>";

    public CommentTest() {
        // Mocking for xmlDeclaration asXmlDeclaration method
        Mockito.mock(XmlDeclaration.class);
    }

    @Test
    public void testAsXmlDeclaration_NoXMLDeclaration() throws IOException, NoSuchMethodException {
        String data = "Some text";
        Comment comment = new Comment(data);
        assertNull(comment.asXmlDeclaration());
    }

}