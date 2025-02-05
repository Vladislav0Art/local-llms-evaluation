package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentOverrideTest {

    @Test
    public void setCommentOverrideTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "Test Comment1", "Test Comment2");
        commentsConfiguration.setComment("path1", "Test Comment3", "Test Comment4");
        List<String> comments = commentsConfiguration.getAllComments().get("path1");
        assertEquals(Arrays.asList("Test Comment3", "Test Comment4"), comments);
    }

}