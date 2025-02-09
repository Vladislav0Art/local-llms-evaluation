package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());

        commentsConfiguration.setComment("path", "Line 1", "Line 2", "Line 3");
        assertEquals(1, commentsConfiguration.getAllComments().size());

        commentsConfiguration.setComment("anotherPath", "Line 4", "Line 5");
        assertEquals(2, commentsConfiguration.getAllComments().size());
    }

}