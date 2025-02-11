package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_nullPath {

    @Test
    public void setComment_nullPath() {
        assertThrows(NullPointerException.class, () -> new CommentsConfiguration(null).setComment(null, new String[]{"test"}));
    }

}