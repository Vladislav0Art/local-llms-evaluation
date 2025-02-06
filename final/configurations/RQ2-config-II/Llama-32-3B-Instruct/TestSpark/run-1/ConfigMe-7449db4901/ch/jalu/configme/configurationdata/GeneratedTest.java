package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private SettingsHolder settingsHolder;

    @Mock
    private Map<String, List<String>> mapOfComments;

    private CommentsConfiguration commentsConfiguration;

    public CommentsConfiguration() {
        this.commentsConfiguration = new CommentsConfiguration();
    }

    public CommentsConfiguration(@NotNull Map<String, List<String>> comments) {
        this.commentsConfiguration = new CommentsConfiguration(comments);
    }

    @Test
    public void nullMapReturnsEmptyComments() {
        when(settingsHolder.getComments()).thenReturn(mapOfComments);
        when(mapOfComments.isEmpty()).thenReturn(true);

        Map<String, @UnmodifiableView List<String>> actualCommentMap = commentsConfiguration.getAllComments();

        assertTrue(actualCommentMap.isEmpty());
    }

    @Test
    public void notNullMapReturnsCorrectComments() {
        when(settingsHolder.getComments()).thenReturn(mapOfComments);
        when(mapOfComments.containsKey("test")).thenReturn(true);

        Map<String, @UnmodifiableView List<String>> actualCommentMap = commentsConfiguration.getAllComments();

        assertTrue(actualCommentMap.containsKey("test"));
    }

    @Test
    public void setCommentEmptiesEntryIfOnlyNewLine() {
        String path = "path";
        String[] commentLines = {"\n"};

        when(settingsHolder.getComments()).thenReturn(mapOfComments);

        commentsConfiguration.setComment(path, commentLines);

        assertTrue(!mapOfComments.containsKey(path));
    }

    @Test
    public void setCommentSetsEntryWithNewLines() {
        String path = "path";
        String[] commentLines = {"1", "\n2"};

        when(settingsHolder.getComments()).thenReturn(mapOfComments);

        commentsConfiguration.setComment(path, commentLines);

        assertTrue(mapOfComments.containsKey(path) && mapOfComments.get(path).size() == 2);
    }

    @Test
    public void setCommentSetsEntryWithMultipleNewLines() {
        String path = "path";
        String[] commentLines = {"1", "\n\n2"};

        when(settingsHolder.getComments()).thenReturn(mapOfComments);

        commentsConfiguration.setComment(path, commentLines);

        assertTrue(mapOfComments.containsKey(path) && mapOfComments.get(path).size() == 3);
    }

    @Test
    public void setCommentSetsMultipleEntries() {
        String path1 = "path1";
        String[] commentLines = {"1", "\n2"};

        when(settingsHolder.getComments()).thenReturn(mapOfComments);

        commentsConfiguration.setComment(path1, commentLines);

        assertTrue(mapOfComments.containsKey(path1) && mapOfComments.get(path1).size() == 2);

        commentsConfiguration.setComment("path2", "3");

        assertTrue(mapOfComments.containsKey("path2") && mapOfComments.get("path2").size() == 1);
    }

    @Test
    public void setCommentOverwritesExistingEntry() {
        String path = "path";
        when(settingsHolder.getComments()).thenReturn(mapOfComments);

        mapOfComments.put(path, Arrays.asList("1"));

        commentsConfiguration.setComment(path, "2");

        assertTrue(!mapOfComments.containsKey(path) || !mapOfComments.get(path).contains("1"));
    }

    @Test
    public void setCommentDoesNotChangeWhenEntryAlreadyExists() {
        String path = "path";
        when(settingsHolder.getComments()).thenReturn(mapOfComments);

        mapOfComments.put(path, Arrays.asList("1"));

        commentsConfiguration.setComment(path, "2");

        assertTrue(mapOfComments.containsKey(path) && mapOfComments.get(path).size() == 1);
    }

    @Test
    public void setCommentAddsNewEntryWhenPathNotExists() {
        String path = "path";
        when(settingsHolder.getComments()).thenReturn(Collections.emptyMap());

        commentsConfiguration.setComment(path, "2");

        assertTrue(mapOfComments.containsKey(path) && mapOfComments.get(path).size() == 1);
    }

    @Test
    public void getAllCommentsReturnsUnmodifiableView() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("test", Arrays.asList("1"));

        when(settingsHolder.getComments()).thenReturn(commentMap);

        Map<String, @UnmodifiableView List<String>> actualCommentMap = commentsConfiguration.getAllComments();

        assertTrue(actualCommentMap.containsKey("test"));
        assertTrue(actualCommentMap.get("test").isUnmodifiable());
    }

}