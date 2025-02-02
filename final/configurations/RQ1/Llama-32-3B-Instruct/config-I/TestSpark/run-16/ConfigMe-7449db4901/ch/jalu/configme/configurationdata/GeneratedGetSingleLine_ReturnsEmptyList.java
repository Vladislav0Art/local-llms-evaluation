package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetSingleLine_ReturnsEmptyList {

    @Test
    public void getSingleLine_ReturnsEmptyList() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("", "\n");
        Map<String, List<String>> comments = config.getAllComments();
        assertTrue(comments.get("").isEmpty());
    }

}