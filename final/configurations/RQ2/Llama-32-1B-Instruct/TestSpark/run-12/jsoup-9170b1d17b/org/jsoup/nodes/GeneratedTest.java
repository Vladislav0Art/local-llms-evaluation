package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testGet() {
        Attributes attrs = new Attributes();
        assert attrs.getKey("key1") == null;
        attrs.add("key2", "value2");
        assert attrs.get("key2") == "value2";
    }

    @Test
    public void testGetIgnoreCase() {
        Attributes attrs = new Attributes();
        assert attrs.getKeyIgnoreCase("KEY1") == null;
        attrs.add("KEY2", "value2");
        assert attrs.getIgnoreCase("KEY2") == "value2";
    }

    @Test
    public void testGetUserData() {
        Attributes attrs = new Attributes();
        assert attrs.getUserData("key1") == null;
        attrs.put("key1", "value1");
        assert attrs.getUserData("key1") == "value1";
    }

    @Test
    public void testPut() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        assert attrs.get("key1") == "value1";
    }

    @Test
    public void testPutUserData() {
        Attributes attrs = new Attributes();
        attrs.put("key2", "value2");
        assert attrs.getUserData("key2") == null;
        attrs.putUserData("key2", "new value2");
        assert attrs.getUserData("key2") == "new value2";
    }

    @Test
    public void testPutIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.putIgnoreCase("KEY1", "value1");
        assert attrs.getIgnoreCase("KEY1") == "value1";
    }

    @Test
    public void testPutUserDataIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.putUserDataIgnoreCase("key2", "new value2");
        assert attrs.getUserData("key2") == null;
        attrs.putUserDataIgnoreCase("key2", "new value2");
        assert attrs.getUserData("key2") == "new value2";
    }

    @Test
    public void testPutValue() {
        Attributes attrs = new Attributes();
        attrs.putValue(true);
        assert attrs.get("value1") == null;
        assert attrs.get("value2") == true;
    }

    @Test
    public void testRemove() {
        Attributes attrs = new Attributes();
        attrs.remove("key1");
        assert attrs.size() == 0;
    }

    @Test
    public void testRemoveIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.removeIgnoreCase("KEY1");
        assert attrs.size() == 0;
    }

    @Test
    public void testHasKey() {
        Attributes attrs = new Attributes();
        assert attrs.hasKey("key1") == false;
        attrs.add("key2", "value2");
        assert attrs.hasKey("key2") == true;
    }

    @Test
    public void testHasKeyIgnoreCase() {
        Attributes attrs = new Attributes();
        assert attrs.hasKeyIgnoreCase("KEY1") == false;
        attrs.add("key2", "value2");
        assert attrs.hasKeyIgnoreCase("KEY2") == true;
    }

    @Test
    public void testHasDeclaredValueForKey() {
        Attributes attrs = new Attributes();
        assert attrs.hasDeclaredValueForKey("key1") == false;
        attrs.add("key2", "value2");
        assert attrs.hasDeclaredValueForKey("key2") == true;
    }

    @Test
    public void testHasKeyForKey() {
        Attributes attrs = new Attributes();
        assert attrs.hasKey("key1") == false;
        attrs.put("key1", "value1");
        assert attrs.hasKey("key1") == true;
    }

    @Test
    public void testHasKeyIgnoreCaseForKey() {
        Attributes attrs = new Attributes();
        assert attrs.hasKeyIgnoreCase("KEY1") == false;
        attrs.add("key2", "value2");
        assert attrs.hasKeyIgnoreCase("KEY2") == true;
    }

    @Test
    public void testSize() {
        Attributes attrs = new Attributes();
        assert attrs.size() == 0;
    }

    @Test
    public void testIsEmpty() {
        Attributes attrs = new Attributes();
        assert attrs.isEmpty() == false;
    }

    @Test
    public void testAddAll() {
        Attributes attrs = new Attributes();
        List<Attribute> incoming = Arrays.asList(new Attr("key1", "value1"), new Attr("key2", "value2"));
        attrs.addAll(incoming);
        assert attrs.size() == 2;
    }

    @Test
    public void testIterator() {
        Attributes attrs = new Attributes();
        Iterator<Attribute> iterator = attrs.iterator();
        while (iterator.hasNext()) {
            Assert.assertTrue(iterator.next().get("key1") == null);
        }
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void testAsList() {
        Attributes attrs = new Attributes();
        List<Attribute> list = attrs.asList();
        assert list.size() == 0;
        list.add(new Attr("key2", "value2"));
        assert list.size() == 1;
    }

}