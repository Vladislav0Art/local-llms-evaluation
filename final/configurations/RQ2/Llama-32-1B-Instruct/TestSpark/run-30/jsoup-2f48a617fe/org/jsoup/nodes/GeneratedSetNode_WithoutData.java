package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.ParserResult;
import org.mockito.Mockito;

public class GeneratedSetNode_WithoutData {

    public static String nodeName(String data) {
        return data.equals("/*") ? "Comment" : data;
    }

    public static String getData() {
        return "";
    }

    @Test
    public void setNode_WithoutData() throws Exception {
        Comment comment = new Comment("/*");
        comment.setNode(node -> {
            String data = node.getData();
            if (data.equals("/*")) {
                return null;
            }
            return null;
        });

        Assert.assertTrue(comment.toString().contains(data));
    }

    public static void mockCommentNoData() throws Exception {
        Mockito.mock(Parser.class);
        ParseSettings settings = new ParseSettings();
        Mockito.when(mockSettings.newLine()).thenReturn(true);

        Mockito.mock(Parser.class, () -> new Parser(settings));

        Comment comment = new Comment("/*");
        comment.setNode(node -> {
            String data = node.getData().trim();
            if (data.equals("/*")) {
                return null;
            }
            return null;
        });

        Assert.assertTrue(comment.toString().contains(data));
    }

}