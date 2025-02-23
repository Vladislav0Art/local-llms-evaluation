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
public class GeneratedSetCommentNullTest {

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentNullTest() {
        commentsConfiguration.setComment("testPath", (String[]) null);
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertEquals(0, comments.size());
    }

}