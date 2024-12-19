package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratedGetAllComments_returnsEmptyMapWhenNoComments {

    @Test
    public void getAllComments_returnsEmptyMapWhenNoComments() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertNotNull(commentsConfiguration.getAllComments());
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

}