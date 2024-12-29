package app;

public class GeneratedTestWriteAllFields {

    private Validator validator;

    @Before
    public void initValidator() {
        validator = new Validator();
    }

    @Test
    public void testWriteAllFields() throws DBAppException {
        CSVWriter writer = new CSVWriter();
        String[] fields = {"id", "name"};
        writer.writeAll(fields);

        try {
            // close writer
        } catch (DBAppException e) {
            throw new RuntimeException(e);
        }
    }

}