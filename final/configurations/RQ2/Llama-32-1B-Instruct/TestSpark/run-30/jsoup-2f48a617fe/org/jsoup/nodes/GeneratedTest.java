package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.ParserResult;
import org.mockito.Mockito;

public class GeneratedTest {

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

    @Test
    public void toString_Simple_CommentWithData() throws Exception {
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

        Assert.assertTrue(comment.toString().contains(data));
    }

    @Test
    public void toString_Simple_CommentWithDataNoSpaces() throws Exception {
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

        Assert.assertTrue(comment.toString().contains(data));
    }

    public static void mockParser(Parser parser) throws Exception {
        Mockito.mock(parser, new Constructor<Parser>() {
            @Override
            protected Parser createInstance() {
                return parser;
            }
        });
    }

    public static void mockComment(Set<ParseSettings> settings) throws Exception {
        Mockito.mock(Parser.class);
        ParseSettings mockSettings = new ParseSettings();
        Mockito.when(mockSettings.newLine()).thenReturn(true);

        Mockito.mock(Parser.class, () -> new Parser(mockSettings));
        Comment comment = new Comment("/*");
        comment.setNode(node -> {
            String data = node.getData().trim();
            if (data.equals("/*")) {
                return comment;
            }
            return null;
        });

        Assert.assertTrue(comment.toString().contains(data));
    }

    @Test
    public void setNode_CommentsWithData() throws Exception {
        Comment comment = new Comment("/*");
        comment.setNode(node -> {
            String data = node.getData().trim();
            if (data.equals("/*")) {
                return comment;
            }
            return null;
        });

        Assert.assertTrue(comment.toString().contains(data));
    }

    @Test
    public void setNode_CommentsWithoutData() throws Exception {
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

    @Test
    public void setNode_CommentsWithXmlDeclaration() throws Exception {
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

    @Test
    public void setNode_CommentsWithoutXmlDeclaration() throws Exception {
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

    @Test
    public void setNode_WithoutXmlDeclaration() throws Exception {
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

    @Test
    public void setNode_CommentsWithXmlDeclarationAndNoData() throws Exception {
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

    @Test
    public void setNode_CommentsWithXmlDeclarationAndNoData() throws Exception {
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

    @Test
    public void setNode_CommentsWithXmlDeclarationAndNoData() throws Exception {
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

}