package org.jsoup.parser;

public class GeneratedProcess_TokenComment_DoesNothing {

    @Test
    public void process_TokenComment_DoesNothing() {
        Token token = Token.COMMENT;
        boolean updated = new XmlTreeBuilder().process(token);
        assertFalse(updated);
    }

}