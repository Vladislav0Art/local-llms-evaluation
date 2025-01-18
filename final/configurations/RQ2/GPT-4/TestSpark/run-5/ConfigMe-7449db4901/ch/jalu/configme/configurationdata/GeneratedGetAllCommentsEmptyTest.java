package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedGetAllCommentsEmptyTest {

    @Test
    public void getAllCommentsEmptyTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> savedComments = commentsConfig.getAllComments();
        assertTrue(savedComments.isEmpty());
    }

}