package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCommentAddsMultipleLinesAsCommented {

    @Test
    public void setCommentAddsMultipleLinesAsCommented() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "line1", "line2");
        assertEquals(Arrays.asList("line1", "line2"), configuration.getAllComments().get("path"));
    }

}