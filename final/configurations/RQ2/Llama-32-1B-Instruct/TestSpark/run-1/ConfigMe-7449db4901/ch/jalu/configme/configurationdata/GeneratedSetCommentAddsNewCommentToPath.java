package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentType;
import ch.jalu.configme.configurationdata.ModelCommentData;
import ch.jalu.configme.configurationdata.ParsedModelComment;
import ch.jalu.configme.configurationdata.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetCommentAddsNewCommentToPath {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentAddsNewCommentToPath() {
        String path = "path";
        List<String> commentLines = Collections.singletonList("comment");
        ModelCommentData modelCommentData = new ParsedModelComment();
        Mockito.when(commentsConfiguration.setComment(path, commentLines)).thenReturn(true);
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(path, commentLines);
        Assertions.assertTrue(commentsConfiguration.getAllComments().get(path).contains(modelCommentData));
    }

}