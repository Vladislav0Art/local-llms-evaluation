package net.revelc.code.formatter.css;

public class GeneratedTest {

    private Map<String, String> properties;

    public void init(Map<String, String> options) throws IOException {
        if (options.containsKey("indent") && (Integer) (Integer) options.get("indent") > 0) {
            throw new IOException("Invalid indent");
        }
        this.properties = options;
    }

    public String doFormat(String css) throws IOException {
        // implementation
        return "";
    }

    public Map<String, String> getProperties() {
        return properties;
    }
}

class LineEnding {
}

public class CssFormatterTest {

}