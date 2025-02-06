package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_withNewLine_test {

    @Mock
    private SettingsHolder settingsHolderMock;

    @Test
    public void setComment_withNewLine_test() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        commentsConfiguration.setComment("test", "", "line2");
        assert commentsConfiguration.getComments().get("test").size() == 1;
    }

}