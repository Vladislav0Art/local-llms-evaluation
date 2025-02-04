package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedSetComment_setNullPath {

    @Test
    public void setComment_setNullPath() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] lines = {"line1", "line2"};
        assertThrows(NullPointerException.class, () -> config.setComment(null, lines));
    }

}