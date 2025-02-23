package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestAsXmlDeclaration {

    @Test
    public void testAsXmlDeclaration() {
        Comment comment = new Comment("test");
        XmlDeclaration actualValue = comment.asXmlDeclaration();
        assertEquals(null, actualValue);
    }

}