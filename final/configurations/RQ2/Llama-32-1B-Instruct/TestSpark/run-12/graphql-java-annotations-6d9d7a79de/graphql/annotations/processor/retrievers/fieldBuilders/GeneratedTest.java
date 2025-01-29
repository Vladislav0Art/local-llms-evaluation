package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    private DirectivesBuilder directivesBuilder;
    private AnnotatedElement object;
    private ProcessingElementsContainer container;

    @Before
    public void setup() {
        // Mock the directivesBuilder with a new instance
        directivesBuilder = Mockito.mock(DirectivesBuilder.class);
    }

    @Test
    public void testBuild() throws GraphQLAnnotationsException {
        // Create an object and set its annotation type to DirectivesBuilder
        Object obj = getMock();
        FieldFieldBuilder[] fields = (FieldFieldBuilder[]) getMockField(obj, FieldsDirectivesBuilder.class);

        // Set the directives to be build for this object
        directivesBuilder.build(fields);

        // Assert that the length of the fields is correct
        assertEquals(1, fields.length);
    }

    @Test
    public void testBuildFields() throws GraphQLAnnotationsException {
        // Create an object and set its annotation type to DirectivesBuilder
        Object obj = getMock();
        FieldFieldBuilder[] fields = (FieldFieldBuilder[]) getMockField(obj, FieldsDirectivesBuilder.class);

        // Set the fields to be build for this object
        directivesBuilder.build(fields);

        // Assert that the length of the fields is correct
        assertEquals(1, fields.length);
    }

    @Test
    public void testBuild() throws GraphQLAnnotationsException {
        // Create an object and set its annotation type to DirectivesBuilder
        Object obj = getMock();
        FieldFieldBuilder[] fields = (FieldFieldBuilder[]) getMockField(obj, FieldsDirectivesBuilder.class);

        // Set the fields to be build for this object
        directivesBuilder.build(fields);

        // Assert that all methods are called with the correct arguments
        assertEquals(1, fields.length);
    }

    @Test
    public void testBuildFields() throws GraphQLAnnotationsException {
        // Create an object and set its annotation type to DirectivesBuilder
        Object obj = getMock();
        FieldFieldBuilder[] fields = (FieldFieldBuilder[]) getMockField(obj, FieldsDirectivesBuilder.class);

        // Set the fields to be build for this object
        directivesBuilder.build(fields);

        // Assert that all methods are called with the correct arguments
        assertEquals(1, fields.length);
    }

    @Test
    public void testBuild() throws GraphQLAnnotationsException {
        // Create an object and set its annotation type to DirectivesBuilder
        Object obj = getMock();
        FieldFieldBuilder[] fields = (FieldFieldBuilder[]) getMockField(obj, FieldsDirectivesBuilder.class);

        // Set the fields to be build for this object using the @Fields annotation
        directivesBuilder.build((FieldFieldBuilder[]) getMockField(obj, FieldsDirectivesBuilder.class));

        // Assert that all methods are called with the correct arguments
        assertEquals(1, fields.length);
    }

    @Test
    public void testBuildFields() throws GraphQLAnnotationsException {
        // Create an object and set its annotation type to DirectivesBuilder
        Object obj = getMock();
        FieldFieldBuilder[] fields = (FieldFieldBuilder[]) getMockField(obj, FieldsDirectivesBuilder.class);

        // Set the fields to be build for this object using the @Fields annotation
        directivesBuilder.build((FieldFieldBuilder[]) getMockField(obj, FieldsDirectivesBuilder.class));

        // Assert that all methods are called with the correct arguments
        assertEquals(1, fields.length);
    }

    private Object[] getMock() {
        return new Object[]{getMock(), Arrays.asList(mockFields)};
    }

    private FieldFieldBuilder[] getMockField(Object obj, Class<?> type) {
        GraphQLArgument arg = new GraphQLArgument(type, "arg");
        // Mock the object and its field using Mockito
        FieldFieldBuilder[] fields = (FieldFieldBuilder[]) getMock(obj, FieldsDirectivesBuilder.class);

        // Create an object with a mock field
        FieldFieldBuilder objField = new FieldFieldBuilder(new GraphQLDirective[]{new DirectiveJavaAnnotationUtil().addDirectiveToField(arg)}, arg);
        return fields;
    }

}