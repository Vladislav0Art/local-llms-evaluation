package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetAllCommentsEmpty {

    @Test
    public void getAllCommentsEmpty() {
        CommentsConfiguration comments = new CommentsConfiguration();
        assertEquals(0, comments.getAllComments().size());
    }

}