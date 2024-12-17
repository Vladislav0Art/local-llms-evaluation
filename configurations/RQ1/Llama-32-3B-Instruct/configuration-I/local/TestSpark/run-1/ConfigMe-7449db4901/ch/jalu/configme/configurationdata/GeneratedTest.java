package ch.jalu.configme.configurationdata;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;

@RunWith(JUnit4.class)
public class GeneratedTest {

    private Map<String, List<String>> comments;

    public static CommentsConfiguration create() {
        return new CommentsConfiguration();
    }

    public CommentsConfiguration() {
    }

    public void setComment(String path, String... lines) {
        if (comments == null) {
            comments = new HashMap<>();
        }
        for (String line : lines) {
            comments.computeIfAbsent(path, k -> new ArrayList<>()).add(line);
        }
    }

    public Map<String, List<String>> getComments() {
        return comments;
    }

    public Map<String, List<String>> getAllComments() {
        return comments;
    }
}

public class GeneratedTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key1", Collections.singletonList("line1"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertTrue(config.getAllComments().containsKey("key1"));
        assertEquals(1, ((List<String>) config.getAllComments().get("key1")).size());
    }

    @Test
    public void getAllCommentsEmpty() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertTrue(config.getAllComments().isEmpty());
    }

    @Test
    public void setCommentAddLineTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "line1");
        assertTrue(config.getAllComments().containsKey("path1"));
        assertEquals(1, ((Map<String, List<String>>) config.getAllComments()).get("path1").size());
    }

    @Test
    public void setCommentAddMultipleLineTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "line1", "line2");
        assertTrue(config.getAllComments().containsKey("path1"));
        assertEquals(2, ((Map<String, List<String>>) config.getAllComments()).get("path1").size());
    }

    @Test
    public void setCommentAddMultipleLineTest2() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "line2", "line1");
        assertTrue(config.getAllComments().containsKey("path1"));
        assertEquals(2, ((Map<String, List<String>>) config.getAllComments()).get("path1").size());
    }

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        config.setComment("path1", "line1");
        config.setComment("path2", "line2");
        assertEquals(2, ((Map<String, List<String>>) config.getAllComments()).size());
    }

}