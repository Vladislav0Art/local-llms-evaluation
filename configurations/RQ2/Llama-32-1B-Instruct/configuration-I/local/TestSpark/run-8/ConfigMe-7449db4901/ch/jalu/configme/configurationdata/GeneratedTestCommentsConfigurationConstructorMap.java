package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCommentsConfigurationConstructorMap {

    @Test
    public void testCommentsConfigurationConstructorMap() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path", Arrays.asList("comment1"));
        commentsMap.put("path2", Collections.singletonList(""));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(commentsMap);
        assertEquals(2, commentsConfig.getAllComments().size());
    }

}