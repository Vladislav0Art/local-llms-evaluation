package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testCommentsConfigurationConstructor() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertEquals(0, commentsConfig.getAllComments().size());
    }

    @Test
    public void testCommentsConfigurationConstructorMap() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path", Arrays.asList("comment1"));
        commentsMap.put("path2", Collections.singletonList(""));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(commentsMap);
        assertEquals(2, commentsConfig.getAllComments().size());
    }

    @Test
    public void testCommentLinesSetter_SingleNewLine() {
        String path = "path";
        String...commentLines = {"comment1\ncomment2"};
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment(path, Arrays.asList(commentLines));
        assertEquals(1, commentsConfig.getAllComments().size());
    }

    @Test
    public void testCommentLinesSetter_SingleNewLineMultiple() {
        String path = "path";
        List<String> commentLines = Arrays.asList("comment1\ncomment2");
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment(path, commentLines);
        assertEquals(1, commentsConfig.getAllComments().size());
    }

    @Test
    public void testGetAllComments() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path", Arrays.asList("comment1"));
        commentsMap.put("path2", Collections.singletonList(""));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(commentsMap);
        assertEquals(1, commentsConfig.getAllComments().size());
    }

}