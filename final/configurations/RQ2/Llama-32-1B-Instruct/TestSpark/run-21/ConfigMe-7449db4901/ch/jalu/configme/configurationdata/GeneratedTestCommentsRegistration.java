package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import ch.jalu.configme.configurationdata.CommentsConfiguration;

public class GeneratedTestCommentsRegistration {

    @Test
    public void testCommentsRegistration() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("", "commentLine1"));
        comments.put("path2", Arrays.asList("commentLine2", ""));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(2, config.getAllComments().size());
        assertAll(
                () -> assertEquals(Arrays.asList(), config.getAllComments().get("path1")),
                () -> assertEquals(Arrays.asList("commentLine1"), config.getAllComments().get("path1")));
    }

}