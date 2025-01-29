package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuild {

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

        // Set the fields to be build for this object using the @Fields annotation
        directivesBuilder.build((FieldFieldBuilder[]) getMockField(obj, FieldsDirectivesBuilder.class));

        // Assert that all methods are called with the correct arguments
        assertEquals(1, fields.length);
    }

}