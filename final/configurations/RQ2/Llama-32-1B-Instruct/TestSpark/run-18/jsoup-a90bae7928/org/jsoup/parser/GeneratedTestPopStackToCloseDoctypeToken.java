package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestPopStackToCloseDoctypeToken {

    @Test
    public void testPopStackToCloseDoctypeToken() {
        Token d = createDoctypeToken("doctype", null, null);
        Mockito.when(d.getTokenizer()).thenReturn(Mockito.mock(Readable.class));
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(null, null, Mockito.mock(Readable.class));
        xmlTreeBuilder.popStackToClose(d);
    }

}