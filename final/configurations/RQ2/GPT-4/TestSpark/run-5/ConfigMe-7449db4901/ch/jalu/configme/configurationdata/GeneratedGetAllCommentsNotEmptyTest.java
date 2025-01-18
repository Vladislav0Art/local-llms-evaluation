package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedGetAllCommentsNotEmptyTest {

    @Test
    public void getAllCommentsNotEmptyTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path3", Arrays.asList("initialComment1", "initialComment2"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(initialComments);

        Map<String, List<String>> savedComments = commentsConfig.getAllComments();
        assertFalse(savedComments.isEmpty());
    }

}