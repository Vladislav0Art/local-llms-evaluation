package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class GeneratedTestComments {

    @Test
    public void testComments() {
        CommentsConfiguration instance = new CommentsConfiguration();
        assertTrue((instance.getComments() instanceof HashMap));

        MockitoAnnotations.initMocks(instance);
        Mockito.when(instance.getComments().containsKey(null)).thenReturn(true);
        assertTrue(instance.getComments().containsKey(null));

        Mockito.when(instance.getComments().get(null)).thenReturn(new ArrayList<>());
        assertEquals(0, ((ArrayList >)instance.getComments().get(null)).size());
    }
}

public class CommentsConfiguration {
    private Map<String, List<String>> comments = new HashMap<>();

    public Map<String, List<String>> getComments() {
        return comments;
    }

    public void put(String key, List<String> value) {
        this.comments.put(key, value);
    }

}