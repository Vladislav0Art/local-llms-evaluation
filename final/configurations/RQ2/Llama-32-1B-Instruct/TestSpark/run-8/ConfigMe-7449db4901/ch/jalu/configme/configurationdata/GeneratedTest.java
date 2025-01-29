package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentLine;
import ch.jalu.configme.configurationdata.FileComment;
import ch.jalu.configme.configurationdata.CommentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void testSetComment() {
        String path = "path";
        String[] commentLines = {"line1", "", "line3"};
        commentsConfiguration.setComment(path, commentLines);
        Assertions.assertEquals(2, commentsConfiguration.getAllComments().size());
        Assertions.assertEquals(CommentLine.LINE_1, commentsConfiguration.getAllComments().get(path).get(0));
    }

    @Test
    public void testGetAllComments() {
        String path = "path";
        String[] commentLines = {"line1", "", "line3"};
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path, Collections.singletonList(commentLines));
        commentsConfiguration.setComment(path, commentLines);
        Assertions.assertEquals(1, comments.get(path).size());
    }

    @Test
    public void testGetAllComments_OnlySingleLine() {
        String path = "path";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path, Collections.singletonList("line1"));
        commentsConfiguration.setComment(path, null);
        Assertions.assertEquals(0, comments.get(path).size());
    }

    @Test
    public void testGetAllComments_SingleLine() {
        String path = "path";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path, Collections.singletonList(new FileComment("", CommentType.LINE)));
        commentsConfiguration.setComment(path, null);
        Assertions.assertEquals(1, comments.get(path).size());
    }

    @Test
    public void testGetAllComments_SingleLine_Comment() {
        String path = "path";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path, Collections.singletonList(new FileComment("", CommentType.LINE, null)));
        commentsConfiguration.setComment(path, null);
        Assertions.assertEquals(1, comments.get(path).size());
    }

    @Test
    public void testGetAllComments_SingleLine_Comment_Mixed() {
        String path = "path";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path, Collections.singletonList(new FileComment("", CommentType.LINE, null)));
        commentsConfiguration.setComment(path, new FileComment("", CommentType.LINE, null));
        Assertions.assertEquals(1, comments.get(path).size());
    }

    @Test
    public void testGetAllComments_MultipleLines() {
        String path = "path";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path, Collections.singletonList(new FileComment("", CommentType.LINE)));
        commentsConfiguration.setComment(path, null);
        Assertions.assertEquals(1, comments.get(path).size());
    }

    @Test
    public void testGetAllComments_MultipleLines_OnlySingleLine() {
        String path = "path";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path, Collections.singletonList(new FileComment("", CommentType.LINE)));
        commentsConfiguration.setComment(path, null);
        Assertions.assertEquals(0, comments.get(path).size());
    }

    @Test
    public void testGetAllComments_MultipleLines_SingleLine() {
        String path = "path";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path, Collections.singletonList(new FileComment("", CommentType.LINE)));
        commentsConfiguration.setComment(path, null);
        Assertions.assertEquals(1, comments.get(path).size());
    }

    @Test
    public void testGetAllComments_MultipleLines_OnlySingleLine() {
        String path = "path";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path, Collections.singletonList(new FileComment("", CommentType.LINE)));
        commentsConfiguration.setComment(path, null);
        Assertions.assertEquals(0, comments.get(path).size());
    }

    @Test
    public void testGetAllComments_MultipleLines_SingleLine() {
        String path = "path";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path, Collections.singletonList(new FileComment("", CommentType.LINE)));
        commentsConfiguration.setComment(path, null);
        Assertions.assertEquals(1, comments.get(path).size());
    }

    @Test
    public void testGetAllComments_MultipleLines_SingleLine() {
        String path = "path";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path, Collections.singletonList(new FileComment("", CommentType.LINE)));
        commentsConfiguration.setComment(path, null);
        Assertions.assertEquals(0, comments.get(path).size());
    }

    @Test
    public void testGetAllComments_MultipleLines_SingleLine() {
        String path = "path";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path, Collections.singletonList(new FileComment("", CommentType.LINE)));
        commentsConfiguration.setComment(path, null);
        Assertions.assertEquals(1, comments.get(path).size());
    }

    @Test
    public void testGetAllComments_MultipleLines_SingleLine() {
        String path = "path";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path, Collections.singletonList(new FileComment("", CommentType.LINE)));
        commentsConfiguration.setComment(path, null);
        Assertions.assertEquals(0, comments.get(path).size());
    }

}