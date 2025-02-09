package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedBuildMethod_Test_WhenNoDirectivesArePresent {

    @Test
    public void buildMethod_Test_WhenNoDirectivesArePresent() {
        // given
        DirectiveJavaAnnotationUtil utilMock = Mockito.mock(DirectiveJavaAnnotationUtil.class);
        ProcessingElementsContainer containerMock = Mockito.mock(ProcessingElementsContainer.class);
        when(containerMock.getDirectiveJavaAnnotationUtil()).thenReturn(utilMock);
        when(utilMock.getDirectiveInfo(any(), any())).thenThrow(new SomeException());

        DirectivesBuilder builder = new DirectivesBuilder(SomeClassWithoutDirectives.class, containerMock);

        // when
        builder.build();

        // then exception expected
    }

}