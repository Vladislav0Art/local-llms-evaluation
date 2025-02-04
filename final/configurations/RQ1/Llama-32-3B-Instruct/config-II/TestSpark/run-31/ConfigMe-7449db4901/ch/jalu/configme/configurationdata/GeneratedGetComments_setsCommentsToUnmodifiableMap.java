package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedGetComments_setsCommentsToUnmodifiableMap {

    @Test
    public void getComments_setsCommentsToUnmodifiableMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        config.setComment("otherPath", "comment1");
        Map<String, List<String>> comments = config.getAllComments();
        assertTrue(comments instanceof java.util.Map.UnmodifiableMap);
    }

}