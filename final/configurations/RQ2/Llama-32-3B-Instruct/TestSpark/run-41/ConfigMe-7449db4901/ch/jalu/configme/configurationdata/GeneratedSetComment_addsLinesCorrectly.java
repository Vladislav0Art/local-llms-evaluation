package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetComment_addsLinesCorrectly {

    @Test
    public void setComment_addsLinesCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        commentsConfig.setComment("path1", "line1");
        assertEquals(1, commentsConfig.getAllComments().size());
        assertTrue(commentsConfig.getAllComments().containsKey("path1"));
    }

}