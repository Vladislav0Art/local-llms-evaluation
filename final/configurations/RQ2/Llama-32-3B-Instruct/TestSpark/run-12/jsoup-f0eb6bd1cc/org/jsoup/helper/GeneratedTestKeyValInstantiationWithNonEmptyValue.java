package org.jsoup.helper;

public class GeneratedTestKeyValInstantiationWithNonEmptyValue {

    public static String encode(String str) {
        return str;
    }
}

public class Connection {
    public interface KeyVal {
    }
}

public class MainTest {

    @Test
    public void testKeyValInstantiationWithNonEmptyValue() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object obj = Util.invoke(null, "new", "Connection.KeyVal", "(java.lang.String, java.lang.Object)", null, "key", "value");
    }

}