package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.*;

@RunWith(PowerMockRunner.class)
public class GeneratedSetCommentAddsEmptyEntryForSingleNewLine {

    @Test
    public void setCommentAddsEmptyEntryForSingleNewLine() {
        CommentsConfiguration configuration = new CommentsConfiguration(new HashMap<>());
        String singleNewLine = "\n";
        List<String> commentLines = Arrays.asList(singleNewLine, "new comment");
        configuration.setComment("path", commentLines);
        Map<String, List<String>> allComments = configuration.getAllComments();
        assertTrue(allComments.containsKey("path"));
    }

}