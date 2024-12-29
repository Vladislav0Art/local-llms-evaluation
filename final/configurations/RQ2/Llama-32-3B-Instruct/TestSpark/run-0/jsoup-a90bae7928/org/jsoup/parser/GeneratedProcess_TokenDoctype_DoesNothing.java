package org.jsoup.parser;

public class GeneratedProcess_TokenDoctype_DoesNothing {

    @Test
    public void process_TokenDoctype_DoesNothing() {
        Token token = Token.DOCTYPE;
        boolean updated = new XmlTreeBuilder().process(token);
        assertFalse(updated);
    }

}