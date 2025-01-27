package org.jsoup.parser;

public class GeneratedPopStackToClose_InsertsEndTagIntoDocument {

    @Test
    public void popStackToClose_InsertsEndTagIntoDocument() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.EndTag endTag = new Token.EndTag();
        Document document = new Document();
        builder.popStackToClose(endTag);
        List<Token> tokens = document.tokens().stream()
                .filter(token -> token instanceof Token.EndTag).collect(Collectors.toList());
        Assert.containsExactly(tokens, endTag);
    }

}