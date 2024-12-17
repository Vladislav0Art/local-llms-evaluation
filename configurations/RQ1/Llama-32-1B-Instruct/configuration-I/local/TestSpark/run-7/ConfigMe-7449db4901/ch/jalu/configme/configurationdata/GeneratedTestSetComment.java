package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.comments.CommentsConfigurationComment;
import ch.jalu.configme.configurationdata.settings.SettingsHolder;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestSetComment {

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

}