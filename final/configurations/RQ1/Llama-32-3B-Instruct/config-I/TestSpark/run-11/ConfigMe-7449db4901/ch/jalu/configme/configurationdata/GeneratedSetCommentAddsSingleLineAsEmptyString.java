package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCommentAddsSingleLineAsEmptyString {

    @Test
    public void setCommentAddsSingleLineAsEmptyString() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "\n");
        assertTrue(configuration.getAllComments().containsKey("path") && configuration.getAllComments().get("path").isEmpty());
    }

}