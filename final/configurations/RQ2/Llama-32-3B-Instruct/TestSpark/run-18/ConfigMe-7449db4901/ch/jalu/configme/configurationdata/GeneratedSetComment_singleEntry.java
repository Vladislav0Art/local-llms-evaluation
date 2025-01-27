package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetComment_singleEntry {

    @Test
    public void setComment_singleEntry() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("comment"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String[] commentLines = {"newComment"};
        config.setComment("path", commentLines[0]);
        assertEquals(1, config.getAllComments().size());
    }

}