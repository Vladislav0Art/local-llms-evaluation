package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        TextNode text = createText("");
        Appendable accum = mock(Appendable.class);
        Document document = mock(Document.class);

        outerHtmlHead(accum, 0, document).when((Document.OutputSettings) any()).prettyPrint().thenReturn(true);
        outerHtmlHead(accum, 1, document).when((Document.OutputSettings) any()).prettyPrint().thenReturn(false);

        verify(accum).append("", 0, Document.OutputSettings.class);
        verify(accum).append("", 1, Document.OutputSettings.class);
    }

}