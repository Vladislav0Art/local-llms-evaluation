package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructor_test {

    @Mock
    private SettingsHolder settingsHolderMock;

    @Test
    public void constructor_test() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assert commentsConfiguration instanceof CommentsConfiguration;
    }

}