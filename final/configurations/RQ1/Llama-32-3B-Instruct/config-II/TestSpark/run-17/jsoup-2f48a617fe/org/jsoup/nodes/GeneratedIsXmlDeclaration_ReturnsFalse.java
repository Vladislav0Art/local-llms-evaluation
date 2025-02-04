package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsXmlDeclaration_ReturnsFalse {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private Element parentNode;

    @Test
    public void isXmlDeclaration_ReturnsFalse() {
        Comment comment = new Comment("<!-- comment -->");
        assertFalse(comment.isXmlDeclaration());
    }

}