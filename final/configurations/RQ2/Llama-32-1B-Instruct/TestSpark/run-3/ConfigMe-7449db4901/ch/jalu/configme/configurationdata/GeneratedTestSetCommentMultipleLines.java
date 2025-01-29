package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSetCommentMultipleLines {

    @Mock
    private Map<String, List<String>> comments;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testSetCommentMultipleLines() {
        when(comments.anyString()).thenReturn(Collections.singletonList(""));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", Arrays.asList("", "commentLine1", "commentLine2"));
        String result = commentsConfiguration.getAllComments().get("path").get(0);
        assertTrue(result.equals("commentLine1"));
    }

}