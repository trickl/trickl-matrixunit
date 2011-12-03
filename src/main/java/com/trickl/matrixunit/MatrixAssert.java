package com.trickl.matrixunit;

import cern.colt.matrix.DoubleMatrix1D;
import cern.colt.matrix.DoubleMatrix2D;
import org.junit.Assert;

public final class MatrixAssert {
   private MatrixAssert() {
   }


   public static void assertEquals(DoubleMatrix1D expected, DoubleMatrix1D actual, double tolerance) {
      Assert.assertEquals(expected.size(), actual.size());
      Assert.assertArrayEquals(expected.toArray(), actual.toArray(), tolerance);
   }

   public static void assertEquals(DoubleMatrix2D expected, DoubleMatrix2D actual, double tolerance) {
      Assert.assertEquals(expected.rows(), actual.rows());
      Assert.assertEquals(expected.columns(), actual.columns());
      for (int i = 0; i < expected.rows(); ++i) {
         Assert.assertArrayEquals(expected.viewRow(i).toArray(), actual.viewRow(i).toArray(), tolerance);
      }
   }
}
