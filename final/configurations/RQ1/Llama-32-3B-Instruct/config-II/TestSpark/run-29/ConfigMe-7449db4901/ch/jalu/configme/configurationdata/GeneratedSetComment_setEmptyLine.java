package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedSetComment_setEmptyLine {

    @Test
    public void setComment_setEmptyLine() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] lines = {"\n"};
        config.setComment("path", lines[0]);
        assertNotNull(config.comments.get("path"));
        assertEquals(Collections.singletonList(lines), config.comments.get("path"));
    }

}