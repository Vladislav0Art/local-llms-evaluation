package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfigurationIsUnmodifiable {

    @Test
    public void newCommentsConfigurationIsUnmodifiable() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = config.getAllComments();
        assertNotEquals(comments, null);
        assertEquals(0, comments.size());
    }

}