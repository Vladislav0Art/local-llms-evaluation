package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDoFormat {

    @Mock
    private InputSource cfg;

    @Mock
    private ConfigurationSource config;

    @Test
    public void testDoFormat() throws IOException {
        String code = "body { color: red; }";
        CSSFormat format = parser.parse(code).format(ending);
        assertEquals("body { color: red;" + LineEnding.CARRIAGE_RETURN, format.toString());
    }

}