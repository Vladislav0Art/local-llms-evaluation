package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeIterator;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAsXmlDeclaration_returnsCommentWhenDataIsNotEmpty {

    @Test
    public void asXmlDeclaration_returnsCommentWhenDataIsNotEmpty() {
        Comment comment = new Comment("data");
        XmlDeclaration result = comment.asXmlDeclaration();
        assertNotNull(result);
        assertEquals(comment, result);
    }

}