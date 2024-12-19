package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCommentsConfigurationWithMultipleCommentsWorksCorrectly {

    @Test
    public void commentsConfigurationWithMultipleCommentsWorksCorrectly() {
        var config = new CommentsConfiguration();
        config.setComment("test1", "comment1");
        config.setComment("test2", "comment2");
        assertEquals(2, config.comments.size());
        assertTrue(config.comments.get("test1").contains("comment1"));
        assertTrue(config.comments.get("test2").contains("comment2"));
    }

}