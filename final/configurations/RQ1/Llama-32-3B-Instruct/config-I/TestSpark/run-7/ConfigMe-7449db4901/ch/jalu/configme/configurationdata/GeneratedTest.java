package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private SettingsHolder settingsHolderMock;

    public CommentsConfigurationTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void givenCommentsConfigurationCreation_withDefaultConstructor_thenMapWithOneEntryIsCreated() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> map = new HashMap<>();
        assertEquals(1, commentsConfig.comments.size());
        assertTrue(commentsConfig.comments.containsKey(""));
    }

    @Test
    public void whenCommentsConfigurationIsCreated_withProvidedMap_thenMapWithEntriesIsUsed() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        assertEquals(1, commentsConfig.comments.size());
        assertTrue(commentsConfig.comments.containsKey("test"));
        assertTrue(commentsConfig.comments.get("test").contains("comment line 1"));
    }

    @Test
    public void givenCommentsConfigurationsetComment_withNewLine_thenEmptyLineWithoutCommentMarkerIsCreated() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("", Arrays.asList(""));
        Mockito.when(settingsHolderMock.registerComments()).thenReturn(expectedMap);
        commentsConfig.setComment("test", "\n");
    }

    @Test
    public void givenCommentsConfigurationsetComment_withNewLine_thenMapContainsEntryWithEmptyKey() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("", Arrays.asList(""));
        Mockito.when(settingsHolderMock.registerComments()).thenReturn(expectedMap);
        commentsConfig.setComment("test", "\n");
        assertEquals(1, commentsConfig.comments.size());
    }

    @Test
    public void givenCommentsConfigurationgetAllComments_thenReadOnlyViewOfAllEntriesIsReturned() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("", Arrays.asList(""));
        Mockito.when(settingsHolderMock.registerComments()).thenReturn(expectedMap);
        commentsConfig.setComment("test", "\n");
        assertEquals(1, commentsConfig.getAllComments().size());
    }

}

public class CommentsConfiguration {
    private Map<String, List<String>> comments;

    public CommentsConfiguration() {
    }

    public void setComment(String key, String value) {
    }

    public Map<String, List<String>> getComments() {
        return comments;
    }

}