package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestPopStackToCloseComment {

    @Test
    public void testPopStackToCloseComment() {
        String input = "<root><a/> <b/></root>";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token commentToken = new Token(Token.Comment.comment(), null, null, true);
        builder.popStackToClose(commentToken);
        Mockito.verify(builder).popStackToClose(Mockito.any());
    }

}