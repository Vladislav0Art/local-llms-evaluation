package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() throws IOException {
        Map<String, String> options = new HashMap<>();
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(options, null);

        cssFormatter.doFormat("invalid css code", LineEnding.CR);
    }

}