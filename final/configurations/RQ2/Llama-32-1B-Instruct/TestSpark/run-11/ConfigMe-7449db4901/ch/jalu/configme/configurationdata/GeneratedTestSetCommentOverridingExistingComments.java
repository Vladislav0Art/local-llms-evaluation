package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

public class GeneratedTestSetCommentOverridingExistingComments {

    private CommentsConfiguration commentsConfiguration;

    @BeforeEach
    void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void testSetCommentOverridingExistingComments() {
        Mockito.when(commentsConfiguration.getAllComments().get("path").get(0)).thenReturn("");
        Comment comment = new Comment();
        comment.setLines(new String[]{"", "line1"});
        commentsConfiguration.setComment("path", comment);
        assertEquals(new String[]{"", "line1"}, commentsConfiguration.getAllComments().get("path"));
    }

}