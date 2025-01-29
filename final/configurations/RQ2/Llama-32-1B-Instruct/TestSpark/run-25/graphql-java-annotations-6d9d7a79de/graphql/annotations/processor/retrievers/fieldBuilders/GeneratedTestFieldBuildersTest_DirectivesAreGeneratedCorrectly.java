package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GeneratedTestFieldBuildersTest_DirectivesAreGeneratedCorrectly {

    public DirectivesBuilderImpl(AnnotatedElement object, ProcessingElementsContainer container) {
        // implementation
    }

    @Override
    public GraphQLDirective[] build() {
        return new GraphQLDirective[0];
    }
}

public interface Builder<T> {
    void setProcessingElementsContainer(ProcessingElementsContainer container);

    T build();
}

class TestBuilder implements Builder<GraphQLDirective[]> {
    private AnnotatedElement object;
    private ProcessingElementsContainer container;

    public TestBuilder(AnnotatedElement object) {
        this.object = object;
    }

    @Override
    public GraphQLDirective[] build() {
        // implementation
    }
}

public class FieldBuildersTest {

    private static class FieldToDirective implements Builder<GraphQLDirective[]> {
        private AnnotatedElement field;

        public FieldToDirective(AnnotatedElement field) {
            this.field = field;
        }

        @Override
        public GraphQLDirective[] build() {
            return new GraphQLDirective[]{directivesBuilder.build()};
        }
    }

    private static class DirectiveBuilderImpl implements Builder<GraphQLDirective[]> {
        private AnnotatedElement object;

        public DirectiveBuilderImpl(AnnotatedElement object) {
            this.object = object;
        }

        @Override
        public GraphQLDirective[] build() {
            return new GraphQLDirective[]{newDirective(new FieldToDirective(object))};
        }
    }

    @Test
    public void testFieldBuildersTest_DirectivesAreGeneratedCorrectly() {
        AnnotatedElement field = FieldBuildersTest.class.getDeclaredField("field");
        field.setAccessible(true);
        field.set(null, FieldBuildersTest.class.getDeclaredConstructor().newInstance());

        DirectivesBuilderImpl builder = new DirectiveBuilderImpl(field.getAnnotation(AnnotatedElement.class));
        GraphQLDirective[] directives = builder.build();

        for (GraphQLDirective directive : directives) {
            System.out.println(directive.getKind() + ": " + directive.getName());
        }
    }

}