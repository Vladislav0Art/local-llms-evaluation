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
public class GeneratedTestSetMultipleLinesWhenExistingPath {

    @Mock
    private Map<String, List<String>> comments;

    @Test
    public void testSetMultipleLinesWhenExistingPath() {
        Map<String, List<String>> expectedComments = Collections.singletonMap("path", Arrays.asList("comment1", "comment2"));
        when(comments.get("path")).thenReturn(expectedComments);
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path", "comment1", "comment2");
        assertEquals(expectedComments, configuration.getAllComments());
    }

}