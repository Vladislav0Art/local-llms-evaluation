package org.jsoup.parser;

public class GeneratedInsertComment_InsertsCommentIntoDocument {

    @Test
    public void insertComment_InsertsCommentIntoDocument() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment();
        Document document = new Document();
        builder.insert(commentToken);
        List<Comment> comments = document.comments();
        Assert.containsExactly(comments, commentToken);
    }

}