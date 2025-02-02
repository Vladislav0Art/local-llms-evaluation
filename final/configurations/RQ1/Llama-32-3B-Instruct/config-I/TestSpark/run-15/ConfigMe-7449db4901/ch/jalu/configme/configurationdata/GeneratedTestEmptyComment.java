package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class GeneratedTestEmptyComment {

    @Test
    public void testEmptyComment() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "testPath";
        List<String> commentLines = Collections.emptyList();
        configuration.setComment(path, commentLines);
        assertTrue(configuration.getComments().containsKey(path));
    }
}

public class CommentsConfiguration {

    private static final String NO_ARGS_MESSAGE = "%s cannot be applied to given types; required: no arguments";

    public CommentsConfiguration() {
        this.comments = new HashMap<>();
    }

    public static CommentsConfiguration create(Map<String, List<String>> commentsMap) {
        return new CommentsConfiguration(commentsMap);
    }

    private Map<String, List<String>> comments;

    public Map<String, List<String>> getComments() {
        return comments;
    }

    public void setComment(String path, List<String> commentLines) {
        if (commentLines == null || commentLines.isEmpty()) {
            throw new RuntimeException("Comment lines cannot be empty");
        }
        comments.put(path, commentLines);
    }

}