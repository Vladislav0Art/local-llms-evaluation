package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetAllComments {

    @Test
    public void testGetAllComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("/path", Collections.singletonList(""));
        CommentsConfiguration configuration = new CommentsConfigurationBuilder()
                .withComments(comments)
                .build();

        assertEquals(comments, configuration.getAllComments());
    }

}