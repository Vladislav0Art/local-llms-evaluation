package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCommentSetsEmptyLineForSoleNewLine {

    @Test
    public void setCommentSetsEmptyLineForSoleNewLine() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration();
        config.setComment("path", "\n");
        assertEquals(Arrays.asList(""), config.getAllComments().get("path"));
    }

}