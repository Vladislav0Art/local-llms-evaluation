package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Document;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

public class GeneratedAsXmlDeclaration_ReturnsNullWhenNotDeclaration {

    @Test
    public void asXmlDeclaration_ReturnsNullWhenNotDeclaration() {
        Comment comment = new Comment("");
        assert comment.asXmlDeclaration() == null;
    }

    private <T> T mock(Class<T> clazz) {
        return Mockito.mock(clazz);
    }

}