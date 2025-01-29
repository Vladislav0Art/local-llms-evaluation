package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentLine;
import ch.jalu.configme.configurationdata.FileComment;
import ch.jalu.configme.configurationdata.CommentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetAllComments {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void testGetAllComments() {
        String path = "path";
        String[] commentLines = {"line1", "", "line3"};
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path, Collections.singletonList(commentLines));
        commentsConfiguration.setComment(path, commentLines);
        Assertions.assertEquals(1, comments.get(path).size());
    }

}