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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_CommentLinesNull_IllegalArgumentException {

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setComment_CommentLinesNull_IllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> commentsConfiguration.setComment("path", null));
    }

}