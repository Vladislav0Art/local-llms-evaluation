package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetEmptyLines_emptyLineAndNewLineOnly {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void setEmptyLines_emptyLineAndNewLineOnly() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> map = new HashMap<>();
        comments.setComment("path", "\n");
        Map<String, List<String>> resultMap = comments.getAllComments();
        assertTrue(resultMap.isEmpty());
    }

}