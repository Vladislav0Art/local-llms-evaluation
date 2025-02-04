package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedGetComments_returnsReadOnlyViewOfMap {

    @Test
    public void getComments_returnsReadOnlyViewOfMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "comment1");
        Map<String, List<String>> comments = config.getAllComments();
        assertNotNull(comments);
        assertTrue(comments instanceof java.util.Map.UnmodifiableMap);
    }

}