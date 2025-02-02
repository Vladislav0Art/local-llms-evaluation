package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsXmlDeclaration_returnsTrue_forXmlDeclarationData {

    @Test
    public void isXmlDeclaration_returnsTrue_forXmlDeclarationData() {
        Comment comment = new Comment("!xml declaration");
        assertTrue(comment.isXmlDeclaration());
    }

}