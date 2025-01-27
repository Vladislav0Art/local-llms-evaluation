package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

public class GeneratedTestCompareCommentsConfig {

    @Test
    public void testCompareCommentsConfig() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        CommentsConfiguration commentsConfig1 = new CommentsConfiguration(comments);
        Map<String, List<String>> comments2 = new HashMap<>();
        comments2.put("path3", Arrays.asList("line3"));
        CommentsConfiguration commentsConfig2 = new CommentsConfiguration(comments2);
        assertTrue(!commentsConfig1.equals(commentsConfig2));
    }
}

class CommentsConfiguration {
    private Map<String, List<String>> comments;

    public CommentsConfiguration(Map<String, List<String>> comments) {
        this.comments = comments;
    }

    public List<String> getAllComments() {
        return new ArrayList<>(comments.values());
    }

    public List<String> getCommentList() {
        return comments.keySet();
    }

    @Override
    public boolean equals(Objects obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        CommentsConfiguration other = (CommentsConfiguration) obj;
        return comments.equals(other.comments);
    }

}