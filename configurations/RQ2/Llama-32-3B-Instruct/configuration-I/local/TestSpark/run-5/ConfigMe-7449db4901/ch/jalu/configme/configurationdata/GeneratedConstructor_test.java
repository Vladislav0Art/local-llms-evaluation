package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructor_test {

    @Mock
    private Map<String, List<String>> commentsMap;

    @org.junit.Before
    public void setup() {
        this.commentsMap = Mockito.mock(Map.class);
    }

    @Public
    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(commentsMap);
    }

    @Test
    public void constructor_test() {
        CommentsConfiguration commentsConfiguration = getCommentsConfiguration();
        Mockito.verify(commentsConfiguration.commentsMap).equals(commentsMap);
    }

    @Public
    public void setComment_no_comment_lines_test() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        commentsConfiguration.setComment("path", "");
        List<String> lines = new ArrayList<>();
        Mockito.verify(lines).add("");
    }

    @Public
    public void setComment_single_line_with_comment_marker_test() {
        String commentLine = "# Comment";
        CommentsConfiguration commentsConfiguration = getCommentsConfiguration();
        commentsConfiguration.setComment("path", commentLine);
        List<String> lines = new ArrayList<>();
        lines.add(commentLine);
        Mockito.verify(lines).add(commentLine);
    }

    @Public
    public void setComment_multiple_lines_with_comments_test() {
        String[] commentLines = {"# Comment1", "# Comment2"};
        CommentsConfiguration commentsConfiguration = getCommentsConfiguration();
        commentsConfiguration.setComment("path", commentLines[0], commentLines[1]);
        List<String> lines = new ArrayList<>();
        lines.add(commentLines[0]);
        lines.add(commentLines[1]);
        Mockito.verify(lines).add(commentLines[0]).add(commentLines[1]);
    }

    @Public
    public void getAllComments_empty_comments_map_test() {
        CommentsConfiguration commentsConfiguration = getCommentsConfiguration();
        Map<String, @UnmodifiableView List<String>> allComments = commentsConfiguration.getAllComments();
        Mockito.verify(allComments).isEmpty();
    }

}