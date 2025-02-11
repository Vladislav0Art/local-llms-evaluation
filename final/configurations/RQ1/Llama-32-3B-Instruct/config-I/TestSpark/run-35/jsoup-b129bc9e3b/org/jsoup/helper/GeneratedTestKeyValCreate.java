package org.jsoup.helper;

public class GeneratedTestKeyValCreate {

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

    @Test
    public void testKeyValCreate() {
        Assert.assertEquals("key", keyVal.getKey());
        Assert.assertFalse(keyVal.hasInputStream());
        Assert.assertEquals("contentType", keyVal.getContentType());

        KeyVal keyVal2 = new KeyVal();
        keyVal2.setValue("value");
        System.out.println(keyVal2.getValue());

        this.keyVal = KeyVal.create("key2", "filename");
        Assert.assertEquals("key2", this.keyVal.getKey());
        Assert.assertFalse(this.keyVal.hasInputStream());
        Assert.assertEquals("contentType", this.keyVal.getContentType());

        this.keyVal = new ConnectionKeyVal("key3", "filename");
        Assert.assertFalse(this.keyVal.hasInputStream());
    }

}