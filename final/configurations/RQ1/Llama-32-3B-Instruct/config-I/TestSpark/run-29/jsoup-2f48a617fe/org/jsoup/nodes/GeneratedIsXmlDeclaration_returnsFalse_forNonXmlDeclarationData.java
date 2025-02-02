package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsXmlDeclaration_returnsFalse_forNonXmlDeclarationData {

    @Test
    public void isXmlDeclaration_returnsFalse_forNonXmlDeclarationData() {
        Comment comment = new Comment("Hello World!");
        assertFalse(comment.isXmlDeclaration());
    }

}