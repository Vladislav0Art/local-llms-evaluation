package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

public class GeneratedNewCommentsConfigurationIsEmptyMap {

    @Test
    public void newCommentsConfigurationIsEmptyMap() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertNotNull(configuration.comments);
        assertEquals(0, configuration.comments.size());
    }

}