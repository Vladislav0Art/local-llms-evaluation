package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlTail_MockAppendable {

    @Test
    public void outerHtmlTail_MockAppendable() throws IOException {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        when(outerHtmlTail(Mockito.any(Appendable.class), 0, Mockito.mock(Document.OutputSettings.class))).thenReturn("Hello World");
        TextNode node = new TextNode("", "", "");
        assertThrows(IllegalArgumentException.class, () -> node.outerHtmlTail(accum, 0, out));
    }

}