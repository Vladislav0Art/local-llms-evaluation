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
public class GeneratedTestSetCommentMultipleLinesSoleNewLine {

    @Mock
    private Map<String, List<String>> comments;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testSetCommentMultipleLinesSoleNewLine() {
        when(comments.anyString()).thenReturn(Collections.singletonList(""));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", Arrays.asList("", "line1", "line2"));
        String result = commentsConfiguration.getAllComments().get("path").get(0);
        assertTrue(result.isEmpty());
    }

}