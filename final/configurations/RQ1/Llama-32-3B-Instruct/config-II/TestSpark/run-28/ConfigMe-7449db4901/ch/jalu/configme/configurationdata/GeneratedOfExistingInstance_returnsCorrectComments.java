package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyList;
import static org.mockito.Mockito.anyMap;

public class GeneratedOfExistingInstance_returnsCorrectComments {

    @Test
    public void ofExistingInstance_returnsCorrectComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(1, configuration.comments.size());
        assertEquals(anyList(), configuration.comments.values().iterator().next());
    }

}