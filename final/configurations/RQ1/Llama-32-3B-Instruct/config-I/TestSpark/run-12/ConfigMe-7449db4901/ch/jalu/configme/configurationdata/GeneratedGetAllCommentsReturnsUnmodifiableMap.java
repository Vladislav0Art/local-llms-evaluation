package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Map;
import java.util.List;

public class GeneratedGetAllCommentsReturnsUnmodifiableMap {

    @Test
    public void getAllCommentsReturnsUnmodifiableMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertTrue(allComments instanceof java.util.Map);
    }

}