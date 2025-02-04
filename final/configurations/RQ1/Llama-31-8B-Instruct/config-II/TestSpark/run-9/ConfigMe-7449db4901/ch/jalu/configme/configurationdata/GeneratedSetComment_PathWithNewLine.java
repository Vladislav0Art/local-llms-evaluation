package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_PathWithNewLine {

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setComment_PathWithNewLine() {
        commentsConfiguration.setComment("path", "\n");
        assertEquals(Collections.emptyList(), commentsConfiguration.getAllComments().get("path"));
    }

}