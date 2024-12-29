package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentType;
import ch.jalu.configme.configurationdata.ModelCommentData;
import ch.jalu.configme.configurationdata.ParsedModelComment;
import ch.jalu.configme.configurationdata.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetCommentsForPathWithNoCommentsReturnsEmptyList {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getCommentsForPathWithNoCommentsReturnsEmptyList() {
        String path = "path";
        Mockito.when(commentsConfiguration.setComment(path, new String[]{"comment"})).thenReturn(true);
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(path, new String[]{"comment"});
        Assertions.assertEquals(Collections.emptyList(), commentsConfiguration.getAllComments().get(path));
    }

}