package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestPopStackToCloseEndTag {

    @Test
    public void testPopStackToCloseEndTag() {
        String input = "<root><a/> <b/></root>";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token endTag = new Token(Token.EndTag.end(), null, null, true);
        builder.popStackToClose(endTag);
        Mockito.verify(builder).popStackToClose(Mockito.any());
    }

}