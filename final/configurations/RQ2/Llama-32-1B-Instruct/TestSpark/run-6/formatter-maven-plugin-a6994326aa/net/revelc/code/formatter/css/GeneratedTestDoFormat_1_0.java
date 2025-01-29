package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestDoFormat_1_0 {

    @Test
    public void testDoFormat_1_0() {
        InputSource is = mock(InputSource.class);
        SACParserCSS3 parser = mock(SACParserCSS3.class);
        when(parser.parse(is)).thenReturn(styleSheet9);
        CssFormatter formatter = new CssFormatter(new HashMap<>(), mock(ConfigurationSource.class));
        String code = formatter.doFormat(styleSheet9, LineEnding.ELF);
        verify(codeBuilder()).append(code());
    }

    private void assertInstanceInitialized(CssFormatter instance) {
        when(instance.getClass().getMethod("getConfiguration").invoke(mock(ConfigurationSource.class))).thenReturn(null);
    }

    private class MockConfigurationSource implements ConfigurationSource {
        @Override
        public Configuration get() {
            return new Configuration();
        }
    }

    private interface CodeBuilder extends CodeGenerator {
        void append(String code());
    }

    static abstract class CodeGenerator {
        protected CodeBuilder codeBuilder;

        protected CodeGenerator(CodeBuilder codeBuilder) {
            this.codeBuilder = codeBuilder;
        }

        public CodeBuilder getCodeBuilder() {
            return codeBuilder;
        }
    }

}