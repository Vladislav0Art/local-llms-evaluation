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
public class GeneratedTestAsXmlDeclaration {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void testAsXmlDeclaration() {
        Comment comment = new Comment("<xml:tag/>");
        assertNull(comment.asXmlDeclaration());

        Comment comment2 = new Comment("<!xml:tag>");
        XmlDeclaration decl = comment2.asXmlDeclaration();
        assertNotNull(decl);
        assertTrue(decl.isXmlDeclaration());
    }

}