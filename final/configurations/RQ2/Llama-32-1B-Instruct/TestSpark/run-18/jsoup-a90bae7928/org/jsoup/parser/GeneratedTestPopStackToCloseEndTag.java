package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestPopStackToCloseEndTag {

    @Test
    public void testPopStackToCloseEndTag() {
        Token endTag = createEndTag("endTag", null);
        Mockito.when(endTag.getTokenizer()).thenReturn(Mockito.mock(Readable.class));
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(null, null, Mockito.mock(Readable.class));
        xmlTreeBuilder.popStackToClose(endTag);
    }

}