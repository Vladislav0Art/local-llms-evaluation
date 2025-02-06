package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedAsXmlDeclaration_returnsNull {

    @Test
    public void asXmlDeclaration_returnsNull() {
        // Arrange & Act
        Comment comment = new Comment("data");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        // Assert
        assertThat(xmlDeclaration, is(null));
    }

}