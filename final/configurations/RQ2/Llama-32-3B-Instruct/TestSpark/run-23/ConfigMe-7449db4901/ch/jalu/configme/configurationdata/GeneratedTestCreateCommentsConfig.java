package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

public class GeneratedTestCreateCommentsConfig {

    @Test
    public void testCreateCommentsConfig() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(comments);
        assertEquals(2, commentsConfig.getAllComments().size());
    }

}