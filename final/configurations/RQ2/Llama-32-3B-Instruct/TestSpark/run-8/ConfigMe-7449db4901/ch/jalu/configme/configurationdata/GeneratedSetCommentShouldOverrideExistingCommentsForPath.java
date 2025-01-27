package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentShouldOverrideExistingCommentsForPath {

    @Mock
    private Map<String, List<String>> commentsMap;

    private CommentsConfiguration commentsConfig = new CommentsConfiguration();

    @Test
    public void setCommentShouldOverrideExistingCommentsForPath() {
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("line1"));
        when(commentsMap.get("path1")).thenReturn(Collections.emptyList());

        commentsConfig.setComment("path1", "line1");
        commentsConfig.setComment("path1", "line2");

        assertNotNull(commentsConfig.getComments());
        assertEquals(expectedComments, commentsConfig.getComments());
    }

}