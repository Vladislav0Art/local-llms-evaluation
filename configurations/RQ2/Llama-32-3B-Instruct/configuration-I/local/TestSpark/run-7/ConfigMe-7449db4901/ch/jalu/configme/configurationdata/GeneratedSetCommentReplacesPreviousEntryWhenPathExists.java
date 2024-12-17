package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.*;

@RunWith(PowerMockRunner.class)
public class GeneratedSetCommentReplacesPreviousEntryWhenPathExists {

    @Test
    public void setCommentReplacesPreviousEntryWhenPathExists() {
        CommentsConfiguration configuration = new CommentsConfiguration(new HashMap<>());
        String previousCommentLine = "previous comment";
        List<String> commentLines = Arrays.asList(previousCommentLine, "new comment");
        configuration.setComment("path", commentLines);
        Map<String, List<String>> allComments = configuration.getAllComments();
        assertTrue(allComments.get("path").contains(previousCommentLine));
    }

}