package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedConstructorSetsCommentsFromExistingMap {

    @Test
    public void constructorSetsCommentsFromExistingMap() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(existingComments);
        assertEquals(1, commentsConfiguration.comments.size());
        assertTrue(commentsConfiguration.comments.containsValue(existingComments.get("path1")));
    }

}