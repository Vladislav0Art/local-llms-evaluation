package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentTest_NullCommentLinesArray {

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void setCommentTest_NullCommentLinesArray() {
        assertThrows(NullPointerException.class, () -> commentsConfiguration.setComment("path", (String[]) null));
    }

}