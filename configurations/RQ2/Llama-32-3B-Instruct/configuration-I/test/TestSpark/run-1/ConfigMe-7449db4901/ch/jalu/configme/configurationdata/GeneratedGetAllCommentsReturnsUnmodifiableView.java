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
public class GeneratedGetAllCommentsReturnsUnmodifiableView {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Mock
    private String path;

    @Mock
    private String commentLine;

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void getAllCommentsReturnsUnmodifiableView() {
        when(commentsMap.get(anyString())).thenReturn(List.of(commentLine));
        Map<String, List<String>> commentMap = Map.of(path, List.of(commentLine));
        CommentsConfiguration configuration = new CommentsConfiguration(commentMap);
        assertEquals(1, configuration.getAllComments().size());
        assertTrue(configuration.getAllComments().containsKey(path));
    }

}