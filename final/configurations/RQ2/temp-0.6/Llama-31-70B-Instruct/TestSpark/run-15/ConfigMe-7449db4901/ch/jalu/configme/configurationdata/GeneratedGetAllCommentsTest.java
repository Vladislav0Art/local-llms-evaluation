package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> expectedComments = Collections.emptyMap();
        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}