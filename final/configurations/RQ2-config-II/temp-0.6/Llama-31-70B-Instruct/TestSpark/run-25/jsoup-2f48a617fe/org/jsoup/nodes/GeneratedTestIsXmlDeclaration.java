package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestIsXmlDeclaration {

    @Test
    public void testIsXmlDeclaration() {
        Comment comment = new Comment("test");
        boolean actualValue = comment.isXmlDeclaration();
        boolean expectedValue = false;
        assertEquals(expectedValue, actualValue);
    }

}