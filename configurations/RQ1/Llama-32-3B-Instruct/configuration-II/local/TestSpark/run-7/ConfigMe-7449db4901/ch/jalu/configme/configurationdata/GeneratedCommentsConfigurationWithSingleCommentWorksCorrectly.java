package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCommentsConfigurationWithSingleCommentWorksCorrectly {

    @Test
    public void commentsConfigurationWithSingleCommentWorksCorrectly() {
        var config = new CommentsConfiguration();
        config.setComment("test", "comment1");
        assertEquals(1, config.comments.size());
        assertTrue(config.comments.get("test").contains("comment1"));
    }

}