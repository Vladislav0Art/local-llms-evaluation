package ch.jalu.configme.configurationdata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCreate_MultipleEntries_SingleEntry {

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
    public void testCreate_MultipleEntries_SingleEntry() {
        // Arrange
        Property<String> multipleEntry1 = new SingleEntry("multiple", "simple");
        Property<String> multipleEntry2 = new MultipleEntry("multiple2", "simple");

        // Act
        List<Property<?>> propertyLists = this.propertyListBuilder.create();

        // Assert
        this.mockPropertyList.set(getRootEntries().get(0), defaultEntry);
    }

}