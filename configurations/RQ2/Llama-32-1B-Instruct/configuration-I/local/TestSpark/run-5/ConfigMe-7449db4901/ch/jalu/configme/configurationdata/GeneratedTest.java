package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testGetComments() {
        assertEquals("comment1", commentsConfig.getAllComments().get("path"));
        assertEquals(Arrays.asList("line1", "line2"), commentsConfig.getAllComments().get("path"));
        assertEquals(Collections.emptyList(), commentsConfig.getAllComments().get(""));
        assertEquals(Collections.singletonList("line1"), expectedCommentsMap.get("path"));
    }

}