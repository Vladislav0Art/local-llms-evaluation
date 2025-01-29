package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import ch.jalu.configme.configurationdata.CommentsConfiguration;

public class GeneratedTestCommentsConfigurationConstructorWithComments {

    @Test
    public void testCommentsConfigurationConstructorWithComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("", "commentLine1"));
        comments.put("path2", Arrays.asList("commentLine2", ""));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertNotNull(config);
    }

}