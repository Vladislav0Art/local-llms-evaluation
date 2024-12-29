package net.revelc.code.formatter.css;

public class GeneratedTest {

    public String getBody() {
        return "body { color: blue; }";
    }

    public String getCssCode() {
        return "";
    }
}

public class TestResponse extends Response {
    @Override
    public String getCssCode() {
        return getBody();
    }
}

public class TestMethod1 extends Response {
    @Override
    public String getCssCode() {
        return getBody();
    }

}