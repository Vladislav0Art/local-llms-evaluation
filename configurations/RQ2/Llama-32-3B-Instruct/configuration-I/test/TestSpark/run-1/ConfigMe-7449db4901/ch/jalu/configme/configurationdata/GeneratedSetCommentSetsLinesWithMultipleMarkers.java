package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentSetsLinesWithMultipleMarkers {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Mock
    private String path;

    @Mock
    private String commentLine;

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void setCommentSetsLinesWithMultipleMarkers() {
        when(commentsMap.get(anyString())).thenReturn(List.of());
        Map<String, List<String>> commentMap = Map.of(path, List.of(commentLine));
        CommentsConfiguration configuration = new CommentsConfiguration(commentMap);
        configuration.setComment(path, "comment line 1" + ": " + commentLine + "; " + commentLine + ": " + commentLine);
        assertEquals(3, configuration.getAllComments().get(path).size());
    }

}