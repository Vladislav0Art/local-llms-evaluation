package net.revelc.code.formatter.css;

public class GeneratedInit_ValidIndent_MatchesExpectedValue {

    @Test
    public void init_ValidIndent_MatchesExpectedValue() {
        CssFormatter formatter = new CssFormatter();
        var options = Map.of("indent", "4");
        formatter.init(options, null);
        assertEquals(4, ((CssFormatter) formatter.formatter).getProperties().get("indent"));
    }

}