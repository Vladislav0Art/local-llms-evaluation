package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlHead_MockAppendable {

    @Test
    public void outerHtmlHead_MockAppendable() throws IOException {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        when(outerHtmlHead(Mockito.any(Appendable.class), 0, Mockito.mock(Document.OutputSettings.class))).thenReturn("Hello World");
        TextNode node = new TextNode("", "", "");
        assertThrows(IllegalArgumentException.class, () -> node.outerHtmlHead(accum, 0, out));
    }

}