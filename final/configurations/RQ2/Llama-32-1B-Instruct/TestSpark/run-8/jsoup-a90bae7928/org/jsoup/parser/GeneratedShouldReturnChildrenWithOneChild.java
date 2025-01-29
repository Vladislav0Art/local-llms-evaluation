package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.fail;

public class GeneratedShouldReturnChildrenWithOneChild {

    @Test
    public void shouldReturnChildrenWithOneChild() {
        // Arrange
        String input = "<a><b>";

        // Act
        Node[] children = Parse_Fragment_NoBaseUri(input);

        // Assert
        fail("Expected Parse_Fragment_NoBaseUri(String) to return an array of child nodes");
        for (Node node : children) {
            System.out.println(node);
        }
    }

}