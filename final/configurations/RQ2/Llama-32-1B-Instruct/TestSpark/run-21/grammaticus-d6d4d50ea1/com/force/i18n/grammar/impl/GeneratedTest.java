package com.force.i18n.grammar.impl;

public class GeneratedTest {

    @Test
    public void testGet() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        map.put("term1", "value1");
        Map<String, String> value = map.get("term1");
        assertEquals("value1", value);
    }

    @Test
    public void testContainsKey() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        map.put("term1", "value1");
        assertTrue(map.containsKey("term1"));
    }

    @Test
    public void testKeySet() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        map.put("term1", "value1");
        Set<String> keySet = map.keySet();
        assertEquals(1, keySet.size());
    }

    @Test
    public void testEquals() {
        GrammaticalTermMapImpl<String, String> map1 = new GrammaticalTermMapImpl<>();
        map1.put("term1", "value1");
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>();
        map2.put("term1", "value1");
        assertTrue(map1.equals(map2));
    }

    @Test
    public void testHashCode() {
        GrammaticalTermMapImpl<String, String> map1 = new GrammaticalTermMapImpl<>();
        map1.put("term1", "value1");
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>();
        map2.put("term1", "value1");
        int hashCode1 = map1.hashCode();
        int hashCode2 = map2.hashCode();
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void testIsSkinny() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.isSkinny());
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>();
        assertFalse(map2.isSkinny());
    }

    @Test
    public void testMakeSkinny() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        map.put("term1", "value1");
        map.makeSkinny();
        assertTrue(map.isEmpty());
    }

    @Test
    public void testWriteJson() throws IOException {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        map.put("term1", "value1");

        // Mock ObjectInputStream and ObjectOutputStream
        when(ObjectInputStream.class.isInstance(obj -> obj.readObject(null))).thenReturn(map);
        when(ObjectOutputStream.class.isInstance(obj -> obj.writeObject(null))).thenReturn(map);

        // Call writeJson method
        map.writeJson(System.out, new RenamingProvider(), null, null);

        // Verify output
        verify(System.out).println("", false); // No exception thrown
    }

}