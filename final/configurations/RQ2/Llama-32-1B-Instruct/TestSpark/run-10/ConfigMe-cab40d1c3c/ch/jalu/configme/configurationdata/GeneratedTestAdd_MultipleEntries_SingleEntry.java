package ch.jalu.configme.configurationdata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestAdd_MultipleEntries_SingleEntry {

    private MockPropertyList mockPropertyList;

    @Before
    public void setup() {
        this.mockPropertyList = mock(Property < List < Property < ? >>> ());
    }

    @After
    public void tearDown() {
        this.mockPropertyList = null;
    }

    @Test
    public void testAdd_MultipleEntries_SingleEntry() throws ConfigMeException {
        // Arrange
        Property<String> multipleEntry1 = new MultipleEntry("multiple", "simple");
        Property<String> multipleEntry2 = new SingleEntry("single", "simple");

        // Act
        this.propertyListBuilder.add(multipleEntry1);
        this.propertyListBuilder.add(multipleEntry2);

        // Assert
        List<Property<?>> propertyLists = getRootEntries();
        assert !propertyLists.isEmpty();
    }

}