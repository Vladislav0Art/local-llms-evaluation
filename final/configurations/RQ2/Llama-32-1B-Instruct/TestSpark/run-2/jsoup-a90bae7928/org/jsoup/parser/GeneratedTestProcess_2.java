package org.jsoup.parser;

public class GeneratedTestProcess_2 {

    @Test
    public void testProcess_2() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilderImpl();
        Token token = Token.StartTag("<root>", "/path/to/baseUri");
        xmlTreeBuilder.process(token);
        assert !xmlTreeBuilder.result.equals(null);
    }

    private static class Token {
        String text;

        Token(String text) {
            this.text = text;
        }
    }

    private static class Node {
        String uri;

        Node(String uri) {
            this.uri = uri;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Token token = (Token) o;
            return uri.equals(token.uri);
        }
    }

    private static class Element extends Node {
    }

}