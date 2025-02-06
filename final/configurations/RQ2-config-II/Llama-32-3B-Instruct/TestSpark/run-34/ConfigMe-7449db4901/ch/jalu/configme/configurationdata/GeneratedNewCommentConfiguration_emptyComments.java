package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedNewCommentConfiguration_emptyComments {

    @Test
    public void newCommentConfiguration_emptyComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(Collections.emptyMap(), comments);
    }

}