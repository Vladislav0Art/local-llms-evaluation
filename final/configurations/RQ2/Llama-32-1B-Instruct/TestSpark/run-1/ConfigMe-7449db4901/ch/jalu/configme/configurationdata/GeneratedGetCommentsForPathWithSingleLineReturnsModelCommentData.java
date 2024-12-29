package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentType;
import ch.jalu.configme.configurationdata.ModelCommentData;
import ch.jalu.configme.configurationdata.ParsedModelComment;
import ch.jalu.configme.configurationdata.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetCommentsForPathWithSingleLineReturnsModelCommentData {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getCommentsForPathWithSingleLineReturnsModelCommentData() {
        String path = "path";
        List<String> commentLines = Collections.singletonList("");
        ModelCommentData modelCommentData = new ParsedModelComment();
        Mockito.when(commentsConfiguration.setComment(path, commentLines)).thenReturn(true);
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(path, commentLines);
        Assertions.assertEquals(modelCommentData, commentsConfiguration.getAllComments().get(path));
    }

}