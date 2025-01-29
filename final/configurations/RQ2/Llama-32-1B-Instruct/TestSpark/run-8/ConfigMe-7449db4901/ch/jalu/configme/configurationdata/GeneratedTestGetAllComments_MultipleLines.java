package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentLine;
import ch.jalu.configme.configurationdata.FileComment;
import ch.jalu.configme.configurationdata.CommentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetAllComments_MultipleLines {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void testGetAllComments_MultipleLines() {
        String path = "path";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path, Collections.singletonList(new FileComment("", CommentType.LINE)));
        commentsConfiguration.setComment(path, null);
        Assertions.assertEquals(1, comments.get(path).size());
    }

}