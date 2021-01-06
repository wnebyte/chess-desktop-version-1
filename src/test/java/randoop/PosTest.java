package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PosTest {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        java.lang.Class<?> wildcardClass4 = pos2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, (int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = pos7.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos5 = new model.Pos(pos2, (int) (byte) 100, 10);
        model.Pos pos8 = new model.Pos(pos5, (int) (short) -1, (int) '4');
        java.lang.Class<?> wildcardClass9 = pos8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        model.Pos pos2 = new model.Pos('a', (int) (byte) -1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        java.lang.String str6 = pos5.toString();
        java.lang.Class<?> wildcardClass7 = pos5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0, -1]" + "'", str6, "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        model.Pos pos2 = new model.Pos(100, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean4 = pos2.equals((java.lang.Object) (-1L));
        boolean boolean6 = pos2.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass7 = pos2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        boolean boolean8 = pos6.equals((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass9 = pos6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        model.Pos pos2 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos9 = new model.Pos(pos6, (int) (byte) 100, 10);
        model.Pos pos12 = new model.Pos(pos9, (int) (short) -1, (int) '4');
        boolean boolean13 = pos3.equals((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass14 = pos3.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        model.Pos pos6 = pos5.clone();
        int int7 = pos6.getX();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        model.Pos pos8 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos11 = new model.Pos(pos8, (int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass12 = pos11.getClass();
        boolean boolean13 = pos2.equals((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        model.Pos pos0 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos3 = new model.Pos(pos0, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: pos may not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        java.lang.Class<?> wildcardClass4 = pos3.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean4 = pos2.equals((java.lang.Object) (-1L));
        boolean boolean6 = pos2.equals((java.lang.Object) 100.0d);
        model.Pos pos7 = pos2.clone();
        int int8 = pos7.getX();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean4 = pos2.equals((java.lang.Object) (-1L));
        model.Pos pos5 = pos2.clone();
        java.lang.Class<?> wildcardClass6 = pos2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        java.lang.Class<?> wildcardClass7 = pos6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean4 = pos2.equals((java.lang.Object) (-1L));
        boolean boolean6 = pos2.equals((java.lang.Object) 100.0d);
        int int7 = pos2.getY();
        model.Pos pos10 = new model.Pos(pos2, 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        int int6 = pos2.getY();
        model.Pos pos7 = pos2.clone();
        java.lang.Class<?> wildcardClass8 = pos7.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        model.Pos pos2 = new model.Pos(52, 52);
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        model.Pos pos2 = new model.Pos('a', (int) '#');
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass6 = pos3.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        int int6 = pos2.getX();
        java.lang.Class<?> wildcardClass7 = pos2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos2.getX();
        java.lang.String str5 = pos2.toString();
        java.lang.String str6 = pos2.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, 1]" + "'", str5, "[100, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[100, 1]" + "'", str6, "[100, 1]");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        model.Pos pos2 = new model.Pos(10, (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        java.lang.Class<?> wildcardClass4 = pos3.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos3.clone();
        java.lang.Class<?> wildcardClass5 = pos3.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        model.Pos pos2 = new model.Pos(10, (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos2.getX();
        java.lang.Class<?> wildcardClass5 = pos2.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        model.Pos pos2 = new model.Pos((int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean4 = pos2.equals((java.lang.Object) (-1L));
        model.Pos pos5 = pos2.clone();
        int int6 = pos5.getX();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean4 = pos2.equals((java.lang.Object) (-1L));
        model.Pos pos5 = pos2.clone();
        java.lang.Class<?> wildcardClass6 = pos5.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        model.Pos pos2 = new model.Pos(10, (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos2.getY();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        boolean boolean8 = pos6.equals((java.lang.Object) 100.0f);
        int int9 = pos6.getX();
        int int10 = pos6.getX();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        model.Pos pos2 = new model.Pos((int) 'a', 2);
        int int3 = pos2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        int int3 = pos2.getY();
        int int4 = pos2.getY();
        java.lang.Class<?> wildcardClass5 = pos2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, (int) '4', (int) (short) 0);
        model.Pos pos8 = pos7.clone();
        model.Pos pos11 = new model.Pos(10, (int) (byte) 1);
        model.Pos pos12 = pos11.clone();
        java.lang.Class<?> wildcardClass13 = pos11.getClass();
        boolean boolean14 = pos8.equals((java.lang.Object) pos11);
        int int15 = pos11.getX();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        model.Pos pos2 = new model.Pos('a', (int) '#');
        model.Pos pos5 = new model.Pos(pos2, (int) (short) 1, 35);
        model.Pos pos8 = new model.Pos(pos2, (int) '#', 0);
        java.lang.String str9 = pos2.toString();
        java.lang.Class<?> wildcardClass10 = pos2.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[a, 35]" + "'", str9, "[a, 35]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        model.Pos pos2 = new model.Pos((int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        boolean boolean8 = pos6.equals((java.lang.Object) 100.0f);
        java.lang.String str9 = pos6.toString();
        java.lang.Class<?> wildcardClass10 = pos6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[52, 1]" + "'", str9, "[52, 1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        model.Pos pos2 = new model.Pos((int) (short) 1, (int) ' ');
        int int3 = pos2.getX();
        int int4 = pos2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        model.Pos pos2 = new model.Pos(10, 52);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, (int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = pos4.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        model.Pos pos6 = new model.Pos(pos2, (int) (byte) -1, (int) (byte) -1);
        model.Pos pos9 = new model.Pos(pos6, (int) (short) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = pos9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        model.Pos pos7 = pos6.clone();
        int int8 = pos6.getY();
        java.lang.Class<?> wildcardClass9 = pos6.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        model.Pos pos2 = new model.Pos('a', (int) (short) 10);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        model.Pos pos9 = new model.Pos(pos3, (int) (byte) 10, (int) (byte) 1);
        int int10 = pos9.getY();
        int int11 = pos9.getX();
        java.lang.Class<?> wildcardClass12 = pos9.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 62 + "'", int11 == 62);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getX();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        model.Pos pos9 = new model.Pos(pos3, (int) (byte) 10, (int) (byte) 1);
        model.Pos pos12 = new model.Pos(pos9, (int) (short) 10, 32);
        int int13 = pos12.getY();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos5 = new model.Pos(pos2, (int) (byte) 100, 10);
        model.Pos pos8 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos9 = pos8.clone();
        model.Pos pos12 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos15 = new model.Pos(pos12, (int) (byte) 100, 10);
        model.Pos pos18 = new model.Pos(pos15, (int) (short) -1, (int) '4');
        boolean boolean19 = pos9.equals((java.lang.Object) '4');
        int int20 = pos9.getY();
        model.Pos pos21 = pos9.clone();
        boolean boolean22 = pos2.equals((java.lang.Object) pos21);
        java.lang.Class<?> wildcardClass23 = pos2.getClass();
        org.junit.Assert.assertNotNull(pos9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(pos21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        model.Pos pos2 = new model.Pos((int) (short) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        model.Pos pos0 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos3 = new model.Pos(pos0, 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: pos may not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos5 = new model.Pos(pos2, (int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass6 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, (int) '4', (int) (short) 0);
        model.Pos pos10 = new model.Pos(pos4, (int) ' ', 32);
        int int11 = pos10.getX();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 132 + "'", int11 == 132);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        model.Pos pos2 = new model.Pos(100, (int) (short) 0);
        model.Pos pos5 = new model.Pos(pos2, (int) '4', 35);
        int int6 = pos5.getY();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        model.Pos pos9 = new model.Pos(pos6, 0, 10);
        model.Pos pos12 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean14 = pos12.equals((java.lang.Object) (-1L));
        boolean boolean16 = pos12.equals((java.lang.Object) 100.0d);
        boolean boolean17 = pos6.equals((java.lang.Object) pos12);
        int int18 = pos6.getY();
        java.lang.Class<?> wildcardClass19 = pos6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        model.Pos pos2 = new model.Pos((int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        model.Pos pos2 = new model.Pos((int) ' ', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos(100, 1);
        model.Pos pos7 = pos6.clone();
        model.Pos pos8 = pos6.clone();
        model.Pos pos11 = new model.Pos(pos8, (int) '4', (int) (short) 0);
        model.Pos pos14 = new model.Pos(pos8, (int) ' ', 32);
        model.Pos pos15 = pos14.clone();
        boolean boolean16 = pos2.equals((java.lang.Object) pos15);
        java.lang.Class<?> wildcardClass17 = pos2.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        model.Pos pos2 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos3 = pos2.clone();
        java.lang.String str4 = pos3.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[-1, 32]" + "'", str4, "[-1, 32]");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        model.Pos pos2 = new model.Pos((int) (byte) 100, (int) (byte) 10);
        model.Pos pos5 = new model.Pos(100, 1);
        model.Pos pos6 = pos5.clone();
        int int7 = pos6.getY();
        model.Pos pos8 = pos6.clone();
        java.lang.Class<?> wildcardClass9 = pos8.getClass();
        boolean boolean10 = pos2.equals((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = pos2.getClass();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        model.Pos pos2 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos9 = new model.Pos(pos6, (int) (byte) 100, 10);
        model.Pos pos12 = new model.Pos(pos9, (int) (short) -1, (int) '4');
        boolean boolean13 = pos3.equals((java.lang.Object) '4');
        model.Pos pos14 = pos3.clone();
        java.lang.String str15 = pos14.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pos14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[-1, 32]" + "'", str15, "[-1, 32]");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        model.Pos pos2 = new model.Pos((int) (short) 0, 52);
        model.Pos pos3 = pos2.clone();
        java.lang.Class<?> wildcardClass4 = pos3.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        model.Pos pos2 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos9 = new model.Pos(pos6, (int) (byte) 100, 10);
        model.Pos pos12 = new model.Pos(pos9, (int) (short) -1, (int) '4');
        boolean boolean13 = pos3.equals((java.lang.Object) '4');
        model.Pos pos14 = pos3.clone();
        java.lang.Class<?> wildcardClass15 = pos14.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pos14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        model.Pos pos2 = new model.Pos((int) ' ', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos(100, 1);
        model.Pos pos7 = pos6.clone();
        model.Pos pos8 = pos6.clone();
        model.Pos pos11 = new model.Pos(pos8, (int) '4', (int) (short) 0);
        model.Pos pos14 = new model.Pos(pos8, (int) ' ', 32);
        model.Pos pos15 = pos14.clone();
        boolean boolean16 = pos2.equals((java.lang.Object) pos15);
        java.lang.Class<?> wildcardClass17 = pos15.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        model.Pos pos2 = new model.Pos((-1), (int) '4');
        int int3 = pos2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        model.Pos pos7 = pos3.clone();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertNotNull(pos7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        model.Pos pos2 = new model.Pos((int) (byte) 0, 52);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        model.Pos pos2 = new model.Pos('a', 132);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        boolean boolean7 = pos5.equals((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = null;
        boolean boolean9 = pos5.equals(obj8);
        model.Pos pos12 = new model.Pos(pos5, 1, 52);
        java.lang.Class<?> wildcardClass13 = pos5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        int int7 = pos2.getX();
        model.Pos pos10 = new model.Pos(pos2, 0, 35);
        java.lang.Object obj11 = null;
        boolean boolean12 = pos10.equals(obj11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        model.Pos pos2 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos9 = new model.Pos(pos6, (int) (byte) 100, 10);
        model.Pos pos12 = new model.Pos(pos9, (int) (short) -1, (int) '4');
        boolean boolean13 = pos3.equals((java.lang.Object) '4');
        int int14 = pos3.getY();
        int int15 = pos3.getY();
        java.lang.Class<?> wildcardClass16 = pos3.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        java.lang.String str5 = pos3.toString();
        model.Pos pos6 = pos3.clone();
        java.lang.Class<?> wildcardClass7 = pos3.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, 1]" + "'", str5, "[100, 1]");
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        model.Pos pos0 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos3 = new model.Pos(pos0, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: pos may not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        model.Pos pos2 = new model.Pos((int) '#', (int) '4');
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        model.Pos pos2 = new model.Pos((int) (short) 10, 10);
        java.lang.String str3 = pos2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10, 10]" + "'", str3, "[10, 10]");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        model.Pos pos6 = new model.Pos(pos2, (int) (byte) -1, (int) (byte) -1);
        int int7 = pos6.getX();
        int int8 = pos6.getY();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        java.lang.String str4 = pos2.toString();
        java.lang.String str5 = pos2.toString();
        int int6 = pos2.getY();
        java.lang.String str7 = pos2.toString();
        model.Pos pos8 = pos2.clone();
        java.lang.Class<?> wildcardClass9 = pos2.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[52, 1]" + "'", str4, "[52, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[52, 1]" + "'", str5, "[52, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[52, 1]" + "'", str7, "[52, 1]");
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos5 = new model.Pos(pos2, (int) (byte) 100, 10);
        model.Pos pos8 = new model.Pos(pos5, (int) (short) -1, (int) '4');
        int int9 = pos8.getX();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 151 + "'", int9 == 151);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        model.Pos pos7 = new model.Pos(pos3, (int) '#', (int) '#');
        model.Pos pos10 = new model.Pos((int) (byte) -1, (int) ' ');
        boolean boolean11 = pos7.equals((java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        int int6 = pos5.getX();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        model.Pos pos2 = new model.Pos((int) ' ', (int) ' ');
        java.lang.String str3 = pos2.toString();
        int int4 = pos2.getY();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[32, 32]" + "'", str3, "[32, 32]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        model.Pos pos2 = new model.Pos((int) (short) -1, 10);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        int int7 = pos2.getX();
        java.lang.String str8 = pos2.toString();
        java.lang.Class<?> wildcardClass9 = pos2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[52, 1]" + "'", str8, "[52, 1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        model.Pos pos0 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos3 = new model.Pos(pos0, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: pos may not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos5 = new model.Pos(pos2, (int) (byte) 100, 10);
        model.Pos pos8 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos9 = pos8.clone();
        model.Pos pos12 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos15 = new model.Pos(pos12, (int) (byte) 100, 10);
        model.Pos pos18 = new model.Pos(pos15, (int) (short) -1, (int) '4');
        boolean boolean19 = pos9.equals((java.lang.Object) '4');
        int int20 = pos9.getY();
        model.Pos pos21 = pos9.clone();
        boolean boolean22 = pos2.equals((java.lang.Object) pos21);
        int int23 = pos2.getX();
        java.lang.Class<?> wildcardClass24 = pos2.getClass();
        org.junit.Assert.assertNotNull(pos9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(pos21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        boolean boolean7 = pos5.equals((java.lang.Object) (byte) -1);
        model.Pos pos8 = pos5.clone();
        int int9 = pos5.getX();
        int int10 = pos5.getX();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        model.Pos pos6 = new model.Pos(pos2, (int) (byte) -1, (int) (byte) -1);
        model.Pos pos9 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos12 = new model.Pos(pos9, 1, 0);
        model.Pos pos13 = pos12.clone();
        model.Pos pos16 = new model.Pos(pos12, 2, (int) (short) 10);
        boolean boolean17 = pos2.equals((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass18 = pos2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertNotNull(pos13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        model.Pos pos2 = new model.Pos(34, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        model.Pos pos2 = new model.Pos('a', (int) '#');
        model.Pos pos5 = new model.Pos(pos2, (int) (short) 1, 35);
        model.Pos pos8 = new model.Pos(pos2, (int) '#', 0);
        java.lang.String str9 = pos2.toString();
        model.Pos pos12 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos13 = pos12.clone();
        boolean boolean14 = pos2.equals((java.lang.Object) pos12);
        model.Pos pos17 = new model.Pos(pos2, (int) '#', (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = pos2.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[a, 35]" + "'", str9, "[a, 35]");
        org.junit.Assert.assertNotNull(pos13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos2.getX();
        java.lang.String str5 = pos2.toString();
        java.lang.Class<?> wildcardClass6 = pos2.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, 1]" + "'", str5, "[100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, (int) '4', (int) (short) 0);
        model.Pos pos10 = new model.Pos(pos7, 1, (int) (byte) 100);
        model.Pos pos13 = new model.Pos('a', (int) (byte) 10);
        model.Pos pos14 = pos13.clone();
        java.lang.Class<?> wildcardClass15 = pos13.getClass();
        boolean boolean16 = pos7.equals((java.lang.Object) pos13);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(pos14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        model.Pos pos6 = new model.Pos(10, (int) (byte) 1);
        model.Pos pos7 = pos6.clone();
        boolean boolean8 = pos2.equals((java.lang.Object) pos6);
        model.Pos pos9 = pos2.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pos9);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos3 = pos2.clone();
        java.lang.String str4 = pos2.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[-1, -1]" + "'", str4, "[-1, -1]");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        java.lang.String str6 = pos5.toString();
        int int7 = pos5.getX();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0, -1]" + "'", str6, "[0, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean4 = pos2.equals((java.lang.Object) (-1L));
        model.Pos pos5 = pos2.clone();
        int int6 = pos5.getY();
        model.Pos pos9 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str10 = pos9.toString();
        model.Pos pos13 = new model.Pos(pos9, (int) (byte) -1, (int) (byte) -1);
        model.Pos pos16 = new model.Pos(pos13, (int) (short) 100, (int) (byte) 100);
        java.lang.String str17 = pos16.toString();
        model.Pos pos18 = pos16.clone();
        boolean boolean19 = pos5.equals((java.lang.Object) pos16);
        java.lang.String str20 = pos5.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[52, 1]" + "'", str10, "[52, 1]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[151, 100]" + "'", str17, "[151, 100]");
        org.junit.Assert.assertNotNull(pos18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[-1, 1]" + "'", str20, "[-1, 1]");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', 151);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        model.Pos pos2 = new model.Pos(35, 152);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', 151);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        model.Pos pos9 = new model.Pos(pos3, (int) (byte) 10, (int) (byte) 1);
        int int10 = pos9.getY();
        model.Pos pos13 = new model.Pos(pos9, (int) (byte) 0, 35);
        java.lang.String str14 = pos13.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[62, 37]" + "'", str14, "[62, 37]");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', 152);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        model.Pos pos6 = pos5.clone();
        model.Pos pos9 = new model.Pos(pos5, 2, (int) (short) 10);
        int int10 = pos5.getY();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos(pos2, 152, (int) (byte) 100);
        org.junit.Assert.assertNotNull(pos3);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        model.Pos pos6 = pos5.clone();
        model.Pos pos9 = new model.Pos(pos5, (int) (byte) 1, 0);
        java.lang.String str10 = pos9.toString();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[a, -1]" + "'", str10, "[a, -1]");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, (int) '4', (int) (short) 0);
        model.Pos pos8 = pos7.clone();
        model.Pos pos11 = new model.Pos((int) (short) -1, (int) (byte) -1);
        boolean boolean12 = pos7.equals((java.lang.Object) (byte) -1);
        model.Pos pos15 = new model.Pos(pos7, (int) 'a', (int) '4');
        model.Pos pos16 = pos7.clone();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(pos16);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        model.Pos pos2 = new model.Pos(2, (int) (byte) 1);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        int int4 = pos2.getY();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        model.Pos pos0 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos3 = new model.Pos(pos0, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: pos may not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        model.Pos pos2 = new model.Pos((int) (short) 10, 152);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        model.Pos pos2 = new model.Pos((int) (short) 1, 1);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos5 = new model.Pos(pos2, (int) (byte) 100, 10);
        int int6 = pos5.getY();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        model.Pos pos6 = new model.Pos(pos2, (int) (byte) -1, (int) (byte) -1);
        model.Pos pos7 = pos6.clone();
        int int8 = pos7.getY();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        model.Pos pos0 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos3 = new model.Pos(pos0, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: pos may not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        model.Pos pos2 = new model.Pos('a', (int) '4');
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        model.Pos pos2 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos9 = new model.Pos(pos6, (int) (byte) 100, 10);
        model.Pos pos12 = new model.Pos(pos9, (int) (short) -1, (int) '4');
        boolean boolean13 = pos3.equals((java.lang.Object) '4');
        model.Pos pos16 = new model.Pos(pos3, (int) '4', (int) (short) -1);
        int int17 = pos3.getY();
        model.Pos pos20 = new model.Pos(pos3, 100, 0);
        java.lang.Class<?> wildcardClass21 = pos3.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        model.Pos pos2 = new model.Pos((int) (short) 0, (int) '#');
        int int3 = pos2.getY();
        model.Pos pos6 = new model.Pos(pos2, 151, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        model.Pos pos2 = new model.Pos(10, 32);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        model.Pos pos7 = new model.Pos(pos3, 0, 62);
        int int8 = pos3.getX();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        model.Pos pos2 = new model.Pos('a', (int) (byte) 100);
        model.Pos pos5 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str6 = pos5.toString();
        model.Pos pos9 = new model.Pos(10, (int) (byte) 1);
        model.Pos pos10 = pos9.clone();
        boolean boolean11 = pos5.equals((java.lang.Object) pos9);
        java.lang.String str12 = pos5.toString();
        boolean boolean13 = pos2.equals((java.lang.Object) str12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[52, 1]" + "'", str6, "[52, 1]");
        org.junit.Assert.assertNotNull(pos10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[52, 1]" + "'", str12, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        model.Pos pos6 = pos5.clone();
        model.Pos pos9 = new model.Pos(pos6, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = pos6.getClass();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        model.Pos pos2 = new model.Pos((int) '4', 32);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos8 = new model.Pos(pos3, 32, (int) '4');
        model.Pos pos11 = new model.Pos(pos3, 32, (int) (byte) 100);
        model.Pos pos14 = new model.Pos('a', (int) '#');
        int int15 = pos14.getY();
        model.Pos pos18 = new model.Pos(pos14, 32, (int) (short) -1);
        boolean boolean19 = pos11.equals((java.lang.Object) pos14);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        java.lang.String str6 = pos3.toString();
        int int7 = pos3.getY();
        model.Pos pos8 = pos3.clone();
        int int9 = pos8.getX();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[52, 1]" + "'", str6, "[52, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        model.Pos pos2 = new model.Pos((-1), (int) '#');
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', 66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos(pos3, (int) '#', (int) '#');
        model.Pos pos9 = new model.Pos((int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = pos9.getClass();
        boolean boolean11 = pos3.equals((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        int int5 = pos2.getY();
        int int6 = pos2.getY();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        model.Pos pos2 = new model.Pos('a', (int) '#');
        int int3 = pos2.getY();
        model.Pos pos4 = pos2.clone();
        int int5 = pos2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        model.Pos pos2 = new model.Pos((int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        model.Pos pos2 = new model.Pos((int) (short) 100, (int) (short) 0);
        int int3 = pos2.getX();
        model.Pos pos6 = new model.Pos('a', (int) '#');
        int int7 = pos6.getY();
        model.Pos pos10 = new model.Pos(pos6, 32, (int) (short) -1);
        boolean boolean11 = pos2.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        model.Pos pos2 = new model.Pos('a', (int) '#');
        model.Pos pos5 = new model.Pos(pos2, (int) (short) 1, 35);
        model.Pos pos8 = new model.Pos(pos2, (int) '#', 0);
        int int9 = pos2.getX();
        model.Pos pos10 = pos2.clone();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(pos10);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        model.Pos pos2 = new model.Pos((-1), (int) '4');
        java.lang.String str3 = pos2.toString();
        java.lang.Class<?> wildcardClass4 = pos2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1, 52]" + "'", str3, "[-1, 52]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        model.Pos pos2 = new model.Pos((int) (byte) 1, 132);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        model.Pos pos9 = new model.Pos(pos3, (int) (byte) 10, (int) (byte) 1);
        int int10 = pos9.getX();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean4 = pos2.equals((java.lang.Object) (-1L));
        boolean boolean6 = pos2.equals((java.lang.Object) 100.0d);
        model.Pos pos7 = pos2.clone();
        java.lang.String str8 = pos7.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[-1, 1]" + "'", str8, "[-1, 1]");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        model.Pos pos2 = new model.Pos('a', (-1));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        boolean boolean7 = pos5.equals((java.lang.Object) (byte) -1);
        int int8 = pos5.getX();
        java.lang.String str9 = pos5.toString();
        java.lang.Class<?> wildcardClass10 = pos5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, -1]" + "'", str9, "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        model.Pos pos2 = new model.Pos((int) '4', (int) (short) 0);
        model.Pos pos5 = new model.Pos(100, 1);
        model.Pos pos6 = pos5.clone();
        int int7 = pos5.getX();
        model.Pos pos8 = pos5.clone();
        boolean boolean9 = pos2.equals((java.lang.Object) pos5);
        model.Pos pos12 = new model.Pos((int) (short) 100, (int) (short) 1);
        boolean boolean13 = pos2.equals((java.lang.Object) (short) 100);
        model.Pos pos16 = new model.Pos(pos2, (int) (byte) 100, 51);
        model.Pos pos17 = pos2.clone();
        model.Pos pos20 = new model.Pos(pos2, (int) '4', 51);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pos17);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        model.Pos pos2 = new model.Pos((int) '4', (int) (short) 0);
        model.Pos pos5 = new model.Pos(100, 1);
        model.Pos pos6 = pos5.clone();
        int int7 = pos5.getX();
        model.Pos pos8 = pos5.clone();
        boolean boolean9 = pos2.equals((java.lang.Object) pos5);
        model.Pos pos12 = new model.Pos((int) (short) 100, (int) (short) 1);
        boolean boolean13 = pos2.equals((java.lang.Object) (short) 100);
        model.Pos pos16 = new model.Pos(pos2, (int) (byte) 100, 51);
        model.Pos pos17 = pos2.clone();
        model.Pos pos18 = pos2.clone();
        model.Pos pos21 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos22 = pos21.clone();
        model.Pos pos25 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos28 = new model.Pos(pos25, (int) (byte) 100, 10);
        model.Pos pos31 = new model.Pos(pos28, (int) (short) -1, (int) '4');
        boolean boolean32 = pos22.equals((java.lang.Object) '4');
        int int33 = pos22.getY();
        int int34 = pos22.getX();
        boolean boolean35 = pos18.equals((java.lang.Object) int34);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pos17);
        org.junit.Assert.assertNotNull(pos18);
        org.junit.Assert.assertNotNull(pos22);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        boolean boolean7 = pos5.equals((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = null;
        boolean boolean9 = pos5.equals(obj8);
        model.Pos pos12 = new model.Pos(pos5, 1, 52);
        model.Pos pos13 = pos12.clone();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(pos13);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        model.Pos pos2 = new model.Pos((int) '4', 0);
        model.Pos pos5 = new model.Pos(pos2, 2, (int) '4');
        model.Pos pos8 = new model.Pos(pos5, 0, (int) (short) 1);
        java.lang.String str9 = pos5.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[54, 52]" + "'", str9, "[54, 52]");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        int int7 = pos6.getX();
        java.lang.String str8 = pos6.toString();
        model.Pos pos11 = new model.Pos(pos6, (int) (short) 0, (int) 'a');
        model.Pos pos12 = pos11.clone();
        model.Pos pos15 = new model.Pos(pos11, (int) (short) 10, (int) 'a');
        int int16 = pos11.getY();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[52, 1]" + "'", str8, "[52, 1]");
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 98 + "'", int16 == 98);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        model.Pos pos5 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos8 = new model.Pos(pos5, 1, 0);
        model.Pos pos11 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos14 = new model.Pos(pos11, 1, 0);
        model.Pos pos15 = pos14.clone();
        boolean boolean16 = pos5.equals((java.lang.Object) pos15);
        java.lang.String str17 = pos5.toString();
        int int18 = pos5.getX();
        int int19 = pos5.getX();
        boolean boolean20 = pos2.equals((java.lang.Object) int19);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[-1, -1]" + "'", str17, "[-1, -1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        model.Pos pos2 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos9 = new model.Pos(pos6, (int) (byte) 100, 10);
        model.Pos pos12 = new model.Pos(pos9, (int) (short) -1, (int) '4');
        boolean boolean13 = pos3.equals((java.lang.Object) '4');
        model.Pos pos16 = new model.Pos(pos3, (int) '4', (int) (short) -1);
        int int17 = pos3.getY();
        java.lang.Class<?> wildcardClass18 = pos3.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        model.Pos pos2 = new model.Pos('a', (int) (byte) 10);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos(pos2, (-1), 34);
        model.Pos pos7 = pos2.clone();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos7);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        model.Pos pos0 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos3 = new model.Pos(pos0, 32, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: pos may not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        model.Pos pos2 = new model.Pos((int) ' ', (int) (short) -1);
        int int3 = pos2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, (int) '4', (int) (short) 0);
        model.Pos pos10 = new model.Pos(pos4, (int) ' ', 32);
        model.Pos pos11 = pos10.clone();
        model.Pos pos14 = new model.Pos((int) (short) 100, (int) (short) 1);
        boolean boolean15 = pos10.equals((java.lang.Object) (short) 1);
        java.lang.String str16 = pos10.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[132, 33]" + "'", str16, "[132, 33]");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        model.Pos pos2 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos3 = pos2.clone();
        int int4 = pos2.getX();
        java.lang.Class<?> wildcardClass5 = pos2.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        model.Pos pos2 = new model.Pos((int) (short) 10, (int) (short) 10);
        model.Pos pos5 = new model.Pos(10, 0);
        model.Pos pos8 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos9 = pos8.clone();
        boolean boolean10 = pos5.equals((java.lang.Object) pos9);
        model.Pos pos11 = pos9.clone();
        boolean boolean12 = pos2.equals((java.lang.Object) pos11);
        org.junit.Assert.assertNotNull(pos9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        int int6 = pos5.getY();
        java.lang.String str7 = pos5.toString();
        int int8 = pos5.getY();
        java.lang.Class<?> wildcardClass9 = pos5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, -1]" + "'", str7, "[0, -1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        model.Pos pos2 = new model.Pos((int) 'a', 2);
        java.lang.String str3 = pos2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[97, 2]" + "'", str3, "[97, 2]");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        model.Pos pos2 = new model.Pos(10, 0);
        model.Pos pos5 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos6 = pos5.clone();
        boolean boolean7 = pos2.equals((java.lang.Object) pos6);
        int int8 = pos6.getY();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        model.Pos pos2 = new model.Pos((int) '4', (int) (short) 0);
        model.Pos pos5 = new model.Pos(100, 1);
        model.Pos pos6 = pos5.clone();
        int int7 = pos5.getX();
        model.Pos pos8 = pos5.clone();
        boolean boolean9 = pos2.equals((java.lang.Object) pos5);
        model.Pos pos12 = new model.Pos((int) (short) 100, (int) (short) 1);
        boolean boolean13 = pos2.equals((java.lang.Object) (short) 100);
        model.Pos pos16 = new model.Pos(pos2, (int) (byte) 100, 51);
        model.Pos pos17 = pos2.clone();
        model.Pos pos18 = pos2.clone();
        int int19 = pos2.getY();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pos17);
        org.junit.Assert.assertNotNull(pos18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        int int7 = pos2.getX();
        java.lang.String str8 = pos2.toString();
        model.Pos pos9 = pos2.clone();
        model.Pos pos12 = new model.Pos(pos9, 62, (int) (short) 0);
        int int13 = pos12.getX();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[52, 1]" + "'", str8, "[52, 1]");
        org.junit.Assert.assertNotNull(pos9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 114 + "'", int13 == 114);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        model.Pos pos2 = new model.Pos(100, (-1));
        int int3 = pos2.getY();
        java.lang.Class<?> wildcardClass4 = pos2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        int int6 = pos2.getY();
        model.Pos pos7 = pos2.clone();
        model.Pos pos8 = pos2.clone();
        java.lang.Class<?> wildcardClass9 = pos2.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        java.lang.Class<?> wildcardClass4 = pos2.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        model.Pos pos7 = pos6.clone();
        java.lang.Class<?> wildcardClass8 = pos6.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        model.Pos pos2 = new model.Pos((int) '4', (int) (short) 0);
        model.Pos pos5 = new model.Pos(pos2, (int) (short) 1, 52);
        java.lang.String str6 = pos5.toString();
        java.lang.Class<?> wildcardClass7 = pos5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[53, 52]" + "'", str6, "[53, 52]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        model.Pos pos2 = new model.Pos((int) ' ', 0);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos2.getY();
        model.Pos pos5 = pos2.clone();
        java.lang.Class<?> wildcardClass6 = pos2.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        model.Pos pos6 = pos5.clone();
        model.Pos pos9 = new model.Pos(pos6, 0, (int) (byte) 0);
        int int10 = pos9.getY();
        int int11 = pos9.getY();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        model.Pos pos2 = new model.Pos((int) (byte) 1, (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        model.Pos pos4 = pos2.clone();
        java.lang.Class<?> wildcardClass5 = pos2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[a, 1]" + "'", str3, "[a, 1]");
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        model.Pos pos7 = new model.Pos(pos3, (int) '#', (int) '#');
        java.lang.Class<?> wildcardClass8 = pos7.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        java.lang.String str6 = pos5.toString();
        model.Pos pos9 = new model.Pos(pos5, 32, (int) '4');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0, -1]" + "'", str6, "[0, -1]");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        model.Pos pos2 = new model.Pos('a', 36);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        int int3 = pos2.getY();
        model.Pos pos6 = new model.Pos(pos2, 2, (-1));
        java.lang.Class<?> wildcardClass7 = pos6.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        model.Pos pos2 = new model.Pos('a', (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        model.Pos pos9 = new model.Pos(pos6, 0, 10);
        model.Pos pos10 = pos9.clone();
        model.Pos pos11 = pos10.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertNotNull(pos10);
        org.junit.Assert.assertNotNull(pos11);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        model.Pos pos2 = new model.Pos(52, (int) (byte) 100);
        int int3 = pos2.getX();
        java.lang.String str4 = pos2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[52, 100]" + "'", str4, "[52, 100]");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        java.lang.String str5 = pos3.toString();
        model.Pos pos6 = pos3.clone();
        int int7 = pos6.getX();
        model.Pos pos10 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str11 = pos10.toString();
        model.Pos pos14 = new model.Pos(10, (int) (byte) 1);
        model.Pos pos15 = pos14.clone();
        boolean boolean16 = pos10.equals((java.lang.Object) pos14);
        model.Pos pos19 = new model.Pos(pos14, 0, 0);
        boolean boolean20 = pos6.equals((java.lang.Object) 0);
        int int21 = pos6.getY();
        model.Pos pos24 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos27 = new model.Pos(pos24, 1, 0);
        boolean boolean29 = pos27.equals((java.lang.Object) (byte) -1);
        model.Pos pos30 = pos27.clone();
        model.Pos pos31 = pos27.clone();
        int int32 = pos31.getX();
        int int33 = pos31.getX();
        model.Pos pos34 = pos31.clone();
        boolean boolean35 = pos6.equals((java.lang.Object) pos34);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, 1]" + "'", str5, "[100, 1]");
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[52, 1]" + "'", str11, "[52, 1]");
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(pos30);
        org.junit.Assert.assertNotNull(pos31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(pos34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        int int6 = pos5.getY();
        java.lang.String str7 = pos5.toString();
        int int8 = pos5.getY();
        model.Pos pos11 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos14 = new model.Pos(pos11, 1, 0);
        model.Pos pos17 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos20 = new model.Pos(pos17, 1, 0);
        model.Pos pos21 = pos20.clone();
        boolean boolean22 = pos11.equals((java.lang.Object) pos21);
        java.lang.String str23 = pos11.toString();
        java.lang.String str24 = pos11.toString();
        int int25 = pos11.getX();
        boolean boolean26 = pos5.equals((java.lang.Object) int25);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, -1]" + "'", str7, "[0, -1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(pos21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[-1, -1]" + "'", str23, "[-1, -1]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[-1, -1]" + "'", str24, "[-1, -1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos5 = new model.Pos(pos2, (int) (byte) 100, 10);
        model.Pos pos8 = new model.Pos(pos5, (int) (short) -1, (int) '4');
        int int9 = pos8.getY();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 63 + "'", int9 == 63);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        model.Pos pos2 = new model.Pos('a', (int) (short) 0);
        int int3 = pos2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, (int) '4', (int) (short) 0);
        model.Pos pos10 = new model.Pos(pos7, 1, (int) (byte) 100);
        int int11 = pos7.getY();
        model.Pos pos14 = new model.Pos((int) (short) 10, (int) (short) 10);
        boolean boolean15 = pos7.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        model.Pos pos2 = new model.Pos('a', (int) '#');
        int int3 = pos2.getY();
        model.Pos pos6 = new model.Pos(pos2, 32, (int) (short) -1);
        model.Pos pos7 = pos2.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(pos7);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        java.lang.String str5 = pos3.toString();
        model.Pos pos6 = pos3.clone();
        model.Pos pos7 = pos6.clone();
        int int8 = pos6.getY();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, 1]" + "'", str5, "[100, 1]");
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        model.Pos pos2 = new model.Pos((-1), (int) (byte) 0);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        model.Pos pos2 = new model.Pos(10, 0);
        model.Pos pos5 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos6 = pos5.clone();
        boolean boolean7 = pos2.equals((java.lang.Object) pos6);
        model.Pos pos8 = pos6.clone();
        int int9 = pos6.getX();
        java.lang.String str10 = pos6.toString();
        java.lang.Class<?> wildcardClass11 = pos6.getClass();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[-1, -1]" + "'", str10, "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        model.Pos pos2 = new model.Pos((int) (byte) 100, (int) (byte) 10);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos3.clone();
        java.lang.String str5 = pos3.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, 10]" + "'", str5, "[100, 10]");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos3.clone();
        model.Pos pos7 = new model.Pos(10, (int) (byte) 1);
        model.Pos pos8 = pos7.clone();
        java.lang.String str9 = pos7.toString();
        boolean boolean10 = pos4.equals((java.lang.Object) pos7);
        int int11 = pos4.getX();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 1]" + "'", str9, "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        model.Pos pos2 = new model.Pos((int) '4', 62);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        model.Pos pos2 = new model.Pos(0, (int) (short) 0);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        boolean boolean6 = pos3.equals((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos(pos2, (int) 'a', (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = pos6.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        model.Pos pos2 = new model.Pos((int) (byte) 100, 152);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, (int) '4', (int) (short) 0);
        model.Pos pos10 = new model.Pos(pos4, (int) ' ', 32);
        int int11 = pos4.getX();
        model.Pos pos14 = new model.Pos(100, 1);
        model.Pos pos15 = pos14.clone();
        int int16 = pos14.getX();
        model.Pos pos19 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos20 = pos19.clone();
        model.Pos pos23 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos26 = new model.Pos(pos23, (int) (byte) 100, 10);
        model.Pos pos29 = new model.Pos(pos26, (int) (short) -1, (int) '4');
        boolean boolean30 = pos20.equals((java.lang.Object) '4');
        model.Pos pos31 = pos20.clone();
        boolean boolean32 = pos14.equals((java.lang.Object) pos20);
        java.lang.String str33 = pos20.toString();
        boolean boolean34 = pos4.equals((java.lang.Object) pos20);
        model.Pos pos35 = pos20.clone();
        java.lang.Class<?> wildcardClass36 = pos35.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(pos20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(pos31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[-1, 32]" + "'", str33, "[-1, 32]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(pos35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        model.Pos pos2 = new model.Pos('a', (int) '#');
        int int3 = pos2.getY();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, 34, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = pos7.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        int int6 = pos2.getX();
        int int7 = pos2.getX();
        model.Pos pos10 = new model.Pos(pos2, (int) (short) -1, (int) (short) 0);
        java.lang.String str11 = pos10.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[51, 1]" + "'", str11, "[51, 1]");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        boolean boolean6 = pos2.equals((java.lang.Object) 100.0f);
        model.Pos pos7 = pos2.clone();
        model.Pos pos10 = new model.Pos(pos7, 151, 10);
        int int11 = pos10.getY();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        model.Pos pos2 = new model.Pos((int) (byte) 0, 132);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        java.lang.String str4 = pos2.toString();
        java.lang.String str5 = pos2.toString();
        int int6 = pos2.getY();
        model.Pos pos9 = new model.Pos(pos2, 132, (int) (byte) 0);
        java.lang.String str10 = pos9.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[52, 1]" + "'", str4, "[52, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[52, 1]" + "'", str5, "[52, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[184, 1]" + "'", str10, "[184, 1]");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos('a', (int) '#');
        model.Pos pos9 = new model.Pos(pos6, (int) (short) 1, 35);
        model.Pos pos12 = new model.Pos(pos6, (int) '#', 0);
        java.lang.String str13 = pos6.toString();
        model.Pos pos14 = pos6.clone();
        boolean boolean15 = pos3.equals((java.lang.Object) pos6);
        java.lang.Class<?> wildcardClass16 = pos3.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[a, 35]" + "'", str13, "[a, 35]");
        org.junit.Assert.assertNotNull(pos14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        model.Pos pos2 = new model.Pos('a', (int) (byte) 10);
        model.Pos pos3 = pos2.clone();
        java.lang.String str4 = pos2.toString();
        model.Pos pos7 = new model.Pos(pos2, 114, 11);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[a, 10]" + "'", str4, "[a, 10]");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        java.lang.String str7 = pos6.toString();
        int int8 = pos6.getY();
        java.lang.String str9 = pos6.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[52, 1]" + "'", str7, "[52, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[52, 1]" + "'", str9, "[52, 1]");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        model.Pos pos6 = new model.Pos(pos2, (int) (byte) -1, (int) (byte) -1);
        int int7 = pos6.getX();
        model.Pos pos8 = pos6.clone();
        java.lang.String str9 = pos8.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[51, 0]" + "'", str9, "[51, 0]");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        model.Pos pos2 = new model.Pos((int) '4', (int) (short) 10);
        java.lang.String str3 = pos2.toString();
        int int4 = pos2.getX();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 10]" + "'", str3, "[52, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        model.Pos pos2 = new model.Pos((int) '#', (int) (byte) 100);
        model.Pos pos5 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos6 = pos5.clone();
        int int7 = pos5.getX();
        model.Pos pos8 = pos5.clone();
        boolean boolean9 = pos2.equals((java.lang.Object) pos8);
        int int10 = pos8.getX();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos3.clone();
        model.Pos pos7 = new model.Pos(pos3, 52, 51);
        model.Pos pos10 = new model.Pos(100, (-1));
        boolean boolean11 = pos7.equals((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        model.Pos pos6 = pos5.clone();
        model.Pos pos9 = new model.Pos(pos6, 0, (int) (byte) 0);
        model.Pos pos10 = pos6.clone();
        model.Pos pos11 = pos10.clone();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertNotNull(pos10);
        org.junit.Assert.assertNotNull(pos11);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        model.Pos pos2 = new model.Pos('a', (int) '#');
        model.Pos pos5 = new model.Pos(pos2, (int) (short) 1, 35);
        model.Pos pos8 = new model.Pos(pos2, (int) '#', 0);
        java.lang.String str9 = pos2.toString();
        int int10 = pos2.getX();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[a, 35]" + "'", str9, "[a, 35]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        boolean boolean7 = pos5.equals((java.lang.Object) (byte) -1);
        model.Pos pos8 = pos5.clone();
        model.Pos pos9 = pos8.clone();
        int int10 = pos8.getY();
        java.lang.String str11 = pos8.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(pos9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0, -1]" + "'", str11, "[0, -1]");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        java.lang.String str5 = pos3.toString();
        model.Pos pos6 = pos3.clone();
        int int7 = pos6.getX();
        model.Pos pos10 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean12 = pos10.equals((java.lang.Object) (-1L));
        boolean boolean14 = pos10.equals((java.lang.Object) 100.0d);
        model.Pos pos15 = pos10.clone();
        model.Pos pos18 = new model.Pos((int) (byte) 100, (int) (byte) 1);
        int int19 = pos18.getX();
        boolean boolean20 = pos15.equals((java.lang.Object) int19);
        boolean boolean21 = pos6.equals((java.lang.Object) boolean20);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, 1]" + "'", str5, "[100, 1]");
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        model.Pos pos9 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str10 = pos9.toString();
        model.Pos pos13 = new model.Pos(10, (int) (byte) 1);
        model.Pos pos14 = pos13.clone();
        boolean boolean15 = pos9.equals((java.lang.Object) pos13);
        model.Pos pos18 = new model.Pos(pos13, 0, 0);
        boolean boolean19 = pos6.equals((java.lang.Object) 0);
        int int20 = pos6.getX();
        int int21 = pos6.getY();
        java.lang.String str22 = pos6.toString();
        java.lang.Class<?> wildcardClass23 = pos6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[52, 1]" + "'", str10, "[52, 1]");
        org.junit.Assert.assertNotNull(pos14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[52, 1]" + "'", str22, "[52, 1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos(pos2, (int) 'a', (int) (short) 0);
        int int7 = pos2.getY();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        model.Pos pos2 = new model.Pos(1, (int) (short) 0);
        model.Pos pos5 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos8 = new model.Pos(pos5, 1, 0);
        boolean boolean10 = pos8.equals((java.lang.Object) (byte) -1);
        model.Pos pos11 = pos8.clone();
        model.Pos pos12 = pos8.clone();
        int int13 = pos8.getX();
        java.lang.Class<?> wildcardClass14 = pos8.getClass();
        boolean boolean15 = pos2.equals((java.lang.Object) pos8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        model.Pos pos2 = new model.Pos((int) '#', (-1));
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        model.Pos pos2 = new model.Pos((int) ' ', (int) (short) 0);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        java.lang.Class<?> wildcardClass5 = pos2.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        model.Pos pos2 = new model.Pos('a', (int) '#');
        int int3 = pos2.getY();
        model.Pos pos4 = pos2.clone();
        int int5 = pos4.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        model.Pos pos2 = new model.Pos(0, (int) (short) 10);
        model.Pos pos5 = new model.Pos(pos2, 35, (int) (short) -1);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        model.Pos pos2 = new model.Pos('a', 34);
        java.lang.String str3 = pos2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[a, 34]" + "'", str3, "[a, 34]");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        boolean boolean6 = pos2.equals((java.lang.Object) 100.0f);
        model.Pos pos9 = new model.Pos(pos2, (int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = pos2.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        java.lang.String str6 = pos3.toString();
        int int7 = pos3.getY();
        model.Pos pos8 = pos3.clone();
        int int9 = pos3.getY();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[52, 1]" + "'", str6, "[52, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, (int) '4', (int) (short) 0);
        model.Pos pos8 = pos7.clone();
        model.Pos pos11 = new model.Pos((int) (short) -1, (int) (byte) -1);
        boolean boolean12 = pos7.equals((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass13 = pos7.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        model.Pos pos6 = new model.Pos(pos2, (int) (byte) -1, (int) (byte) -1);
        int int7 = pos2.getX();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        model.Pos pos2 = new model.Pos((int) '4', (int) (short) 0);
        model.Pos pos5 = new model.Pos(pos2, (int) (byte) 10, 52);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        boolean boolean7 = pos5.equals((java.lang.Object) (byte) -1);
        model.Pos pos8 = pos5.clone();
        model.Pos pos9 = pos5.clone();
        int int10 = pos9.getX();
        model.Pos pos13 = new model.Pos(pos9, 66, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = pos9.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(pos9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        int int7 = pos6.getX();
        java.lang.String str8 = pos6.toString();
        model.Pos pos11 = new model.Pos(pos6, (int) (short) 0, (int) 'a');
        model.Pos pos12 = pos11.clone();
        model.Pos pos15 = new model.Pos(pos11, 62, 66);
        model.Pos pos18 = new model.Pos((int) (byte) -1, 1);
        boolean boolean19 = pos11.equals((java.lang.Object) 1);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[52, 1]" + "'", str8, "[52, 1]");
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        model.Pos pos6 = new model.Pos(pos2, (int) (byte) -1, (int) (byte) -1);
        model.Pos pos7 = pos6.clone();
        model.Pos pos10 = new model.Pos(pos7, (int) (short) 100, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertNotNull(pos7);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, (int) '4', (int) (short) 0);
        model.Pos pos10 = new model.Pos(pos4, (int) ' ', 32);
        model.Pos pos11 = pos10.clone();
        model.Pos pos14 = new model.Pos(pos10, 2, 0);
        java.lang.Class<?> wildcardClass15 = pos14.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        java.lang.String str7 = pos6.toString();
        int int8 = pos6.getY();
        model.Pos pos9 = pos6.clone();
        int int10 = pos6.getY();
        java.lang.String str11 = pos6.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[52, 1]" + "'", str7, "[52, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(pos9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[52, 1]" + "'", str11, "[52, 1]");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos8 = new model.Pos(pos3, 32, (int) '4');
        java.lang.Class<?> wildcardClass9 = pos3.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        model.Pos pos2 = new model.Pos((int) '4', (int) (short) 0);
        model.Pos pos5 = new model.Pos(pos2, (int) (short) 1, 52);
        java.lang.String str6 = pos2.toString();
        model.Pos pos9 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos10 = pos9.clone();
        model.Pos pos13 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos16 = new model.Pos(pos13, (int) (byte) 100, 10);
        model.Pos pos19 = new model.Pos(pos16, (int) (short) -1, (int) '4');
        boolean boolean20 = pos10.equals((java.lang.Object) '4');
        int int21 = pos10.getY();
        boolean boolean22 = pos2.equals((java.lang.Object) pos10);
        int int23 = pos2.getY();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[52, 0]" + "'", str6, "[52, 0]");
        org.junit.Assert.assertNotNull(pos10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        int int5 = pos2.getX();
        int int6 = pos2.getX();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        model.Pos pos2 = new model.Pos(66, 152);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos('a', (int) '#');
        model.Pos pos9 = new model.Pos(pos6, (int) (short) 1, 35);
        model.Pos pos12 = new model.Pos(pos6, (int) '#', 0);
        java.lang.String str13 = pos6.toString();
        model.Pos pos14 = pos6.clone();
        boolean boolean15 = pos3.equals((java.lang.Object) pos6);
        int int16 = pos6.getX();
        model.Pos pos19 = new model.Pos(0, (int) (short) 10);
        int int20 = pos19.getY();
        model.Pos pos23 = new model.Pos(pos19, (int) ' ', 36);
        boolean boolean24 = pos6.equals((java.lang.Object) pos19);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[a, 35]" + "'", str13, "[a, 35]");
        org.junit.Assert.assertNotNull(pos14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean4 = pos2.equals((java.lang.Object) (-1L));
        boolean boolean6 = pos2.equals((java.lang.Object) 100.0d);
        model.Pos pos7 = pos2.clone();
        java.lang.String str8 = pos2.toString();
        java.lang.String str9 = pos2.toString();
        model.Pos pos12 = new model.Pos((int) '4', (int) (short) 0);
        model.Pos pos15 = new model.Pos(100, 1);
        model.Pos pos16 = pos15.clone();
        int int17 = pos15.getX();
        model.Pos pos18 = pos15.clone();
        boolean boolean19 = pos12.equals((java.lang.Object) pos15);
        model.Pos pos22 = new model.Pos((int) (short) 100, (int) (short) 1);
        boolean boolean23 = pos12.equals((java.lang.Object) (short) 100);
        model.Pos pos26 = new model.Pos(pos12, (int) (byte) 100, 51);
        model.Pos pos27 = pos12.clone();
        model.Pos pos28 = pos12.clone();
        java.lang.Class<?> wildcardClass29 = pos28.getClass();
        boolean boolean30 = pos2.equals((java.lang.Object) pos28);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[-1, 1]" + "'", str8, "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[-1, 1]" + "'", str9, "[-1, 1]");
        org.junit.Assert.assertNotNull(pos16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(pos18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pos27);
        org.junit.Assert.assertNotNull(pos28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        java.lang.String str6 = pos3.toString();
        int int7 = pos3.getY();
        model.Pos pos8 = pos3.clone();
        java.lang.Class<?> wildcardClass9 = pos8.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[52, 1]" + "'", str6, "[52, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        model.Pos pos2 = new model.Pos(10, 0);
        model.Pos pos5 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos6 = pos5.clone();
        boolean boolean7 = pos2.equals((java.lang.Object) pos6);
        java.lang.String str8 = pos2.toString();
        java.lang.String str9 = pos2.toString();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[10, 0]" + "'", str8, "[10, 0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        model.Pos pos2 = new model.Pos((int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        model.Pos pos2 = new model.Pos('a', (int) '#');
        model.Pos pos5 = new model.Pos(pos2, (int) (short) 1, 35);
        model.Pos pos8 = new model.Pos(pos2, (int) '#', 0);
        java.lang.String str9 = pos2.toString();
        model.Pos pos12 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos13 = pos12.clone();
        boolean boolean14 = pos2.equals((java.lang.Object) pos12);
        int int15 = pos2.getX();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[a, 35]" + "'", str9, "[a, 35]");
        org.junit.Assert.assertNotNull(pos13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        java.lang.String str4 = pos3.toString();
        model.Pos pos5 = pos3.clone();
        int int6 = pos5.getY();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[-1, 1]" + "'", str4, "[-1, 1]");
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', 114);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        model.Pos pos2 = new model.Pos(11, 66);
        java.lang.String str3 = pos2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[11, 66]" + "'", str3, "[11, 66]");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        model.Pos pos9 = new model.Pos(pos6, 0, 10);
        int int10 = pos9.getX();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        model.Pos pos6 = pos5.clone();
        model.Pos pos9 = new model.Pos(pos6, 0, (int) (byte) 0);
        int int10 = pos6.getX();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        boolean boolean7 = pos5.equals((java.lang.Object) (byte) -1);
        model.Pos pos8 = pos5.clone();
        model.Pos pos9 = pos5.clone();
        int int10 = pos9.getX();
        int int11 = pos9.getX();
        model.Pos pos12 = pos9.clone();
        model.Pos pos15 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos18 = new model.Pos(pos15, 1, 0);
        boolean boolean20 = pos18.equals((java.lang.Object) (byte) -1);
        model.Pos pos21 = pos18.clone();
        model.Pos pos24 = new model.Pos(pos21, 52, 151);
        boolean boolean25 = pos12.equals((java.lang.Object) 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(pos9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(pos21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        model.Pos pos2 = new model.Pos((int) '4', (int) (short) 0);
        model.Pos pos5 = new model.Pos(pos2, (int) (short) 1, 52);
        java.lang.String str6 = pos2.toString();
        int int7 = pos2.getY();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[52, 0]" + "'", str6, "[52, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        model.Pos pos2 = new model.Pos('a', (int) (byte) 10);
        int int3 = pos2.getX();
        int int4 = pos2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        model.Pos pos6 = new model.Pos(pos2, (int) (byte) -1, (int) (byte) -1);
        model.Pos pos9 = new model.Pos(pos6, (int) (short) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = pos6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        java.lang.String str7 = pos2.toString();
        model.Pos pos10 = new model.Pos(100, 1);
        model.Pos pos11 = pos10.clone();
        model.Pos pos12 = pos10.clone();
        boolean boolean14 = pos10.equals((java.lang.Object) 100.0f);
        model.Pos pos17 = new model.Pos(pos10, (int) (byte) -1, (int) (byte) -1);
        boolean boolean18 = pos2.equals((java.lang.Object) pos17);
        int int19 = pos17.getY();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[52, 1]" + "'", str7, "[52, 1]");
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        model.Pos pos2 = new model.Pos((int) (short) 100, 51);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        java.lang.String str6 = pos5.toString();
        java.lang.String str7 = pos5.toString();
        java.lang.String str8 = pos5.toString();
        model.Pos pos11 = new model.Pos(100, 1);
        model.Pos pos12 = pos11.clone();
        model.Pos pos13 = pos11.clone();
        model.Pos pos16 = new model.Pos(pos13, (int) '4', (int) (short) 0);
        model.Pos pos19 = new model.Pos(pos13, (int) ' ', 32);
        int int20 = pos13.getX();
        model.Pos pos23 = new model.Pos(100, 1);
        model.Pos pos24 = pos23.clone();
        int int25 = pos23.getX();
        model.Pos pos28 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos29 = pos28.clone();
        model.Pos pos32 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos35 = new model.Pos(pos32, (int) (byte) 100, 10);
        model.Pos pos38 = new model.Pos(pos35, (int) (short) -1, (int) '4');
        boolean boolean39 = pos29.equals((java.lang.Object) '4');
        model.Pos pos40 = pos29.clone();
        boolean boolean41 = pos23.equals((java.lang.Object) pos29);
        java.lang.String str42 = pos29.toString();
        boolean boolean43 = pos13.equals((java.lang.Object) pos29);
        boolean boolean44 = pos5.equals((java.lang.Object) pos13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0, -1]" + "'", str6, "[0, -1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, -1]" + "'", str7, "[0, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, -1]" + "'", str8, "[0, -1]");
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertNotNull(pos13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(pos24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(pos29);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(pos40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[-1, 32]" + "'", str42, "[-1, 32]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        model.Pos pos2 = new model.Pos('a', (int) '#');
        model.Pos pos5 = new model.Pos(pos2, (int) (short) 1, 35);
        model.Pos pos8 = new model.Pos(pos2, (int) '#', 0);
        java.lang.String str9 = pos2.toString();
        model.Pos pos12 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos13 = pos12.clone();
        boolean boolean14 = pos2.equals((java.lang.Object) pos12);
        int int15 = pos12.getY();
        model.Pos pos18 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean20 = pos18.equals((java.lang.Object) (-1L));
        int int21 = pos18.getY();
        java.lang.String str22 = pos18.toString();
        boolean boolean23 = pos12.equals((java.lang.Object) str22);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[a, 35]" + "'", str9, "[a, 35]");
        org.junit.Assert.assertNotNull(pos13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[-1, 1]" + "'", str22, "[-1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos(100, 1);
        model.Pos pos7 = pos6.clone();
        model.Pos pos8 = pos6.clone();
        model.Pos pos11 = new model.Pos(pos8, (int) '4', (int) (short) 0);
        model.Pos pos12 = pos11.clone();
        boolean boolean13 = pos3.equals((java.lang.Object) pos11);
        model.Pos pos16 = new model.Pos(pos11, 11, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = pos11.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        model.Pos pos2 = new model.Pos(0, (int) (short) 10);
        int int3 = pos2.getY();
        java.lang.Class<?> wildcardClass4 = pos2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, (int) '4', (int) (short) 0);
        model.Pos pos10 = new model.Pos(pos4, (int) ' ', 32);
        model.Pos pos11 = pos10.clone();
        model.Pos pos14 = new model.Pos(pos10, 2, 0);
        model.Pos pos17 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str18 = pos17.toString();
        model.Pos pos21 = new model.Pos(10, (int) (byte) 1);
        model.Pos pos22 = pos21.clone();
        boolean boolean23 = pos17.equals((java.lang.Object) pos21);
        model.Pos pos26 = new model.Pos(pos21, 0, 0);
        boolean boolean27 = pos10.equals((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[52, 1]" + "'", str18, "[52, 1]");
        org.junit.Assert.assertNotNull(pos22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        java.lang.String str5 = pos2.toString();
        java.lang.Class<?> wildcardClass6 = pos2.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, 1]" + "'", str5, "[100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        model.Pos pos6 = pos5.clone();
        model.Pos pos7 = pos6.clone();
        java.lang.String str8 = pos6.toString();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, -1]" + "'", str8, "[0, -1]");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, (int) '4', (int) (short) 0);
        model.Pos pos10 = new model.Pos(pos4, (int) ' ', 32);
        int int11 = pos4.getX();
        model.Pos pos14 = new model.Pos(100, 1);
        model.Pos pos15 = pos14.clone();
        int int16 = pos14.getX();
        model.Pos pos19 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos20 = pos19.clone();
        model.Pos pos23 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos26 = new model.Pos(pos23, (int) (byte) 100, 10);
        model.Pos pos29 = new model.Pos(pos26, (int) (short) -1, (int) '4');
        boolean boolean30 = pos20.equals((java.lang.Object) '4');
        model.Pos pos31 = pos20.clone();
        boolean boolean32 = pos14.equals((java.lang.Object) pos20);
        java.lang.String str33 = pos20.toString();
        boolean boolean34 = pos4.equals((java.lang.Object) pos20);
        model.Pos pos37 = new model.Pos((int) ' ', (int) (short) 0);
        model.Pos pos38 = pos37.clone();
        model.Pos pos39 = pos37.clone();
        boolean boolean40 = pos20.equals((java.lang.Object) pos37);
        int int41 = pos20.getX();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(pos20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(pos31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[-1, 32]" + "'", str33, "[-1, 32]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(pos38);
        org.junit.Assert.assertNotNull(pos39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        model.Pos pos2 = new model.Pos(10, 152);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos3.clone();
        model.Pos pos7 = new model.Pos(10, (int) (byte) 1);
        model.Pos pos8 = pos7.clone();
        java.lang.String str9 = pos7.toString();
        boolean boolean10 = pos4.equals((java.lang.Object) pos7);
        java.lang.String str11 = pos4.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 1]" + "'", str9, "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[52, 1]" + "'", str11, "[52, 1]");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        int int3 = pos2.getX();
        java.lang.String str4 = pos2.toString();
        int int5 = pos2.getX();
        model.Pos pos6 = pos2.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[-1, 1]" + "'", str4, "[-1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(pos6);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        model.Pos pos6 = new model.Pos(10, (int) (byte) 1);
        model.Pos pos7 = pos6.clone();
        boolean boolean8 = pos2.equals((java.lang.Object) pos6);
        model.Pos pos11 = new model.Pos(pos6, 0, 0);
        boolean boolean13 = pos6.equals((java.lang.Object) "[152, 51]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        boolean boolean6 = pos2.equals((java.lang.Object) 100.0f);
        model.Pos pos7 = pos2.clone();
        int int8 = pos2.getX();
        java.lang.Class<?> wildcardClass9 = pos2.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, (int) '4', (int) (short) 0);
        model.Pos pos10 = new model.Pos(pos4, (int) ' ', 32);
        model.Pos pos11 = pos10.clone();
        java.lang.Class<?> wildcardClass12 = pos10.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        model.Pos pos2 = new model.Pos(114, 66);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        model.Pos pos2 = new model.Pos(0, (int) 'a');
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        int int7 = pos2.getX();
        java.lang.String str8 = pos2.toString();
        model.Pos pos9 = pos2.clone();
        int int10 = pos2.getX();
        java.lang.Class<?> wildcardClass11 = pos2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[52, 1]" + "'", str8, "[52, 1]");
        org.junit.Assert.assertNotNull(pos9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos3.clone();
        model.Pos pos7 = new model.Pos((int) (short) -1, (int) (byte) 1);
        int int8 = pos7.getX();
        boolean boolean9 = pos4.equals((java.lang.Object) int8);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        java.lang.String str4 = pos2.toString();
        java.lang.String str5 = pos2.toString();
        int int6 = pos2.getY();
        java.lang.String str7 = pos2.toString();
        model.Pos pos10 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos13 = new model.Pos(pos10, 1, 0);
        boolean boolean15 = pos13.equals((java.lang.Object) (byte) -1);
        model.Pos pos16 = pos13.clone();
        boolean boolean17 = pos2.equals((java.lang.Object) pos13);
        boolean boolean19 = pos2.equals((java.lang.Object) 114);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[52, 1]" + "'", str4, "[52, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[52, 1]" + "'", str5, "[52, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[52, 1]" + "'", str7, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(pos16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        java.lang.String str6 = pos2.toString();
        model.Pos pos9 = new model.Pos(pos2, 62, 32);
        model.Pos pos10 = pos9.clone();
        java.lang.Class<?> wildcardClass11 = pos10.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[-1, -1]" + "'", str6, "[-1, -1]");
        org.junit.Assert.assertNotNull(pos10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        boolean boolean7 = pos5.equals((java.lang.Object) (byte) -1);
        model.Pos pos8 = pos5.clone();
        model.Pos pos9 = pos8.clone();
        model.Pos pos12 = new model.Pos(100, 1);
        model.Pos pos13 = pos12.clone();
        model.Pos pos16 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean18 = pos16.equals((java.lang.Object) (-1L));
        model.Pos pos19 = pos16.clone();
        int int20 = pos19.getY();
        int int21 = pos19.getX();
        boolean boolean22 = pos13.equals((java.lang.Object) pos19);
        boolean boolean23 = pos8.equals((java.lang.Object) pos19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(pos9);
        org.junit.Assert.assertNotNull(pos13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(pos19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos2.getX();
        java.lang.String str5 = pos2.toString();
        model.Pos pos6 = pos2.clone();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, 1]" + "'", str5, "[100, 1]");
        org.junit.Assert.assertNotNull(pos6);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        model.Pos pos2 = new model.Pos((int) (byte) -1, (int) ' ');
        int int3 = pos2.getX();
        java.lang.String str4 = pos2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[-1, 32]" + "'", str4, "[-1, 32]");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        model.Pos pos2 = new model.Pos((int) ' ', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos(100, 1);
        model.Pos pos7 = pos6.clone();
        model.Pos pos8 = pos6.clone();
        model.Pos pos11 = new model.Pos(pos8, (int) '4', (int) (short) 0);
        model.Pos pos14 = new model.Pos(pos8, (int) ' ', 32);
        model.Pos pos15 = pos14.clone();
        boolean boolean16 = pos2.equals((java.lang.Object) pos15);
        model.Pos pos19 = new model.Pos(100, 1);
        model.Pos pos20 = pos19.clone();
        int int21 = pos20.getY();
        model.Pos pos22 = pos20.clone();
        boolean boolean23 = pos2.equals((java.lang.Object) pos22);
        java.lang.String str24 = pos22.toString();
        int int25 = pos22.getY();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(pos20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(pos22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[100, 1]" + "'", str24, "[100, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        model.Pos pos2 = new model.Pos(151, 11);
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        java.lang.String str4 = pos2.toString();
        java.lang.String str5 = pos2.toString();
        int int6 = pos2.getY();
        model.Pos pos9 = new model.Pos(pos2, 132, (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = pos9.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[52, 1]" + "'", str4, "[52, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[52, 1]" + "'", str5, "[52, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        model.Pos pos2 = new model.Pos(114, 63);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        model.Pos pos2 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos9 = new model.Pos(pos6, (int) (byte) 100, 10);
        model.Pos pos12 = new model.Pos(pos9, (int) (short) -1, (int) '4');
        boolean boolean13 = pos3.equals((java.lang.Object) '4');
        int int14 = pos3.getY();
        model.Pos pos15 = pos3.clone();
        model.Pos pos18 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos21 = new model.Pos(pos18, 1, 0);
        model.Pos pos24 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos27 = new model.Pos(pos24, 1, 0);
        model.Pos pos28 = pos27.clone();
        boolean boolean29 = pos18.equals((java.lang.Object) pos28);
        java.lang.String str30 = pos18.toString();
        boolean boolean31 = pos15.equals((java.lang.Object) str30);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertNotNull(pos28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[-1, -1]" + "'", str30, "[-1, -1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, (int) '4', (int) (short) 0);
        model.Pos pos10 = new model.Pos(pos4, (int) ' ', 32);
        model.Pos pos11 = pos10.clone();
        model.Pos pos14 = new model.Pos('a', 0);
        boolean boolean15 = pos10.equals((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        model.Pos pos2 = new model.Pos((int) ' ', (int) ' ');
        java.lang.String str3 = pos2.toString();
        int int4 = pos2.getX();
        java.lang.Class<?> wildcardClass5 = pos2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[32, 32]" + "'", str3, "[32, 32]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        int int3 = pos2.getX();
        java.lang.Class<?> wildcardClass4 = pos2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        model.Pos pos2 = new model.Pos(51, 98);
        int int3 = pos2.getY();
        java.lang.String str4 = pos2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[51, 98]" + "'", str4, "[51, 98]");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        model.Pos pos5 = pos3.clone();
        model.Pos pos6 = pos3.clone();
        java.lang.String str7 = pos6.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100, 1]" + "'", str7, "[100, 1]");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        model.Pos pos9 = new model.Pos(pos3, (int) (byte) 10, (int) (byte) 1);
        model.Pos pos12 = new model.Pos(pos9, (int) (short) 10, 32);
        model.Pos pos15 = new model.Pos(pos12, (int) ' ', (int) (short) 10);
        int int16 = pos12.getY();
        int int17 = pos12.getY();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 34 + "'", int17 == 34);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        model.Pos pos8 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos11 = new model.Pos(pos8, 1, 0);
        model.Pos pos12 = pos11.clone();
        boolean boolean13 = pos2.equals((java.lang.Object) pos12);
        java.lang.String str14 = pos2.toString();
        java.lang.String str15 = pos2.toString();
        model.Pos pos16 = pos2.clone();
        model.Pos pos19 = new model.Pos(pos16, 51, (-1));
        java.lang.String str20 = pos19.toString();
        java.lang.Class<?> wildcardClass21 = pos19.getClass();
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[-1, -1]" + "'", str14, "[-1, -1]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[-1, -1]" + "'", str15, "[-1, -1]");
        org.junit.Assert.assertNotNull(pos16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[50, -2]" + "'", str20, "[50, -2]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        model.Pos pos2 = new model.Pos(114, (int) '#');
        java.lang.String str3 = pos2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[114, 35]" + "'", str3, "[114, 35]");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        model.Pos pos2 = new model.Pos((int) (short) 0, 52);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos(pos2, (int) (byte) -1, (int) (short) 1);
        java.lang.String str7 = pos2.toString();
        java.lang.String str8 = pos2.toString();
        java.lang.Class<?> wildcardClass9 = pos2.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 52]" + "'", str7, "[0, 52]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 52]" + "'", str8, "[0, 52]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        model.Pos pos8 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos11 = new model.Pos(pos8, 1, 0);
        model.Pos pos12 = pos11.clone();
        boolean boolean13 = pos2.equals((java.lang.Object) pos12);
        java.lang.String str14 = pos2.toString();
        int int15 = pos2.getX();
        int int16 = pos2.getX();
        int int17 = pos2.getY();
        model.Pos pos20 = new model.Pos(pos2, 66, 35);
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[-1, -1]" + "'", str14, "[-1, -1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        model.Pos pos2 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos9 = new model.Pos(pos6, (int) (byte) 100, 10);
        model.Pos pos12 = new model.Pos(pos9, (int) (short) -1, (int) '4');
        boolean boolean13 = pos3.equals((java.lang.Object) '4');
        int int14 = pos3.getY();
        int int15 = pos3.getY();
        int int16 = pos3.getX();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean4 = pos2.equals((java.lang.Object) (-1L));
        boolean boolean6 = pos2.equals((java.lang.Object) 100.0d);
        model.Pos pos7 = pos2.clone();
        model.Pos pos10 = new model.Pos(10, (int) (byte) 1);
        model.Pos pos11 = pos10.clone();
        int int12 = pos10.getX();
        boolean boolean13 = pos7.equals((java.lang.Object) int12);
        boolean boolean15 = pos7.equals((java.lang.Object) "[52, 98]");
        int int16 = pos7.getY();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        model.Pos pos2 = new model.Pos((int) (short) -1, 0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        model.Pos pos2 = new model.Pos(0, (int) (short) 10);
        int int3 = pos2.getY();
        model.Pos pos6 = new model.Pos(pos2, (int) ' ', 36);
        int int7 = pos6.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 46 + "'", int7 == 46);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        int int7 = pos6.getX();
        java.lang.String str8 = pos6.toString();
        model.Pos pos11 = new model.Pos(pos6, (int) (short) 0, (int) 'a');
        model.Pos pos12 = pos11.clone();
        model.Pos pos15 = new model.Pos(pos11, (int) (short) 10, (int) 'a');
        model.Pos pos18 = new model.Pos(100, 1);
        model.Pos pos19 = pos18.clone();
        java.lang.String str20 = pos19.toString();
        model.Pos pos23 = new model.Pos(pos19, 11, (int) (short) 0);
        boolean boolean24 = pos15.equals((java.lang.Object) 11);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[52, 1]" + "'", str8, "[52, 1]");
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertNotNull(pos19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[100, 1]" + "'", str20, "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        model.Pos pos0 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos3 = new model.Pos(pos0, 98, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: pos may not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        model.Pos pos5 = pos3.clone();
        model.Pos pos6 = pos3.clone();
        java.lang.Class<?> wildcardClass7 = pos3.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        model.Pos pos2 = new model.Pos((int) (byte) 0, 100);
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        model.Pos pos6 = new model.Pos(pos2, (int) (byte) 0, (int) (byte) 1);
        int int7 = pos6.getX();
        model.Pos pos10 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str11 = pos10.toString();
        boolean boolean13 = pos10.equals((java.lang.Object) 10.0d);
        model.Pos pos14 = pos10.clone();
        model.Pos pos17 = new model.Pos(pos14, 0, 10);
        boolean boolean18 = pos6.equals((java.lang.Object) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[52, 1]" + "'", str11, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pos14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        model.Pos pos8 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos11 = new model.Pos(pos8, 1, 0);
        model.Pos pos12 = pos11.clone();
        boolean boolean13 = pos2.equals((java.lang.Object) pos12);
        java.lang.String str14 = pos2.toString();
        int int15 = pos2.getX();
        model.Pos pos18 = new model.Pos(pos2, (int) (short) 10, 114);
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[-1, -1]" + "'", str14, "[-1, -1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        model.Pos pos2 = new model.Pos((int) '#', (int) '4');
        java.lang.String str3 = pos2.toString();
        int int4 = pos2.getY();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[35, 52]" + "'", str3, "[35, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean4 = pos2.equals((java.lang.Object) (-1L));
        boolean boolean6 = pos2.equals((java.lang.Object) 100.0d);
        model.Pos pos7 = pos2.clone();
        model.Pos pos10 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos11 = pos10.clone();
        boolean boolean13 = pos11.equals((java.lang.Object) 1.0d);
        model.Pos pos14 = pos11.clone();
        model.Pos pos15 = pos14.clone();
        int int16 = pos14.getY();
        boolean boolean17 = pos2.equals((java.lang.Object) pos14);
        int int18 = pos2.getX();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pos14);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        model.Pos pos2 = new model.Pos((int) ' ', (int) (byte) 1);
        model.Pos pos5 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str6 = pos5.toString();
        model.Pos pos9 = new model.Pos(pos5, (int) (byte) -1, (int) (byte) -1);
        model.Pos pos12 = new model.Pos(pos9, (int) (short) 100, (int) (byte) 100);
        int int13 = pos12.getY();
        boolean boolean14 = pos2.equals((java.lang.Object) pos12);
        model.Pos pos17 = new model.Pos(pos2, 10, 151);
        int int18 = pos17.getY();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[52, 1]" + "'", str6, "[52, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 152 + "'", int18 == 152);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        model.Pos pos2 = new model.Pos((int) (short) 0, (int) '#');
        int int3 = pos2.getY();
        int int4 = pos2.getX();
        java.lang.String str5 = pos2.toString();
        int int6 = pos2.getY();
        int int7 = pos2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0, 35]" + "'", str5, "[0, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos8 = new model.Pos(pos3, 32, (int) '4');
        model.Pos pos11 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos12 = pos11.clone();
        boolean boolean14 = pos12.equals((java.lang.Object) 1.0d);
        model.Pos pos15 = pos12.clone();
        model.Pos pos18 = new model.Pos(pos12, (int) (byte) 10, (int) (byte) 1);
        model.Pos pos21 = new model.Pos(pos18, (int) (short) 10, 32);
        model.Pos pos24 = new model.Pos(pos21, (int) ' ', (int) (short) 10);
        boolean boolean25 = pos8.equals((java.lang.Object) pos21);
        java.lang.String str26 = pos8.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[84, 53]" + "'", str26, "[84, 53]");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        model.Pos pos2 = new model.Pos((int) ' ', (int) ' ');
        java.lang.String str3 = pos2.toString();
        int int4 = pos2.getX();
        boolean boolean6 = pos2.equals((java.lang.Object) 34);
        java.lang.Class<?> wildcardClass7 = pos2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[32, 32]" + "'", str3, "[32, 32]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        model.Pos pos2 = new model.Pos((int) (short) 0, (int) 'a');
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        model.Pos pos2 = new model.Pos('a', (int) (byte) 100);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos7 = pos6.clone();
        model.Pos pos10 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos13 = new model.Pos(pos10, (int) (byte) 100, 10);
        model.Pos pos16 = new model.Pos(pos13, (int) (short) -1, (int) '4');
        boolean boolean17 = pos7.equals((java.lang.Object) '4');
        int int18 = pos7.getY();
        model.Pos pos19 = pos7.clone();
        boolean boolean20 = pos2.equals((java.lang.Object) pos7);
        java.lang.String str21 = pos7.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(pos19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[-1, 32]" + "'", str21, "[-1, 32]");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, (int) '4', (int) (short) 0);
        model.Pos pos10 = new model.Pos(pos4, (int) ' ', 32);
        int int11 = pos4.getY();
        model.Pos pos12 = pos4.clone();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(pos12);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        model.Pos pos2 = new model.Pos(66, 51);
        model.Pos pos5 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos8 = new model.Pos(pos5, 1, 0);
        model.Pos pos11 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos14 = new model.Pos(pos11, 1, 0);
        model.Pos pos15 = pos14.clone();
        boolean boolean16 = pos5.equals((java.lang.Object) pos15);
        java.lang.String str17 = pos5.toString();
        java.lang.String str18 = pos5.toString();
        int int19 = pos5.getX();
        model.Pos pos22 = new model.Pos(0, 0);
        boolean boolean23 = pos5.equals((java.lang.Object) pos22);
        int int24 = pos5.getY();
        boolean boolean25 = pos2.equals((java.lang.Object) int24);
        int int26 = pos2.getY();
        model.Pos pos27 = pos2.clone();
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[-1, -1]" + "'", str17, "[-1, -1]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[-1, -1]" + "'", str18, "[-1, -1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 51 + "'", int26 == 51);
        org.junit.Assert.assertNotNull(pos27);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        model.Pos pos2 = new model.Pos('a', (int) (byte) 100);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos7 = pos6.clone();
        model.Pos pos10 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos13 = new model.Pos(pos10, (int) (byte) 100, 10);
        model.Pos pos16 = new model.Pos(pos13, (int) (short) -1, (int) '4');
        boolean boolean17 = pos7.equals((java.lang.Object) '4');
        int int18 = pos7.getY();
        model.Pos pos19 = pos7.clone();
        boolean boolean20 = pos2.equals((java.lang.Object) pos7);
        java.lang.String str21 = pos2.toString();
        java.lang.String str22 = pos2.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(pos19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[a, 100]" + "'", str21, "[a, 100]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[a, 100]" + "'", str22, "[a, 100]");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        boolean boolean7 = pos5.equals((java.lang.Object) (byte) -1);
        model.Pos pos8 = pos5.clone();
        model.Pos pos9 = pos8.clone();
        java.lang.String str10 = pos9.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(pos9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, -1]" + "'", str10, "[0, -1]");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean4 = pos2.equals((java.lang.Object) (-1L));
        model.Pos pos5 = pos2.clone();
        int int6 = pos5.getY();
        model.Pos pos9 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str10 = pos9.toString();
        model.Pos pos13 = new model.Pos(pos9, (int) (byte) -1, (int) (byte) -1);
        model.Pos pos16 = new model.Pos(pos13, (int) (short) 100, (int) (byte) 100);
        java.lang.String str17 = pos16.toString();
        model.Pos pos18 = pos16.clone();
        boolean boolean19 = pos5.equals((java.lang.Object) pos16);
        model.Pos pos22 = new model.Pos((int) (short) 0, (int) '#');
        boolean boolean23 = pos5.equals((java.lang.Object) (short) 0);
        int int24 = pos5.getX();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[52, 1]" + "'", str10, "[52, 1]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[151, 100]" + "'", str17, "[151, 100]");
        org.junit.Assert.assertNotNull(pos18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        int int7 = pos2.getX();
        java.lang.String str8 = pos2.toString();
        model.Pos pos9 = pos2.clone();
        model.Pos pos12 = new model.Pos(100, 1);
        model.Pos pos13 = pos12.clone();
        model.Pos pos14 = pos12.clone();
        java.lang.Class<?> wildcardClass15 = pos12.getClass();
        boolean boolean16 = pos9.equals((java.lang.Object) pos12);
        int int17 = pos9.getY();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[52, 1]" + "'", str8, "[52, 1]");
        org.junit.Assert.assertNotNull(pos9);
        org.junit.Assert.assertNotNull(pos13);
        org.junit.Assert.assertNotNull(pos14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        model.Pos pos9 = new model.Pos(pos3, (int) (byte) 10, (int) (byte) 1);
        int int10 = pos9.getY();
        int int11 = pos9.getX();
        model.Pos pos14 = new model.Pos(100, 1);
        model.Pos pos15 = pos14.clone();
        int int16 = pos15.getY();
        java.lang.String str17 = pos15.toString();
        model.Pos pos18 = pos15.clone();
        int int19 = pos18.getX();
        int int20 = pos18.getY();
        java.lang.String str21 = pos18.toString();
        model.Pos pos22 = pos18.clone();
        boolean boolean23 = pos9.equals((java.lang.Object) pos22);
        java.lang.Class<?> wildcardClass24 = pos22.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 62 + "'", int11 == 62);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[100, 1]" + "'", str17, "[100, 1]");
        org.junit.Assert.assertNotNull(pos18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[100, 1]" + "'", str21, "[100, 1]");
        org.junit.Assert.assertNotNull(pos22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        model.Pos pos2 = new model.Pos(10, 0);
        model.Pos pos5 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos6 = pos5.clone();
        boolean boolean7 = pos2.equals((java.lang.Object) pos6);
        java.lang.String str8 = pos2.toString();
        java.lang.Class<?> wildcardClass9 = pos2.getClass();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[10, 0]" + "'", str8, "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        model.Pos pos0 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos3 = new model.Pos(pos0, (int) (short) 0, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: pos may not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        java.lang.String str4 = pos2.toString();
        boolean boolean6 = pos2.equals((java.lang.Object) 100.0d);
        model.Pos pos9 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos10 = pos9.clone();
        boolean boolean12 = pos10.equals((java.lang.Object) 1.0d);
        model.Pos pos13 = pos10.clone();
        int int14 = pos13.getX();
        model.Pos pos15 = pos13.clone();
        java.lang.String str16 = pos15.toString();
        boolean boolean17 = pos2.equals((java.lang.Object) str16);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[52, 1]" + "'", str4, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(pos10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(pos13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[52, 1]" + "'", str16, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        int int7 = pos6.getX();
        java.lang.String str8 = pos6.toString();
        model.Pos pos11 = new model.Pos(pos6, (int) (short) 0, (int) 'a');
        model.Pos pos12 = pos11.clone();
        model.Pos pos15 = new model.Pos(pos11, (int) (short) 10, (int) 'a');
        java.lang.String str16 = pos11.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[52, 1]" + "'", str8, "[52, 1]");
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[52, 98]" + "'", str16, "[52, 98]");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        model.Pos pos2 = new model.Pos(132, (int) (byte) -1);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        int int6 = pos2.getX();
        int int7 = pos2.getX();
        model.Pos pos10 = new model.Pos(pos2, (int) (short) -1, (int) (short) 0);
        int int11 = pos2.getX();
        int int12 = pos2.getX();
        int int13 = pos2.getX();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        model.Pos pos2 = new model.Pos((int) '4', (-1));
        model.Pos pos3 = pos2.clone();
        java.lang.String str4 = pos2.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[52, -1]" + "'", str4, "[52, -1]");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        model.Pos pos2 = new model.Pos((int) '#', (int) (byte) 1);
        int int3 = pos2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos3.clone();
        model.Pos pos5 = pos4.clone();
        java.lang.Class<?> wildcardClass6 = pos5.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        model.Pos pos2 = new model.Pos(11, 62);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        model.Pos pos2 = new model.Pos(0, (int) (short) 10);
        model.Pos pos5 = new model.Pos(pos2, 35, (int) (short) 1);
        model.Pos pos6 = pos5.clone();
        int int7 = pos5.getY();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        boolean boolean7 = pos5.equals((java.lang.Object) (byte) -1);
        int int8 = pos5.getX();
        java.lang.String str9 = pos5.toString();
        model.Pos pos10 = pos5.clone();
        model.Pos pos13 = new model.Pos((int) '4', 0);
        model.Pos pos16 = new model.Pos(pos13, 2, (int) '4');
        boolean boolean17 = pos10.equals((java.lang.Object) pos16);
        int int18 = pos10.getX();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, -1]" + "'", str9, "[0, -1]");
        org.junit.Assert.assertNotNull(pos10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        model.Pos pos7 = new model.Pos(pos3, (int) '#', (int) '#');
        int int8 = pos7.getY();
        int int9 = pos7.getY();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        model.Pos pos2 = new model.Pos(32, 63);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        java.lang.Class<?> wildcardClass4 = pos3.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        model.Pos pos2 = new model.Pos((int) ' ', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos(pos3, 34, (int) (short) -1);
        java.lang.String str7 = pos3.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[32, 1]" + "'", str7, "[32, 1]");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        model.Pos pos2 = new model.Pos(2, 51);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        boolean boolean7 = pos5.equals((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = null;
        boolean boolean9 = pos5.equals(obj8);
        java.lang.String str10 = pos5.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, -1]" + "'", str10, "[0, -1]");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        model.Pos pos2 = new model.Pos('a', (int) (byte) 100);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos7 = pos6.clone();
        model.Pos pos10 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos13 = new model.Pos(pos10, (int) (byte) 100, 10);
        model.Pos pos16 = new model.Pos(pos13, (int) (short) -1, (int) '4');
        boolean boolean17 = pos7.equals((java.lang.Object) '4');
        int int18 = pos7.getY();
        model.Pos pos19 = pos7.clone();
        boolean boolean20 = pos2.equals((java.lang.Object) pos7);
        java.lang.String str21 = pos2.toString();
        model.Pos pos24 = new model.Pos(114, (int) '#');
        java.lang.Class<?> wildcardClass25 = pos24.getClass();
        boolean boolean26 = pos2.equals((java.lang.Object) wildcardClass25);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(pos19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[a, 100]" + "'", str21, "[a, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        model.Pos pos2 = new model.Pos((int) ' ', (int) ' ');
        int int3 = pos2.getX();
        java.lang.Class<?> wildcardClass4 = pos2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        java.lang.String str4 = pos3.toString();
        model.Pos pos5 = pos3.clone();
        int int6 = pos3.getY();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[-1, 1]" + "'", str4, "[-1, 1]");
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        model.Pos pos2 = new model.Pos((int) (byte) 10, (-1));
        model.Pos pos5 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos6 = pos5.clone();
        boolean boolean8 = pos6.equals((java.lang.Object) 1.0d);
        model.Pos pos9 = pos6.clone();
        model.Pos pos10 = pos9.clone();
        int int11 = pos9.getY();
        model.Pos pos12 = pos9.clone();
        boolean boolean13 = pos2.equals((java.lang.Object) pos12);
        java.lang.Class<?> wildcardClass14 = pos12.getClass();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pos9);
        org.junit.Assert.assertNotNull(pos10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        model.Pos pos2 = new model.Pos((int) (short) 10, (int) (short) 10);
        model.Pos pos5 = new model.Pos(pos2, 51, (int) (short) -1);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos3.clone();
        model.Pos pos7 = new model.Pos(pos3, 52, 51);
        int int8 = pos7.getY();
        int int9 = pos7.getX();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 152 + "'", int9 == 152);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        model.Pos pos9 = new model.Pos(pos6, 0, 10);
        model.Pos pos12 = new model.Pos(pos9, 52, 51);
        int int13 = pos9.getY();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        model.Pos pos2 = new model.Pos('a', 0);
        java.lang.String str3 = pos2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[a, 0]" + "'", str3, "[a, 0]");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        java.lang.String str5 = pos3.toString();
        model.Pos pos6 = pos3.clone();
        int int7 = pos6.getX();
        model.Pos pos10 = new model.Pos(pos6, 62, 2);
        java.lang.Class<?> wildcardClass11 = pos6.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, 1]" + "'", str5, "[100, 1]");
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        model.Pos pos2 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos9 = new model.Pos(pos6, (int) (byte) 100, 10);
        model.Pos pos12 = new model.Pos(pos9, (int) (short) -1, (int) '4');
        boolean boolean13 = pos3.equals((java.lang.Object) '4');
        int int14 = pos3.getY();
        model.Pos pos15 = pos3.clone();
        model.Pos pos18 = new model.Pos(pos3, (int) (byte) 1, 34);
        int int19 = pos18.getX();
        model.Pos pos22 = new model.Pos(pos18, 32, 0);
        model.Pos pos25 = new model.Pos(pos18, 10, 34);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        model.Pos pos2 = new model.Pos(10, (int) (short) 1);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        model.Pos pos2 = new model.Pos((int) (short) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos(100, 1);
        model.Pos pos7 = pos6.clone();
        model.Pos pos8 = pos6.clone();
        model.Pos pos11 = new model.Pos(pos8, (int) '4', (int) (short) 0);
        model.Pos pos12 = pos11.clone();
        boolean boolean13 = pos3.equals((java.lang.Object) pos11);
        model.Pos pos16 = new model.Pos(pos11, 11, (int) (short) 0);
        java.lang.String str17 = pos16.toString();
        java.lang.String str18 = pos16.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[163, 1]" + "'", str17, "[163, 1]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[163, 1]" + "'", str18, "[163, 1]");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean4 = pos2.equals((java.lang.Object) (-1L));
        boolean boolean6 = pos2.equals((java.lang.Object) 100.0d);
        model.Pos pos7 = pos2.clone();
        model.Pos pos10 = new model.Pos(pos2, (int) (short) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass11 = pos2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        model.Pos pos2 = new model.Pos((int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos2.getX();
        model.Pos pos5 = pos2.clone();
        java.lang.String str6 = pos2.toString();
        model.Pos pos9 = new model.Pos((int) (byte) 100, (int) (byte) 10);
        model.Pos pos10 = pos9.clone();
        model.Pos pos11 = pos10.clone();
        boolean boolean12 = pos2.equals((java.lang.Object) pos11);
        java.lang.Class<?> wildcardClass13 = pos11.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[100, 1]" + "'", str6, "[100, 1]");
        org.junit.Assert.assertNotNull(pos10);
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        model.Pos pos2 = new model.Pos(10, (int) (byte) 1);
        int int3 = pos2.getY();
        model.Pos pos6 = new model.Pos(pos2, 11, (int) (short) -1);
        int int7 = pos2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        model.Pos pos2 = new model.Pos((int) ' ', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos(pos3, 34, (int) (short) -1);
        int int7 = pos6.getX();
        model.Pos pos10 = new model.Pos(pos6, 62, (int) (byte) 1);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 66 + "'", int7 == 66);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        model.Pos pos2 = new model.Pos((int) '4', (int) (short) 0);
        model.Pos pos5 = new model.Pos(pos2, (int) (short) 1, 52);
        java.lang.String str6 = pos2.toString();
        model.Pos pos9 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos10 = pos9.clone();
        model.Pos pos13 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos16 = new model.Pos(pos13, (int) (byte) 100, 10);
        model.Pos pos19 = new model.Pos(pos16, (int) (short) -1, (int) '4');
        boolean boolean20 = pos10.equals((java.lang.Object) '4');
        int int21 = pos10.getY();
        boolean boolean22 = pos2.equals((java.lang.Object) pos10);
        model.Pos pos25 = new model.Pos((int) (short) 1, (int) (short) 1);
        boolean boolean26 = pos10.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[52, 0]" + "'", str6, "[52, 0]");
        org.junit.Assert.assertNotNull(pos10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        int int7 = pos2.getX();
        model.Pos pos10 = new model.Pos(pos2, 0, 35);
        java.lang.String str11 = pos2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[52, 1]" + "'", str11, "[52, 1]");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean4 = pos2.equals((java.lang.Object) (-1L));
        boolean boolean6 = pos2.equals((java.lang.Object) 100.0d);
        model.Pos pos7 = pos2.clone();
        model.Pos pos10 = new model.Pos(pos2, (int) (short) 1, (int) (short) 10);
        java.lang.String str11 = pos10.toString();
        java.lang.String str12 = pos10.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0, 11]" + "'", str11, "[0, 11]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 11]" + "'", str12, "[0, 11]");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        model.Pos pos2 = new model.Pos(10, (int) (short) -1);
        model.Pos pos5 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos8 = new model.Pos(pos5, 1, 0);
        model.Pos pos11 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos14 = new model.Pos(pos11, 1, 0);
        model.Pos pos15 = pos14.clone();
        boolean boolean16 = pos5.equals((java.lang.Object) pos15);
        java.lang.String str17 = pos5.toString();
        java.lang.String str18 = pos5.toString();
        model.Pos pos19 = pos5.clone();
        boolean boolean20 = pos2.equals((java.lang.Object) pos5);
        int int21 = pos2.getX();
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[-1, -1]" + "'", str17, "[-1, -1]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[-1, -1]" + "'", str18, "[-1, -1]");
        org.junit.Assert.assertNotNull(pos19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        model.Pos pos2 = new model.Pos('a', 11);
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        model.Pos pos2 = new model.Pos((int) ' ', (int) (short) -1);
        model.Pos pos5 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str6 = pos5.toString();
        model.Pos pos9 = new model.Pos(10, (int) (byte) 1);
        model.Pos pos10 = pos9.clone();
        boolean boolean11 = pos5.equals((java.lang.Object) pos9);
        boolean boolean12 = pos2.equals((java.lang.Object) boolean11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[52, 1]" + "'", str6, "[52, 1]");
        org.junit.Assert.assertNotNull(pos10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        int int6 = pos5.getY();
        int int7 = pos5.getY();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        model.Pos pos2 = new model.Pos(0, (int) (short) 0);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos('a', (int) '#');
        int int7 = pos6.getY();
        model.Pos pos8 = pos6.clone();
        model.Pos pos9 = pos6.clone();
        boolean boolean10 = pos3.equals((java.lang.Object) pos6);
        model.Pos pos11 = pos6.clone();
        java.lang.String str12 = pos6.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(pos9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[a, 35]" + "'", str12, "[a, 35]");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        model.Pos pos2 = new model.Pos(51, 34);
        int int3 = pos2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 51 + "'", int3 == 51);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        model.Pos pos5 = pos3.clone();
        model.Pos pos6 = pos3.clone();
        model.Pos pos9 = new model.Pos(pos3, 35, 0);
        model.Pos pos12 = new model.Pos(pos3, 35, 132);
        model.Pos pos15 = new model.Pos(66, (int) (byte) 100);
        boolean boolean16 = pos3.equals((java.lang.Object) 66);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        model.Pos pos2 = new model.Pos(2, 52);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        int int6 = pos2.getY();
        model.Pos pos7 = pos2.clone();
        model.Pos pos8 = pos2.clone();
        java.lang.Class<?> wildcardClass9 = pos8.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        int int7 = pos2.getX();
        model.Pos pos10 = new model.Pos(pos2, 0, 35);
        int int11 = pos10.getY();
        model.Pos pos14 = new model.Pos(pos10, (int) '4', 132);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        boolean boolean7 = pos5.equals((java.lang.Object) (byte) -1);
        model.Pos pos8 = pos5.clone();
        model.Pos pos9 = pos5.clone();
        int int10 = pos9.getX();
        int int11 = pos9.getX();
        model.Pos pos14 = new model.Pos(pos9, 0, 0);
        int int15 = pos9.getY();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(pos9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        boolean boolean7 = pos5.equals((java.lang.Object) (byte) -1);
        model.Pos pos8 = pos5.clone();
        model.Pos pos9 = pos5.clone();
        int int10 = pos9.getX();
        int int11 = pos9.getX();
        model.Pos pos12 = pos9.clone();
        int int13 = pos12.getX();
        int int14 = pos12.getY();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(pos9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        boolean boolean8 = pos6.equals((java.lang.Object) 100.0f);
        int int9 = pos6.getX();
        java.lang.Class<?> wildcardClass10 = pos6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        model.Pos pos2 = new model.Pos(114, (int) (short) 10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos(pos3, 34, 0);
        int int7 = pos6.getX();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos8 = new model.Pos(pos3, 32, (int) '4');
        java.lang.String str9 = pos3.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[52, 1]" + "'", str9, "[52, 1]");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos5 = new model.Pos(pos2, (int) (byte) 100, 10);
        model.Pos pos8 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos9 = pos8.clone();
        model.Pos pos12 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos15 = new model.Pos(pos12, (int) (byte) 100, 10);
        model.Pos pos18 = new model.Pos(pos15, (int) (short) -1, (int) '4');
        boolean boolean19 = pos9.equals((java.lang.Object) '4');
        int int20 = pos9.getY();
        model.Pos pos21 = pos9.clone();
        boolean boolean22 = pos2.equals((java.lang.Object) pos21);
        int int23 = pos2.getY();
        model.Pos pos24 = pos2.clone();
        int int25 = pos24.getY();
        org.junit.Assert.assertNotNull(pos9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(pos21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(pos24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean4 = pos2.equals((java.lang.Object) (-1L));
        model.Pos pos5 = pos2.clone();
        java.lang.String str6 = pos5.toString();
        model.Pos pos9 = new model.Pos('a', 32);
        model.Pos pos12 = new model.Pos(pos9, (int) (short) -1, (int) ' ');
        boolean boolean13 = pos5.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass14 = pos5.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[-1, 1]" + "'", str6, "[-1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        model.Pos pos6 = pos5.clone();
        int int7 = pos5.getY();
        int int8 = pos5.getX();
        model.Pos pos11 = new model.Pos(pos5, (int) (short) 100, (int) (byte) 0);
        model.Pos pos14 = new model.Pos(100, 1);
        model.Pos pos15 = pos14.clone();
        int int16 = pos14.getX();
        model.Pos pos17 = pos14.clone();
        boolean boolean18 = pos5.equals((java.lang.Object) pos14);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(pos17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        model.Pos pos5 = pos3.clone();
        model.Pos pos6 = pos3.clone();
        model.Pos pos9 = new model.Pos(pos3, 35, 0);
        model.Pos pos12 = new model.Pos(pos3, 35, 132);
        java.lang.Class<?> wildcardClass13 = pos3.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos2.getX();
        model.Pos pos5 = pos2.clone();
        model.Pos pos6 = pos2.clone();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertNotNull(pos6);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        model.Pos pos6 = new model.Pos(10, (int) (byte) 1);
        model.Pos pos7 = pos6.clone();
        boolean boolean8 = pos2.equals((java.lang.Object) pos6);
        model.Pos pos11 = new model.Pos(pos6, 0, 0);
        java.lang.Class<?> wildcardClass12 = pos11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        java.lang.String str4 = pos2.toString();
        java.lang.String str5 = pos2.toString();
        int int6 = pos2.getY();
        java.lang.String str7 = pos2.toString();
        model.Pos pos8 = pos2.clone();
        int int9 = pos2.getX();
        model.Pos pos10 = pos2.clone();
        model.Pos pos11 = pos10.clone();
        model.Pos pos14 = new model.Pos(pos10, (int) ' ', 0);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[52, 1]" + "'", str4, "[52, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[52, 1]" + "'", str5, "[52, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[52, 1]" + "'", str7, "[52, 1]");
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(pos10);
        org.junit.Assert.assertNotNull(pos11);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        model.Pos pos2 = new model.Pos((int) (byte) 100, (int) (byte) 0);
        model.Pos pos5 = new model.Pos(pos2, 66, (int) '4');
        java.lang.String str6 = pos5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[166, 52]" + "'", str6, "[166, 52]");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        model.Pos pos9 = new model.Pos(pos6, 0, 10);
        model.Pos pos10 = pos9.clone();
        java.lang.Class<?> wildcardClass11 = pos10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertNotNull(pos10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        java.lang.String str5 = pos3.toString();
        model.Pos pos6 = pos3.clone();
        int int7 = pos6.getX();
        model.Pos pos8 = pos6.clone();
        java.lang.Class<?> wildcardClass9 = pos8.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, 1]" + "'", str5, "[100, 1]");
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        model.Pos pos2 = new model.Pos('a', (int) '#');
        model.Pos pos5 = new model.Pos(pos2, (int) (short) 1, 35);
        model.Pos pos8 = new model.Pos(pos2, (int) '#', 0);
        java.lang.String str9 = pos2.toString();
        model.Pos pos12 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos13 = pos12.clone();
        boolean boolean14 = pos2.equals((java.lang.Object) pos12);
        model.Pos pos17 = new model.Pos(pos2, (int) '#', (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = pos17.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[a, 35]" + "'", str9, "[a, 35]");
        org.junit.Assert.assertNotNull(pos13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        model.Pos pos2 = new model.Pos('a', (int) '#');
        int int3 = pos2.getY();
        model.Pos pos4 = pos2.clone();
        model.Pos pos5 = pos2.clone();
        int int6 = pos2.getX();
        java.lang.Class<?> wildcardClass7 = pos2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos2.getX();
        java.lang.String str5 = pos2.toString();
        int int6 = pos2.getX();
        model.Pos pos7 = pos2.clone();
        java.lang.String str8 = pos2.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, 1]" + "'", str5, "[100, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[100, 1]" + "'", str8, "[100, 1]");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        model.Pos pos2 = new model.Pos('a', (int) '#');
        int int3 = pos2.getY();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, 34, (int) (byte) 100);
        model.Pos pos10 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos11 = pos10.clone();
        boolean boolean13 = pos11.equals((java.lang.Object) 1.0d);
        model.Pos pos14 = pos11.clone();
        model.Pos pos15 = pos14.clone();
        int int16 = pos14.getY();
        model.Pos pos17 = pos14.clone();
        java.lang.String str18 = pos17.toString();
        boolean boolean19 = pos7.equals((java.lang.Object) str18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pos14);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(pos17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[52, 1]" + "'", str18, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        java.lang.String str6 = pos2.toString();
        model.Pos pos9 = new model.Pos(pos2, 62, 32);
        java.lang.Object obj10 = null;
        boolean boolean11 = pos9.equals(obj10);
        int int12 = pos9.getY();
        model.Pos pos13 = pos9.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[-1, -1]" + "'", str6, "[-1, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertNotNull(pos13);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        model.Pos pos8 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos11 = new model.Pos(pos8, 1, 0);
        model.Pos pos12 = pos11.clone();
        boolean boolean13 = pos2.equals((java.lang.Object) pos12);
        model.Pos pos16 = new model.Pos(pos2, (int) (short) 1, (int) (short) 1);
        model.Pos pos19 = new model.Pos(pos2, 32, 62);
        int int20 = pos19.getX();
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 31 + "'", int20 == 31);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        model.Pos pos2 = new model.Pos((int) ' ', (int) (short) -1);
        java.lang.String str3 = pos2.toString();
        int int4 = pos2.getY();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[32, -1]" + "'", str3, "[32, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', 114);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        model.Pos pos2 = new model.Pos((int) (short) 0, (int) '#');
        int int3 = pos2.getY();
        int int4 = pos2.getX();
        int int5 = pos2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        model.Pos pos2 = new model.Pos('a', 1);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        model.Pos pos2 = new model.Pos((-1), (int) '4');
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', 46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        model.Pos pos2 = new model.Pos(32, (int) (byte) 1);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean4 = pos2.equals((java.lang.Object) (-1L));
        model.Pos pos5 = pos2.clone();
        model.Pos pos8 = new model.Pos(pos5, (int) (byte) 0, 0);
        model.Pos pos11 = new model.Pos(pos8, 63, (int) 'a');
        model.Pos pos14 = new model.Pos((int) (short) 0, 52);
        model.Pos pos15 = pos14.clone();
        model.Pos pos16 = pos14.clone();
        boolean boolean17 = pos11.equals((java.lang.Object) pos14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertNotNull(pos16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        model.Pos pos2 = new model.Pos(100, 36);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        model.Pos pos5 = pos3.clone();
        model.Pos pos6 = pos3.clone();
        model.Pos pos9 = new model.Pos(pos3, 35, 0);
        int int10 = pos9.getY();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        model.Pos pos2 = new model.Pos((int) (short) 10, (int) '4');
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        model.Pos pos9 = new model.Pos(pos3, (int) (byte) 10, (int) (byte) 1);
        int int10 = pos9.getY();
        model.Pos pos13 = new model.Pos(pos9, (int) (byte) 0, 35);
        model.Pos pos14 = pos9.clone();
        java.lang.Class<?> wildcardClass15 = pos9.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(pos14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        model.Pos pos2 = new model.Pos(0, (int) (short) 0);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        java.lang.String str5 = pos3.toString();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0, 0]" + "'", str5, "[0, 0]");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        java.lang.String str5 = pos3.toString();
        model.Pos pos6 = pos3.clone();
        int int7 = pos6.getX();
        model.Pos pos10 = new model.Pos(pos6, 62, 2);
        model.Pos pos13 = new model.Pos((int) (byte) 100, (int) (byte) 0);
        boolean boolean14 = pos10.equals((java.lang.Object) (byte) 100);
        int int15 = pos10.getX();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, 1]" + "'", str5, "[100, 1]");
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 162 + "'", int15 == 162);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        model.Pos pos2 = new model.Pos(35, (int) (short) 1);
        int int3 = pos2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        model.Pos pos2 = new model.Pos((int) (byte) 0, (-1));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        model.Pos pos6 = new model.Pos(pos2, (int) (byte) -1, (int) (byte) -1);
        model.Pos pos7 = pos6.clone();
        model.Pos pos8 = pos6.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertNotNull(pos8);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        java.lang.String str7 = pos6.toString();
        int int8 = pos6.getY();
        model.Pos pos9 = pos6.clone();
        java.lang.Class<?> wildcardClass10 = pos6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[52, 1]" + "'", str7, "[52, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(pos9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        model.Pos pos2 = new model.Pos('a', (int) 'a');
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos(' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos2.getX();
        model.Pos pos7 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos8 = pos7.clone();
        boolean boolean10 = pos8.equals((java.lang.Object) 1.0d);
        model.Pos pos11 = pos8.clone();
        model.Pos pos12 = pos11.clone();
        java.lang.String str13 = pos11.toString();
        model.Pos pos16 = new model.Pos(pos11, (int) (byte) 10, 98);
        boolean boolean17 = pos2.equals((java.lang.Object) pos11);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[52, 1]" + "'", str13, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        java.lang.String str7 = pos2.toString();
        model.Pos pos10 = new model.Pos('a', (int) (byte) 100);
        model.Pos pos11 = pos10.clone();
        model.Pos pos14 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos15 = pos14.clone();
        model.Pos pos18 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos21 = new model.Pos(pos18, (int) (byte) 100, 10);
        model.Pos pos24 = new model.Pos(pos21, (int) (short) -1, (int) '4');
        boolean boolean25 = pos15.equals((java.lang.Object) '4');
        int int26 = pos15.getY();
        model.Pos pos27 = pos15.clone();
        boolean boolean28 = pos10.equals((java.lang.Object) pos15);
        java.lang.String str29 = pos10.toString();
        java.lang.Class<?> wildcardClass30 = pos10.getClass();
        boolean boolean31 = pos2.equals((java.lang.Object) pos10);
        java.lang.Class<?> wildcardClass32 = pos10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[52, 1]" + "'", str7, "[52, 1]");
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(pos27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[a, 100]" + "'", str29, "[a, 100]");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        java.lang.String str5 = pos3.toString();
        model.Pos pos6 = pos3.clone();
        model.Pos pos9 = new model.Pos('a', (int) (short) 100);
        model.Pos pos10 = pos9.clone();
        model.Pos pos13 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean15 = pos13.equals((java.lang.Object) (-1L));
        boolean boolean17 = pos13.equals((java.lang.Object) 100.0d);
        model.Pos pos18 = pos13.clone();
        java.lang.String str19 = pos13.toString();
        boolean boolean20 = pos9.equals((java.lang.Object) str19);
        boolean boolean21 = pos6.equals((java.lang.Object) boolean20);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, 1]" + "'", str5, "[100, 1]");
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertNotNull(pos10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(pos18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[-1, 1]" + "'", str19, "[-1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        model.Pos pos9 = new model.Pos(pos3, (int) (byte) 10, (int) (byte) 1);
        model.Pos pos12 = new model.Pos(pos9, (int) (short) 10, 32);
        model.Pos pos13 = pos12.clone();
        model.Pos pos16 = new model.Pos((int) '4', (int) (short) 0);
        model.Pos pos19 = new model.Pos(100, 1);
        model.Pos pos20 = pos19.clone();
        int int21 = pos19.getX();
        model.Pos pos22 = pos19.clone();
        boolean boolean23 = pos16.equals((java.lang.Object) pos19);
        model.Pos pos26 = new model.Pos((int) (short) 100, (int) (short) 1);
        boolean boolean27 = pos16.equals((java.lang.Object) (short) 100);
        model.Pos pos30 = new model.Pos(pos16, (int) (byte) 100, 51);
        boolean boolean31 = pos13.equals((java.lang.Object) 51);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertNotNull(pos13);
        org.junit.Assert.assertNotNull(pos20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(pos22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean4 = pos2.equals((java.lang.Object) (-1L));
        model.Pos pos5 = pos2.clone();
        int int6 = pos2.getY();
        int int7 = pos2.getY();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        model.Pos pos2 = new model.Pos((int) (short) 0, (int) '#');
        java.lang.String str3 = pos2.toString();
        model.Pos pos6 = new model.Pos(pos2, (int) '#', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0, 35]" + "'", str3, "[0, 35]");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        int int7 = pos6.getX();
        java.lang.String str8 = pos6.toString();
        model.Pos pos11 = new model.Pos(pos6, (int) (short) 0, (int) 'a');
        model.Pos pos12 = pos6.clone();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[52, 1]" + "'", str8, "[52, 1]");
        org.junit.Assert.assertNotNull(pos12);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        model.Pos pos2 = new model.Pos(36, 35);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        model.Pos pos2 = new model.Pos((int) ' ', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos(100, 1);
        model.Pos pos7 = pos6.clone();
        model.Pos pos8 = pos6.clone();
        model.Pos pos11 = new model.Pos(pos8, (int) '4', (int) (short) 0);
        model.Pos pos14 = new model.Pos(pos8, (int) ' ', 32);
        model.Pos pos15 = pos14.clone();
        boolean boolean16 = pos2.equals((java.lang.Object) pos15);
        model.Pos pos19 = new model.Pos(100, 1);
        model.Pos pos20 = pos19.clone();
        int int21 = pos20.getY();
        model.Pos pos22 = pos20.clone();
        boolean boolean23 = pos2.equals((java.lang.Object) pos22);
        java.lang.String str24 = pos22.toString();
        int int25 = pos22.getX();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(pos20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(pos22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[100, 1]" + "'", str24, "[100, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        model.Pos pos6 = pos5.clone();
        model.Pos pos9 = new model.Pos(pos5, (int) (byte) 1, 0);
        int int10 = pos9.getY();
        model.Pos pos11 = pos9.clone();
        int int12 = pos11.getY();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        java.lang.String str3 = pos2.toString();
        boolean boolean5 = pos2.equals((java.lang.Object) 10.0d);
        model.Pos pos6 = pos2.clone();
        int int7 = pos6.getY();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[52, 1]" + "'", str3, "[52, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        model.Pos pos2 = new model.Pos('a', 67);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        int int6 = pos3.getY();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        model.Pos pos2 = new model.Pos('a', (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        model.Pos pos2 = new model.Pos((int) (short) 10, 98);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        model.Pos pos9 = new model.Pos(pos3, (int) (byte) 10, (int) (byte) 1);
        int int10 = pos9.getY();
        model.Pos pos13 = new model.Pos(pos9, (int) (byte) 0, 35);
        int int14 = pos13.getX();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 62 + "'", int14 == 62);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        model.Pos pos8 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos11 = new model.Pos(pos8, 1, 0);
        model.Pos pos12 = pos11.clone();
        boolean boolean13 = pos2.equals((java.lang.Object) pos12);
        model.Pos pos16 = new model.Pos(pos2, (int) (short) 1, (int) (short) 1);
        int int17 = pos2.getY();
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        model.Pos pos7 = new model.Pos(pos4, (int) '4', (int) (short) 0);
        model.Pos pos10 = new model.Pos(pos4, (int) ' ', 32);
        model.Pos pos11 = pos4.clone();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertNotNull(pos11);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        model.Pos pos2 = new model.Pos((int) ' ', (int) (short) -1);
        java.lang.String str3 = pos2.toString();
        model.Pos pos6 = new model.Pos(pos2, (int) (short) 1, 132);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[32, -1]" + "'", str3, "[32, -1]");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        model.Pos pos2 = new model.Pos(62, 152);
        model.Pos pos3 = pos2.clone();
        java.lang.String str4 = pos3.toString();
        java.lang.Class<?> wildcardClass5 = pos3.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[62, 152]" + "'", str4, "[62, 152]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        model.Pos pos6 = pos5.clone();
        model.Pos pos9 = new model.Pos(pos5, (int) (byte) 1, 0);
        int int10 = pos9.getY();
        model.Pos pos11 = pos9.clone();
        java.lang.String str12 = pos9.toString();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[a, -1]" + "'", str12, "[a, -1]");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        model.Pos pos2 = new model.Pos(98, 114);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        int int6 = pos2.getY();
        model.Pos pos7 = pos2.clone();
        model.Pos pos8 = pos2.clone();
        int int9 = pos2.getX();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        model.Pos pos2 = new model.Pos((int) '4', (int) (short) 0);
        model.Pos pos5 = new model.Pos(pos2, (int) (short) 1, 52);
        java.lang.String str6 = pos2.toString();
        java.lang.String str7 = pos2.toString();
        int int8 = pos2.getX();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[52, 0]" + "'", str6, "[52, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[52, 0]" + "'", str7, "[52, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        int int7 = pos6.getX();
        model.Pos pos8 = pos6.clone();
        int int9 = pos6.getX();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(pos8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        model.Pos pos4 = pos2.clone();
        boolean boolean6 = pos2.equals((java.lang.Object) 100.0f);
        model.Pos pos7 = pos2.clone();
        java.lang.Class<?> wildcardClass8 = pos2.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertNotNull(pos4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(pos7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        model.Pos pos2 = new model.Pos((int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('4', 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        model.Pos pos2 = new model.Pos(100, 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        model.Pos pos2 = new model.Pos(66, 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        model.Pos pos2 = new model.Pos((int) '4', (int) (short) 0);
        model.Pos pos5 = new model.Pos(pos2, (int) (short) 1, 52);
        java.lang.String str6 = pos2.toString();
        model.Pos pos9 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos10 = pos9.clone();
        model.Pos pos13 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos16 = new model.Pos(pos13, (int) (byte) 100, 10);
        model.Pos pos19 = new model.Pos(pos16, (int) (short) -1, (int) '4');
        boolean boolean20 = pos10.equals((java.lang.Object) '4');
        int int21 = pos10.getY();
        boolean boolean22 = pos2.equals((java.lang.Object) pos10);
        java.lang.Class<?> wildcardClass23 = pos2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[52, 0]" + "'", str6, "[52, 0]");
        org.junit.Assert.assertNotNull(pos10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        model.Pos pos2 = new model.Pos(100, 100);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        model.Pos pos2 = new model.Pos('a', (int) '#');
        int int3 = pos2.getY();
        model.Pos pos6 = new model.Pos(pos2, 32, (int) (short) -1);
        model.Pos pos9 = new model.Pos(pos2, (int) (byte) 1, 114);
        model.Pos pos12 = new model.Pos(100, 1);
        model.Pos pos13 = pos12.clone();
        int int14 = pos13.getY();
        model.Pos pos17 = new model.Pos(pos13, 0, 62);
        boolean boolean18 = pos9.equals((java.lang.Object) pos17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(pos13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        model.Pos pos2 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos5 = new model.Pos(pos2, 1, 0);
        model.Pos pos8 = new model.Pos((int) (short) -1, (int) (byte) -1);
        model.Pos pos11 = new model.Pos(pos8, 1, 0);
        model.Pos pos12 = pos11.clone();
        boolean boolean13 = pos2.equals((java.lang.Object) pos12);
        java.lang.String str14 = pos2.toString();
        int int15 = pos2.getX();
        int int16 = pos2.getX();
        int int17 = pos2.getY();
        int int18 = pos2.getY();
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[-1, -1]" + "'", str14, "[-1, -1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        model.Pos pos2 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos9 = new model.Pos(pos6, (int) (byte) 100, 10);
        model.Pos pos12 = new model.Pos(pos9, (int) (short) -1, (int) '4');
        boolean boolean13 = pos3.equals((java.lang.Object) '4');
        model.Pos pos16 = new model.Pos(pos3, (int) '4', (int) (short) -1);
        model.Pos pos19 = new model.Pos(151, (int) (short) 0);
        boolean boolean20 = pos3.equals((java.lang.Object) 151);
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        java.lang.String str5 = pos3.toString();
        model.Pos pos6 = pos3.clone();
        int int7 = pos6.getX();
        model.Pos pos10 = new model.Pos(pos6, 62, 2);
        model.Pos pos11 = pos6.clone();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, 1]" + "'", str5, "[100, 1]");
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(pos11);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        model.Pos pos2 = new model.Pos((int) (short) 100, (int) (short) 0);
        model.Pos pos5 = new model.Pos(100, 1);
        model.Pos pos6 = pos5.clone();
        int int7 = pos5.getX();
        model.Pos pos10 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos11 = pos10.clone();
        model.Pos pos14 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos17 = new model.Pos(pos14, (int) (byte) 100, 10);
        model.Pos pos20 = new model.Pos(pos17, (int) (short) -1, (int) '4');
        boolean boolean21 = pos11.equals((java.lang.Object) '4');
        model.Pos pos22 = pos11.clone();
        boolean boolean23 = pos5.equals((java.lang.Object) pos11);
        java.lang.String str24 = pos11.toString();
        model.Pos pos25 = pos11.clone();
        boolean boolean26 = pos2.equals((java.lang.Object) pos11);
        model.Pos pos27 = pos11.clone();
        java.lang.String str28 = pos11.toString();
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(pos22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[-1, 32]" + "'", str24, "[-1, 32]");
        org.junit.Assert.assertNotNull(pos25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(pos27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[-1, 32]" + "'", str28, "[-1, 32]");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        model.Pos pos9 = new model.Pos(pos3, (int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = pos9.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos2.getX();
        java.lang.Class<?> wildcardClass5 = pos2.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        model.Pos pos2 = new model.Pos(63, (int) 'a');
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        model.Pos pos2 = new model.Pos((int) (byte) -1, (int) ' ');
        model.Pos pos3 = pos2.clone();
        model.Pos pos6 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos9 = new model.Pos(pos6, (int) (byte) 100, 10);
        model.Pos pos12 = new model.Pos(pos9, (int) (short) -1, (int) '4');
        boolean boolean13 = pos3.equals((java.lang.Object) '4');
        int int14 = pos3.getY();
        model.Pos pos15 = pos3.clone();
        model.Pos pos18 = new model.Pos(pos3, (int) (byte) 1, 34);
        int int19 = pos18.getX();
        model.Pos pos22 = new model.Pos(pos18, 32, 0);
        int int23 = pos22.getY();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(pos15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 66 + "'", int23 == 66);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos2.getX();
        model.Pos pos5 = pos2.clone();
        java.lang.String str6 = pos2.toString();
        model.Pos pos9 = new model.Pos((int) (byte) 100, (int) (byte) 10);
        model.Pos pos10 = pos9.clone();
        model.Pos pos11 = pos10.clone();
        boolean boolean12 = pos2.equals((java.lang.Object) pos11);
        model.Pos pos13 = pos11.clone();
        java.lang.Class<?> wildcardClass14 = pos11.getClass();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[100, 1]" + "'", str6, "[100, 1]");
        org.junit.Assert.assertNotNull(pos10);
        org.junit.Assert.assertNotNull(pos11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(pos13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        model.Pos pos2 = new model.Pos(132, 52);
        model.Pos pos5 = new model.Pos('a', (int) '#');
        model.Pos pos8 = new model.Pos(pos5, (int) (short) 1, 35);
        model.Pos pos11 = new model.Pos(pos5, (int) '#', 0);
        boolean boolean12 = pos2.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        model.Pos pos2 = new model.Pos(100, 1);
        model.Pos pos3 = pos2.clone();
        int int4 = pos3.getY();
        model.Pos pos5 = pos3.clone();
        model.Pos pos6 = pos3.clone();
        int int7 = pos6.getY();
        int int8 = pos6.getY();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(pos5);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        model.Pos pos2 = new model.Pos((int) '4', (int) (byte) 1);
        model.Pos pos3 = pos2.clone();
        boolean boolean5 = pos3.equals((java.lang.Object) 1.0d);
        model.Pos pos6 = pos3.clone();
        int int7 = pos6.getX();
        java.lang.String str8 = pos6.toString();
        model.Pos pos11 = new model.Pos(pos6, (int) (short) 0, (int) 'a');
        model.Pos pos12 = pos11.clone();
        model.Pos pos15 = new model.Pos(pos11, (int) (short) 10, (int) 'a');
        int int16 = pos15.getX();
        org.junit.Assert.assertNotNull(pos3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pos6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[52, 1]" + "'", str8, "[52, 1]");
        org.junit.Assert.assertNotNull(pos12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 62 + "'", int16 == 62);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        // The following exception was thrown during execution in test generation
        try {
            model.Pos pos2 = new model.Pos('#', 152);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: x is not a valid char");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        model.Pos pos2 = new model.Pos('a', (int) '#');
        model.Pos pos5 = new model.Pos((int) (short) -1, (int) (byte) 1);
        boolean boolean7 = pos5.equals((java.lang.Object) (-1L));
        boolean boolean9 = pos5.equals((java.lang.Object) 100.0d);
        boolean boolean10 = pos2.equals((java.lang.Object) 100.0d);
        int int11 = pos2.getX();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        model.Pos pos2 = new model.Pos(36, 162);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        model.Pos pos2 = new model.Pos((int) (short) 0, 0);
        int int3 = pos2.getY();
        int int4 = pos2.getY();
        int int5 = pos2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        model.Pos pos2 = new model.Pos(152, (int) '4');
        java.lang.Class<?> wildcardClass3 = pos2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }
}

