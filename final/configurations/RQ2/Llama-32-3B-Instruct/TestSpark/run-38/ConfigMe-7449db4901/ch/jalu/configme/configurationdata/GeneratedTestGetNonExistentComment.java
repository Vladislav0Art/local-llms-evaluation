package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetNonExistentComment {

    @Test
    public void testGetNonExistentComment() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);

        assertNull(commentsConfiguration.getComment("non-existent-path"));
    }
}

public class CommentsConfiguration {
    private Map<String, List<String>> comments;

    public CommentsConfiguration(Map<String, List<String>> comments) {
        this.comments = comments;
    }

    public List<String> getComment(String path) {
        return comments.get(path);
    }

    public void setComment(String path, String comment) {
        if (!comments.containsKey(path)) {
            comments.put(path, new ArrayList<>());
        }
        comments.get(path).add(comment);
    }

}