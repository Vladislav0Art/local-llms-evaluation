package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.ParserResult;
import org.mockito.Mockito;

public class GeneratedSetNode_CommentsWithXmlDeclarationAndData {

    public static String nodeName(String data) {
        return data.equals("/*") ? "Comment" : data;
    }

    public static String getData() {
        return "";
    }

    @Test
    public void setNode_CommentsWithXmlDeclarationAndData() throws Exception {
        Comment comment = new Comment("/*");
        comment.setNode(node -> {
            String data = node.getData();
            if (data.equals("/*")) {
                return comment;
            }
            return null;
        });

        Assert.assertTrue(comment.toString().contains(data));
    }

}