package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestPopStackToCloseDoctype {

    @Test
    public void testPopStackToCloseDoctype() {
        String input = "<root><a/> <b/></root>";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token d = new Token(Token.Doctype.doctype(), null, null, true);
        builder.popStackToClose(d);
        Mockito.verify(builder).popStackToClose(Mockito.any());
    }

}