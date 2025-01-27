package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class GeneratedCreateFromEncoded_NullString_ThrowsNPE {

    @Test
    public void createFromEncoded_NullString_ThrowsNPE() {
        assertThrows(NullPointerException.class, () -> TextNode.createFromEncoded(null));
    }

    static class AppendableStub implements Appendable {
        StringBuilder sb = new StringBuilder();

        @Override
        public Writer writer() {
            return new StringWriter(sb);
        }
    }

}