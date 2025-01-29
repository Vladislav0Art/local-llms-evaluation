package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void test_comments_getAllComments() {
        List<String> commentLines1 = Collections.singletonList("");
        List<String> commentLines2 = Arrays.asList("Line 1", "Line 2");
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", commentLines1);
        comments.put("anotherPath", commentLines2);

        Map<String, List<String>> result = commentsConfiguration.getAllComments();
        assertEquals(commentLines1, result.get("path"));
        assertEquals(commentLines2, result.get("anotherPath"));
    }

    @Test
    public void test_setComment_setNewLine() {
        String path = "path";
        String commentLines[] = {""};
        CommentsConfiguration.commentsConfiguration.setComment(path, commentLines);

        List<String> expectedCommentLines = Collections.singletonList("");
        assertEquals(expectedCommentLines, commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void test_setComment_setExistingComment() {
        String path = "path";
        String existingCommentLine = "";
        CommentsConfiguration.commentsConfiguration.setComment(path, existingCommentLine);

        List<String> expectedCommentLines = Arrays.asList(existingCommentLine);
        assertEquals(expectedCommentLines, commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void test_setComment_emptyPath() {
        String path = "";
        String commentLines[] = {""};

        CommentsConfiguration.commentsConfiguration.setComment(path, commentLines);

        List<String> expectedCommentLines = Arrays.asList("");
        assertEquals(expectedCommentLines, commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void test_setComment_pathWithoutExistingComment() {
        String path = "path";
        String existingCommentLine = "";
        CommentsConfiguration.commentsConfiguration.setComment(path, existingCommentLine);

        List<String> expectedCommentLines = Arrays.asList(existingCommentLine);
        assertEquals(expectedCommentLines, commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void test_setComment_noExistingComment() {
        String path = "path";
        List<String> commentLines[] = {""};
        CommentsConfiguration.commentsConfiguration.setComment(path, commentLines);

        Map<String, List<String>> result = commentsConfiguration.getAllComments();
        assertEquals(commentLines, result.get("path"));
    }

    @Test
    public void test_setComment_emptyPathAndExistingComment() {
        String path = "";
        String existingCommentLine = "";
        CommentsConfiguration.commentsConfiguration.setComment(path, existingCommentLine);

        List<String> expectedCommentLines = Arrays.asList(existingCommentLine);
        assertEquals(expectedCommentLines, commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void test_setComment_emptyPathAndNoExistingComment() {
        String path = "";
        CommentsConfiguration.commentsConfiguration.setComment(path, "");

        Map<String, List<String>> result = commentsConfiguration.getAllComments();
        assertEquals(Collections.emptyList(), result.get("path"));
    }

}