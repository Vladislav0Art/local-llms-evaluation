package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetAllComments {

    @Test
    public void testGetAllComments() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path", Arrays.asList("comment1"));
        commentsMap.put("path2", Collections.singletonList(""));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(commentsMap);
        assertEquals(1, commentsConfig.getAllComments().size());
    }

}