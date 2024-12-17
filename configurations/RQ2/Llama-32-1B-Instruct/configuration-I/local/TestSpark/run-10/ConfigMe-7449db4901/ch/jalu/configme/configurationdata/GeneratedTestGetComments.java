package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetComments {

    @Test
    public void testGetComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList("line1"));
        comments.put("path2", Collections.emptyList());
        assertEquals(Map.of("path1", Collections.singletonList("line1"), "path2", Collections.emptyList()), Main.getComments("path1", "path2"));
    }

}