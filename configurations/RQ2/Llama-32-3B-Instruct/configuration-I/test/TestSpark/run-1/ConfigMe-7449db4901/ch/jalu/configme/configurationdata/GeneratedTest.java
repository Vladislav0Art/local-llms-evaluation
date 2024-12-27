package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.mockito.ArgumentCaptor;

public class GeneratedTest {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Mock
    private String path;

    @Mock
    private String commentLine;

    public static final List<String> COMMENT_LINES = List.of("comment line with multiple new lines");

    @Test
    public void newCommentConfigurationIsEmpty() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertEquals(0, configuration.getAllComments().size());
    }

    @Test
    public void newCommentConfigurationFromMapIsNotEmpty() {
        when(commentsMap.get(anyString())).thenReturn(COMMENT_LINES);
        Map<String, List<String>> commentMap = Map.of(path, COMMENT_LINES);
        CommentsConfiguration configuration = new CommentsConfiguration(commentMap);
        assertEquals(1, configuration.getAllComments().size());
    }

    @Test
    public void setCommentOverwritesExistingComment() {
        when(commentsMap.get(anyString())).thenReturn(List.of("old comment"));
        Map<String, List<String>> commentMap = Map.of(path, List.of("new comment"));
        CommentsConfiguration configuration = new CommentsConfiguration(commentMap);
        String[] commentLines = {"new comment", "comment line with multiple new lines"};
        configuration.setComment(path, commentLines);
        assertEquals(2, configuration.getAllComments().get(path).size());
    }

    @Test
    public void setCommentAddsNewLineAsEmptyLine() {
        Map<String, List<String>> commentMap = Map.of(path, List.of(""));
        CommentsConfiguration configuration = new CommentsConfiguration(commentMap);
        String[] commentLines = {"comment line with multiple new lines"};
        configuration.setComment(path, commentLines);
        assertEquals(0, configuration.getAllComments().get(path).size());
    }

    @Test
    public void setCommentSetsLinesWithMarker() {
        when(commentsMap.get(anyString())).thenReturn(List.of());
        Map<String, List<String>> commentMap = Map.of(path, List.of("comment line with multiple new lines"));
        CommentsConfiguration configuration = new CommentsConfiguration(commentMap);
        String[] commentLines = {"comment line with multiple new lines", "comment: " + "comment line with multiple new lines"};
        configuration.setComment(path, commentLines);
        assertEquals(2, configuration.getAllComments().get(path).size());
    }

    @Test
    public void getAllComments() {
        when(commentsMap.get(anyString())).thenReturn(COMMENT_LINES);
        Map<String, List<String>> commentMap = Map.of("path", COMMENT_LINES);
        CommentsConfiguration configuration = new CommentsConfiguration(commentMap);
        String[] expectedCommentLines = {"comment line with multiple new lines"};
        configuration.setComment("path", expectedCommentLines);
        assertEquals(expectedCommentLines, configuration.getAllComments().get("path"));
    }

    @Test
    public void getCommentsWhenNoCommentIsSet() {
        Map<String, List<String>> commentMap = Map.of();
        CommentsConfiguration configuration = new CommentsConfiguration(commentMap);
        Optional<List<String>> result = configuration.getComments();
        assertNull(result);
    }

}