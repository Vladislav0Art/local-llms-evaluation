package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GeneratedTestDoFormatWithoutFormatting {

    @Test
    public void testDoFormatWithoutFormatting() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "h1 {\n    font-size: 16px;\n}";
        LineEnding ending = LineEnding.UNIX;

        String formattedCode = cssFormatter.doFormat(code, ending);

        assertNull(formattedCode);
    }

}