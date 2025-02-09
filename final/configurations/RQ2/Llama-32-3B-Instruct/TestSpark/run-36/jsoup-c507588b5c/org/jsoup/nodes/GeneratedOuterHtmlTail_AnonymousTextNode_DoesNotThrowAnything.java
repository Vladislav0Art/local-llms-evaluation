package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedOuterHtmlTail_AnonymousTextNode_DoesNotThrowAnything {

    @Test
    public void outerHtmlTail_AnonymousTextNode_DoesNotThrowAnything() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        TextNode node = new TextNode("");
        assertDoesNotThrow(() -> node.outerHtmlTail(accum, 0, out));
    }

}