package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetCommentEmpty {

    @Test
    public void testGetCommentEmpty() throws Exception {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        assertEquals(Collections.emptyList(), commentsConfiguration.getComments());
    }
}

public class CommentsConfiguration {
    public Map<String, List<String>> commentsMap;

    public CommentsConfiguration() {
        this.commentsMap = new HashMap<>();
    }

    public void setComment(String path, String comment) {
        if (commentsMap.containsKey(path)) {
            ((List<String>) commentsMap.get(path)).add(comment);
        } else {
            List<String> list = new ArrayList<>();
            list.add(comment);
            commentsMap.put(path, list);
        }
    }

    public Map<String, List<String>> getComments() {
        return commentsMap;
    }

}