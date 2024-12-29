package org.jsoup.parser;

public class GeneratedProcess_TokenEndTagUpdatesStackAndAddsToResult {

    @Test
    public void process_TokenEndTagUpdatesStackAndAddsToResult() {
        Token token = Token.END_TAG;
        List<Node> result = new ArrayList<>();
        boolean updated = new XmlTreeBuilder().process(token);
        assertTrue(updated);
        assertEquals(1, result.size());
    }

}