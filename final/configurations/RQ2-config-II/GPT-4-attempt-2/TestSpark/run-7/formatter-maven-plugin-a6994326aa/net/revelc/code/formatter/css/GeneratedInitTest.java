package net.revelc.code.formatter.css;

import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.api.mockito.PowerMockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(PowerMockRunner.class)
public class GeneratedInitTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void initTest() {
        CssFormatter formatter = new CssFormatter();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");

        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

}