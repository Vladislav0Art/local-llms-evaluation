package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetAllComments_returnsEmptyListForEmptyPath {

    @Test
    public void getAllComments_returnsEmptyListForEmptyPath() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        @NotNull Map<String, @UnmodifiableView List<String>> result = config.getAllComments();
        assertEquals(0, ((HashMap) result).get(""));
    }

}