package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSetCommentEmpty {

    @Test
    public void testSetCommentEmpty() throws Exception {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] line1 = {"comment", "line", "1"};

        commentsConfiguration.setComments("test/path", line1);

        assertEquals(Collections.singletonList(line1), commentsConfiguration.getComments().get("test/path"));
    }

}