package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSetComment {

    @Test
    public void testSetComment() throws Exception {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] line1 = {"comment", "line", "1"};
        String[] line2 = {"comment", "line", "2"};
        String path = "/test/path";

        commentsConfiguration.setComments(path, line1);
        commentsConfiguration.setComments(path, line2);

        assertEquals(Collections.singletonList(line1), commentsConfiguration.getComments().get(path));
    }

}