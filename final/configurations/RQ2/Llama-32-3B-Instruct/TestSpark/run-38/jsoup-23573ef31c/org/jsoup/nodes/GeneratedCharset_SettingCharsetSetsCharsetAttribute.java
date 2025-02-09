package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCharset_SettingCharsetSetsCharsetAttribute {

    @Test
    public void charset_SettingCharsetSetsCharsetAttribute() {
        Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        Document document = new Document("");
        document.charset(charset);
        assertTrue(document.charset().equals(charset));
    }

}