package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestInsertComment {

    @Test
    public void testInsertComment() {
        String input = "<root><a/> <b/></root>";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token commentToken = new Token(Token.Comment.comment(), null, null, true);
        builder.insert(commentToken);
        Mockito.verify(builder).insertComment(Mockito.any());
    }

}