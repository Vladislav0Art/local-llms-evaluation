package net.revelc.code.formatter.css;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import org.w3c.css.sac.InputSource;

import static org.junit.Assert.*;

public class GeneratedTestIsInitializedWithoutOptions {

    public String doFormatWithoutOptions() {
        return "body { background-color: #fff; }";
    }

    public String doFormatWithEmptyOptions() throws IOException {
        InputSource source = new InputSource(new java.nio.charset.StandardCharsets.UTF_8);
        return CssFormatter.doFormat(source, LineEnding.CRLF);
    }

    public void doFormatWithOptionsNotProvided() throws IOException {
        System.out.println(CssFormatter.doFormat(null, LineEnding.CRLF));
    }

    boolean isInitializedWithoutOptions() {
        return CssFormatter.isInitialized();
    }

    boolean isInitializedWithOptionsProvided() throws IOException {
        return CssFormatter.isInitialized();
    }

    @Test
    public void testIsInitializedWithoutOptions() {
        System.out.println(isInitializedWithoutOptions());
    }

}