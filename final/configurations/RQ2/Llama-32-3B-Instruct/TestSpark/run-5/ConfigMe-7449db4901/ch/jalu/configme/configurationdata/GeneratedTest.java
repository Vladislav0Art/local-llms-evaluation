package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void newCommentsConfigurationIsEmpty() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assert commentLinesIsEmpty(commentsConfiguration.getAllComments());
    }

    @Test
    public void newCommentsConfigurationIsPopulatedFromMap() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);
        assertEquals(map, commentsConfiguration.getAllComments());
    }

    @Test
    public void setCommentOverwritesExistingCommentForPath() {
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path1", Collections.singletonList("comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(expectedMap);
        String[] commentLines = {"comment3"};
        commentsConfiguration.setComment("path1", commentLines);
        assertEquals(expectedMap, commentsConfiguration.getAllComments());
    }

    @Test
    public void setCommentAddsNewLineForPath() {
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path1", Arrays.asList(""));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(expectedMap);
        String[] commentLines = {"comment3"};
        commentsConfiguration.setComment("path1", commentLines);
        assertEquals(new HashMap<>(expectedMap), commentsConfiguration.getAllComments());
    }

    @Test
    public void setCommentAddsNewLineWithoutMarkerForPath() {
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path1", Arrays.asList(""));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(expectedMap);
        String[] commentLines = {"comment3"};
        commentsConfiguration.setComment("path1", commentLines[0]);
        assertEquals(new HashMap<>(expectedMap), commentsConfiguration.getAllComments());
    }

    @Test
    public void setMultipleCommentLinesForPath() {
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(expectedMap);
        String[] commentLines = {"comment3"};
        commentsConfiguration.setComment("path1", commentLines);
        assertEquals(new HashMap<>(expectedMap), commentsConfiguration.getAllComments());
    }

    @Test
    public void setMultipleCommentLinesForPathWithEmptyLine() {
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path1", Arrays.asList("", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(expectedMap);
        String[] commentLines = {"comment3"};
        commentsConfiguration.setComment("path1", Arrays.asList(commentLines[0], "")); // using add instead of single assignment
        assertEquals(new HashMap<>(expectedMap), commentsConfiguration.getAllComments());
    }

    private void assert

    commentLinesIsEmpty(Map<String, @UnmodifiableView List<String>> expectedMap) {
        for (Map.Entry<String, List<String>> entry : expectedMap.entrySet()) {
            assertTrue(entry.getValue().isEmpty());
        }
    }

}