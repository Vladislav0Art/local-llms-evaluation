package ch.jalu.configme.configurationdata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCreate_SingleEntry_MultipleEntries {

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
    public void testCreate_SingleEntry_MultipleEntries() {
        // Arrange
        Property<String> multipleEntry1 = new MultipleEntry("multiple", "simple");
        Property<String> singleEntry2 = new SingleEntry("single", "simple");

        // Act
        List<Property<?>> propertyLists = this.propertyListBuilder.create();

        // Assert
        this.mockPropertyList.set(getRootEntries().get(0), defaultEntry);
    }

    private List<Property<?>> getRootEntries() {
        return this.mockPropertyList.getRootEntries();
    }

}