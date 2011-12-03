/*
 * This file is part of the Trickl Open Source Libraries.
 *
 * Trickl Open Source Libraries - http://open.trickl.com/
 *
 * Copyright (C) 2011 Tim Gee.
 *
 * Trickl Open Source Libraries are free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Trickl Open Source Libraries are distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this project.  If not, see <http://www.gnu.org/licenses/>.
 */
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
