package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJson {

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