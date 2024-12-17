package ch.jalu.configme.configurationdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedGetAllCommentsTest {

    private Map<String, List<String>> comments;

    public static CommentsConfiguration create() {
        return new CommentsConfiguration();
    }

    public CommentsConfiguration(Map<String, List<String>> comments) {
        this.comments = comments;
    }

    public Map<String, List<String>> getComments() {
        return comments;
    }

    public void setComment(String path, String... lines) {
        if (comments == null) {
            comments = new HashMap<>();
        }
        for (String line : lines) {
            comments.computeIfAbsent(path, k -> new ArrayList<>()).add(line);
        }
    }

    public Map<String, List<String>> getAllComments() {
        return comments;
    }
}

public class GeneratedTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration config = CommentsConfiguration.create();
        Map<String, List<String>> comments = new HashMap<>();
        config.setComment("path1", "line1");
        config.setComment("path2", "line2");
        assertEquals(2, ((Map<String, List<String>>) config.getAllComments()).size());
    }

}