package ch.jalu.configme.configurationdata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    private MockPropertyList mockPropertyList;

    @Before
    public void setup() {
        this.mockPropertyList = new MockPropertyList();
    }

    @After
    public void tearDown() {
        this.mockPropertyList = null;
    }

    @Test
    public void testAdd_SimpleEntry() throws ConfigMeException {
        // Arrange
        Property<String> simpleEntry = new DefaultEntry("simple");

        // Act
        this.propertyListBuilder.add(simpleEntry);

        // Assert
        List<Property<?>> propertyLists = this.propertyLists;
        assert !propertyLists.isEmpty();
    }

    @Test
    public void testAdd_SingleEntry() throws ConfigMeException {
        // Arrange
        Property<String> singleEntry = new SingleEntry("single", "simple");

        // Act
        this.propertyListBuilder.add(singleEntry);

        // Assert
        List<Property<?>> propertyLists = getRootEntries();
        assert !propertyLists.isEmpty();
    }

    @Test
    public void testAdd_MultipleEntries() throws ConfigMeException {
        // Arrange
        Property<String> multipleEntry1 = new MultipleEntry("multiple", "simple");
        Property<String> multipleEntry2 = new MultipleEntry("multiple2", "simple");

        // Act
        this.propertyListBuilder.add(multipleEntry1);
        this.propertyListBuilder.add(multipleEntry2);

        // Assert
        List<Property<?>> propertyLists = getRootEntries();
        assert !propertyLists.isEmpty();
    }

    @Test
    public void testCreate_MultipleEntries() {
        // Arrange
        Property<String> multipleEntry1 = new MultipleEntry("multiple", "simple");
        Property<String> singleEntry2 = new SingleEntry("single", "simple");

        // Act
        List<Property<?>> propertyLists = this.propertyListBuilder.create();

        // Assert
        assert propertyLists.contains(multipleEntry1);
        assert propertyLists.contains(singleEntry2);
    }

    private List<Property<?>> getRootEntries() {
        return this.mockPropertyList.getRootEntries();
    }
}

class MockPropertyList {
    public List<Property> getRootEntries() {
        return Collections.emptyList();
    }

}