package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedExistingCommentsConfigurationIsEmpty {

    @Test
    public void existingCommentsConfigurationIsEmpty() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "line1\n", "line2");
        assertTrue(config.getAllComments().isEmpty());
    }

}