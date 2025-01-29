package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCommentSetMultipleLines {

    @Test
    public void testCommentSetMultipleLines() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("/path", Collections.singletonList(""));
        comments.put("/anotherPath", Collections.singletonList("line 2"));
        CommentsConfiguration configuration = new CommentsConfigurationBuilder()
                .withComments(comments)
                .build();

        configuration.setComment("/path", "some comment");
        String expectedComment = configuration.getAllComments().get("/path").get(1);
        assertEquals(expectedComment, comments.get("/path").get(1));
    }

}