package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedGetAllCommentsReturnsCompleteCommentMap {

    @Test
    public void getAllCommentsReturnsCompleteCommentMap() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("test1", Arrays.asList("line1"));
        commentMap.put("test2", Arrays.asList("line2"));
        comments.setComment("test1", "line3");
        comments.setComment("test2", "line4");
        Map<String, @UnmodifiableView List<String>> allComments = comments.getAllComments();
        assertEquals(commentMap, allComments);
    }

}