package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.nio.charset.StandardCharsets;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import java.nio.file.Paths;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        CssFormatter formatter = new CssFormatter();
        ConfigurationSource cfg = new ConfigurationSource() {
            @Override
            public LineEnding getLineEnding() {
                return LineEnding.CRLF;
            }

            @Override
            public java.nio.charset.Charset getEncoding() {
                return StandardCharsets.UTF_8;
            }

            @Override
            public java.nio.file.Path getTargetDirectory() {
                return Paths.get("target");
            }
        };
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        formatter.init(options, cfg);
        Assert.assertTrue(formatter.isInitialized());
    }

}