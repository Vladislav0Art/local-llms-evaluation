package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedSetComment_HidesEmptyLineIfNoComment {

    @Test
    public void setComment_HidesEmptyLineIfNoComment() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"", ""};
        commentsConfig.setComment(path, commentLines);
        Map<String, List<String>> expectedComments = Collections.singletonMap("path", Arrays.asList());
        assertEquals(expectedComments, commentsConfig.getAllComments());
    }

}