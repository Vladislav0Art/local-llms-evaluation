package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;

public class GeneratedClone_returnsSameInstance {

    @Test
    public void clone_returnsSameInstance() {
        Comment original = new Comment("data");
        Comment cloned = original.clone();
        assertSame(original, cloned);
    }

}