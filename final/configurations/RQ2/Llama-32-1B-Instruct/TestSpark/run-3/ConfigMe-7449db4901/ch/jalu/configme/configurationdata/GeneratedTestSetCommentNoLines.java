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
public class GeneratedTestSetCommentNoLines {

    @Mock
    private Map<String, List<String>> comments;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testSetCommentNoLines() {
        when(comments.anyString()).thenReturn(Collections.emptyList());
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", Arrays.asList("", "", ""));

        Map<String, List<String>> result = commentsConfiguration.getAllComments().get("path");
        assertNotNull(result);
        assertEquals(0, result.size());
    }

}