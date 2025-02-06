package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllComments_isUnmodifiable {

    @Test
    public void getAllComments_isUnmodifiable() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);
        try {
            ((List<String>) commentsConfiguration.getAllComments().get("path")).add("newComment");
            fail();
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

}