package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCommentsConfigurationTest {

    @Test
    public void commentsConfigurationTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), config.getAllComments());
    }

}