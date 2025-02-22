package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetAllComments_emptyMap_returnsEmptyMap {

    @Test
    public void getAllComments_emptyMap_returnsEmptyMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

}