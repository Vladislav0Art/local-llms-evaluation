package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAccumulationComment {

    @Test
    public void testAccumulationComment() {
        // Given
        XmlDeclaration comment1 = new XmlDeclaration("<!--data-->");
        XmlDeclaration comment2 = new XmlDeclaration();

        // When
        Comment accum = new Comment().accumulate(comment1, comment2);

        // Then
        assertTrue(accum.asXmlDeclaration().toString().contains("<!--data-->"));
    }

}