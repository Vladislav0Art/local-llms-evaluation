package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAsXmlDeclaration_returnsNull_ifNotAnXmlDeclaration {

    @Test
    public void asXmlDeclaration_returnsNull_ifNotAnXmlDeclaration() {
        Comment comment = new Comment("!xml declaration");
        assertNull(comment.asXmlDeclaration());
    }

}