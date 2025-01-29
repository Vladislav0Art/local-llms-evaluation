package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestInsertDoctype {

    @Test
    public void testInsertDoctype() {
        String input = "<root><a/> <b/></root>";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token d = new Token(Token.Doctype.doctype(), null, null, true);
        builder.insert(d);
        Mockito.verify(builder).insertToken(Mockito.any());
    }

}