package net.revelc.code.formatter.css;

import net.revelc.code.formatter.ConfigurationSource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestDoFormat {

    @Test
    public void testDoFormat() {
        // Arrange
        String[] options = new String[]{"--css-minify", "--css-no-empty"};
        ConfigurationSource cfg = new ConfigurationSource();
        InputSource inputSource = new InputSource(new StringReader("body { color: blue; }"));

        // Act
        CSSOMParser parser = new SACParserCSS3(inputSource);
        CssFormatter formatter = new CssFormatter(options, cfg);
        CSSFormat cssFormat = formatter.doFormat(parser);

        // Assert
        assertEquals(1, cssFormat.getLines().size());
    }

}