package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedOuterHtmlHead_AnonymousTextNode_ThrowsIOException {

    @Test
    public void outerHtmlHead_AnonymousTextNode_ThrowsIOException() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.getEncoding()).thenReturn("UTF-8");
        TextNode node = new TextNode("");
        try {
            node.outerHtmlHead(accum, 0, out);
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

}