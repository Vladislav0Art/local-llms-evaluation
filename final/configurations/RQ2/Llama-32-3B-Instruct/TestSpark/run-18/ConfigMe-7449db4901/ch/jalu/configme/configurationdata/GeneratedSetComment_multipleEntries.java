package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetComment_multipleEntries {

    @Test
    public void setComment_multipleEntries() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String[] commentLines = {"newComment", "anotherComment"};
        config.setComment("path1", commentLines[0]);
        assertEquals(2, config.getAllComments().size());
    }

}