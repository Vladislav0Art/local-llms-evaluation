package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.Map;

public class GeneratedInit_SetsFormatterProperties {

    @Test
    public void init_SetsFormatterProperties() {
        // given
        Map<String, String> options = Map.of("indent", "2");
        ConfigurationSource cfg = null;
        cssFormatter.init(options, cfg);

        // when
        String formatter = cssFormatter.getFormatter();

        // then
        assertEquals(2, Integer.parseInt(formatter.getProperties().getPropertiesInSeparateLines()));
    }

}