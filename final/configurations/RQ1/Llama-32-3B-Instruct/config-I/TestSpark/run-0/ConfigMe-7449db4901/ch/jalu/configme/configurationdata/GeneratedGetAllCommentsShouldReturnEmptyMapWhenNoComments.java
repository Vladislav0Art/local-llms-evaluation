package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsShouldReturnEmptyMapWhenNoComments {

    @Test
    public void getAllCommentsShouldReturnEmptyMapWhenNoComments() {
        CommentsConfiguration c = new CommentsConfiguration(new HashMap<>());
        assertEquals(0, ((java.util.Map) c.getAllComments()).size());
    }

}