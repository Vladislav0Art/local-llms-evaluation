package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedGetAllComments_returnsUnmodifiableView {

    @Test
    public void getAllComments_returnsUnmodifiableView() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1"));
        CommentsConfiguration config = new CommentsConfiguration(map);
        Map<String, @UnmodifiableView List<String>> comments = config.getAllComments();
        assertTrue(comments.values().stream().allMatch(Objects::nonNull));
    }

}