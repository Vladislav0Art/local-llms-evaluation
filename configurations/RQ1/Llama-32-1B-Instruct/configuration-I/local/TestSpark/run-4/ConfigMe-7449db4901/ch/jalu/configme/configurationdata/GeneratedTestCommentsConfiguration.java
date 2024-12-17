package ch.jalu.configme.configurationdata;

public class GeneratedTestCommentsConfiguration {

    // Define test class

    @Test
    public void testCommentsConfiguration() throws Exception {
        CommentsConfiguration configuration = new CommentsConfiguration(new HashMap<>());

        // Test if constructor is created correctly
        Mockito.when(SettingsHolder.registerComments(anyString())).thenReturn(true);

        assertEquals("true", configuration.getComments().toString());

        // Remove the when and then lines for testing
    }

    public static void main(String[] args) {
        new Main().testCommentsConfiguration();
    }

}