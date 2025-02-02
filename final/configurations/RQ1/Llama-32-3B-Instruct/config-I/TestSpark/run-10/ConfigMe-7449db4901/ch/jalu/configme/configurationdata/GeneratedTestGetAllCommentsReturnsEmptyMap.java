package ch.jalu.configme.configurationdata;

import java.util.*;

public class GeneratedTestGetAllCommentsReturnsEmptyMap {

    private Map<String, List<String>> comments;

    public CommentConfiguration() {
        this.comments = new HashMap<>();
    }

    public void addComment(String key, String value) {
        if (!comments.containsKey(key)) {
            comments.put(key, new ArrayList<>());
        }
        comments.get(key).add(value);
    }

    public Map<String, List<String>> getAllComments() {
        return Collections.unmodifiableMap(comments);
    }
}

public class CommentTest {

    private CommentConfiguration commentsConfiguration;

    @Before
    public void setup() {
        this.commentsConfiguration = new CommentConfiguration();
    }

    @Test
    public void testGetAllCommentsReturnsEmptyMap() {
        Map<String, List<String>> map = new HashMap<>();
        commentsConfiguration.getAllComments().equals(map);
    }

}