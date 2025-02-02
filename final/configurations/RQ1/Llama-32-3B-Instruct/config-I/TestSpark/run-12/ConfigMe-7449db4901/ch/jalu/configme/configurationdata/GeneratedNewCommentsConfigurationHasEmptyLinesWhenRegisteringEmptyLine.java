package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Map;
import java.util.List;

public class GeneratedNewCommentsConfigurationHasEmptyLinesWhenRegisteringEmptyLine {

    @Test
    public void newCommentsConfigurationHasEmptyLinesWhenRegisteringEmptyLine() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] commentLines = {"\n"};
        String path = "path";
        commentsConfiguration.setComment(path, commentLines);
        assertTrue(commentsConfiguration.getAllComments().get(path).isEmpty());
    }

}