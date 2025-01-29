package ch.jalu.configme.configurationdata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCreate_MultipleEntries {

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