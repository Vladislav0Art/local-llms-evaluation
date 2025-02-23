package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSetCommentEmptyLines {

    @Test
    public void testSetCommentEmptyLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "\n");
        assertEquals(1, config.getAllComments().size());
        assertEquals(Collections.singletonList(""), config.getAllComments().get("path1"));
    }

}