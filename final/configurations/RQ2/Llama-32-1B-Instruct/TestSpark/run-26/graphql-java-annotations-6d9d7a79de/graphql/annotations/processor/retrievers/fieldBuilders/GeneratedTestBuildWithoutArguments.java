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

public class GeneratedTestBuildWithoutArguments {

    @Test
    public void testBuildWithoutArguments() {
        DirectivesBuilder builder = new DirectivesBuilder(new AnnotatedElement("type3"), new ProcessingElementsContainer());
        ProcessingElementsContainer container = builder.getProcessingElementsContainer();
        // TODO: Verify the result is correct
    }
}

class MockDirectivesBuilder extends DirectivesBuilder {

    private List<GraphQLDirective> directives;

    public MockDirectivesBuilder() {
        this.directives = new ArrayList<>();
    }

    @Override
    public GraphQLDirective[] build() {
        return directives;
    }
}

public class TestDirectivesUtil {

    public static void mockGetArgument(DirectivesBuilder builder) {
        DirectivesBuilder directivesBuilder = new MockDirectivesBuilder();
        directivesBuilder.setProcessingElementsContainer(new ProcessingElementsContainer());
        builder.getProcessingElementsContainer().setArguments(Arrays.asList(directivesBuilder.directives));
        directivesBuilder.build();
    }

    public static void mockGetArgumentWithoutArguments(DirectivesBuilder builder) {
        DirectivesBuilder directivesBuilder = new MockDirectivesBuilder();
        builder.setProcessingElementsContainer(new ProcessingElementsContainer());
        directivesBuilder.getProcessingElementsContainer().setArguments(new ArrayList<>());
        directivesBuilder.build();
    }

}