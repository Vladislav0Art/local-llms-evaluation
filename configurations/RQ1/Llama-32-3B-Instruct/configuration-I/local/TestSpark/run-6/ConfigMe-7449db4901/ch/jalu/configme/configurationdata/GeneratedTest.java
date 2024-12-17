package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedTest {

    @Test
    public void constructorCreatesNewEmptyMap() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();

        // When
        Map<String, List<String>> map = commentsConfig.comments;

        // Then
        assertNotNull(map);
        assertTrue(map.isEmpty());
    }

    @Test
    public void constructorAcceptsExistingMap() {
        // Given
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("test1", Collections.singletonList("line1"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(existingComments);

        // When
        Map<String, List<String>> map = commentsConfig.comments;

        // Then
        assertEquals(existingComments, map);
    }

    @Test
    public void setComment_setsCommentsForPath() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "testPath";
        String commentLine1 = "line1";
        String commentLine2 = "line2";

        // When
        commentsConfig.setComment(path, commentLine1, commentLine2);

        // Then
        assertEquals(2, commentsConfig.comments.get(path).size());
        assertTrue(commentsConfig.comments.get(path).contains(commentLine1));
        assertTrue(commentsConfig.comments.get(path).contains(commentLine2));
    }

    @Test
    public void setComment_setsEmptyLinesForSoleNewline() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "testPath";
        String newlineOnly = "\n";

        // When
        commentsConfig.setComment(path, newlineOnly);

        // Then
        assertEquals(1, commentsConfig.comments.get(path).size());
        assertTrue(commentsConfig.comments.get(path).contains(newlineOnly));
    }

    @Test
    public void getAllComments_returnsUnmodifiableMap() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "testPath";
        List<String> commentLines = Arrays.asList("line1", "line2");

        commentsConfig.comments.put(path, commentLines);

        // When
        Map<String,@org.jetbrains.annotations.UnmodifiableList> map = commentsConfig.getAllComments();

        // Then
        assertNotNull(map);
        assertTrue(map.containsKey(path));
        assertEquals(1, map.get(path).size());
        assertTrue(map.get(path).containsAll(commentLines));
    }

    @Test
    public void getAllComments_doesNotModifyOriginalMap() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "testPath";
        List<String> commentLines = Arrays.asList("line1", "line2");

        Map<String,@org.jetbrains.annotations.UnmodifiableList> originalComments = Collections.singletonMap(path, commentLines);
        commentsConfig.comments = originalComments;

        // When
        Map<String,@org.jetbrains.annotations.UnmodifiableList> map = commentsConfig.getAllComments();

        // Then
        assertNotNull(map);
        assertEquals(originalComments, map);
    }

    @Test
    public void setComment_throwsNullPointerExceptionWhenPathIsNull() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();

        // When & Then
        assertThrows(NullPointerException.class, () -> commentsConfig.setComment(null, "line1", "line2"));
    }

    @Test
    public void setComment_throwsNullPointerExceptionWhenCommentsIsNull() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "testPath";

        // When & Then
        assertThrows(NullPointerException.class, () -> commentsConfig.setComment(path, null, "line2"));
    }

    @Test
    public void setComment_throwsNullPointerExceptionWhenLine1IsNull() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "testPath";
        String commentLine2 = "line2";

        // When & Then
        assertThrows(NullPointerException.class, () -> commentsConfig.setComment(path, null, commentLine2));
    }

    @Test
    public void setComment_throwsNullPointerExceptionWhenLine2IsNull() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "testPath";
        List<String> existingLines = Collections.singletonList("line1");

        // When & Then
        assertThrows(NullPointerException.class, () -> commentsConfig.setComment(path, "line1", null));
    }

}