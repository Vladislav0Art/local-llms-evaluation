package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedOuterHtmlTail_GivenAccumDepthOutSettingsThrowsIOException {

    private TextNode textNode = new TextNode("text");

    @Test
    public void outerHtmlTail_GivenAccumDepthOutSettingsThrowsIOException() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        when(out.depth()).thenReturn(0);
        when(accum.toString()).thenThrow(new IOException());
        TextNode textNode = new TextNode("text");
        try {
            textNode.outerHtmlTail(accum, 1, out);
            fail("IOException was not thrown");
        } catch (IOException e) {
            // expected
        }
    }

}