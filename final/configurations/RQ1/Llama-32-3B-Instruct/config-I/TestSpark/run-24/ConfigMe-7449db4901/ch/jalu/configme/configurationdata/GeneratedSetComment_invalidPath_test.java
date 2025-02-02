package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedSetComment_invalidPath_test {

    @Test
    public void setComment_invalidPath_test() {
        CommentsConfiguration comments = new CommentsConfiguration();
        try {
            comments.setComment("", "line");
            assert false;
        } catch (Exception e) {
        }
    }

}