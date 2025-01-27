package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAsXmlDeclarationMethodTest {

    @Test
    public void asXmlDeclarationMethodTest() {
        // Arrange

        // Act
        XmlDeclaration xmlDeclaration = new Comment("some data").asXmlDeclaration();

        // Assert
        assertNotNull(xmlDeclaration);
    }

}