package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestPopStackToCloseCommentToken {

    @Test
    public void testPopStackToCloseCommentToken() {
        Token commentToken = createCommentToken("comment", "text", null, null);
        Mockito.when(commentToken.getTokenizer()).thenReturn(Mockito.mock(Readable.class));
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(null, null, Mockito.mock(Readable.class));
        xmlTreeBuilder.popStackToClose(commentToken);
    }

}