package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.mockito.Mockito.verify;

public class GeneratedTestGetRootEntries {

    @Test
    public void testGetRootEntries() throws ConfigMeException {
        // Arrange
        String rootKey = "root1";
        List<Property<?>> properties = new ArrayList<>();
        MockitoAnnotations.initMocks(this);

        // Act
        Map<String, Object> map = propertyListBuilder.getRootEntries();

        // Assert
        assertEquals(rootKey, (String) map.getOrDefault(rootKey, Collections.emptyList()).iterator().next());
    }

}