package org.jsoup.parser;

public class GeneratedProcess_TokenCommentDoesNothing {

    @Test
    public void process_TokenCommentDoesNothing() {
        Token token = Token.COMMENT;
        boolean updated = new XmlTreeBuilder().process(token);
        assertFalse(updated);
    }

}