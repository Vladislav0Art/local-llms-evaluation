package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetAllCommentsList {

    public Map<String, List<String>> getAllComments() {
        return new HashMap<>();
    }
}

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private List<String> commentsList;

    @Mock
    private Map<String, List<String>> commentsMap;

    @Test
    public void testGetAllCommentsList() {
        // setup mock objects and calls on them
        commentsMap.put("key2", new ArrayList<>());
        when(commentsMap.get(anyString())).thenReturn(new ArrayList<>());

        // check if the getAllComments method was called with the correct values
        List<String> allComments = CommentsConfiguration.getAllComments();
        verify(commentsMap).get(eq("key2"));
    }

}