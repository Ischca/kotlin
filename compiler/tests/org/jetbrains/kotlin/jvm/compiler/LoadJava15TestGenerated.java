/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.jvm.compiler;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class LoadJava15TestGenerated extends AbstractLoadJava15Test {
    @TestMetadata("compiler/testData/loadJava15")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CompiledJava extends AbstractLoadJava15Test {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestCompiledJava, this, testDataFilePath);
        }

        public void testAllFilesPresentInCompiledJava() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava15"), Pattern.compile("^(.+)\\.java$"), null, true);
        }

        @TestMetadata("GenericRecord.java")
        public void testGenericRecord() throws Exception {
            runTest("compiler/testData/loadJava15/GenericRecord.java");
        }

        @TestMetadata("SimpleRecord.java")
        public void testSimpleRecord() throws Exception {
            runTest("compiler/testData/loadJava15/SimpleRecord.java");
        }
    }

    @TestMetadata("compiler/testData/loadJava15")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SourceJava extends AbstractLoadJava15Test {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestSourceJava, this, testDataFilePath);
        }

        public void testAllFilesPresentInSourceJava() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava15"), Pattern.compile("^(.+)\\.java$"), null, true);
        }

        @TestMetadata("GenericRecord.java")
        public void testGenericRecord() throws Exception {
            runTest("compiler/testData/loadJava15/GenericRecord.java");
        }

        @TestMetadata("SimpleRecord.java")
        public void testSimpleRecord() throws Exception {
            runTest("compiler/testData/loadJava15/SimpleRecord.java");
        }
    }
}
