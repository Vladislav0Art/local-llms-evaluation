package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.lang.reflect.Method;

public class GeneratedConstructorShouldInitializeMap {

    @Test
    public void constructorShouldInitializeMap() {
        CommentsConfiguration comments = new CommentsConfiguration();
        assertNull(comments.comments);
    }

}