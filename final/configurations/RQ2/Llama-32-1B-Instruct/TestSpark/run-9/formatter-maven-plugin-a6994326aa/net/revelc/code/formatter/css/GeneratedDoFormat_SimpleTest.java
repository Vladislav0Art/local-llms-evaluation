package net.revelc.code.formatter.css;

public class GeneratedDoFormat_SimpleTest {

    @Test
    public void doFormat_SimpleTest() throws IOException {
        String code = "body { background-color: #f2f2f2; }";
        LineEnding ending = LineEnding.LF_ALL;
        String expected = "body {\n  background-color: #f2f2f2;\n}";
        assert formatter.doFormat(code, ending) == expected : "doFormat failed";
    }

}