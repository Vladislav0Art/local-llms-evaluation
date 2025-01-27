package org.davidmoten.text.utils;

public class GeneratedWordWrapReaderInOutAndNewLineShouldNotThrowAnyException {

    @Test
    public void wordWrapReaderInOutAndNewLineShouldNotThrowAnyException() {
        try (WordWraper wordWraper = new WordWraper(20, true)) {
            Writer out = new StringWriter();
            String newLine = "\n";
            int maxWidth = 20;
            Function<String, Number> stringWidth = s -> s.length();
            Set<Character> extraWordChars = new HashSet<>();
            boolean insertHyphens = true;
            boolean breakWords = false;

            wordWraper.setInsertHyphens(insertHyphens);
            wordWraper.setBreakWords(breakWords);
            wordWraper.setExtraWordChars(extraWordChars);

            out.append("This is a test string that needs to be wrapped");
            out.append(newLine);
            out.append("with a max width of 20");

            String wrappedText = wordWraper.wrapText(out.toString());
            Assert.assertTrue(wrappedText.contains("This "));
        } catch (Exception e) {
            fail("Expected no exception");
        }
    }

}