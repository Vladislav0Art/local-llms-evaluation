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
public class GeneratedSetComment_no_comment_lines_test {

    @Mock
    private Map<String, List<String>> commentsMap;

    @org.junit.Before
    public void setup() {
        this.commentsMap = Mockito.mock(Map.class);
    }

    @Test
    public void setComment_no_comment_lines_test() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        commentsConfiguration.setComment("path", "");
        List<String> lines = new ArrayList<>();
        Mockito.verify(lines).add("");
    }

}