package app;

public class GeneratedTestWriteAllIterable {

    private Validator validator;

    @Before
    public void initValidator() {
        validator = new Validator();
    }

    @Test
    public void testWriteAllIterable() throws DBAppException {
        CSVWriter writer = new CSVWriter();
        String[] fields = {"id", "name"};
        Iterator<String> iterator = getReader().iterator();

        // write all values from reader to CSV
        while (iterator.hasNext()) {
            String[] values = iterator.next();
            try {
                writer.writeAll(values);
            } catch (DBAppException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            // close writer
        } catch (DBAppException e) {
            throw new RuntimeException(e);
        }
    }

    private CSVReader getReader() throws DBAppException {
        return null;
    }

}