package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetAllCommentsReturnsUnmodifiableMap {

    @Test
    public void getAllCommentsReturnsUnmodifiableMap() {
        CommentsConfiguration commentConfig = new CommentsConfiguration();
        Map<String, List<String>> comments = Collections.singletonMap("path", Arrays.asList("line1"));
        commentConfig.setComment("path", "line1");
        assertNotNull(commentConfig.getAllComments());
        assertTrue(((List<String>) commentConfig.getAllComments().get("path")).containsAll(Arrays.asList("line1")));
    }

}