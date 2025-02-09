package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetComment {

    @Test
    public void testGetComment() {
        Map<String, List<String>> comments = new HashMap<>();
        List<String> commentLine1 = new ArrayList<>();
        commentLine1.add("comment1");
        List<String> commentLine2 = new ArrayList<>();
        commentLine2.add("comment2");

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        commentsConfiguration.setComment("path1", "comment1");
        commentsConfiguration.setComment("path2", "comment2");

        assertEquals(2, commentsConfiguration.getComment("path1").size());
        assertEquals(1, commentsConfiguration.getComment("path1").get(0).equals("comment1"));
        assertEquals(1, commentsConfiguration.getComment("path2").size());
        assertEquals(1, commentsConfiguration.getComment("path2").get(0).equals("comment2"));
    }

}