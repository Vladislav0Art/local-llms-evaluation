package ch.jalu.configme.configurationdata;

public class GeneratedTestIsValidProperty_WhenValid_ReturnsTrue {

    public boolean isValidProperty(String propertyName, String value) {
        if (propertyName == null || value == null) {
            return false;
        }

        // Assume we are using a simple regex for validation
        String pattern = "^[a-zA-Z]+$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(propertyName);
        if (!m.matches()) {
            return false;
        }

        return true;
    }
}

public class PropertyValidatorTest {

    @Test
    public void testIsValidProperty_WhenValid_ReturnsTrue() {
        PropertyValidator validator = new PropertyValidator();
        String propertyName = "propertyName";
        String value = "value";
        boolean result = validator.isValidProperty(propertyName, value);
        assertTrue(result);
    }

}