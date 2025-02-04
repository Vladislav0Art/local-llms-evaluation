package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration_isEmptyMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertEquals(0, config.comments.size());
    }

    @Test
    public void newCommentsConfiguration_isCreatedWithPassedArguments() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("test", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        assertEquals(commentsMap, config.comments);
    }

    @Test
    public void setComment_addsNewLineWithoutMarker() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path = "test";
        List<String> commentLines = Arrays.asList("comment1\n", "comment2");
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        config.setComment(path, commentLines.get(0), commentLines.get(1));
        assertEquals(Collections.singletonList(commentLines.get(0)), config.comments.get(path));
    }

    @Test
    public void setComment_overwritesExistingComments() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path = "test";
        List<String> commentLines = Arrays.asList("comment1", "\n", "comment2");
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        config.setComment(path, "newComment1", "newComment2");
        assertEquals(Collections.singletonList("newComment1"), config.comments.get(path));
    }

    @Test
    public void getAllComments_returnsUnmodifiableMap() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path = "test";
        List<String> commentLines = Arrays.asList("comment1", "comment2");
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        config.setComment(path, commentLines.get(0), commentLines.get(1));
        Map<String, @UnmodifiableView List<String>> result = config.getAllComments();
        assertTrue(result instanceof UnmodifiableMap);
    }

    @Test
    public void getAllComments_returnsCorrectPathEntries() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path = "test";
        List<String> commentLines = Arrays.asList("comment1", "comment2");
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        config.setComment(path, commentLines.get(0), commentLines.get(1));
        Map<String, @UnmodifiableView List<String>> result = config.getAllComments();
        assertEquals(Arrays.asList(commentLines.get(0)), result.get(path));
    }

}