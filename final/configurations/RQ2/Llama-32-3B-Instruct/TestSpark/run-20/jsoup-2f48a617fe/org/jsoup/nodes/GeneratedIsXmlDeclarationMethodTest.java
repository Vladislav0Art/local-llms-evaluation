package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsXmlDeclarationMethodTest {

    @Test
    public void isXmlDeclarationMethodTest() {
        // Arrange

        // Act
        boolean isDeclaration = new Comment("some data").isXmlDeclaration();

        // Assert
        assertTrue(isDeclaration);
    }

}