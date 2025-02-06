package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetAllComments_returnsUnmodifiableMap {

    @Test
    public void getAllComments_returnsUnmodifiableMap() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        @NotNull Map<String, @UnmodifiableView List<String>> result = config.getAllComments();
        assertTrue(result instanceof UnmodifiableMap);
    }

}