package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuildWithoutDirectiveAnnotations_shouldReturnEmptyArray {

    @Test
    public void buildWithoutDirectiveAnnotations_shouldReturnEmptyArray() {
        // Arrange
        AnnotatedElement object = new AnnotatedElement() {
            @Override
            public <T extends Annotation> T getAnnotation(Class<T> annotationClass) {
                return null;
            }

            @Override
            public Annotation[] getAnnotations() {
                return new Annotation[0];
            }

            @Override
            public Annotation[] getDeclaredAnnotations() {
                return new Annotation[0];
            }
        };
        ProcessingElementsContainer container = new ProcessingElementsContainer(null);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Act
        GraphQLDirective[] result = builder.build();

        // Assert
        assertThat(result, is(emptyArray()));
    }

}