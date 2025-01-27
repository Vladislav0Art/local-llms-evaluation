package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParserSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedAsXmlDeclaration_ReturnsNullIfNotXmlDeclaration {

    @Test
    public void asXmlDeclaration_ReturnsNullIfNotXmlDeclaration() {
        Comment comment = new Comment("some data");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assert xmlDeclaration == null;
        Mockito.verifyNoMethodCalls();
    }

}