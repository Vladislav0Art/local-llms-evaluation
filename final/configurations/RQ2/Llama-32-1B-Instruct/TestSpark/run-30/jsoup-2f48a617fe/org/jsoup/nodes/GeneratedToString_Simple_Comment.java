package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.ParserResult;
import org.mockito.Mockito;

public class GeneratedToString_Simple_Comment {

    public static String nodeName(String data) {
        return data.equals("/*") ? "Comment" : data;
    }

    public static String getData() {
        return "";
    }

    @Test
    public void toString_Simple_Comment() throws Exception {
        Mockito.mock(Parser.class);
        ParseSettings settings = new ParseSettings();
        Parser parser = new Parser(settings);

        Comment comment = new Comment("/*");
        comment.setNode(node -> {
            String data = node.getData().trim();
            if (data.equals("/*")) {
                return comment;
            }
            return null;
        });

        Assert.assertTrue(comment.toString().contains("Comment"));
    }

}