package org.jsoup.parser;

public class GeneratedProcess_TokenStartTag_UpdatesStack {

    @Test
    public void process_TokenStartTag_UpdatesStack() {
        Token token = Token.START_TAG;
        List<Node> stack = new ArrayList<>();
        boolean updated = new XmlTreeBuilder().process(token);
        assertTrue(updated);
    }

}