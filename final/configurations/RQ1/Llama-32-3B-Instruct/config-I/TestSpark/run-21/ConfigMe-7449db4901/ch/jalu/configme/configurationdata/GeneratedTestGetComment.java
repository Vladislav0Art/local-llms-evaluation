package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetComment {

    @Test
    public void testGetComment() throws Exception {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] line1 = {"comment", "line", "1"};
        String[] line2 = {"comment", "line", "2"};
        String path = "/test/path";

        commentsConfiguration.setComments(path, line1);
        commentsConfiguration.setComments(path, line2);

        assertEquals(Collections.singletonList(line2), commentsConfiguration.getComments().get(path));
    }

}