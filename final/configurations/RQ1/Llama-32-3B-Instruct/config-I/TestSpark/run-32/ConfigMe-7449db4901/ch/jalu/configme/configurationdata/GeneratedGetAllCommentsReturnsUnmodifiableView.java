package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GeneratedGetAllCommentsReturnsUnmodifiableView {

    @Test
    public void getAllCommentsReturnsUnmodifiableView() {
        String comment1 = "Comment 1";
        String comment2 = "Comment 2";

        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Collections.singletonList(comment1));
        commentsMap.put("path2", Arrays.asList(comment2));

        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        Map<String, @UnmodifiableView List<String>> allComments = config.getAllComments();

        assertTrue(allComments.containsKey("path1"));
        assertTrue(allComments.get("path1") instanceof @UnmodifiableView List);

        assertTrue(allComments.containsKey("path2"));
        assertTrue(allComments.get("path2") instanceof @UnmodifiableView List);
    }

}