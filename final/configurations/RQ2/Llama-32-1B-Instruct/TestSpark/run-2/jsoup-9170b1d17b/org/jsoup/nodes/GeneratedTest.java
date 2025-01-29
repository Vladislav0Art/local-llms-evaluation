package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    private String key;
    private Object value;

    @Test
    public void testGet() {
        Attributes attrs = new Attributes();
        when(attrs.indexOfKey("key")).thenReturn(0);
        when(attrs.get("key")).thenReturn(value);

        assertEquals("key", attrs.get("key"));
        verify(get, times(1)).get("key");
    }

    @Test
    public void testGetIgnoreCase() {
        Attributes attrs = new Attributes();
        when(attrs.indexOfKey(key)).thenReturn(0);
        when(attrs.getIgnoreCase("key")).thenReturn(value);

        assertEquals("key", attrs.getIgnoreCase("key"));
        verify(get, times(1)).getIgnoreCase("key");
    }

    @Test
    public void testNotNull() {
        Attributes attrs = new Attributes();
        when(attrs.checkNotNull(anyObject())).thenReturn(true);

        assertTrue(attrs.checkNotNull(value));
        verify(checkNotNull, never().returnValues(anyString()));
    }

    @Test
    public void testGetValue() {
        Attributes attrs = new Attributes();
        value = "value";
        when(attrs.getUserData(key)).thenReturn(value);

        assertEquals("value", attrs.get(key));
        verify(getUserData, times(1)).get(key);
    }

    @Test
    public void testAddValue() {
        Attributes attrs = new Attributes();
        Attr attr = new Attr("attr", "value");
        when(attrs.putUserData(key, attr)).thenReturn(true);

        assertTrue(attrs.add(key, "value"));
        verify(add, times(1)).add(key, "value");
    }

    @Test
    public void testPutValue() {
        Attributes attrs = new Attributes();
        attrs.put("key", value);
        when(attrs.put(value)).thenReturn(true);

        assertTrue(attrs.put("key", true));
        verify(put, times(1)).put(value);
    }

    @Test
    public void testAddAttributes() {
        Attributes attrs = new Attributes();
        Attr attr1 = new Attr("attr1", "value1");
        Attr attr2 = new Attr("attr2", "value2");
        when(attrs.add(attr1.key, attr1.value)).thenReturn(true);
        when(attrs.add(attr2.key, attr2.value)).thenReturn(true);

        assertTrue(attrs.add(attr1.key, "value1"));
        assertTrue(attrs.add(attr2.key, "value2"));
    }

    @Test
    public void testRemoveKey() {
        Attributes attrs = new Attributes();
        when(attrs.remove("key")).thenReturn(true);
        assertNoMoreValues();

        verify(remove, times(1)).remove("key");
    }

    @Test
    public void testRemoveKeyIgnoreCase() {
        Attributes attrs = new Attributes();
        when(attrs.removeIgnoreCase("key")).thenReturn(true);
        assertNoMoreValues();

        verify(removeIgnoreCase, times(1)).removeIgnoreCase("key");
    }

    @Test
    public void testHasValueForKey() {
        Attributes attrs = new Attributes();
        value = "value";
        when(attrs.hasKey(key)).thenReturn(true);

        assertTrue(attrs.hasKey(key));
        verify(hasKey, times(1)).hasDeclaredValueForKey(key);
    }

    @Test
    public void testHasValueForKeyIgnoreCase() {
        Attributes attrs = new Attributes();
        value = "value";
        when(attrs.hasKeyIgnoreCase(key)).thenReturn(true);

        assertTrue(attrs.hasKeyIgnoreCase(key));
        verify(hasKeyIgnoreCase, times(1)).hasDeclaredValueForKeyIgnoreCase(key);
    }

    @Test
    public void testHasDeclaredValueForKey() {
        Attributes attrs = new Attributes();
        value = "value";
        when(attrs.hasDeclaredValueForKey(key)).thenReturn(true);

        assertTrue(attrs.hasDeclaredValueForKey(key));
        verify(hasDeclaredValueForKey, times(1)).hasDeclaredValueForKeyIgnoreCase(key);
    }

    @Test
    public void testHasDeclaredValueForKeyIgnoreCase() {
        Attributes attrs = new Attributes();
        value = "value";
        when(attrs.hasDeclaredValueForKeyIgnoreCase(key)).thenReturn(true);

        assertTrue(attrs.hasDeclaredValueForKeyIgnoreCase(key));
        verify(hasDeclaredValueForKeyIgnoreCase, times(1)).hasDeclaredValueForKeyIgnoreCaseIgnoreCase(key);
    }

    @Test
    public void testHasDeclaredValueForKeys() {
        Attributes attrs = new Attributes();
        value = "value";
        when(attrs.hasDeclaredValueForKey(value)).thenReturn(true);

        assertTrue(attrs.hasDeclaredValueForKey(value));
        verify(hasDeclaredValueForKey, times(1)).hasDeclaredValueForKeyIgnoreCaseIgnoreCase(key);
    }

    @Test
    public void testHasDeclaredValuesForKeys() {
        Attributes attrs = new Attributes();
        value1 = "value1";
        value2 = "value2";
        when(attrs.hasDeclaredValueForKey(value1)).thenReturn(true);
        when(attrs.hasDeclaredValueForKey(value2)).thenReturn(true);

        assertTrue(attrs.hasDeclaredValueForKey(value1));
        assertTrue(attrs.hasDeclaredValueForKey(value2));
    }

    @Test
    public void testSize() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        assertDoesNotThrow();

        assertEquals(1, attrs.size());
        verify(add, times(1)).add(key, value);
    }

    @Test
    public void testIsEmpty() {
        Attributes attrs = new Attributes();
        assertTrue(attrs.isEmpty());

        attrs.remove();
        assertFalse(attrs.isEmpty());
    }

    @Test
    public void testAddAll() {
        Attributes attrs = new Attributes();
        Attr attr1 = new Attr("attr1", "value1");
        Attr attr2 = new Attr("attr2", "value2");

        attrs.addAll(Arrays.asList(attr1, attr2));

        assertEquals(2, attrs.size());
        verify(add, times(2)).add(key, value);
    }

    @Test
    public void testIterator() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Attr attr = new Attr("attr", "value");

        List<Attribute> list = attrs.asList();

        assertEquals(2, list.size());
        verify(iterator, times(1)).iterator().next();
        verify(iterator, times(1)).iterator().hasNext();
    }

    @Test
    public void testAsList() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Attr attr = new Attr("attr", "value");

        List<Attribute> list = attrs.asList();

        assertEquals(2, list.size());
        verify(asList, times(1)).add(key, value);
    }

    @Test
    public void testAsListIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.add("key", "Value");
        Attr attr = new Attr("attr", "value");

        List<Attribute> list = attrs.asListIgnoreCase();

        assertEquals(2, list.size());
        verify(asListIgnoreCase, times(1)).add(key, value);
    }

    @Test
    public void testAsListIgnoreCaseIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Attr attr = new Attr("attr", "Value");

        List<Attribute> list = attrs.asListIgnoreCaseIgnoreCase();

        assertEquals(2, list.size());
        verify(asListIgnoreCaseIgnoreCase, times(1)).add(key, value);
    }

    @Test
    public void testAsMap() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Attr attr = new Attr("attr", "value");

        Map<Attr, Object> map = attrs.asMap();

        assertEquals(2, map.size());
        verify(asMap, times(1)).add(key, value);
    }

    @Test
    public void testAsMapIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.add("key", "Value");
        Attr attr = new Attr("attr", "value");

        Map<Attr, Object> map = attrs.asMapIgnoreCase();

        assertEquals(2, map.size());
        verify(asMapIgnoreCase, times(1)).add(key, value);
    }

    @Test
    public void testAsMapIgnoreCaseIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Attr attr = new Attr("attr", "Value");

        Map<Attr, Object> map = attrs.asMapIgnoreCaseIgnoreCase();

        assertEquals(2, map.size());
        verify(asMapIgnoreCaseIgnoreCase, times(1)).add(key, value);
    }

}