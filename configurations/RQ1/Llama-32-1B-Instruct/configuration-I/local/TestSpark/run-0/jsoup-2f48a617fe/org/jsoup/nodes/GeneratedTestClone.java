package org.jsoup.nodes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        Comment comment1 = new Comment("");
        Comment comment2 = comment1.clone();
        Assert.assertNotSame(comment1, comment2);
        Assert.assertNotNull(comment2);
    }

}