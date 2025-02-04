package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedGetAllCommentsReturnsUnmodifiableView {

    @Test
    public void getAllCommentsReturnsUnmodifiableView() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("test", Arrays.asList("line1"));
        comments.setComment("test", "line2");
        Map<String, @UnmodifiableView List<String>> allComments = comments.getAllComments();
        assertTrue(allComments.isUnmodifiable());
    }

}