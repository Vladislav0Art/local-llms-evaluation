package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertNotNull(comments);
        assertTrue(comments instanceof HashMap);
    }

}