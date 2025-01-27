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
public class GeneratedTest {

    @Mock
    private Map<String, List<String>> commentsMap;

    private CommentsConfiguration commentsConfig = new CommentsConfiguration();

    @Test
    public void constructorShouldCreateNewInstance() {
        assertNotNull(commentsConfig);
    }

    @Test
    public void constructorWithCommentsMapShouldUseProvidedMap() {
        commentsConfig = new CommentsConfiguration(commentsMap);
        assertNotNull(commentsConfig.getComments());
        assertEquals(commentsMap, commentsConfig.getComments());
    }

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

    @Test
    public void setCommentShouldAddNewLinesForPath() {
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("line1"));
        when(commentsMap.get("path1")).thenReturn(Collections.singletonList("line2"));

        commentsConfig.setComment("path1", "line1");
        commentsConfig.setComment("path1", "line3");

        assertNotNull(commentsConfig.getComments());
        assertEquals(expectedComments, commentsConfig.getComments());
    }

    @Test
    public void setCommentShouldResultInEmptyLineWithoutMarker() {
        Map<String, List<String>> expectedComments = new HashMap<>();
        when(commentsMap.get("path1")).thenReturn(Collections.singletonList("line2"));

        commentsConfig.setComment("path1", "line3");

        assertNotNull(commentsConfig.getComments());
        assertEquals(expectedComments, commentsConfig.getComments());
    }

    @Test
    public void getAllCommentsShouldReturnUnmodifiableView() {
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("line1"));

        when(commentsMap).thenReturn(expectedComments);

        assertNotNull(commentsConfig.getAllComments());
        assertEquals(expectedComments, commentsConfig.getAllComments());
    }

    @Test
    public void getAllCommentsShouldReturnUnmodifiableViewForComment() {
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("line1"));

        when(commentsMap.get("path1")).thenReturn(Collections.singletonList("line2"));

        assertNotNull(commentsConfig.getAllComments());
        assertEquals(expectedComments, commentsConfig.getAllComments());
    }

    @Test
    public void getAllCommentsShouldNotChangeOriginalMap() {
        Map<String, List<String>> originalComments = new HashMap<>();
        when(commentsMap).thenReturn(originalComments);

        commentsConfig.setComment("path1", "line1");
        commentsConfig.setComment("path2", "line2");

        assertNotNull(commentsConfig.getAllComments());
        assertEquals(originalComments, commentsConfig.getAllComments());
    }

}