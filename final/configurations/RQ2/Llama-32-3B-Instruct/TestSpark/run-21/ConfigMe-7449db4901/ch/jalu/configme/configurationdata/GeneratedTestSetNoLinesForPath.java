package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSetNoLinesForPath {

    @Mock
    private Map<String, List<String>> comments;

    @Test
    public void testSetNoLinesForPath() {
        Map<String, List<String>> expectedComments = Collections.singletonMap("path", Collections.emptyList());
        when(comments.get("path")).thenReturn(Collections.emptyList());
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path");
        assertEquals(expectedComments, configuration.getAllComments());
    }

}