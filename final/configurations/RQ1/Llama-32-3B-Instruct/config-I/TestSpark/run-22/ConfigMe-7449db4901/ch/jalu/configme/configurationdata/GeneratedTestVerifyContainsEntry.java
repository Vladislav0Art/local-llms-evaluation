package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestVerifyContainsEntry {

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
    public void testVerifyContainsEntry() {
        // setup mock objects and calls on them
        commentsMap.put("key3", new ArrayList<>());
        when(commentsMap.get(anyString())).thenReturn(new ArrayList<>());

        // check if the verify contains entry method was called with the correct values
        verify(commentsMap).containsEntry(eq("key3"), eq(commentsList));
    }

}