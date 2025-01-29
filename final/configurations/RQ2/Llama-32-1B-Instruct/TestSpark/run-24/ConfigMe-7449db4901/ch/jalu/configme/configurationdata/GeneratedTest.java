package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testCommentSet() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("/path", Collections.singletonList(""));
        CommentsConfiguration configuration = new CommentsConfigurationBuilder()
                .withComments(comments)
                .build();

        configuration.setComment("/path", "some comment");
        String expectedComment = configuration.getAllComments().get("/path").get(0);
        assertEquals(expectedComment, comments.get("/path").get(1));
    }

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

    @Test
    public void testCommentSetEmptyString() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("/path", Collections.singletonList(""));
        CommentsConfiguration configuration = new CommentsConfigurationBuilder()
                .withComments(comments)
                .build();

        configuration.setComment("/path", "");
        String expectedComment = configuration.getAllComments().get("/path").get(0);
        assertEquals(expectedComment, comments.get("/path").get(0));
    }

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