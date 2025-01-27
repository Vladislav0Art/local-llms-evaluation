package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAsXmlDeclaration_returnsNull {

    @Test
    public void asXmlDeclaration_returnsNull() {
        Comment comment = new Comment("");
        XmlDeclaration result = comment.asXmlDeclaration();
        assertNull(result);
    }

}