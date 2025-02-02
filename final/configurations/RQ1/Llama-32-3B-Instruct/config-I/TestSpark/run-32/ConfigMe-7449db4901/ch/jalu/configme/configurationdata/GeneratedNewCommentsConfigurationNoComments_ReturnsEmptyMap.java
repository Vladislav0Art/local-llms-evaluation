package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GeneratedNewCommentsConfigurationNoComments_ReturnsEmptyMap {

    @Test
    public void newCommentsConfigurationNoComments_ReturnsEmptyMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertEquals(0, config.comments.size());
    }

}