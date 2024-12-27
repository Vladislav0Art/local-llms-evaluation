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

public class GeneratedSetCommentAddsNewLineAsEmptyLine {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Mock
    private String path;

    @Mock
    private String commentLine;

    public static final List<String> COMMENT_LINES = List.of("comment line with multiple new lines");

    @Test
    public void setCommentAddsNewLineAsEmptyLine() {
        Map<String, List<String>> commentMap = Map.of(path, List.of(""));
        CommentsConfiguration configuration = new CommentsConfiguration(commentMap);
        String[] commentLines = {"comment line with multiple new lines"};
        configuration.setComment(path, commentLines);
        assertEquals(0, configuration.getAllComments().get(path).size());
    }

}