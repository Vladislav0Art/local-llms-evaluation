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
public class GeneratedTestGetAllCommentsIsUnmodifiable {

    @Mock
    private Map<String, List<String>> comments;

    @Test
    public void testGetAllCommentsIsUnmodifiable() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path", Arrays.asList("comment1"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        try {
            configuration.getAllComments().put("new path", Collections.singletonList("comment3"));
            assert false;
        } catch (UnsupportedOperationException e) {
            assertNotNull(configuration.getAllComments());
            assertTrue(configuration.getAllComments().get("path").equals(Arrays.asList("comment1")));
        }
    }

}