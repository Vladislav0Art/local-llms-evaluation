package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;

public class GeneratedCreateFromEncoded {

    @Test
    public void createFromEncoded() {
        TextNode node = TextNode.createFromEncoded("%s %s%n");
        assertNotNull(node);
    }

}