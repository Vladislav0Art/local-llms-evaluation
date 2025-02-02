package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCommentOverwritesExistingComment {

    @Test
    public void setCommentOverwritesExistingComment() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration();
        config.setComment("path", Arrays.asList("line1"));
        assertEquals(Collections.singletonList("line2"), config.getAllComments().get("path"));
    }

}