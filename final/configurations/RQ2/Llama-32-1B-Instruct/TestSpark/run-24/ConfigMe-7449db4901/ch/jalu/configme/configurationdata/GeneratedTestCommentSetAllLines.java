package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCommentSetAllLines {

    @Test
    public void testCommentSetAllLines() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("/path", Collections.singletonList(""));
        CommentsConfiguration configuration = new CommentsConfigurationBuilder()
                .withComments(comments)
                .build();

        configuration.setComment("/path", "some comment");
        String expectedComment = configuration.getAllComments().get("/path").get(1);
        assertEquals(expectedComment, comments.get("/path").get(0));
    }

}