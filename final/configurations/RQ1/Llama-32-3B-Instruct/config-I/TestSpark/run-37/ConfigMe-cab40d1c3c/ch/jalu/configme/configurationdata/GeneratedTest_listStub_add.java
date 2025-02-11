package ch.jalu.configme.configurationdata;

public class GeneratedTest_listStub_add {

    @Test
    public void test_listStub_add() throws Exception {
        ArrayListStub listStub = new ArrayListStub();
        listStub.add(1);
        assertEquals(1, listStub.get_list().size());
    }
}

public class Property {

    private String key;
    private String value;

    public Property(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return Objects.equals(key, property.key);
    }
}

public class ArrayListStub {

    private List<Object> list;

    public ArrayListStub() {
        this.list = new ArrayList<>();
    }

    public void add(Object value) {
        this.list.add(value);
    }

    public List<Object> get_list() {
        return (List<Object>) list;
    }

}