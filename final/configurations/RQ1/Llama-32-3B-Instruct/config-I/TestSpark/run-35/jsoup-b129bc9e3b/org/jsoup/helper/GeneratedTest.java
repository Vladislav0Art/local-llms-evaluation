package org.jsoup.helper;

public class GeneratedTest {

    private String key;
    private String value;

    public static KeyVal create(String key, String filename) {
        return new KeyVal(key, null);
    }

    public KeyVal() {
    }

    public String getKey() {
        return key;
    }

    public boolean hasInputStream() {
        return false;
    }

    public String getContentType() {
        return "contentType";
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static KeyVal createFromFile(String key, String filename) {
        // implementation
    }
}

public class ConnectionKeyVal extends KeyVal {

    @Override
    public boolean hasInputStream() {
        return false;
    }

    @Override
    public String getContentType() {
        return "contentType";
    }
}

public class KeyValTest {

    private KeyVal keyVal;

    @Before
    public void setUp() {
        this.keyVal = KeyVal.create("key", null);
    }

    @After
    public void tearDown() {
        keyVal = null;
    }

}