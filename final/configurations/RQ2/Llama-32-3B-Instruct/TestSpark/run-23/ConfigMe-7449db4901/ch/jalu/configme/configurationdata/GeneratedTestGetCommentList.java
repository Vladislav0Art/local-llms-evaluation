package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

public class GeneratedTestGetCommentList {

    @Test
    public void testGetCommentList() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path2", Arrays.asList("line2"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(comments);
        assertEquals(1, commentsConfig.getCommentList().size());
    }

}