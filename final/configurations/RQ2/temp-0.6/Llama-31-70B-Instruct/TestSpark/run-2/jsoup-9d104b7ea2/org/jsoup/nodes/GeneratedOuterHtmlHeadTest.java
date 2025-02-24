package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("TextNode");
        Appendable appendable = mock(Appendable.class);
        textNode.outerHtmlHead(appendable, 1, mock(Document.OutputSettings.class));
        verify(appendable).append("TextNode");
    }

}