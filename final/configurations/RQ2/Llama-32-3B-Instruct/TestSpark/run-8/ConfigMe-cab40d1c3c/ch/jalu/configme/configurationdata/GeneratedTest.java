package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private String name;
    private String value;

    public Property(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return name.equals(property.name);
    }
}

public class PropertyList implements List<Property> {

    private ArrayList<Property> list;

    public PropertyList() {
        this.list = new ArrayList<>();
    }

    @Override
    public boolean add(Property element) {
        if (element == null) {
            throw new NullPointerException("You can not add Null into the list");
        }
        return list.add(element);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public Object get(int index) {
        return list.get(index);
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public Iterator<Property> iterator() {
        return list.iterator();
    }

    @Override
    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object object : c) {
            if (!list.contains(object)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void add(int index, Property element) {
        list.add(index, element);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropertyList propertyList = (PropertyList) o;
        return list.equals(propertyList.list);
    }

    @Override
    public int hashCode() {
        return list.hashCode();
    }
}

public class PropertyListBuilder {

    private List<Property> propertyList;

    public PropertyListBuilder(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    public void addProperty(String name, String value) {
        propertyList.add(new Property(name, value));
    }

    public List<Property> getProperties() {
        return new ArrayList<>(propertyList);
    }
}

public class TestSpark {

}