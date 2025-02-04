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

public class GeneratedSetComment_setsCorrectPathWithEmptyLine {

    @Test
    public void setComment_setsCorrectPathWithEmptyLine() {
        CommentsConfiguration config = new CommentsConfiguration(existingMap);
        config.setComment("path", "\n");
        assertEquals(Collections.emptyList(), config.comments.get("path"));
    }

}