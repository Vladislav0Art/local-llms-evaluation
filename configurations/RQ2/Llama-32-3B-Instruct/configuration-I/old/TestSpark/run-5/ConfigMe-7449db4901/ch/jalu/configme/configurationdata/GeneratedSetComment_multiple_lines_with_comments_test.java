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
public class GeneratedSetComment_multiple_lines_with_comments_test {

    @Mock
    private Map<String, List<String>> commentsMap;

    @org.junit.Before
    public void setup() {
        this.commentsMap = Mockito.mock(Map.class);
    }

    @Test
    public void setComment_multiple_lines_with_comments_test() {
        String[] commentLines = {"# Comment1", "# Comment2"};
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        commentsConfiguration.setComment("path", commentLines[0], commentLines[1]);
        List<String> lines = new ArrayList<>();
        lines.add(commentLines[0]);
        lines.add(commentLines[1]);
        Mockito.verify(lines).add(commentLines[0]).add(commentLines[1]);
    }

}