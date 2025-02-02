package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedGetAllCommentsEmptyMapTest {

    @Test
    public void getAllCommentsEmptyMapTest() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, @UnmodifiableView List<String>> getAllComments = comments.getAllComments();
        assertTrue(getAllComments.isEmpty());
    }

}