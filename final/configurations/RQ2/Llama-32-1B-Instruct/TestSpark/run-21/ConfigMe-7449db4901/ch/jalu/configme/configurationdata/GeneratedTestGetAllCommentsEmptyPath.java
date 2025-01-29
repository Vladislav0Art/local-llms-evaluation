package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import ch.jalu.configme.configurationdata.CommentsConfiguration;

public class GeneratedTestGetAllCommentsEmptyPath {

    @Test
    public void testGetAllCommentsEmptyPath() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertNull(config.getAllComments().get(""));
    }

}