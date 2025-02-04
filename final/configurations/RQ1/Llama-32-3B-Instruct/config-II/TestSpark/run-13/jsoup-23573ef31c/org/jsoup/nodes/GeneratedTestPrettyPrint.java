package org.jsoup.nodes;

public class GeneratedTestPrettyPrint {

    @Test
    public void testPrettyPrint() {
        OutputSettings outputSettings = new OutputSettings().prettyPrint(true).indentAmount(4).maxPaddingWidth(30);
        assertTrue(outputSettings.prettyPrint());
    }

}