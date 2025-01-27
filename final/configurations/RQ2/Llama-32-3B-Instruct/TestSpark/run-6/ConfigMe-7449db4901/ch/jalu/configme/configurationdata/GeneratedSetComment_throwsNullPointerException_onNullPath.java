package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_throwsNullPointerException_onNullPath {

    @Test
    public void setComment_throwsNullPointerException_onNullPath() {
        assertThrows(NullPointerException.class, () -> new CommentsConfiguration().setComment(null, "line1", "line2"));
    }

}