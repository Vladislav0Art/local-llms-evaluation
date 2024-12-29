package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentType;
import ch.jalu.configme.configurationdata.ModelCommentData;
import ch.jalu.configme.configurationdata.ParsedModelComment;
import ch.jalu.configme.configurationdata.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetMultipleCommentsAddsAllNewLinesToPath {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setMultipleCommentsAddsAllNewLinesToPath() {
        String path = "path";
        List<String> commentLines1 = Collections.singletonList("comment1");
        List<String> commentLines2 = Collections.singletonList("");
        ModelCommentData modelCommentData1 = new ParsedModelComment();
        ModelCommentData modelCommentData2 = new ParsedModelComment();
        Mockito.when(commentsConfiguration.setComment(path, commentLines1)).thenReturn(true);
        Mockito.when(commentsConfiguration.setComment(path, commentLines2)).thenReturn(true);
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(path, commentLines1);
        commentsConfiguration.setComment(path, commentLines2);
        Assertions.assertTrue(commentsConfiguration.getAllComments().get(path).containsAll(modelCommentData1, modelCommentData2));
    }

}