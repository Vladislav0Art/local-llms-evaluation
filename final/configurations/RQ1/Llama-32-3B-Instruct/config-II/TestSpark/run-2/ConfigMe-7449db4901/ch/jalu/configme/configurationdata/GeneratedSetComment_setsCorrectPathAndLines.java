package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedSetComment_setsCorrectPathAndLines {

    @Test
    public void setComment_setsCorrectPathAndLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "line1");
        assertEquals(Collections.singletonList("line1"), config.comments.get("path"));
    }

}