package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsXmlDeclaration_ReturnsNull {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private Element parentNode;

    @Test
    public void asXmlDeclaration_ReturnsNull() {
        Comment comment = new Comment("<!-- comment -->");
        assertNull(comment.asXmlDeclaration());
    }

}