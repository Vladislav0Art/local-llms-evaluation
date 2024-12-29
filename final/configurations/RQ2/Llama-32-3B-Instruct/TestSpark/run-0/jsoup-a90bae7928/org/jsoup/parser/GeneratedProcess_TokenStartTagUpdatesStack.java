package org.jsoup.parser;

public class GeneratedProcess_TokenStartTagUpdatesStack {

    @Test
    public void process_TokenStartTagUpdatesStack() {
        Token token = Token.START_TAG;
        List<Node> stack = new ArrayList<>();
        boolean updated = new XmlTreeBuilder().process(token);
        assertTrue(updated);
    }

}