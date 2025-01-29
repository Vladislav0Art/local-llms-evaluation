package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedSetComment_SetsCommentLines {

    @Test
    public void setComment_SetsCommentLines() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"", ""};
        commentsConfig.setComment(path, commentLines);
        Map<String, List<String>> expectedComments = Collections.singletonMap("path", Arrays.asList(commentLines));
        assertEquals(expectedComments, commentsConfig.getAllComments());
    }

}