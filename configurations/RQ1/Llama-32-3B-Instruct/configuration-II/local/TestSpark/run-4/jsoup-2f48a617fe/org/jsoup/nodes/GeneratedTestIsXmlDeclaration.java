package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestIsXmlDeclaration {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void testIsXmlDeclaration() {
        Comment comment = new Comment("<xml:tag/>");
        assertTrue(comment.isXmlDeclaration());

        Comment comment2 = new Comment("<!xml:tag>");
        assertTrue(comment2.isXmlDeclaration());

        Comment comment3 = new Comment("Not an XML Declaration");
        assertFalse(comment3.isXmlDeclaration());
    }

}