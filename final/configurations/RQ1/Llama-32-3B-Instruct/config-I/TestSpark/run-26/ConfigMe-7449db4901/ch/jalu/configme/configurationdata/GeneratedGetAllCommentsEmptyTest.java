package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsEmptyTest {

    @Test
    public void getAllCommentsEmptyTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, @UnmodifiableView List<String>> allComments = commentsConfig.getAllComments();
        assertTrue(allComments.isEmpty());
    }

}