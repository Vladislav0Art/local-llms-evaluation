package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestSetCommentEmptyLines {

    private Map<String, List<String>> comments = new HashMap<>();

    public void setComment(String path, String commentLine1, String commentLine2) {
        comments.put(path, Arrays.asList(commentLine1, commentLine2));
    }

    public Map<String,@java.util.Map.Entry<String,
    @java.util.List<String>>>

    getAllComments() {
        return Collections.unmodifiableMap(comments);
    }
}

public class GeneratedTest {
    private CommentsConfiguration commentsConfig = new CommentsConfiguration();

    @Test
    public void testSetCommentEmptyLines() {
        String path = "path";
        String commentLine1 = "\n";
        String commentLine2 = "comment line 2";
        commentsConfig.setComment(path, commentLine1, commentLine2);
        assertEquals(1, commentsConfig.getAllComments().size());
        assertTrue(commentsConfig.getAllComments().containsKey(path));
    }

}