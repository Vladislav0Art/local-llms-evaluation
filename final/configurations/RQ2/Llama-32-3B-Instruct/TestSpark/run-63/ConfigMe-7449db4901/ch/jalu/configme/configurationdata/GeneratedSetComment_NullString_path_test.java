package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class GeneratedSetComment_NullString_path_test {

    @Test
    public void setComment_NullString_path_test() {
        assertThrows(NullPointerException.class, () -> new CommentsConfiguration(new HashMap<>()).setComment(null, "new-line"));
    }

}