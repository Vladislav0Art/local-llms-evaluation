package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestOuterHtmlHead_Indent_SplitNode_Children {

    @Test
    public void testOuterHtmlHead_Indent_SplitNode_Children() throws IOException {
        TextNode text = createText("");
        Appendable accum = mock(Appendable.class);

        outerHtmlHead(accum, 0, document()).when((Document.OutputSettings) any()).prettyPrint().thenReturn(true);
        outerHtmlTail(accum, 1, document()).when((Document.OutputSettings) any()).prettyPrint().thenReturn(false);

        TextNode result = text.splitText(2);
        verify(accum).append("", 0, Document.OutputSettings.class);
        verify(accum).append("", 1, Document.OutputSettings.class);
        verify(result).splitText(3);
    }

}