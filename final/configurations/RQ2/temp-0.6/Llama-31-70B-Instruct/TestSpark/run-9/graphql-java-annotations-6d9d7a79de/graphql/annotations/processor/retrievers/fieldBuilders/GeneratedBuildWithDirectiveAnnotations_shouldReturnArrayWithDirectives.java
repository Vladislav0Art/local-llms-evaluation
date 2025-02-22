package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuildWithDirectiveAnnotations_shouldReturnArrayWithDirectives {

    @Test
    public void buildWithDirectiveAnnotations_shouldReturnArrayWithDirectives() {
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
                return new Annotation[]{
                        new Annotation() {
                            @Override
                            public Class<? extends Annotation> annotationType() {
                                return DirectiveJavaAnnotationUtil.class;
                            }
                        }
                };
            }

        }