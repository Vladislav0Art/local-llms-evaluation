package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCommentsConfigurationGetAllCommentsWorksCorrectly {

    @Test
    public void commentsConfigurationGetAllCommentsWorksCorrectly() {
        var config = new CommentsConfiguration();
        config.setComment("test1", "comment1");
        config.setComment("test2", "comment2");
        assertEquals(2, config.getAllComments().size());
        assertTrue(config.getAllComments().containsEntry("test1", Arrays.asList("comment1")));
        assertTrue(config.getAllComments().containsEntry("test2", Arrays.asList("comment2")));
    }

}