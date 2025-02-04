package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void newCommentsConfiguration_hasEmptyMap() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        // when
        Map<String, List<String>> comments = commentsConfiguration.comments;

        // then
        assertNotNull(comments);
        assertEquals(0, comments.size());
    }

    @Test
    public void newCommentsConfiguration_withInitialMap_hasExpectedMap() {
        // given
        Map<String, List<String>> initialMap = Mockito.mock(Map.class);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialMap);

        when(initialMap.size()).thenReturn(1);
        when(initialMap.keySet()).thenReturn(Arrays.asList("key"));

        // when
        Map<String, List<String>> actualComments = commentsConfiguration.comments;

        // then
        assertNotNull(actualComments);
        assertEquals(1, actualComments.size());
        assertTrue(actualComments.containsKey("key"));
    }

    @Test
    public void setComment_addsEntry() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        String commentLine = "line";

        // when
        commentsConfiguration.setComment(path, commentLine);

        // then
        assertNotNull(commentsConfiguration.comments);
        assertTrue(commentsConfiguration.comments.containsKey(path));
        assertEquals(1, commentsConfiguration.comments.get(path).size());
    }

    @Test
    public void setComment_overridesEntry() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        List<String> commentLines = Arrays.asList("line");

        commentsConfiguration.setComment(path, commentLine);

        when(settingsHolder.registerComments()).thenReturn(commentLines);

        // when
        commentsConfiguration.setComment(path, "newLine");

        // then
        assertNotNull(commentsConfiguration.comments);
        assertTrue(commentsConfiguration.comments.containsKey(path));
        assertEquals(1, commentsConfiguration.comments.get(path).size());
    }

    @Test
    public void setComment_setsEmptyEntry_ifNewLine() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        List<String> commentLines = Collections.emptyList();

        when(settingsHolder.registerComments()).thenReturn(commentLines);

        // when
        commentsConfiguration.setComment(path, "\n");

        // then
        assertNotNull(commentsConfiguration.comments);
        assertTrue(commentsConfiguration.comments.containsKey(path));
        assertEquals(0, commentsConfiguration.comments.get(path).size());
    }

    @Test
    public void getAllComments_returnsReadOnlyMap() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> map = Mockito.mock(Map.class);
        when(commentsConfiguration.comments).thenReturn(map);

        // when
        @NotNull Map<String, @UnmodifiableView List<String>> actualMap = commentsConfiguration.getAllComments();

        // then
        assertNotNull(actualMap);
        assertTrue(actualMap instanceof UnmodifiableMap);
    }

    @Test
    public void getAllComments_hasExpectedSize() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> map = Mockito.mock(Map.class);
        when(commentsConfiguration.comments).thenReturn(map);

        Map<String, @UnmodifiableView List<String>> actualMap = commentsConfiguration.getAllComments();

        assertEquals(0, actualMap.size());
    }

}