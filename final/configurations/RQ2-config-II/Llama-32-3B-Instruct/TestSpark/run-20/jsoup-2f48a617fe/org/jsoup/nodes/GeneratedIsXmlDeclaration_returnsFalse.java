package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedIsXmlDeclaration_returnsFalse {

    @Test
    public void isXmlDeclaration_returnsFalse() {
        // Arrange & Act
        Comment comment = new Comment("");
        boolean isXmlDeclaration = comment.isXmlDeclaration();
        // Assert
        assertThat(isXmlDeclaration, is(false));
    }

}