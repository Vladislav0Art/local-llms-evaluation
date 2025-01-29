package ch.jalu.configme.configurationdata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestAdd_SingleEntry {

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
    public void testAdd_SingleEntry() throws ConfigMeException {
        // Arrange
        Property<String> singleEntry = new SingleEntry("single", "simple");

        // Act
        this.propertyListBuilder.add(singleEntry);

        // Assert
        List<Property<?>> propertyLists = getRootEntries();
        assert !propertyLists.isEmpty();
    }

}