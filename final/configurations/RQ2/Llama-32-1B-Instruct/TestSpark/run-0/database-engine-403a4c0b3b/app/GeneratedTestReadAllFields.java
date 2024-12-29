package app;

public class GeneratedTestReadAllFields {

    private Validator validator;

    @Before
    public void initValidator() {
        validator = new Validator();
    }

    @Test
    public void testReadAllFields() throws DBAppException {
        CSVReader reader = new CSVReader();

        // read all fields from CSV
        String[] fields = {"id", "name"};
        reader.read(fields);

        Iterator<String> iterator = reader.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            if (!value.isEmpty()) {
                System.out.println(value);
            }
        }

        try {
            // close reader
        } catch (DBAppException e) {
            throw new RuntimeException(e);
        }
    }

}