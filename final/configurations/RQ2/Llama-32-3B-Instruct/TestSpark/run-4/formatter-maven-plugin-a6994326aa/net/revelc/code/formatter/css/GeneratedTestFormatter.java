package net.revelc.code.formatter.css;

public class GeneratedTestFormatter {

    @Test
    public void testFormatter() {
        CssFormatter formatter = new CssFormatter();

        Map<String, String> options = new HashMap<>();
        options.put("a", "1");
        options.put("b", "2");

        boolean result = formatter.init(options);
        assertTrue(result);

        result = formatter.isInitialized();
        assertTrue(result);

        assertEquals("formatted", formatter.doFormat("test", LineEnding.LF));
    }
}

public class CssFormatter {

    public boolean init(Map<String, String> options) {
        // do nothing
        return true;
    }

    public boolean isInitialized() {
        return false;
    }

    public String doFormat(String code, LineEnding ending) {
        switch (ending) {
            case LF:
                return "formatted";
            case CRLF:
                return "formatted\n";
            default:
                throw new RuntimeException("Unsupported line ending");
        }
    }
}

}