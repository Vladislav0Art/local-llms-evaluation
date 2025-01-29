package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void testCheckNotNull() {
        String attrKey = "myAttr";
        Object expectedValue = "Hello, world!";
        Mockito.when(Attributes.internalKey(attrKey)).thenReturn(expectedValue);
        Assertions.assertThat(Attributes.checkNotNull(Mockito.mock(String.class))).isEqualTo(expectedValue);
    }

    @Test
    public void testGet_
    returns empty for

    consumers() {
        String key = "myAttr";
        Attributes attributes = new Attributes();
        Object expectedValue = "";
        Mockito.when(attributes.get(key)).thenReturn(expectedValue);

        Assertions.assertThat(attributes.get(key)).isEqualTo(expectedValue);
    }

    @Test
    public void testGetIgnoreCase_
    returns empty for non-

    internal attributes() {
        String key = "myAttr";
        Attributes attributes = new Attributes();
        Object expectedValue = "";
        Mockito.when(attributes.getIgnoreCase(key)).thenReturn(expectedValue);

        Assertions.assertThat(attributes.getIgnoreCase(key)).isEqualTo(expectedValue);
    }

    @Test
    public void testGetUserData_
    returns null for

    internal attribute() {
        String key = "myAttr";
        Mockito.when(Attributes.internalKey(key)).thenReturn(null);
        Object expectedValue = null;
        Assertions.assertThat(Attributes.getUserData(Mockito.mock(String.class))).isEqualTo(expectedValue);
    }

    @Test
    public void testAdd_
    adds to

    map internally() {
        String key = "myAttr";
        Mockito.when(Attributes.internalKey(key)).thenReturn("hello");
        Attributes attributes = new Attributes();
        Map<String, Object> expectedMap = new ArrayList<>();
        expectedMap.add("hello");

        List<Object> list = Mockito.mock(List.class);
        Mockito.when(attributes.asList(Mockito.mock(Iterable.class))).thenReturn(list);

        Assertions.assertThat(attributes.add(Mockito.mock(String.class), "hello")).isEqualTo(expectedMap);
    }

    @Test
    public void testPut_
    adds to

    map internally() {
        String key = "myAttr";
        Object value = "hello";

        Mockito.when(Attributes.internalKey(key)).thenReturn("value");
        Attributes attributes = new Attributes();
        Map<String, Object> expectedMap = new ArrayList<>();
        expectedMap.put("value", "hello");

        List<Object> list = Mockito.mock(List.class);
        Mockito.when(attributes.asList(Mockito.mock(Iterable.class))).thenReturn(list);

        Assertions.assertThat(attributes.put(Mockito.mock(String.class), value)).isEqualTo(expectedMap);
    }

    @Test
    public void testPutUserData_
    adds to

    map internally() {
        String key = "myAttr";
        Object value = "hello";

        Mockito.when(Attributes.internalKey(key)).thenReturn("value");
        Attributes attributes = new Attributes();
        Map<String, Object> expectedMap = new ArrayList<>();
        expectedMap.put("value", "hello");

        List<Object> list = Mockito.mock(List.class);
        Mockito.when(attributes.asList(Mockito.mock(Iterable.class))).thenReturn(list);

        Assertions.assertThat(attributes.putUserData(value)).isEqualTo(expectedMap);
    }

    @Test
    public void testPutIgnoreCase_
    adds to

    map internally() {
        String key = "myAttr";
        Object value = "hello";

        Mockito.when(Attributes.internalKey(key)).thenReturn("value");
        Attributes attributes = new Attributes();
        Map<String, Object> expectedMap = new ArrayList<>();
        expectedMap.put("value", "hello");

        List<Object> list = Mockito.mock(List.class);
        Mockito.when(attributes.asList(Mockito.mock(Iterable.class))).thenReturn(list);

        Assertions.assertThat(attributes.putIgnoreCase(value)).isEqualTo(expectedMap);
    }

    @Test
    public void testPut_
    adds to

    map internally() {
        String key = "myAttr";
        Object value = "hello";

        Mockito.when(Attributes.internalKey(key)).thenReturn("value");
        Attributes attributes = new Attributes();
        Map<String, Object> expectedMap = new ArrayList<>();
        expectedMap.put(value.toString(), "hello");

        List<Object> list = Mockito.mock(List.class);
        Mockito.when(attributes.asList(Mockito.mock(Iterable.class))).thenReturn(list);

        Assertions.assertThat(attributes.put(value)).isEqualTo(expectedMap);
    }

    @Test
    public void testRemove_
    removes from

    map internally() {
        String key = "myAttr";
        Mockito.when(Attributes.internalKey(key)).thenReturn("value");
        Attributes attributes = new Attributes();
        Map<String, Object> expectedMap = new ArrayList<>();
        expectedMap.remove("hello");

        List<Object> list = Mockito.mock(List.class);
        Mockito.when(attributes.asList(Mockito.mock(Iterable.class))).thenReturn(list);

        Assertions.assertThat(attributes.remove(Mockito.mock(String.class))).isEqualTo(expectedMap);
    }

    @Test
    public void testRemoveIgnoreCase_
    removes from

    map internally() {
        String key = "myAttr";
        Object value = "hello";

        Mockito.when(Attributes.internalKey(key)).thenReturn("value");
        Attributes attributes = new Attributes();
        Map<String, Object> expectedMap = new ArrayList<>();
        expectedMap.remove(value.toString());

        List<Object> list = Mockito.mock(List.class);
        Mockito.when(attributes.asList(Mockito.mock(Iterable.class))).thenReturn(list);

        Assertions.assertThat(attributes.removeIgnoreCase(value)).isEqualTo(expectedMap);
    }

    @Test
    public void testRemove_
    removes from

    map internally() {
        String key = "myAttr";
        Object value = "hello";

        Mockito.when(Attributes.internalKey(key)).thenReturn("value");
        Attributes attributes = new Attributes();
        Map<String, Object> expectedMap = new ArrayList<>();
        expectedMap.remove(value.toString());

        List<Object> list = Mockito.mock(List.class);
        Mockito.when(attributes.asList(Mockito.mock(Iterable.class))).thenReturn(list);

        Assertions.assertThat(attributes.remove(value)).isEqualTo(expectedMap);
    }

    @Test
    public void testHasKey_
    returns true for

    internal attribute() {
        String key = "myAttr";
        Mockito.when(Attributes.internalKey(key)).thenReturn("value");
        Attributes attributes = new Attributes();
        Assertions.assertThat(attributes.hasKey(Mockito.mock(String.class))).isEqualTo(true);

        // Clear mock object
        Mockito.reset(Attributes.internalKey, Mockito.times(1));
    }

    @Test
    public void testHasKeyIgnoreCase_
    returns true for

    internal attribute() {
        String key = "myAttr";
        Object value = "value";
        Mockito.when(Attributes.internalKey(key)).thenReturn(value.toString());
        Attributes attributes = new Attributes();
        Assertions.assertThat(attributes.hasKey(value.toString())).isEqualTo(true);

        // Clear mock object
        Mockito.reset(Attributes.internalKey, Mockito.times(1));
    }

    @Test
    public void testHasKey_
    returns true for

    external attribute() {
        String key = "myAttr";
        Mockito.when(Attributes.internalKey(key)).thenReturn("value");
        Attributes attributes = new Attributes();
        Assertions.assertThat(attributes.hasKey(Mockito.mock(String.class))).isEqualTo(true);

        // Clear mock object
        Mockito.reset(Attributes.internalKey, Mockito.times(1));
    }

    @Test
    public void testHasKeyIgnoreCase_
    returns true for

    external attribute() {
        String key = "myAttr";
        Object value = "value";
        Mockito.when(Attributes.internalKey(key)).thenReturn(value.toString());
        Attributes attributes = new Attributes();
        Assertions.assertThat(attributes.hasKey(value.toString())).isEqualTo(true);

        // Clear mock object
        Mockito.reset(Attributes.internalKey, Mockito.times(1));
    }

    @Test
    public void testHas_
    returns false for

    external attribute() {
        String key = "myAttr";
        Mockito.when(Attributes.internalKey(key)).thenReturn("value");
        Attributes attributes = new Attributes();
        Assertions.assertThat(attributes.has(Mockito.mock(String.class))).isEqualTo(false);

        // Clear mock object
        Mockito.reset(Attributes.internalKey, Mockito.times(1));
    }

    @Test
    public void testHas_
    returns false for

    external attribute() {
        String key = "myAttr";
        Object value = "value";
        Mockito.when(Attributes.internalKey(key)).thenReturn(value.toString());
        Attributes attributes = new Attributes();
        Assertions.assertThat(attributes.has(value.toString())).isEqualTo(false);

        // Clear mock object
        Mockito.reset(Attributes.internalKey, Mockito.times(1));
    }

    @Test
    public void testHas_
    returns false for

    external attribute() {
        String key = "myAttr";
        Mockito.when(Attributes.internalKey(key)).thenReturn("value");
        Attributes attributes = new Attributes();
        Assertions.assertThat(attributes.has(Mockito.mock(String.class))).isEqualTo(false);

        // Clear mock object
        Mockito.reset(Attributes.internalKey, Mockito.times(1));
    }

    @Test
    public void testGet_
    returns null for

    external attribute() {
        String key = "myAttr";
        Mockito.when(Attributes.internalKey(key)).thenReturn("value");
        Attributes attributes = new Attributes();
        Object value = null;
        Assertions.assertThat(attributes.get(Mockito.mock(String.class))).isEqualTo(value);

        // Clear mock object
        Mockito.reset(Attributes.internalKey, Mockito.times(1));
    }

    @Test
    public void testGet_
    returns null for

    external attribute() {
        String key = "myAttr";
        Object value = "value";
        Mockito.when(Attributes.internalKey(key)).thenReturn(value.toString());
        Attributes attributes = new Attributes();
        Object expectedValue = null;
        Assertions.assertThat(attributes.get(Mockito.mock(String.class))).isEqualTo(expectedValue);

        // Clear mock object
        Mockito.reset(Attributes.internalKey, Mockito.times(1));
    }

    @Test
    public void testGet_
    returns value for

    external attribute() {
        String key = "myAttr";
        Mockito.when(Attributes.internalKey(key)).thenReturn("value");
        Attributes attributes = new Attributes();
        Object expectedValue = null;
        Assertions.assertThat(attributes.get(Mockito.mock(String.class))).isEqualTo(expectedValue);

        // Clear mock object
        Mockito.reset(Attributes.internalKey, Mockito.times(1));
    }

    @Test
    public void testGet_
    returns value for

    external attribute() {
        String key = "myAttr";
        Object value = "value";
        Mockito.when(Attributes.internalKey(key)).thenReturn(value.toString());
        Attributes attributes = new Attributes();
        Object expectedValue = null;
        Assertions.assertThat(attributes.get(Mockito.mock(String.class))).isEqualTo(expectedValue);

        // Clear mock object
        Mockito.reset(Attributes.internalKey, Mockito.times(1));
    }

    @Test
    public void testGet_
    returns value for

    external attribute() {
        String key = "myAttr";
        Object value = null;
        Mockito.when(Attributes.internalKey(key)).thenReturn(value.toString());
        Attributes attributes = new Attributes();
        Assertions.assertThat(attributes.get(Mockito.mock(String.class))).isEqualTo(value);

        // Clear mock object
        Mockito.reset(Attributes.internalKey, Mockito.times(1));
    }

}