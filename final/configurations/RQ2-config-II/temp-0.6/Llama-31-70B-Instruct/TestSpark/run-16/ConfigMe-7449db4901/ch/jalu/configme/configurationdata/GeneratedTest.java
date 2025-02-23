package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentTest() {
        commentsConfiguration.setComment("testPath", "testComment1", "testComment2");
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertEquals(1, comments.size());
        assertEquals(Arrays.asList("testComment1", "testComment2"), comments.get("testPath"));
    }

    @Test
    public void setCommentNullTest() {
        commentsConfiguration.setComment("testPath", (String[]) null);
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertEquals(0, comments.size());
    }

    @Test
    public void setCommentEmptyTest() {
        commentsConfiguration.setComment("testPath", new String[]{});
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertEquals(0, comments.size());
    }

}