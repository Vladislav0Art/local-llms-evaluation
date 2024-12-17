package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.comments.CommentsConfigurationComment;
import ch.jalu.configme.configurationdata.settings.SettingsHolder;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTest {

    private CommentsConfiguration commentsConfiguration;
    private SettingsHolder settingsHolder;
    private Map<String, List<String>> commentsMap;
    private CommentsComments commentsComments;
    private CommentsComment comment;
    private String path1 = "path1";
    private String line1 = "\nline1";
    private String line2 = "";
    private String[] commentLines1 = {"comment1", "", ""};
    private String[] commentLines2 = {"comment2", "comment3", ""};

    @Before
    public void setUp() {
        commentsConfiguration = new CommentsConfiguration();
        settingsHolder = new SettingsHolder();
        commentsMap = settingsHolder.getComments();
        commentsComments = new CommentsComments(commentsMap);
        comment = new CommentsComment(path1, line1, commentLines1[0]);
    }

    @Test
    public void testSetComment() {
        commentsConfiguration.setComment(path1, comment);
        Assert.assertTrue(commentsMap.containsKey(path1));
        Assert.assertTrue(Arrays.asList(commentLines1).containsAll(Arrays.asList(line1, "")));
    }

    @Test
    public void testGetAllComments() {
        commentsConfiguration.setComment(path1, line2);
        Map<String, List<String>> result = commentsConfiguration.getAllComments();
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.containsKey(path1));
        Assert.assertTrue(Arrays.asList(commentLines1).containsAll(Arrays.asList(line1, line2)));
    }

    @Test
    public void testGetComment() {
        CommentsConfigurationComment comment2 = new CommentsConfigurationComment("path2", "", "");
        commentsMap.put("path2", Arrays.asList(comment2));
        CommentsConfigurationComments commentsComments2 = new CommentsComments(commentsMap);
        CommentReader reader = new CommentReader();
        Assert.assertTrue(reader.getComments(path1).containsAll(Arrays.asList(commentLines1[0], comment2)));
    }

    @Test
    public void testGetCommentLines() {
        commentsConfiguration.setComment(path1, line2);
        String[] result = commentsConfiguration.getAllComments().get(path1).get(0);
        Assert.assertTrue(result.length == 3 && Arrays.equals(result, Arrays.asList(line1, "", "")));
    }

    @Test
    public void testGetAllCommentsLines() {
        commentsMap.put("path2", Collections.singletonList(comment2));
        CommentsConfigurationComments commentsComments2 = new CommentsComments(commentsMap);
        CommentReader reader = new CommentReader();
        Assert.assertTrue(reader.getComments(path1).get(0).containsAll(Arrays.asList(line1, comment2)));
    }

}