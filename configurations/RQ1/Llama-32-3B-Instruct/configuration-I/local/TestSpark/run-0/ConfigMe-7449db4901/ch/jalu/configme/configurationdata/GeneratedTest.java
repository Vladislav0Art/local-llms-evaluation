package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void getAllCommentsReturnsReadOnlyView() {
        CommentsConfiguration instance = new CommentsConfiguration();
        Map<String, List<String>> map = instance.getAllComments();
        assertTrue(map instanceof java.util.Map);
        assertFalse(java.util.Collections.unmodifiableMap(map).containsKey("new"));
    }

}