package org.jsoup.parser;

public class GeneratedProcess_TokenDoctypeDoesNothing {

    @Test
    public void process_TokenDoctypeDoesNothing() {
        Token token = Token.DOCTYPE;
        boolean updated = new XmlTreeBuilder().process(token);
        assertFalse(updated);
    }

}