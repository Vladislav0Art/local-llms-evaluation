package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsXmlDeclaration {

    @Mock
    private Appendable accum;

    @Test
    public void asXmlDeclaration() {
        Comment comment = new Comment("<!-- data -->");
        XmlDeclaration xmlDecl = comment.asXmlDeclaration();
        assertNotNull(xmlDecl);
        assertEquals("<!-- data -->", xmlDecl.toString());
    }

}