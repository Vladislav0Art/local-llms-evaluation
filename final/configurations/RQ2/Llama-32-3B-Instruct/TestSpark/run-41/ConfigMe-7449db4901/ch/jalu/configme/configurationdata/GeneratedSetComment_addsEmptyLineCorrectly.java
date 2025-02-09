package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetComment_addsEmptyLineCorrectly {

    @Test
    public void setComment_addsEmptyLineCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        commentsConfig.setComment("path1", "");
        assertEquals(0, commentsConfig.getAllComments().size());
    }

}