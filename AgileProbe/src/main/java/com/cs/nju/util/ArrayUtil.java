/**
 * created by zym at 2012-1-8
 */
package com.cs.nju.util;


import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 有关数组处理的工具类�?
 * 
 * <p>
 * 这个类中的每个方法都可以“安全�?�地处理<code>null</code>，�?�不会抛�?<code>NullPointerException</code>�?
 * </p>
 *
 * @author zym
 */
public class ArrayUtil {
    /* ============================================================================ */
    /*  常量和singleton�?                                                           */
    /* ============================================================================ */

    /** 空的<code>Object</code>数组�? */
    public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];

    /** 空的<code>Class</code>数组�? */
    public static final Class<?>[] EMPTY_CLASS_ARRAY = new Class[0];

    /** 空的<code>String</code>数组�? */
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    /** 空的<code>long</code>数组�? */
    public static final long[] EMPTY_LONG_ARRAY = new long[0];

    /** 空的<code>Long</code>数组�? */
    public static final Long[] EMPTY_LONG_OBJECT_ARRAY = new Long[0];

    /** 空的<code>int</code>数组�? */
    public static final int[] EMPTY_INT_ARRAY = new int[0];

    /** 空的<code>Integer</code>数组�? */
    public static final Integer[] EMPTY_INTEGER_OBJECT_ARRAY = new Integer[0];

    /** 空的<code>short</code>数组�? */
    public static final short[] EMPTY_SHORT_ARRAY = new short[0];

    /** 空的<code>Short</code>数组�? */
    public static final Short[] EMPTY_SHORT_OBJECT_ARRAY = new Short[0];

    /** 空的<code>byte</code>数组�? */
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    /** 空的<code>Byte</code>数组�? */
    public static final Byte[] EMPTY_BYTE_OBJECT_ARRAY = new Byte[0];

    /** 空的<code>double</code>数组�? */
    public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];

    /** 空的<code>Double</code>数组�? */
    public static final Double[] EMPTY_DOUBLE_OBJECT_ARRAY = new Double[0];

    /** 空的<code>float</code>数组�? */
    public static final float[] EMPTY_FLOAT_ARRAY = new float[0];

    /** 空的<code>Float</code>数组�? */
    public static final Float[] EMPTY_FLOAT_OBJECT_ARRAY = new Float[0];

    /** 空的<code>boolean</code>数组�? */
    public static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[0];

    /** 空的<code>Boolean</code>数组�? */
    public static final Boolean[] EMPTY_BOOLEAN_OBJECT_ARRAY = new Boolean[0];

    /** 空的<code>char</code>数组�? */
    public static final char[] EMPTY_CHAR_ARRAY = new char[0];

    /** 空的<code>Character</code>数组�? */
    public static final Character[] EMPTY_CHARACTER_OBJECT_ARRAY = new Character[0];

    /** 计算hashcode�?用的常量�? */
    private static final int INITIAL_NON_ZERO_ODD_NUMBER = 17;

    /** 计算hashcode�?用的常量�? */
    private static final int MULTIPLIER_NON_ZERO_ODD_NUMBER = 37;

    /* ============================================================================ */
    /*  判空函数�?                                                                  */
    /*                                                                              */
    /*  判断�?个数组是否为null或包�?0个元素�??                                       */
    /* ============================================================================ */

    /**
     * �?查数组是否为<code>null</code>或空数组<code>[]</code>�?
     * <pre>
     * ArrayUtil.isEmpty(null)              = true
     * ArrayUtil.isEmpty(new String[0])     = true
     * ArrayUtil.isEmpty(new String[10])    = false
     * </pre>
     *
     * @param array 要检查的数组
     *
     * @return 如果为空, 则返�?<code>true</code>
     */
    public static boolean isEmpty(Object[] array) {
        return ((array == null) || (array.length == 0));
    }

    /**
     * �?查数组是否为<code>null</code>或空数组<code>[]</code>�?
     * <pre>
     * ArrayUtil.isEmpty(null)              = true
     * ArrayUtil.isEmpty(new long[0])     = true
     * ArrayUtil.isEmpty(new long[10])    = false
     * </pre>
     *
     * @param array 要检查的数组
     *
     * @return 如果为空, 则返�?<code>true</code>
     */
    public static boolean isEmpty(long[] array) {
        return ((array == null) || (array.length == 0));
    }

    /**
     * �?查数组是否为<code>null</code>或空数组<code>[]</code>�?
     * <pre>
     * ArrayUtil.isEmpty(null)              = true
     * ArrayUtil.isEmpty(new int[0])     = true
     * ArrayUtil.isEmpty(new int[10])    = false
     * </pre>
     *
     * @param array 要检查的数组
     *
     * @return 如果为空, 则返�?<code>true</code>
     */
    public static boolean isEmpty(int[] array) {
        return ((array == null) || (array.length == 0));
    }

    /**
     * �?查数组是否为<code>null</code>或空数组<code>[]</code>�?
     * <pre>
     * ArrayUtil.isEmpty(null)              = true
     * ArrayUtil.isEmpty(new short[0])     = true
     * ArrayUtil.isEmpty(new short[10])    = false
     * </pre>
     *
     * @param array 要检查的数组
     *
     * @return 如果为空, 则返�?<code>true</code>
     */
    public static boolean isEmpty(short[] array) {
        return ((array == null) || (array.length == 0));
    }

    /**
     * �?查数组是否为<code>null</code>或空数组<code>[]</code>�?
     * <pre>
     * ArrayUtil.isEmpty(null)              = true
     * ArrayUtil.isEmpty(new byte[0])     = true
     * ArrayUtil.isEmpty(new byte[10])    = false
     * </pre>
     *
     * @param array 要检查的数组
     *
     * @return 如果为空, 则返�?<code>true</code>
     */
    public static boolean isEmpty(byte[] array) {
        return ((array == null) || (array.length == 0));
    }

    /**
     * �?查数组是否为<code>null</code>或空数组<code>[]</code>�?
     * <pre>
     * ArrayUtil.isEmpty(null)              = true
     * ArrayUtil.isEmpty(new double[0])     = true
     * ArrayUtil.isEmpty(new double[10])    = false
     * </pre>
     *
     * @param array 要检查的数组
     *
     * @return 如果为空, 则返�?<code>true</code>
     */
    public static boolean isEmpty(double[] array) {
        return ((array == null) || (array.length == 0));
    }

    /**
     * �?查数组是否为<code>null</code>或空数组<code>[]</code>�?
     * <pre>
     * ArrayUtil.isEmpty(null)              = true
     * ArrayUtil.isEmpty(new float[0])     = true
     * ArrayUtil.isEmpty(new float[10])    = false
     * </pre>
     *
     * @param array 要检查的数组
     *
     * @return 如果为空, 则返�?<code>true</code>
     */
    public static boolean isEmpty(float[] array) {
        return ((array == null) || (array.length == 0));
    }

    /**
     * �?查数组是否为<code>null</code>或空数组<code>[]</code>�?
     * <pre>
     * ArrayUtil.isEmpty(null)              = true
     * ArrayUtil.isEmpty(new boolean[0])     = true
     * ArrayUtil.isEmpty(new boolean[10])    = false
     * </pre>
     *
     * @param array 要检查的数组
     *
     * @return 如果为空, 则返�?<code>true</code>
     */
    public static boolean isEmpty(boolean[] array) {
        return ((array == null) || (array.length == 0));
    }

    /**
     * �?查数组是否为<code>null</code>或空数组<code>[]</code>�?
     * <pre>
     * ArrayUtil.isEmpty(null)              = true
     * ArrayUtil.isEmpty(new char[0])     = true
     * ArrayUtil.isEmpty(new char[10])    = false
     * </pre>
     *
     * @param array 要检查的数组
     *
     * @return 如果为空, 则返�?<code>true</code>
     */
    public static boolean isEmpty(char[] array) {
        return ((array == null) || (array.length == 0));
    }

    /**
     * �?查数组是否不�?<code>null</code>和空数组<code>[]</code>�?
     * <pre>
     * ArrayUtil.isEmpty(null)              = false
     * ArrayUtil.isEmpty(new String[0])     = false
     * ArrayUtil.isEmpty(new String[10])    = true
     * </pre>
     *
     * @param array 要检查的数组
     *
     * @return 如果不为�?, 则返�?<code>true</code>
     */
    public static boolean isNotEmpty(Object[] array) {
        return ((array != null) && (array.length > 0));
    }

    /**
     * �?查数组是否不�?<code>null</code>和空数组<code>[]</code>�?
     * <pre>
     * ArrayUtil.isEmpty(null)              = false
     * ArrayUtil.isEmpty(new long[0])     = false
     * ArrayUtil.isEmpty(new long[10])    = true
     * </pre>
     *
     * @param array 要检查的数组
     *
     * @return 如果不为�?, 则返�?<code>true</code>
     */
    public static boolean isNotEmpty(long[] array) {
        return ((array != null) && (array.length > 0));
    }

    /**
     * �?查数组是否不�?<code>null</code>和空数组<code>[]</code>�?
     * <pre>
     * ArrayUtil.isEmpty(null)              = false
     * ArrayUtil.isEmpty(new int[0])     = false
     * ArrayUtil.isEmpty(new int[10])    = true
     * </pre>
     *
     * @param array 要检查的数组
     *
     * @return 如果不为�?, 则返�?<code>true</code>
     */
    public static boolean isNotEmpty(int[] array) {
        return ((array != null) && (array.length > 0));
    }

    /**
     * �?查数组是否不�?<code>null</code>和空数组<code>[]</code>�?
     * <pre>
     * ArrayUtil.isEmpty(null)              = false
     * ArrayUtil.isEmpty(new short[0])     = false
     * ArrayUtil.isEmpty(new short[10])    = true
     * </pre>
     *
     * @param array 要检查的数组
     *
     * @return 如果不为�?, 则返�?<code>true</code>
     */
    public static boolean isNotEmpty(short[] array) {
        return ((array != null) && (array.length > 0));
    }

    /**
     * �?查数组是否不�?<code>null</code>和空数组<code>[]</code>�?
     * <pre>
     * ArrayUtil.isEmpty(null)              = false
     * ArrayUtil.isEmpty(new byte[0])     = false
     * ArrayUtil.isEmpty(new byte[10])    = true
     * </pre>
     *
     * @param array 要检查的数组
     *
     * @return 如果不为�?, 则返�?<code>true</code>
     */
    public static boolean isNotEmpty(byte[] array) {
        return ((array != null) && (array.length > 0));
    }

    /**
     * �?查数组是否不�?<code>null</code>和空数组<code>[]</code>�?
     * <pre>
     * ArrayUtil.isEmpty(null)              = false
     * ArrayUtil.isEmpty(new double[0])     = false
     * ArrayUtil.isEmpty(new double[10])    = true
     * </pre>
     *
     * @param array 要检查的数组
     *
     * @return 如果不为�?, 则返�?<code>true</code>
     */
    public static boolean isNotEmpty(double[] array) {
        return ((array != null) && (array.length > 0));
    }

    /**
     * �?查数组是否不�?<code>null</code>和空数组<code>[]</code>�?
     * <pre>
     * ArrayUtil.isEmpty(null)              = false
     * ArrayUtil.isEmpty(new float[0])     = false
     * ArrayUtil.isEmpty(new float[10])    = true
     * </pre>
     *
     * @param array 要检查的数组
     *
     * @return 如果不为�?, 则返�?<code>true</code>
     */
    public static boolean isNotEmpty(float[] array) {
        return ((array != null) && (array.length > 0));
    }

    /**
     * �?查数组是否不�?<code>null</code>和空数组<code>[]</code>�?
     * <pre>
     * ArrayUtil.isEmpty(null)              = false
     * ArrayUtil.isEmpty(new boolean[0])     = false
     * ArrayUtil.isEmpty(new boolean[10])    = true
     * </pre>
     *
     * @param array 要检查的数组
     *
     * @return 如果不为�?, 则返�?<code>true</code>
     */
    public static boolean isNotEmpty(boolean[] array) {
        return ((array != null) && (array.length > 0));
    }

    /**
     * �?查数组是否不�?<code>null</code>和空数组<code>[]</code>�?
     * <pre>
     * ArrayUtil.isEmpty(null)              = false
     * ArrayUtil.isEmpty(new char[0])     = false
     * ArrayUtil.isEmpty(new char[10])    = true
     * </pre>
     *
     * @param array 要检查的数组
     *
     * @return 如果不为�?, 则返�?<code>true</code>
     */
    public static boolean isNotEmpty(char[] array) {
        return ((array != null) && (array.length > 0));
    }

    /* ============================================================================ */
    /*  默认值函数�??                                                                */
    /*                                                                              */
    /*  当数组为null或empty时，将数组转换成指定的默认数组�??                         */
    /* ============================================================================ */

    /**
     * 如果数组�?<code>null</code>，则返回空数�?<code>[]</code>，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null)           = []
     * ArrayUtil.defaultIfNull(new String[0])  = 数组本身
     * ArrayUtil.defaultIfNull(new String[10]) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     *
     * @return 数组本身或空数组<code>[]</code>
     */
    public static Object[] defaultIfNull(Object[] array) {
        return (array == null) ? EMPTY_OBJECT_ARRAY
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>，则返回空数�?<code>[]</code>，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null)           = []
     * ArrayUtil.defaultIfNull(new long[0])  = 数组本身
     * ArrayUtil.defaultIfNull(new long[10]) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     *
     * @return 数组本身或空数组<code>[]</code>
     */
    public static long[] defaultIfNull(long[] array) {
        return (array == null) ? EMPTY_LONG_ARRAY
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>，则返回空数�?<code>[]</code>，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null)           = []
     * ArrayUtil.defaultIfNull(new int[0])  = 数组本身
     * ArrayUtil.defaultIfNull(new int[10]) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     *
     * @return 数组本身或空数组<code>[]</code>
     */
    public static int[] defaultIfNull(int[] array) {
        return (array == null) ? EMPTY_INT_ARRAY
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>，则返回空数�?<code>[]</code>，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null)           = []
     * ArrayUtil.defaultIfNull(new short[0])  = 数组本身
     * ArrayUtil.defaultIfNull(new short[10]) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     *
     * @return 数组本身或空数组<code>[]</code>
     */
    public static short[] defaultIfNull(short[] array) {
        return (array == null) ? EMPTY_SHORT_ARRAY
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>，则返回空数�?<code>[]</code>，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null)           = []
     * ArrayUtil.defaultIfNull(new byte[0])  = 数组本身
     * ArrayUtil.defaultIfNull(new byte[10]) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     *
     * @return 数组本身或空数组<code>[]</code>
     */
    public static byte[] defaultIfNull(byte[] array) {
        return (array == null) ? EMPTY_BYTE_ARRAY
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>，则返回空数�?<code>[]</code>，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null)           = []
     * ArrayUtil.defaultIfNull(new double[0])  = 数组本身
     * ArrayUtil.defaultIfNull(new double[10]) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     *
     * @return 数组本身或空数组<code>[]</code>
     */
    public static double[] defaultIfNull(double[] array) {
        return (array == null) ? EMPTY_DOUBLE_ARRAY
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>，则返回空数�?<code>[]</code>，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null)           = []
     * ArrayUtil.defaultIfNull(new float[0])  = 数组本身
     * ArrayUtil.defaultIfNull(new float[10]) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     *
     * @return 数组本身或空数组<code>[]</code>
     */
    public static float[] defaultIfNull(float[] array) {
        return (array == null) ? EMPTY_FLOAT_ARRAY
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>，则返回空数�?<code>[]</code>，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null)           = []
     * ArrayUtil.defaultIfNull(new boolean[0])  = 数组本身
     * ArrayUtil.defaultIfNull(new boolean[10]) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     *
     * @return 数组本身或空数组<code>[]</code>
     */
    public static boolean[] defaultIfNull(boolean[] array) {
        return (array == null) ? EMPTY_BOOLEAN_ARRAY
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>，则返回空数�?<code>[]</code>，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null)           = []
     * ArrayUtil.defaultIfNull(new char[0])  = 数组本身
     * ArrayUtil.defaultIfNull(new char[10]) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     *
     * @return 数组本身或空数组<code>[]</code>
     */
    public static char[] defaultIfNull(char[] array) {
        return (array == null) ? EMPTY_CHAR_ARRAY
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>，则返回指定默认数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null, defaultArray)           = defaultArray
     * ArrayUtil.defaultIfNull(new String[0], defaultArray)  = 数组本身
     * ArrayUtil.defaultIfNull(new String[10], defaultArray) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultArray 默认数组
     *
     * @return 数组本身或指定的默认数组
     */
    public static Object[] defaultIfNull(Object[] array, Object[] defaultArray) {
        return (array == null) ? defaultArray
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>，则返回指定默认数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null, defaultArray)         = defaultArray
     * ArrayUtil.defaultIfNull(new long[0], defaultArray)  = 数组本身
     * ArrayUtil.defaultIfNull(new long[10], defaultArray) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultArray 默认数组
     *
     * @return 数组本身或指定的默认数组
     */
    public static long[] defaultIfNull(long[] array, long[] defaultArray) {
        return (array == null) ? defaultArray
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>，则返回指定默认数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null, defaultArray)        = defaultArray
     * ArrayUtil.defaultIfNull(new int[0], defaultArray)  = 数组本身
     * ArrayUtil.defaultIfNull(new int[10], defaultArray) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultArray 默认数组
     *
     * @return 数组本身或指定的默认数组
     */
    public static int[] defaultIfNull(int[] array, int[] defaultArray) {
        return (array == null) ? defaultArray
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>，则返回指定默认数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null, defaultArray)          = defaultArray
     * ArrayUtil.defaultIfNull(new short[0], defaultArray)  = 数组本身
     * ArrayUtil.defaultIfNull(new short[10], defaultArray) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultArray 默认数组
     *
     * @return 数组本身或指定的默认数组
     */
    public static short[] defaultIfNull(short[] array, short[] defaultArray) {
        return (array == null) ? defaultArray
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>，则返回指定默认数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null, defaultArray)         = defaultArray
     * ArrayUtil.defaultIfNull(new byte[0], defaultArray)  = 数组本身
     * ArrayUtil.defaultIfNull(new byte[10], defaultArray) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultArray 默认数组
     *
     * @return 数组本身或指定的默认数组
     */
    public static byte[] defaultIfNull(byte[] array, byte[] defaultArray) {
        return (array == null) ? defaultArray
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>，则返回指定默认数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null, defaultArray)         = defaultArray
     * ArrayUtil.defaultIfNull(new double[0], defaultArray)  = 数组本身
     * ArrayUtil.defaultIfNull(new double[10], defaultArray) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultArray 默认数组
     *
     * @return 数组本身或指定的默认数组
     */
    public static double[] defaultIfNull(double[] array, double[] defaultArray) {
        return (array == null) ? defaultArray
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>，则返回指定默认数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null, defaultArray)          = defaultArray
     * ArrayUtil.defaultIfNull(new float[0], defaultArray)  = 数组本身
     * ArrayUtil.defaultIfNull(new float[10], defaultArray) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultArray 默认数组
     *
     * @return 数组本身或指定的默认数组
     */
    public static float[] defaultIfNull(float[] array, float[] defaultArray) {
        return (array == null) ? defaultArray
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>，则返回指定默认数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null, defaultArray)            = defaultArray
     * ArrayUtil.defaultIfNull(new boolean[0], defaultArray)  = 数组本身
     * ArrayUtil.defaultIfNull(new boolean[10], defaultArray) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultArray 默认数组
     *
     * @return 数组本身或指定的默认数组
     */
    public static boolean[] defaultIfNull(boolean[] array, boolean[] defaultArray) {
        return (array == null) ? defaultArray
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>，则返回指定默认数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null, defaultArray)         = defaultArray
     * ArrayUtil.defaultIfNull(new char[0], defaultArray)  = 数组本身
     * ArrayUtil.defaultIfNull(new char[10], defaultArray) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultArray 默认数组
     *
     * @return 数组本身或指定的默认数组
     */
    public static char[] defaultIfNull(char[] array, char[] defaultArray) {
        return (array == null) ? defaultArray
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>，则返回指定元素类型的空数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null, String.class)           = new String[0]
     * ArrayUtil.defaultIfNull(new String[0], String.class)  = 数组本身
     * ArrayUtil.defaultIfNull(new String[10], String.class) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultComponentType 默认数组的元素类�?
     *
     * @return 数组本身或指定类型的空数�?
     */
    public static Object[] defaultIfNull(Object[] array, Class<?> defaultComponentType) {
        return (array == null)
               ? (Object[]) Array.newInstance(ClassUtil.getNonPrimitiveType(defaultComponentType), 0)
               : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回空数�?<code>[]</code>，否则返回数组本身�??
     * 
     * <p>
     * 此方法实际上�?<code>defaultIfNull(Object[])</code>等效�?
     * <pre>
     * ArrayUtil.defaultIfEmpty(null)           = []
     * ArrayUtil.defaultIfEmpty(new String[0])  = 数组本身
     * ArrayUtil.defaultIfEmpty(new String[10]) = 数组本身
     * </pre>
     * </p>
     *
     * @param array 要转换的数组
     *
     * @return 数组本身或空数组<code>[]</code>
     */
    public static Object[] defaultIfEmpty(Object[] array) {
        return (array == null) ? EMPTY_OBJECT_ARRAY
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回空数�?<code>[]</code>，否则返回数组本身�??
     * 
     * <p>
     * 此方法实际上�?<code>defaultIfNull(Object[])</code>等效�?
     * <pre>
     * ArrayUtil.defaultIfEmpty(null)           = []
     * ArrayUtil.defaultIfEmpty(new long[0])    = 数组本身
     * ArrayUtil.defaultIfEmpty(new long[10])   = 数组本身
     * </pre>
     * </p>
     *
     * @param array 要转换的数组
     *
     * @return 数组本身或空数组<code>[]</code>
     */
    public static long[] defaultIfEmpty(long[] array) {
        return (array == null) ? EMPTY_LONG_ARRAY
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回空数�?<code>[]</code>，否则返回数组本身�??
     * 
     * <p>
     * 此方法实际上�?<code>defaultIfNull(Object[])</code>等效�?
     * <pre>
     * ArrayUtil.defaultIfEmpty(null)          = []
     * ArrayUtil.defaultIfEmpty(new int[0])    = 数组本身
     * ArrayUtil.defaultIfEmpty(new int[10])   = 数组本身
     * </pre>
     * </p>
     *
     * @param array 要转换的数组
     *
     * @return 数组本身或空数组<code>[]</code>
     */
    public static int[] defaultIfEmpty(int[] array) {
        return (array == null) ? EMPTY_INT_ARRAY
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回空数�?<code>[]</code>，否则返回数组本身�??
     * 
     * <p>
     * 此方法实际上�?<code>defaultIfNull(Object[])</code>等效�?
     * <pre>
     * ArrayUtil.defaultIfEmpty(null)               = []
     * ArrayUtil.defaultIfEmpty(new short[0])    = 数组本身
     * ArrayUtil.defaultIfEmpty(new short[10])   = 数组本身
     * </pre>
     * </p>
     *
     * @param array 要转换的数组
     *
     * @return 数组本身或空数组<code>[]</code>
     */
    public static short[] defaultIfEmpty(short[] array) {
        return (array == null) ? EMPTY_SHORT_ARRAY
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回空数�?<code>[]</code>，否则返回数组本身�??
     * 
     * <p>
     * 此方法实际上�?<code>defaultIfNull(Object[])</code>等效�?
     * <pre>
     * ArrayUtil.defaultIfEmpty(null)           = []
     * ArrayUtil.defaultIfEmpty(new byte[0])    = 数组本身
     * ArrayUtil.defaultIfEmpty(new byte[10])   = 数组本身
     * </pre>
     * </p>
     *
     * @param array 要转换的数组
     *
     * @return 数组本身或空数组<code>[]</code>
     */
    public static byte[] defaultIfEmpty(byte[] array) {
        return (array == null) ? EMPTY_BYTE_ARRAY
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回空数�?<code>[]</code>，否则返回数组本身�??
     * 
     * <p>
     * 此方法实际上�?<code>defaultIfNull(Object[])</code>等效�?
     * <pre>
     * ArrayUtil.defaultIfEmpty(null)               = []
     * ArrayUtil.defaultIfEmpty(new double[0])    = 数组本身
     * ArrayUtil.defaultIfEmpty(new double[10])   = 数组本身
     * </pre>
     * </p>
     *
     * @param array 要转换的数组
     *
     * @return 数组本身或空数组<code>[]</code>
     */
    public static double[] defaultIfEmpty(double[] array) {
        return (array == null) ? EMPTY_DOUBLE_ARRAY
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回空数�?<code>[]</code>，否则返回数组本身�??
     * 
     * <p>
     * 此方法实际上�?<code>defaultIfNull(Object[])</code>等效�?
     * <pre>
     * ArrayUtil.defaultIfEmpty(null)               = []
     * ArrayUtil.defaultIfEmpty(new float[0])    = 数组本身
     * ArrayUtil.defaultIfEmpty(new float[10])   = 数组本身
     * </pre>
     * </p>
     *
     * @param array 要转换的数组
     *
     * @return 数组本身或空数组<code>[]</code>
     */
    public static float[] defaultIfEmpty(float[] array) {
        return (array == null) ? EMPTY_FLOAT_ARRAY
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回空数�?<code>[]</code>，否则返回数组本身�??
     * 
     * <p>
     * 此方法实际上�?<code>defaultIfNull(Object[])</code>等效�?
     * <pre>
     * ArrayUtil.defaultIfEmpty(null)               = []
     * ArrayUtil.defaultIfEmpty(new boolean[0])    = 数组本身
     * ArrayUtil.defaultIfEmpty(new boolean[10])   = 数组本身
     * </pre>
     * </p>
     *
     * @param array 要转换的数组
     *
     * @return 数组本身或空数组<code>[]</code>
     */
    public static boolean[] defaultIfEmpty(boolean[] array) {
        return (array == null) ? EMPTY_BOOLEAN_ARRAY
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回空数�?<code>[]</code>，否则返回数组本身�??
     * 
     * <p>
     * 此方法实际上�?<code>defaultIfNull(Object[])</code>等效�?
     * <pre>
     * ArrayUtil.defaultIfEmpty(null)           = []
     * ArrayUtil.defaultIfEmpty(new char[0])    = 数组本身
     * ArrayUtil.defaultIfEmpty(new char[10])   = 数组本身
     * </pre>
     * </p>
     *
     * @param array 要转换的数组
     *
     * @return 数组本身或空数组<code>[]</code>
     */
    public static char[] defaultIfEmpty(char[] array) {
        return (array == null) ? EMPTY_CHAR_ARRAY
                               : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回指定默认数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfEmpty(null, defaultArray)           = defaultArray
     * ArrayUtil.defaultIfEmpty(new String[0], defaultArray)  = defaultArray
     * ArrayUtil.defaultIfEmpty(new String[10], defaultArray) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultArray 默认数组
     *
     * @return 数组本身或指定的默认数组
     */
    public static Object[] defaultIfEmpty(Object[] array, Object[] defaultArray) {
        return ((array == null) || (array.length == 0)) ? defaultArray
                                                        : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回指定默认数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfEmpty(null, defaultArray)           = defaultArray
     * ArrayUtil.defaultIfEmpty(new long[0], defaultArray)    = defaultArray
     * ArrayUtil.defaultIfEmpty(new long[10], defaultArray)   = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultArray 默认数组
     *
     * @return 数组本身或指定的默认数组
     */
    public static long[] defaultIfEmpty(long[] array, long[] defaultArray) {
        return ((array == null) || (array.length == 0)) ? defaultArray
                                                        : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回指定默认数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfEmpty(null, defaultArray)           = defaultArray
     * ArrayUtil.defaultIfEmpty(new int[0], defaultArray)     = defaultArray
     * ArrayUtil.defaultIfEmpty(new int[10], defaultArray)    = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultArray 默认数组
     *
     * @return 数组本身或指定的默认数组
     */
    public static int[] defaultIfEmpty(int[] array, int[] defaultArray) {
        return ((array == null) || (array.length == 0)) ? defaultArray
                                                        : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回指定默认数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfEmpty(null, defaultArray)           = defaultArray
     * ArrayUtil.defaultIfEmpty(new short[0], defaultArray)   = defaultArray
     * ArrayUtil.defaultIfEmpty(new short[10], defaultArray)  = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultArray 默认数组
     *
     * @return 数组本身或指定的默认数组
     */
    public static short[] defaultIfEmpty(short[] array, short[] defaultArray) {
        return ((array == null) || (array.length == 0)) ? defaultArray
                                                        : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回指定默认数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfEmpty(null, defaultArray)           = defaultArray
     * ArrayUtil.defaultIfEmpty(new byte[0], defaultArray)    = defaultArray
     * ArrayUtil.defaultIfEmpty(new byte[10], defaultArray)   = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultArray 默认数组
     *
     * @return 数组本身或指定的默认数组
     */
    public static byte[] defaultIfEmpty(byte[] array, byte[] defaultArray) {
        return ((array == null) || (array.length == 0)) ? defaultArray
                                                        : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回指定默认数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfEmpty(null, defaultArray)           = defaultArray
     * ArrayUtil.defaultIfEmpty(new double[0], defaultArray)  = defaultArray
     * ArrayUtil.defaultIfEmpty(new double[10], defaultArray) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultArray 默认数组
     *
     * @return 数组本身或指定的默认数组
     */
    public static double[] defaultIfEmpty(double[] array, double[] defaultArray) {
        return ((array == null) || (array.length == 0)) ? defaultArray
                                                        : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回指定默认数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfEmpty(null, defaultArray)           = defaultArray
     * ArrayUtil.defaultIfEmpty(new float[0], defaultArray)   = defaultArray
     * ArrayUtil.defaultIfEmpty(new float[10], defaultArray)  = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultArray 默认数组
     *
     * @return 数组本身或指定的默认数组
     */
    public static float[] defaultIfEmpty(float[] array, float[] defaultArray) {
        return ((array == null) || (array.length == 0)) ? defaultArray
                                                        : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回指定默认数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfEmpty(null, defaultArray)              = defaultArray
     * ArrayUtil.defaultIfEmpty(new boolean[0], defaultArray)    = defaultArray
     * ArrayUtil.defaultIfEmpty(new boolean[10], defaultArray)   = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultArray 默认数组
     *
     * @return 数组本身或指定的默认数组
     */
    public static boolean[] defaultIfEmpty(boolean[] array, boolean[] defaultArray) {
        return ((array == null) || (array.length == 0)) ? defaultArray
                                                        : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回指定默认数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfEmpty(null, defaultArray)           = defaultArray
     * ArrayUtil.defaultIfEmpty(new char[0], defaultArray)    = defaultArray
     * ArrayUtil.defaultIfEmpty(new char[10], defaultArray)   = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultArray 默认数组
     *
     * @return 数组本身或指定的默认数组
     */
    public static char[] defaultIfEmpty(char[] array, char[] defaultArray) {
        return ((array == null) || (array.length == 0)) ? defaultArray
                                                        : array;
    }

    /**
     * 如果数组�?<code>null</code>或空数组<code>[]</code>，则返回指定元素类型的空数组，否则返回数组本身�??
     * <pre>
     * ArrayUtil.defaultIfNull(null, String.class)           = new String[0]
     * ArrayUtil.defaultIfNull(new String[0], String.class)  = new String[0]
     * ArrayUtil.defaultIfNull(new String[10], String.class) = 数组本身
     * </pre>
     *
     * @param array 要转换的数组
     * @param defaultComponentType 默认数组的元素类�?
     *
     * @return 数组本身或指定类型的空数�?
     */
    public static Object[] defaultIfEmpty(Object[] array, Class<?> defaultComponentType) {
        return ((array == null) || (array.length == 0))
               ? (Object[]) Array.newInstance(ClassUtil.getNonPrimitiveType(defaultComponentType), 0)
               : array;
    }

    /* ============================================================================ */
    /*  比较函数�?                                                                  */
    /*                                                                              */
    /*  以下方法用来比较两个数组是否完全相同，支持多维数组�??                        */
    /* ============================================================================ */

    /**
     * 递归地比较两个数组是否相同，支持多维数组�?
     * 
     * <p>
     * 如果比较的对象不是数组，则此方法的结果同<code>ObjectUtil.equals</code>�?
     * </p>
     *
     * @param array1 数组1
     * @param array2 数组2
     *
     * @return 如果相等, 则返�?<code>true</code>
     */
    public static boolean equals(Object array1, Object array2) {
        if (array1 == array2) {
            return true;
        }

        if ((array1 == null) || (array2 == null)) {
            return false;
        }

        Class<?> clazz = array1.getClass();

        if (!clazz.equals(array2.getClass())) {
            return false;
        }

        if (!clazz.isArray()) {
            return array1.equals(array2);
        }

        // array1和array2为同类型的数�?
        if (array1 instanceof long[]) {
            long[] longArray1 = (long[]) array1;
            long[] longArray2 = (long[]) array2;

            if (longArray1.length != longArray2.length) {
                return false;
            }

            for (int i = 0; i < longArray1.length; i++) {
                if (longArray1[i] != longArray2[i]) {
                    return false;
                }
            }

            return true;
        } else if (array1 instanceof int[]) {
            int[] intArray1 = (int[]) array1;
            int[] intArray2 = (int[]) array2;

            if (intArray1.length != intArray2.length) {
                return false;
            }

            for (int i = 0; i < intArray1.length; i++) {
                if (intArray1[i] != intArray2[i]) {
                    return false;
                }
            }

            return true;
        } else if (array1 instanceof short[]) {
            short[] shortArray1 = (short[]) array1;
            short[] shortArray2 = (short[]) array2;

            if (shortArray1.length != shortArray2.length) {
                return false;
            }

            for (int i = 0; i < shortArray1.length; i++) {
                if (shortArray1[i] != shortArray2[i]) {
                    return false;
                }
            }

            return true;
        } else if (array1 instanceof byte[]) {
            byte[] byteArray1 = (byte[]) array1;
            byte[] byteArray2 = (byte[]) array2;

            if (byteArray1.length != byteArray2.length) {
                return false;
            }

            for (int i = 0; i < byteArray1.length; i++) {
                if (byteArray1[i] != byteArray2[i]) {
                    return false;
                }
            }

            return true;
        } else if (array1 instanceof double[]) {
            double[] doubleArray1 = (double[]) array1;
            double[] doubleArray2 = (double[]) array2;

            if (doubleArray1.length != doubleArray2.length) {
                return false;
            }

            for (int i = 0; i < doubleArray1.length; i++) {
                if (Double.doubleToLongBits(doubleArray1[i]) != Double.doubleToLongBits(doubleArray2[i])) {
                    return false;
                }
            }

            return true;
        } else if (array1 instanceof float[]) {
            float[] floatArray1 = (float[]) array1;
            float[] floatArray2 = (float[]) array2;

            if (floatArray1.length != floatArray2.length) {
                return false;
            }

            for (int i = 0; i < floatArray1.length; i++) {
                if (Float.floatToIntBits(floatArray1[i]) != Float.floatToIntBits(floatArray2[i])) {
                    return false;
                }
            }

            return true;
        } else if (array1 instanceof boolean[]) {
            boolean[] booleanArray1 = (boolean[]) array1;
            boolean[] booleanArray2 = (boolean[]) array2;

            if (booleanArray1.length != booleanArray2.length) {
                return false;
            }

            for (int i = 0; i < booleanArray1.length; i++) {
                if (booleanArray1[i] != booleanArray2[i]) {
                    return false;
                }
            }

            return true;
        } else if (array1 instanceof char[]) {
            char[] charArray1 = (char[]) array1;
            char[] charArray2 = (char[]) array2;

            if (charArray1.length != charArray2.length) {
                return false;
            }

            for (int i = 0; i < charArray1.length; i++) {
                if (charArray1[i] != charArray2[i]) {
                    return false;
                }
            }

            return true;
        } else {
            Object[] objectArray1 = (Object[]) array1;
            Object[] objectArray2 = (Object[]) array2;

            if (objectArray1.length != objectArray2.length) {
                return false;
            }

            for (int i = 0; i < objectArray1.length; i++) {
                if (!equals(objectArray1[i], objectArray2[i])) {
                    return false;
                }
            }

            return true;
        }
    }

    /* ============================================================================ */
    /*  Hashcode函数�?                                                              */
    /*                                                                              */
    /*  以下方法用来取得数组的hash code�?                                           */
    /* ============================================================================ */

    /**
     * 取得数组的hash�?, 如果数组�?<code>null</code>, 则返�?<code>0</code>�?
     * 
     * <p>
     * 如果对象不是数组，则此方法的结果�?<code>ObjectUtil.hashCode</code>�?
     * </p>
     *
     * @param array 数组
     *
     * @return hash�?
     */
    public static int hashCode(Object array) {
        if (array == null) {
            return 0;
        }

        if (!array.getClass().isArray()) {
            return array.hashCode();
        }

        int hashCode = INITIAL_NON_ZERO_ODD_NUMBER;

        // array是数�?
        if (array instanceof long[]) {
            long[] longArray = (long[]) array;

            for (int i = 0; i < longArray.length; i++) {
                hashCode = (hashCode * MULTIPLIER_NON_ZERO_ODD_NUMBER)
                           + ((int) (longArray[i] ^ (longArray[i] >> 32)));
            }
        } else if (array instanceof int[]) {
            int[] intArray = (int[]) array;

            for (int i = 0; i < intArray.length; i++) {
                hashCode = (hashCode * MULTIPLIER_NON_ZERO_ODD_NUMBER) + intArray[i];
            }
        } else if (array instanceof short[]) {
            short[] shortArray = (short[]) array;

            for (int i = 0; i < shortArray.length; i++) {
                hashCode = (hashCode * MULTIPLIER_NON_ZERO_ODD_NUMBER) + shortArray[i];
            }
        } else if (array instanceof byte[]) {
            byte[] byteArray = (byte[]) array;

            for (int i = 0; i < byteArray.length; i++) {
                hashCode = (hashCode * MULTIPLIER_NON_ZERO_ODD_NUMBER) + byteArray[i];
            }
        } else if (array instanceof double[]) {
            double[] doubleArray = (double[]) array;

            for (int i = 0; i < doubleArray.length; i++) {
                long longBits = Double.doubleToLongBits(doubleArray[i]);

                hashCode = (hashCode * MULTIPLIER_NON_ZERO_ODD_NUMBER)
                           + ((int) (longBits ^ (longBits >> 32)));
            }
        } else if (array instanceof float[]) {
            float[] floatArray = (float[]) array;

            for (int i = 0; i < floatArray.length; i++) {
                hashCode = (hashCode * MULTIPLIER_NON_ZERO_ODD_NUMBER)
                           + Float.floatToIntBits(floatArray[i]);
            }
        } else if (array instanceof boolean[]) {
            boolean[] booleanArray = (boolean[]) array;

            for (int i = 0; i < booleanArray.length; i++) {
                hashCode = (hashCode * MULTIPLIER_NON_ZERO_ODD_NUMBER) + (booleanArray[i] ? 1
                                                                                          : 0);
            }
        } else if (array instanceof char[]) {
            char[] charArray = (char[]) array;

            for (int i = 0; i < charArray.length; i++) {
                hashCode = (hashCode * MULTIPLIER_NON_ZERO_ODD_NUMBER) + charArray[i];
            }
        } else {
            Object[] objectArray = (Object[]) array;

            for (int i = 0; i < objectArray.length; i++) {
                hashCode = (hashCode * MULTIPLIER_NON_ZERO_ODD_NUMBER) + hashCode(objectArray[i]);
            }
        }

        return hashCode;
    }

    /* ============================================================================ */
    /*  将数组转换成集合类�??                                                        */
    /* ============================================================================ */

    /**
     * 将数组映射成固定长度�?<code>List</code>，当改变这个<code>List</code>中的值时。数组中的相应�?�也被改变�??
     * 
     * <p>
     * 如果输入数组�?<code>null</code>，则返回<code>null</code>�?
     * </p>
     * 
     * <p>
     * 该方法内部调�?<code>java.util.Arrays.asList</code>方法�?返回的列表为指定数组的映像（固定长度），因此性能和内存占用上�?<code>toList</code>方法更优�?
     * </p>
     * 
     * <p>
     * 这个方法常被用于初始化，例如�?
     * <pre>
     * List myList = ArrayUtil.toFixedList(new String[] { "aaa", "bbb", "ccc" });
     * </pre>
     * </p>
     *
     * @param array 要转换的数组
     *
     * @return 以数组本身为映射的list
     */
    public static List<Object> toFixedList(Object[] array) {
        if (array == null) {
            return null;
        }

        return Arrays.asList(array);
    }

    /**
     * 将数组转换成<code>List</code>�?
     * 
     * <p>
     * 如果输入数组�?<code>null</code>，则返回<code>null</code>�?
     * </p>
     * 
     * <p>
     * 该方法返回的列表为指定数组的复本，�??<code>java.util.Arrays.asList</code>方法�?返回的列表为指定数组的映像（固定长度）�??
     * </p>
     * 
     * <p>
     * 这个方法常被用于初始化，例如�?
     * <pre>
     * List myList      = ArrayUtil.toList(new String[] { "aaa", "bbb", "ccc" });
     * List singleList  = ArrayUtil.toList("hello");     // 返回单个元素的列表["hello"]
     * </pre>
     * </p>
     *
     * @param array 要转换的数组
     *
     * @return 被创建的list
     */
    public static List<?> toList(Object array) {
        return toList(array, null);
    }

    /**
     * 将数组转换成<code>List</code>�?
     * 
     * <p>
     * 如果输入数组�?<code>null</code>，则返回<code>null</code>�?
     * </p>
     * 
     * <p>
     * 该方法返回的列表为指定数组的复本，�??<code>java.util.Arrays.asList</code>方法�?返回的列表为指定数组的映像（固定长度）�??
     * </p>
     * 
     * <p>
     * 这个方法常被用于初始化，例如�?
     * <pre>
     * List myList      = ArrayUtil.toList(new String[] { "aaa", "bbb", "ccc" }, new ArrayList());
     * List singleList  = ArrayUtil.toList("hello", new ArrayList());     // 返回单个元素的列表["hello"]
     * </pre>
     * </p>
     *
     * @param array 要转换的数组
     * @param list 要填充的列表，如果是<code>null</code>，则创建�?
     *
     * @return 被创建或填充的list
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<?> toList(Object array, List list) {
        if (array == null) {
            return list;
        }

        // 非array，创建一个只有一个元素的列表
        if (!array.getClass().isArray()) {
            if (list == null) {
                list = new ArrayList<Object>(1);
            }

            list.add(array);
        } else if (array instanceof long[]) {
            long[] longArray = (long[]) array;

            if (list == null) {
                list = new ArrayList<Long>(longArray.length);
            }

            for (int i = 0; i < longArray.length; i++) {
                list.add(new Long(longArray[i]));
            }
        } else if (array instanceof int[]) {
            int[] intArray = (int[]) array;

            if (list == null) {
                list = new ArrayList(intArray.length);
            }

            for (int i = 0; i < intArray.length; i++) {
                list.add(new Integer(intArray[i]));
            }
        } else if (array instanceof short[]) {
            short[] shortArray = (short[]) array;

            if (list == null) {
                list = new ArrayList<Short>(shortArray.length);
            }

            for (int i = 0; i < shortArray.length; i++) {
                list.add(new Short(shortArray[i]));
            }
        } else if (array instanceof byte[]) {
            byte[] byteArray = (byte[]) array;

            if (list == null) {
                list = new ArrayList(byteArray.length);
            }

            for (int i = 0; i < byteArray.length; i++) {
                list.add(new Byte(byteArray[i]));
            }
        } else if (array instanceof double[]) {
            double[] doubleArray = (double[]) array;

            if (list == null) {
                list = new ArrayList(doubleArray.length);
            }

            for (int i = 0; i < doubleArray.length; i++) {
                list.add(new Double(doubleArray[i]));
            }
        } else if (array instanceof float[]) {
            float[] floatArray = (float[]) array;

            if (list == null) {
                list = new ArrayList(floatArray.length);
            }

            for (int i = 0; i < floatArray.length; i++) {
                list.add(new Float(floatArray[i]));
            }
        } else if (array instanceof boolean[]) {
            boolean[] booleanArray = (boolean[]) array;

            if (list == null) {
                list = new ArrayList(booleanArray.length);
            }

            for (int i = 0; i < booleanArray.length; i++) {
                list.add(booleanArray[i] ? Boolean.TRUE
                                         : Boolean.FALSE);
            }
        } else if (array instanceof char[]) {
            char[] charArray = (char[]) array;

            if (list == null) {
                list = new ArrayList(charArray.length);
            }

            for (int i = 0; i < charArray.length; i++) {
                list.add(new Character(charArray[i]));
            }
        } else {
            Object[] objectArray = (Object[]) array;

            if (list == null) {
                list = new ArrayList(objectArray.length);
            }

            for (int i = 0; i < objectArray.length; i++) {
                list.add(objectArray[i]);
            }
        }

        return list;
    }

    /**
     * 将数组转换成<code>Map</code>。数组的元素必须�?<code>Map.Entry</code>或元素个数多�?2的子数组�?
     * 
     * <p>
     * 如果输入数组�?<code>null</code>，则返回<code>null</code>�?
     * </p>
     * 
     * <p>
     * 这个方法常被用于初始化，例如�?
     * <pre>
     * Map colorMap = ArrayUtil.toMap(new String[][] {
     *     {"RED", "#FF0000"},
     *     {"GREEN", "#00FF00"},
     *     {"BLUE", "#0000FF"}});
     * </pre>
     * </p>
     *
     * @param array 要转换的数组
     *
     * @return 被创建的map
     *
     * @throws IllegalArgumentException 如果有一个子数组元素个数小于2或不�?<code>Map.Entry</code>实例
     */
    @SuppressWarnings({ "rawtypes"})
    public static Map toMap(Object[] array) {
        return toMap(array, null);
    }

    /**
     * 将数组转换成<code>Map</code>。数组的元素必须�?<code>Map.Entry</code>或元素个数多�?2的子数组�?
     * 
     * <p>
     * 如果输入数组�?<code>null</code>，则返回<code>null</code>�?
     * </p>
     * 
     * <p>
     * 这个方法常被用于初始化，例如�?
     * <pre>
     * Map colorMap = ArrayUtil.toMap(new String[][] {{
     *     {"RED", "#FF0000"},
     *     {"GREEN", "#00FF00"},
     *     {"BLUE", "#0000FF"}}, new HashMap());
     * </pre>
     * </p>
     *
     * @param array 要转换的数组
     * @param map 要填充的map，如果为<code>null</code>则自动创建之
     *
     * @return 被创建或填充的map
     *
     * @throws IllegalArgumentException 如果有一个子数组元素个数小于2或不�?<code>Map.Entry</code>实例
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static Map toMap(Object[] array, Map map) {
        if (array == null) {
            return map;
        }

        if (map == null) {
            map = new HashMap((int) (array.length * 1.5));
        }

        for (int i = 0; i < array.length; i++) {
            Object object = array[i];

            if (object instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) object;

                map.put(entry.getKey(), entry.getValue());
            } else if (object instanceof Object[]) {
                Object[] entry = (Object[]) object;

                if (entry.length < 2) {
                    throw new IllegalArgumentException("Array element " + i + ", '" + object
                                                       + "', has a length less than 2");
                }

                map.put(entry[0], entry[1]);
            } else {
                throw new IllegalArgumentException("Array element " + i + ", '" + object
                                                   + "', is neither of type Map.Entry nor an Array");
            }
        }

        return map;
    }

    /* ============================================================================ */
    /*  Clone函数�?                                                                 */
    /*                                                                              */
    /*  以下方法调用Object.clone方法，进行�?�浅复制”（shallow copy）�??              */
    /* ============================================================================ */

    /**
     * 复制�?个数组�?�如果数组为<code>null</code>，则返回<code>null</code>�?
     * 
     * <p>
     * 此方法只进行“浅复制”，也就是说，数组中的对象本身不会被复制�? 另外，此方法也不处理多维数组�?
     * </p>
     *
     * @param array 要复制的数组
     *
     * @return 数组的复本，如果原始数组�?<code>null</code>，则返回<code>null</code>
     */
    public static Object[] clone(Object[] array) {
        if (array == null) {
            return null;
        }

        return (Object[]) array.clone();
    }

    /**
     * 复制�?个数组�?�如果数组为<code>null</code>，则返回<code>null</code>�?
     * 
     * <p>
     * 此方法也不处理多维数组�??
     * </p>
     *
     * @param array 要复制的数组
     *
     * @return 数组的复本，如果原始数组�?<code>null</code>，则返回<code>null</code>
     */
    public static long[] clone(long[] array) {
        if (array == null) {
            return null;
        }

        return (long[]) array.clone();
    }

    /**
     * 复制�?个数组�?�如果数组为<code>null</code>，则返回<code>null</code>�?
     * 
     * <p>
     * 此方法也不处理多维数组�??
     * </p>
     *
     * @param array 要复制的数组
     *
     * @return 数组的复本，如果原始数组�?<code>null</code>，则返回<code>null</code>
     */
    public static int[] clone(int[] array) {
        if (array == null) {
            return null;
        }

        return (int[]) array.clone();
    }

    /**
     * 复制�?个数组�?�如果数组为<code>null</code>，则返回<code>null</code>�?
     * 
     * <p>
     * 此方法也不处理多维数组�??
     * </p>
     *
     * @param array 要复制的数组
     *
     * @return 数组的复本，如果原始数组�?<code>null</code>，则返回<code>null</code>
     */
    public static short[] clone(short[] array) {
        if (array == null) {
            return null;
        }

        return (short[]) array.clone();
    }

    /**
     * 复制�?个数组�?�如果数组为<code>null</code>，则返回<code>null</code>�?
     * 
     * <p>
     * 此方法也不处理多维数组�??
     * </p>
     *
     * @param array 要复制的数组
     *
     * @return 数组的复本，如果原始数组�?<code>null</code>，则返回<code>null</code>
     */
    public static byte[] clone(byte[] array) {
        if (array == null) {
            return null;
        }

        return (byte[]) array.clone();
    }

    /**
     * 复制�?个数组�?�如果数组为<code>null</code>，则返回<code>null</code>�?
     * 
     * <p>
     * 此方法也不处理多维数组�??
     * </p>
     *
     * @param array 要复制的数组
     *
     * @return 数组的复本，如果原始数组�?<code>null</code>，则返回<code>null</code>
     */
    public static double[] clone(double[] array) {
        if (array == null) {
            return null;
        }

        return (double[]) array.clone();
    }

    /**
     * 复制�?个数组�?�如果数组为<code>null</code>，则返回<code>null</code>�?
     * 
     * <p>
     * 此方法也不处理多维数组�??
     * </p>
     *
     * @param array 要复制的数组
     *
     * @return 数组的复本，如果原始数组�?<code>null</code>，则返回<code>null</code>
     */
    public static float[] clone(float[] array) {
        if (array == null) {
            return null;
        }

        return (float[]) array.clone();
    }

    /**
     * 复制�?个数组�?�如果数组为<code>null</code>，则返回<code>null</code>�?
     * 
     * <p>
     * 此方法也不处理多维数组�??
     * </p>
     *
     * @param array 要复制的数组
     *
     * @return 数组的复本，如果原始数组�?<code>null</code>，则返回<code>null</code>
     */
    public static boolean[] clone(boolean[] array) {
        if (array == null) {
            return null;
        }

        return (boolean[]) array.clone();
    }

    /**
     * 复制�?个数组�?�如果数组为<code>null</code>，则返回<code>null</code>�?
     * 
     * <p>
     * 此方法也不处理多维数组�??
     * </p>
     *
     * @param array 要复制的数组
     *
     * @return 数组的复本，如果原始数组�?<code>null</code>，则返回<code>null</code>
     */
    public static char[] clone(char[] array) {
        if (array == null) {
            return null;
        }

        return (char[]) array.clone();
    }

    /* ============================================================================ */
    /*  比较数组的长度�??                                                            */
    /* ============================================================================ */

    /**
     * 判断两个数组是否具有相同的长度�?�如果数组为<code>null</code>则被看作长度�?<code>0</code>�?
     *
     * @param array1 数组1
     * @param array2 数组2
     *
     * @return 如果两个数组长度相同，则返回<code>true</code>
     */
    public static boolean isSameLength(Object[] array1, Object[] array2) {
        int length1 = (array1 == null) ? 0
                                       : array1.length;
        int length2 = (array2 == null) ? 0
                                       : array2.length;

        return length1 == length2;
    }

    /**
     * 判断两个数组是否具有相同的长度�?�如果数组为<code>null</code>则被看作长度�?<code>0</code>�?
     *
     * @param array1 数组1
     * @param array2 数组2
     *
     * @return 如果两个数组长度相同，则返回<code>true</code>
     */
    public static boolean isSameLength(long[] array1, long[] array2) {
        int length1 = (array1 == null) ? 0
                                       : array1.length;
        int length2 = (array2 == null) ? 0
                                       : array2.length;

        return length1 == length2;
    }

    /**
     * 判断两个数组是否具有相同的长度�?�如果数组为<code>null</code>则被看作长度�?<code>0</code>�?
     *
     * @param array1 数组1
     * @param array2 数组2
     *
     * @return 如果两个数组长度相同，则返回<code>true</code>
     */
    public static boolean isSameLength(int[] array1, int[] array2) {
        int length1 = (array1 == null) ? 0
                                       : array1.length;
        int length2 = (array2 == null) ? 0
                                       : array2.length;

        return length1 == length2;
    }

    /**
     * 判断两个数组是否具有相同的长度�?�如果数组为<code>null</code>则被看作长度�?<code>0</code>�?
     *
     * @param array1 数组1
     * @param array2 数组2
     *
     * @return 如果两个数组长度相同，则返回<code>true</code>
     */
    public static boolean isSameLength(short[] array1, short[] array2) {
        int length1 = (array1 == null) ? 0
                                       : array1.length;
        int length2 = (array2 == null) ? 0
                                       : array2.length;

        return length1 == length2;
    }

    /**
     * 判断两个数组是否具有相同的长度�?�如果数组为<code>null</code>则被看作长度�?<code>0</code>�?
     *
     * @param array1 数组1
     * @param array2 数组2
     *
     * @return 如果两个数组长度相同，则返回<code>true</code>
     */
    public static boolean isSameLength(byte[] array1, byte[] array2) {
        int length1 = (array1 == null) ? 0
                                       : array1.length;
        int length2 = (array2 == null) ? 0
                                       : array2.length;

        return length1 == length2;
    }

    /**
     * 判断两个数组是否具有相同的长度�?�如果数组为<code>null</code>则被看作长度�?<code>0</code>�?
     *
     * @param array1 数组1
     * @param array2 数组2
     *
     * @return 如果两个数组长度相同，则返回<code>true</code>
     */
    public static boolean isSameLength(double[] array1, double[] array2) {
        int length1 = (array1 == null) ? 0
                                       : array1.length;
        int length2 = (array2 == null) ? 0
                                       : array2.length;

        return length1 == length2;
    }

    /**
     * 判断两个数组是否具有相同的长度�?�如果数组为<code>null</code>则被看作长度�?<code>0</code>�?
     *
     * @param array1 数组1
     * @param array2 数组2
     *
     * @return 如果两个数组长度相同，则返回<code>true</code>
     */
    public static boolean isSameLength(float[] array1, float[] array2) {
        int length1 = (array1 == null) ? 0
                                       : array1.length;
        int length2 = (array2 == null) ? 0
                                       : array2.length;

        return length1 == length2;
    }

    /**
     * 判断两个数组是否具有相同的长度�?�如果数组为<code>null</code>则被看作长度�?<code>0</code>�?
     *
     * @param array1 数组1
     * @param array2 数组2
     *
     * @return 如果两个数组长度相同，则返回<code>true</code>
     */
    public static boolean isSameLength(boolean[] array1, boolean[] array2) {
        int length1 = (array1 == null) ? 0
                                       : array1.length;
        int length2 = (array2 == null) ? 0
                                       : array2.length;

        return length1 == length2;
    }

    /**
     * 判断两个数组是否具有相同的长度�?�如果数组为<code>null</code>则被看作长度�?<code>0</code>�?
     *
     * @param array1 数组1
     * @param array2 数组2
     *
     * @return 如果两个数组长度相同，则返回<code>true</code>
     */
    public static boolean isSameLength(char[] array1, char[] array2) {
        int length1 = (array1 == null) ? 0
                                       : array1.length;
        int length2 = (array2 == null) ? 0
                                       : array2.length;

        return length1 == length2;
    }

    /* ============================================================================ */
    /*  反转数组的元素顺序�??                                                        */
    /* ============================================================================ */

    /**
     * 反转数组的元素顺序�?�如果数组为<code>null</code>，则�?么也不做�?
     *
     * @param array 要反转的数组
     */
    public static void reverse(Object[] array) {
        if (array == null) {
            return;
        }

        Object tmp;

        for (int i = 0, j = array.length - 1; j > i; i++, j--) {
            tmp      = array[j];
            array[j] = array[i];
            array[i] = tmp;
        }
    }

    /**
     * 反转数组的元素顺序�?�如果数组为<code>null</code>，则�?么也不做�?
     *
     * @param array 要反转的数组
     */
    public static void reverse(long[] array) {
        if (array == null) {
            return;
        }

        long tmp;

        for (int i = 0, j = array.length - 1; j > i; i++, j--) {
            tmp      = array[j];
            array[j] = array[i];
            array[i] = tmp;
        }
    }

    /**
     * 反转数组的元素顺序�?�如果数组为<code>null</code>，则�?么也不做�?
     *
     * @param array 要反转的数组
     */
    public static void reverse(int[] array) {
        if (array == null) {
            return;
        }

        int tmp;

        for (int i = 0, j = array.length - 1; j > i; i++, j--) {
            tmp      = array[j];
            array[j] = array[i];
            array[i] = tmp;
        }
    }

    /**
     * 反转数组的元素顺序�?�如果数组为<code>null</code>，则�?么也不做�?
     *
     * @param array 要反转的数组
     */
    public static void reverse(short[] array) {
        if (array == null) {
            return;
        }

        short tmp;

        for (int i = 0, j = array.length - 1; j > i; i++, j--) {
            tmp      = array[j];
            array[j] = array[i];
            array[i] = tmp;
        }
    }

    /**
     * 反转数组的元素顺序�?�如果数组为<code>null</code>，则�?么也不做�?
     *
     * @param array 要反转的数组
     */
    public static void reverse(byte[] array) {
        if (array == null) {
            return;
        }

        byte tmp;

        for (int i = 0, j = array.length - 1; j > i; i++, j--) {
            tmp      = array[j];
            array[j] = array[i];
            array[i] = tmp;
        }
    }

    /**
     * 反转数组的元素顺序�?�如果数组为<code>null</code>，则�?么也不做�?
     *
     * @param array 要反转的数组
     */
    public static void reverse(double[] array) {
        if (array == null) {
            return;
        }

        double tmp;

        for (int i = 0, j = array.length - 1; j > i; i++, j--) {
            tmp      = array[j];
            array[j] = array[i];
            array[i] = tmp;
        }
    }

    /**
     * 反转数组的元素顺序�?�如果数组为<code>null</code>，则�?么也不做�?
     *
     * @param array 要反转的数组
     */
    public static void reverse(float[] array) {
        if (array == null) {
            return;
        }

        float tmp;

        for (int i = 0, j = array.length - 1; j > i; i++, j--) {
            tmp      = array[j];
            array[j] = array[i];
            array[i] = tmp;
        }
    }

    /**
     * 反转数组的元素顺序�?�如果数组为<code>null</code>，则�?么也不做�?
     *
     * @param array 要反转的数组
     */
    public static void reverse(boolean[] array) {
        if (array == null) {
            return;
        }

        boolean tmp;

        for (int i = 0, j = array.length - 1; j > i; i++, j--) {
            tmp      = array[j];
            array[j] = array[i];
            array[i] = tmp;
        }
    }

    /**
     * 反转数组的元素顺序�?�如果数组为<code>null</code>，则�?么也不做�?
     *
     * @param array 要反转的数组
     */
    public static void reverse(char[] array) {
        if (array == null) {
            return;
        }

        char tmp;

        for (int i = 0, j = array.length - 1; j > i; i++, j--) {
            tmp      = array[j];
            array[j] = array[i];
            array[i] = tmp;
        }
    }

    /* ============================================================================ */
    /*  在数组中查找�?个元素或�?个元素序列�??                                        */
    /*                                                                              */
    /*  类型：Object[]                                                              */
    /* ============================================================================ */

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param objectToFind 要查找的元素
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(Object[] array, Object objectToFind) {
        return indexOf(array, objectToFind, 0);
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(Object[] array, Object[] arrayToFind) {
        return indexOf(array, arrayToFind, 0);
    }

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param objectToFind 要查找的元素
     * @param startIndex 起始索引
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(Object[] array, Object objectToFind, int startIndex) {
        if (array == null) {
            return -1;
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        if (objectToFind == null) {
            for (int i = startIndex; i < array.length; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = startIndex; i < array.length; i++) {
                if (objectToFind.equals(array[i])) {
                    return i;
                }
            }
        }

        return -1;
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(Object[] array, Object[] arrayToFind, int startIndex) {
        if ((array == null) || (arrayToFind == null)) {
            return -1;
        }

        int sourceLength = array.length;
        int targetLength = arrayToFind.length;

        if (startIndex >= sourceLength) {
            return (targetLength == 0) ? sourceLength
                                       : (-1);
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        if (targetLength == 0) {
            return startIndex;
        }

        Object first = arrayToFind[0];
        int    i   = startIndex;
        int    max = sourceLength - targetLength;

        startSearchForFirst: 
        while (true) {
            // 查找第一个元�?
            while ((i <= max) && !ObjectUtil.equals(array[i], first)) {
                i++;
            }

            if (i > max) {
                return -1;
            }

            // 已经找到第一个元素，接着�?
            int j   = i + 1;
            int end = (j + targetLength) - 1;
            int k   = 1;

            while (j < end) {
                if (!ObjectUtil.equals(array[j++], arrayToFind[k++])) {
                    i++;

                    // 重新查找第一个元�?
                    continue startSearchForFirst;
                }
            }

            // 找到�?
            return i;
        }
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param objectToFind 要查找的元素
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(Object[] array, Object objectToFind) {
        return lastIndexOf(array, objectToFind, Integer.MAX_VALUE);
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(Object[] array, Object[] arrayToFind) {
        return lastIndexOf(array, arrayToFind, Integer.MAX_VALUE);
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param objectToFind 要查找的元素
     * @param startIndex 起始索引
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(Object[] array, Object objectToFind, int startIndex) {
        if (array == null) {
            return -1;
        }

        if (startIndex < 0) {
            return -1;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }

        if (objectToFind == null) {
            for (int i = startIndex; i >= 0; i--) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = startIndex; i >= 0; i--) {
                if (objectToFind.equals(array[i])) {
                    return i;
                }
            }
        }

        return -1;
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(Object[] array, Object[] arrayToFind, int startIndex) {
        if ((array == null) || (arrayToFind == null)) {
            return -1;
        }

        int sourceLength = array.length;
        int targetLength = arrayToFind.length;

        int rightIndex = sourceLength - targetLength;

        if (startIndex < 0) {
            return -1;
        }

        if (startIndex > rightIndex) {
            startIndex = rightIndex;
        }

        if (targetLength == 0) {
            return startIndex;
        }

        int    lastIndex = targetLength - 1;
        Object last = arrayToFind[lastIndex];
        int    min  = targetLength - 1;
        int    i    = min + startIndex;

        startSearchForLast: 
        while (true) {
            while ((i >= min) && !ObjectUtil.equals(array[i], last)) {
                i--;
            }

            if (i < min) {
                return -1;
            }

            int j     = i - 1;
            int start = j - (targetLength - 1);
            int k     = lastIndex - 1;

            while (j > start) {
                if (!ObjectUtil.equals(array[j--], arrayToFind[k--])) {
                    i--;
                    continue startSearchForLast;
                }
            }

            return start + 1;
        }
    }

    /**
     * 判断指定对象是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param objectToFind 要查找的元素
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(Object[] array, Object objectToFind) {
        return indexOf(array, objectToFind) != -1;
    }

    /**
     * 判断指定元素序列是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(Object[] array, Object[] arrayToFind) {
        return indexOf(array, arrayToFind) != -1;
    }

    /* ============================================================================ */
    /*  在数组中查找�?个元素或�?个元素序列�??                                        */
    /*                                                                              */
    /*  类型：long[]                                                                */
    /* ============================================================================ */

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param longToFind 要查找的元素
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(long[] array, long longToFind) {
        return indexOf(array, longToFind, 0);
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(long[] array, long[] arrayToFind) {
        return indexOf(array, arrayToFind, 0);
    }

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param longToFind 要查找的元素
     * @param startIndex 起始索引
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(long[] array, long longToFind, int startIndex) {
        if (array == null) {
            return -1;
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        for (int i = startIndex; i < array.length; i++) {
            if (longToFind == array[i]) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(long[] array, long[] arrayToFind, int startIndex) {
        if ((array == null) || (arrayToFind == null)) {
            return -1;
        }

        int sourceLength = array.length;
        int targetLength = arrayToFind.length;

        if (startIndex >= sourceLength) {
            return (targetLength == 0) ? sourceLength
                                       : (-1);
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        if (targetLength == 0) {
            return startIndex;
        }

        long first = arrayToFind[0];
        int  i   = startIndex;
        int  max = sourceLength - targetLength;

        startSearchForFirst: 
        while (true) {
            // 查找第一个元�?
            while ((i <= max) && (array[i] != first)) {
                i++;
            }

            if (i > max) {
                return -1;
            }

            // 已经找到第一个元素，接着�?
            int j   = i + 1;
            int end = (j + targetLength) - 1;
            int k   = 1;

            while (j < end) {
                if (array[j++] != arrayToFind[k++]) {
                    i++;

                    // 重新查找第一个元�?
                    continue startSearchForFirst;
                }
            }

            // 找到�?
            return i;
        }
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param longToFind 要查找的元素
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(long[] array, long longToFind) {
        return lastIndexOf(array, longToFind, Integer.MAX_VALUE);
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(long[] array, long[] arrayToFind) {
        return lastIndexOf(array, arrayToFind, Integer.MAX_VALUE);
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param longToFind 要查找的元素
     * @param startIndex 起始索引
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(long[] array, long longToFind, int startIndex) {
        if (array == null) {
            return -1;
        }

        if (startIndex < 0) {
            return -1;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }

        for (int i = startIndex; i >= 0; i--) {
            if (longToFind == array[i]) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(long[] array, long[] arrayToFind, int startIndex) {
        if ((array == null) || (arrayToFind == null)) {
            return -1;
        }

        int sourceLength = array.length;
        int targetLength = arrayToFind.length;

        int rightIndex = sourceLength - targetLength;

        if (startIndex < 0) {
            return -1;
        }

        if (startIndex > rightIndex) {
            startIndex = rightIndex;
        }

        if (targetLength == 0) {
            return startIndex;
        }

        int  lastIndex = targetLength - 1;
        long last = arrayToFind[lastIndex];
        int  min  = targetLength - 1;
        int  i    = min + startIndex;

        startSearchForLast: 
        while (true) {
            while ((i >= min) && (array[i] != last)) {
                i--;
            }

            if (i < min) {
                return -1;
            }

            int j     = i - 1;
            int start = j - (targetLength - 1);
            int k     = lastIndex - 1;

            while (j > start) {
                if (array[j--] != arrayToFind[k--]) {
                    i--;
                    continue startSearchForLast;
                }
            }

            return start + 1;
        }
    }

    /**
     * 判断指定对象是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param longToFind 要查找的元素
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(long[] array, long longToFind) {
        return indexOf(array, longToFind) != -1;
    }

    /**
     * 判断指定元素序列是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(long[] array, long[] arrayToFind) {
        return indexOf(array, arrayToFind) != -1;
    }

    /* ============================================================================ */
    /*  在数组中查找�?个元素或�?个元素序列�??                                        */
    /*                                                                              */
    /*  类型：int[]                                                                 */
    /* ============================================================================ */

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param intToFind 要查找的元素
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(int[] array, int intToFind) {
        return indexOf(array, intToFind, 0);
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(int[] array, int[] arrayToFind) {
        return indexOf(array, arrayToFind, 0);
    }

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param intToFind 要查找的元素
     * @param startIndex 起始索引
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(int[] array, int intToFind, int startIndex) {
        if (array == null) {
            return -1;
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        for (int i = startIndex; i < array.length; i++) {
            if (intToFind == array[i]) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(int[] array, int[] arrayToFind, int startIndex) {
        if ((array == null) || (arrayToFind == null)) {
            return -1;
        }

        int sourceLength = array.length;
        int targetLength = arrayToFind.length;

        if (startIndex >= sourceLength) {
            return (targetLength == 0) ? sourceLength
                                       : (-1);
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        if (targetLength == 0) {
            return startIndex;
        }

        int first = arrayToFind[0];
        int i   = startIndex;
        int max = sourceLength - targetLength;

        startSearchForFirst: 
        while (true) {
            // 查找第一个元�?
            while ((i <= max) && (array[i] != first)) {
                i++;
            }

            if (i > max) {
                return -1;
            }

            // 已经找到第一个元素，接着�?
            int j   = i + 1;
            int end = (j + targetLength) - 1;
            int k   = 1;

            while (j < end) {
                if (array[j++] != arrayToFind[k++]) {
                    i++;

                    // 重新查找第一个元�?
                    continue startSearchForFirst;
                }
            }

            // 找到�?
            return i;
        }
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param intToFind 要查找的元素
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(int[] array, int intToFind) {
        return lastIndexOf(array, intToFind, Integer.MAX_VALUE);
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(int[] array, int[] arrayToFind) {
        return lastIndexOf(array, arrayToFind, Integer.MAX_VALUE);
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param intToFind 要查找的元素
     * @param startIndex 起始索引
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(int[] array, int intToFind, int startIndex) {
        if (array == null) {
            return -1;
        }

        if (startIndex < 0) {
            return -1;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }

        for (int i = startIndex; i >= 0; i--) {
            if (intToFind == array[i]) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(int[] array, int[] arrayToFind, int startIndex) {
        if ((array == null) || (arrayToFind == null)) {
            return -1;
        }

        int sourceLength = array.length;
        int targetLength = arrayToFind.length;

        int rightIndex = sourceLength - targetLength;

        if (startIndex < 0) {
            return -1;
        }

        if (startIndex > rightIndex) {
            startIndex = rightIndex;
        }

        if (targetLength == 0) {
            return startIndex;
        }

        int lastIndex = targetLength - 1;
        int last = arrayToFind[lastIndex];
        int min  = targetLength - 1;
        int i    = min + startIndex;

        startSearchForLast: 
        while (true) {
            while ((i >= min) && (array[i] != last)) {
                i--;
            }

            if (i < min) {
                return -1;
            }

            int j     = i - 1;
            int start = j - (targetLength - 1);
            int k     = lastIndex - 1;

            while (j > start) {
                if (array[j--] != arrayToFind[k--]) {
                    i--;
                    continue startSearchForLast;
                }
            }

            return start + 1;
        }
    }

    /**
     * 判断指定对象是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param intToFind 要查找的元素
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(int[] array, int intToFind) {
        return indexOf(array, intToFind) != -1;
    }

    /**
     * 判断指定元素序列是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(int[] array, int[] arrayToFind) {
        return indexOf(array, arrayToFind) != -1;
    }

    /* ============================================================================ */
    /*  在数组中查找�?个元素或�?个元素序列�??                                        */
    /*                                                                              */
    /*  类型：short[]                                                               */
    /* ============================================================================ */

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param shortToFind 要查找的元素
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(short[] array, short shortToFind) {
        return indexOf(array, shortToFind, 0);
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(short[] array, short[] arrayToFind) {
        return indexOf(array, arrayToFind, 0);
    }

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param shortToFind 要查找的元素
     * @param startIndex 起始索引
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(short[] array, short shortToFind, int startIndex) {
        if (array == null) {
            return -1;
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        for (int i = startIndex; i < array.length; i++) {
            if (shortToFind == array[i]) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(short[] array, short[] arrayToFind, int startIndex) {
        if ((array == null) || (arrayToFind == null)) {
            return -1;
        }

        int sourceLength = array.length;
        int targetLength = arrayToFind.length;

        if (startIndex >= sourceLength) {
            return (targetLength == 0) ? sourceLength
                                       : (-1);
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        if (targetLength == 0) {
            return startIndex;
        }

        short first = arrayToFind[0];
        int   i   = startIndex;
        int   max = sourceLength - targetLength;

        startSearchForFirst: 
        while (true) {
            // 查找第一个元�?
            while ((i <= max) && (array[i] != first)) {
                i++;
            }

            if (i > max) {
                return -1;
            }

            // 已经找到第一个元素，接着�?
            int j   = i + 1;
            int end = (j + targetLength) - 1;
            int k   = 1;

            while (j < end) {
                if (array[j++] != arrayToFind[k++]) {
                    i++;

                    // 重新查找第一个元�?
                    continue startSearchForFirst;
                }
            }

            // 找到�?
            return i;
        }
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param shortToFind 要查找的元素
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(short[] array, short shortToFind) {
        return lastIndexOf(array, shortToFind, Integer.MAX_VALUE);
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(short[] array, short[] arrayToFind) {
        return lastIndexOf(array, arrayToFind, Integer.MAX_VALUE);
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param shortToFind 要查找的元素
     * @param startIndex 起始索引
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(short[] array, short shortToFind, int startIndex) {
        if (array == null) {
            return -1;
        }

        if (startIndex < 0) {
            return -1;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }

        for (int i = startIndex; i >= 0; i--) {
            if (shortToFind == array[i]) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(short[] array, short[] arrayToFind, int startIndex) {
        if ((array == null) || (arrayToFind == null)) {
            return -1;
        }

        int sourceLength = array.length;
        int targetLength = arrayToFind.length;

        int rightIndex = sourceLength - targetLength;

        if (startIndex < 0) {
            return -1;
        }

        if (startIndex > rightIndex) {
            startIndex = rightIndex;
        }

        if (targetLength == 0) {
            return startIndex;
        }

        int   lastIndex = targetLength - 1;
        short last = arrayToFind[lastIndex];
        int   min  = targetLength - 1;
        int   i    = min + startIndex;

        startSearchForLast: 
        while (true) {
            while ((i >= min) && (array[i] != last)) {
                i--;
            }

            if (i < min) {
                return -1;
            }

            int j     = i - 1;
            int start = j - (targetLength - 1);
            int k     = lastIndex - 1;

            while (j > start) {
                if (array[j--] != arrayToFind[k--]) {
                    i--;
                    continue startSearchForLast;
                }
            }

            return start + 1;
        }
    }

    /**
     * 判断指定对象是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param shortToFind 要查找的元素
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(short[] array, short shortToFind) {
        return indexOf(array, shortToFind) != -1;
    }

    /**
     * 判断指定元素序列是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(short[] array, short[] arrayToFind) {
        return indexOf(array, arrayToFind) != -1;
    }

    /* ============================================================================ */
    /*  在数组中查找�?个元素或�?个元素序列�??                                        */
    /*                                                                              */
    /*  类型：byte[]                                                                */
    /* ============================================================================ */

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param byteToFind 要查找的元素
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(byte[] array, byte byteToFind) {
        return indexOf(array, byteToFind, 0);
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(byte[] array, byte[] arrayToFind) {
        return indexOf(array, arrayToFind, 0);
    }

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param byteToFind 要查找的元素
     * @param startIndex 起始索引
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(byte[] array, byte byteToFind, int startIndex) {
        if (array == null) {
            return -1;
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        for (int i = startIndex; i < array.length; i++) {
            if (byteToFind == array[i]) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(byte[] array, byte[] arrayToFind, int startIndex) {
        if ((array == null) || (arrayToFind == null)) {
            return -1;
        }

        int sourceLength = array.length;
        int targetLength = arrayToFind.length;

        if (startIndex >= sourceLength) {
            return (targetLength == 0) ? sourceLength
                                       : (-1);
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        if (targetLength == 0) {
            return startIndex;
        }

        byte first = arrayToFind[0];
        int  i   = startIndex;
        int  max = sourceLength - targetLength;

        startSearchForFirst: 
        while (true) {
            // 查找第一个元�?
            while ((i <= max) && (array[i] != first)) {
                i++;
            }

            if (i > max) {
                return -1;
            }

            // 已经找到第一个元素，接着�?
            int j   = i + 1;
            int end = (j + targetLength) - 1;
            int k   = 1;

            while (j < end) {
                if (array[j++] != arrayToFind[k++]) {
                    i++;

                    // 重新查找第一个元�?
                    continue startSearchForFirst;
                }
            }

            // 找到�?
            return i;
        }
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param byteToFind 要查找的元素
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(byte[] array, byte byteToFind) {
        return lastIndexOf(array, byteToFind, Integer.MAX_VALUE);
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(byte[] array, byte[] arrayToFind) {
        return lastIndexOf(array, arrayToFind, Integer.MAX_VALUE);
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param byteToFind 要查找的元素
     * @param startIndex 起始索引
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(byte[] array, byte byteToFind, int startIndex) {
        if (array == null) {
            return -1;
        }

        if (startIndex < 0) {
            return -1;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }

        for (int i = startIndex; i >= 0; i--) {
            if (byteToFind == array[i]) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(byte[] array, byte[] arrayToFind, int startIndex) {
        if ((array == null) || (arrayToFind == null)) {
            return -1;
        }

        int sourceLength = array.length;
        int targetLength = arrayToFind.length;

        int rightIndex = sourceLength - targetLength;

        if (startIndex < 0) {
            return -1;
        }

        if (startIndex > rightIndex) {
            startIndex = rightIndex;
        }

        if (targetLength == 0) {
            return startIndex;
        }

        int  lastIndex = targetLength - 1;
        byte last = arrayToFind[lastIndex];
        int  min  = targetLength - 1;
        int  i    = min + startIndex;

        startSearchForLast: 
        while (true) {
            while ((i >= min) && (array[i] != last)) {
                i--;
            }

            if (i < min) {
                return -1;
            }

            int j     = i - 1;
            int start = j - (targetLength - 1);
            int k     = lastIndex - 1;

            while (j > start) {
                if (array[j--] != arrayToFind[k--]) {
                    i--;
                    continue startSearchForLast;
                }
            }

            return start + 1;
        }
    }

    /**
     * 判断指定对象是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param byteToFind 要查找的元素
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(byte[] array, byte byteToFind) {
        return indexOf(array, byteToFind) != -1;
    }

    /**
     * 判断指定元素序列是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(byte[] array, byte[] arrayToFind) {
        return indexOf(array, arrayToFind) != -1;
    }

    /* ============================================================================ */
    /*  在数组中查找�?个元素或�?个元素序列�??                                        */
    /*                                                                              */
    /*  类型：double[]                                                              */
    /* ============================================================================ */

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param doubleToFind 要查找的元素
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(double[] array, double doubleToFind) {
        return indexOf(array, doubleToFind, 0, 0);
    }

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param doubleToFind 要查找的元素
     * @param tolerance 误差
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(double[] array, double doubleToFind, double tolerance) {
        return indexOf(array, doubleToFind, 0, tolerance);
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(double[] array, double[] arrayToFind) {
        return indexOf(array, arrayToFind, 0, 0);
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param tolerance 误差
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(double[] array, double[] arrayToFind, double tolerance) {
        return indexOf(array, arrayToFind, 0, tolerance);
    }

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param doubleToFind 要查找的元素
     * @param startIndex 起始索引
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(double[] array, double doubleToFind, int startIndex) {
        return indexOf(array, doubleToFind, startIndex, 0);
    }

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param doubleToFind 要查找的元素
     * @param startIndex 起始索引
     * @param tolerance 误差
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(double[] array, double doubleToFind, int startIndex, double tolerance) {
        if (array == null) {
            return -1;
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        double min = doubleToFind - tolerance;
        double max = doubleToFind + tolerance;

        for (int i = startIndex; i < array.length; i++) {
            if ((array[i] >= min) && (array[i] <= max)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(double[] array, double[] arrayToFind, int startIndex) {
        return indexOf(array, arrayToFind, startIndex, 0);
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     * @param tolerance 误差
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(double[] array, double[] arrayToFind, int startIndex, double tolerance) {
        if ((array == null) || (arrayToFind == null)) {
            return -1;
        }

        int sourceLength = array.length;
        int targetLength = arrayToFind.length;

        if (startIndex >= sourceLength) {
            return (targetLength == 0) ? sourceLength
                                       : (-1);
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        if (targetLength == 0) {
            return startIndex;
        }

        double firstMin = arrayToFind[0] - tolerance;
        double firstMax = arrayToFind[0] + tolerance;
        int    i        = startIndex;
        int    max      = sourceLength - targetLength;

        startSearchForFirst: 
        while (true) {
            // 查找第一个元�?
            while ((i <= max) && ((array[i] < firstMin) || (array[i] > firstMax))) {
                i++;
            }

            if (i > max) {
                return -1;
            }

            // 已经找到第一个元素，接着�?
            int j   = i + 1;
            int end = (j + targetLength) - 1;
            int k   = 1;

            while (j < end) {
                if (Math.abs(array[j++] - arrayToFind[k++]) > tolerance) {
                    i++;

                    // 重新查找第一个元�?
                    continue startSearchForFirst;
                }
            }

            // 找到�?
            return i;
        }
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param doubleToFind 要查找的元素
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(double[] array, double doubleToFind) {
        return lastIndexOf(array, doubleToFind, Integer.MAX_VALUE, 0);
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param doubleToFind 要查找的元素
     * @param tolerance 误差
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(double[] array, double doubleToFind, double tolerance) {
        return lastIndexOf(array, doubleToFind, Integer.MAX_VALUE, tolerance);
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(double[] array, double[] arrayToFind) {
        return lastIndexOf(array, arrayToFind, Integer.MAX_VALUE, 0);
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param tolerance 误差
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(double[] array, double[] arrayToFind, double tolerance) {
        return lastIndexOf(array, arrayToFind, Integer.MAX_VALUE, tolerance);
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param doubleToFind 要查找的元素
     * @param startIndex 起始索引
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(double[] array, double doubleToFind, int startIndex) {
        return lastIndexOf(array, doubleToFind, startIndex, 0);
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param doubleToFind 要查找的元素
     * @param startIndex 起始索引
     * @param tolerance 误差
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(double[] array, double doubleToFind, int startIndex,
                                  double tolerance) {
        if (array == null) {
            return -1;
        }

        if (startIndex < 0) {
            return -1;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }

        double min = doubleToFind - tolerance;
        double max = doubleToFind + tolerance;

        for (int i = startIndex; i >= 0; i--) {
            if ((array[i] >= min) && (array[i] <= max)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(double[] array, double[] arrayToFind, int startIndex) {
        return lastIndexOf(array, arrayToFind, startIndex, 0);
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     * @param tolerance 误差
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(double[] array, double[] arrayToFind, int startIndex,
                                  double tolerance) {
        if ((array == null) || (arrayToFind == null)) {
            return -1;
        }

        int sourceLength = array.length;
        int targetLength = arrayToFind.length;

        int rightIndex = sourceLength - targetLength;

        if (startIndex < 0) {
            return -1;
        }

        if (startIndex > rightIndex) {
            startIndex = rightIndex;
        }

        if (targetLength == 0) {
            return startIndex;
        }

        int    lastIndex = targetLength - 1;
        double lastMin = arrayToFind[lastIndex] - tolerance;
        double lastMax = arrayToFind[lastIndex] + tolerance;
        int    min     = targetLength - 1;
        int    i       = min + startIndex;

        startSearchForLast: 
        while (true) {
            while ((i >= min) && ((array[i] < lastMin) || (array[i] > lastMax))) {
                i--;
            }

            if (i < min) {
                return -1;
            }

            int j     = i - 1;
            int start = j - (targetLength - 1);
            int k     = lastIndex - 1;

            while (j > start) {
                if (Math.abs(array[j--] - arrayToFind[k--]) > tolerance) {
                    i--;
                    continue startSearchForLast;
                }
            }

            return start + 1;
        }
    }

    /**
     * 判断指定对象是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param doubleToFind 要查找的元素
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(double[] array, double doubleToFind) {
        return indexOf(array, doubleToFind) != -1;
    }

    /**
     * 判断指定对象是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param doubleToFind 要查找的元素
     * @param tolerance 误差
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(double[] array, double doubleToFind, double tolerance) {
        return indexOf(array, doubleToFind, tolerance) != -1;
    }

    /**
     * 判断指定元素序列是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(double[] array, double[] arrayToFind) {
        return indexOf(array, arrayToFind) != -1;
    }

    /**
     * 判断指定元素序列是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param tolerance 误差
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(double[] array, double[] arrayToFind, double tolerance) {
        return indexOf(array, arrayToFind, tolerance) != -1;
    }

    /* ============================================================================ */
    /*  在数组中查找�?个元素或�?个元素序列�??                                        */
    /*                                                                              */
    /*  类型：float[]                                                               */
    /* ============================================================================ */

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param floatToFind 要查找的元素
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(float[] array, float floatToFind) {
        return indexOf(array, floatToFind, 0, 0);
    }

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param floatToFind 要查找的元素
     * @param tolerance 误差
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(float[] array, float floatToFind, float tolerance) {
        return indexOf(array, floatToFind, 0, tolerance);
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(float[] array, float[] arrayToFind) {
        return indexOf(array, arrayToFind, 0, 0);
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param tolerance 误差
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(float[] array, float[] arrayToFind, float tolerance) {
        return indexOf(array, arrayToFind, 0, tolerance);
    }

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param floatToFind 要查找的元素
     * @param startIndex 起始索引
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(float[] array, float floatToFind, int startIndex) {
        return indexOf(array, floatToFind, startIndex, 0);
    }

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param floatToFind 要查找的元素
     * @param startIndex 起始索引
     * @param tolerance 误差
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(float[] array, float floatToFind, int startIndex, float tolerance) {
        if (array == null) {
            return -1;
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        float min = floatToFind - tolerance;
        float max = floatToFind + tolerance;

        for (int i = startIndex; i < array.length; i++) {
            if ((array[i] >= min) && (array[i] <= max)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(float[] array, float[] arrayToFind, int startIndex) {
        return indexOf(array, arrayToFind, startIndex, 0);
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     * @param tolerance 误差
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(float[] array, float[] arrayToFind, int startIndex, float tolerance) {
        if ((array == null) || (arrayToFind == null)) {
            return -1;
        }

        int sourceLength = array.length;
        int targetLength = arrayToFind.length;

        if (startIndex >= sourceLength) {
            return (targetLength == 0) ? sourceLength
                                       : (-1);
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        if (targetLength == 0) {
            return startIndex;
        }

        float firstMin = arrayToFind[0] - tolerance;
        float firstMax = arrayToFind[0] + tolerance;
        int   i        = startIndex;
        int   max      = sourceLength - targetLength;

        startSearchForFirst: 
        while (true) {
            // 查找第一个元�?
            while ((i <= max) && ((array[i] < firstMin) || (array[i] > firstMax))) {
                i++;
            }

            if (i > max) {
                return -1;
            }

            // 已经找到第一个元素，接着�?
            int j   = i + 1;
            int end = (j + targetLength) - 1;
            int k   = 1;

            while (j < end) {
                if (Math.abs(array[j++] - arrayToFind[k++]) > tolerance) {
                    i++;

                    // 重新查找第一个元�?
                    continue startSearchForFirst;
                }
            }

            // 找到�?
            return i;
        }
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param floatToFind 要查找的元素
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(float[] array, float floatToFind) {
        return lastIndexOf(array, floatToFind, Integer.MAX_VALUE, 0);
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param floatToFind 要查找的元素
     * @param tolerance 误差
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(float[] array, float floatToFind, float tolerance) {
        return lastIndexOf(array, floatToFind, Integer.MAX_VALUE, tolerance);
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(float[] array, float[] arrayToFind) {
        return lastIndexOf(array, arrayToFind, Integer.MAX_VALUE, 0);
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param tolerance 误差
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(float[] array, float[] arrayToFind, float tolerance) {
        return lastIndexOf(array, arrayToFind, Integer.MAX_VALUE, tolerance);
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param floatToFind 要查找的元素
     * @param startIndex 起始索引
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(float[] array, float floatToFind, int startIndex) {
        return lastIndexOf(array, floatToFind, startIndex, 0);
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param floatToFind 要查找的元素
     * @param startIndex 起始索引
     * @param tolerance 误差
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(float[] array, float floatToFind, int startIndex, float tolerance) {
        if (array == null) {
            return -1;
        }

        if (startIndex < 0) {
            return -1;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }

        float min = floatToFind - tolerance;
        float max = floatToFind + tolerance;

        for (int i = startIndex; i >= 0; i--) {
            if ((array[i] >= min) && (array[i] <= max)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(float[] array, float[] arrayToFind, int startIndex) {
        return lastIndexOf(array, arrayToFind, startIndex, 0);
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     * @param tolerance 误差
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(float[] array, float[] arrayToFind, int startIndex,
                                  float tolerance) {
        if ((array == null) || (arrayToFind == null)) {
            return -1;
        }

        int sourceLength = array.length;
        int targetLength = arrayToFind.length;

        int rightIndex = sourceLength - targetLength;

        if (startIndex < 0) {
            return -1;
        }

        if (startIndex > rightIndex) {
            startIndex = rightIndex;
        }

        if (targetLength == 0) {
            return startIndex;
        }

        int   lastIndex = targetLength - 1;
        float lastMin = arrayToFind[lastIndex] - tolerance;
        float lastMax = arrayToFind[lastIndex] + tolerance;
        int   min     = targetLength - 1;
        int   i       = min + startIndex;

        startSearchForLast: 
        while (true) {
            while ((i >= min) && ((array[i] < lastMin) || (array[i] > lastMax))) {
                i--;
            }

            if (i < min) {
                return -1;
            }

            int j     = i - 1;
            int start = j - (targetLength - 1);
            int k     = lastIndex - 1;

            while (j > start) {
                if (Math.abs(array[j--] - arrayToFind[k--]) > tolerance) {
                    i--;
                    continue startSearchForLast;
                }
            }

            return start + 1;
        }
    }

    /**
     * 判断指定对象是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param floatToFind 要查找的元素
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(float[] array, float floatToFind) {
        return indexOf(array, floatToFind) != -1;
    }

    /**
     * 判断指定对象是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param floatToFind 要查找的元素
     * @param tolerance 误差
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(float[] array, float floatToFind, float tolerance) {
        return indexOf(array, floatToFind, tolerance) != -1;
    }

    /**
     * 判断指定元素序列是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(float[] array, float[] arrayToFind) {
        return indexOf(array, arrayToFind) != -1;
    }

    /**
     * 判断指定元素序列是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param tolerance 误差
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(float[] array, float[] arrayToFind, float tolerance) {
        return indexOf(array, arrayToFind, tolerance) != -1;
    }

    /* ============================================================================ */
    /*  在数组中查找�?个元素或�?个元素序列�??                                        */
    /*                                                                              */
    /*  类型：boolean[]                                                             */
    /* ============================================================================ */

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param booleanToFind 要查找的元素
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(boolean[] array, boolean booleanToFind) {
        return indexOf(array, booleanToFind, 0);
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(boolean[] array, boolean[] arrayToFind) {
        return indexOf(array, arrayToFind, 0);
    }

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param booleanToFind 要查找的元素
     * @param startIndex 起始索引
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(boolean[] array, boolean booleanToFind, int startIndex) {
        if (array == null) {
            return -1;
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        for (int i = startIndex; i < array.length; i++) {
            if (booleanToFind == array[i]) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(boolean[] array, boolean[] arrayToFind, int startIndex) {
        if ((array == null) || (arrayToFind == null)) {
            return -1;
        }

        int sourceLength = array.length;
        int targetLength = arrayToFind.length;

        if (startIndex >= sourceLength) {
            return (targetLength == 0) ? sourceLength
                                       : (-1);
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        if (targetLength == 0) {
            return startIndex;
        }

        boolean first = arrayToFind[0];
        int     i   = startIndex;
        int     max = sourceLength - targetLength;

        startSearchForFirst: 
        while (true) {
            // 查找第一个元�?
            while ((i <= max) && (array[i] != first)) {
                i++;
            }

            if (i > max) {
                return -1;
            }

            // 已经找到第一个元素，接着�?
            int j   = i + 1;
            int end = (j + targetLength) - 1;
            int k   = 1;

            while (j < end) {
                if (array[j++] != arrayToFind[k++]) {
                    i++;

                    // 重新查找第一个元�?
                    continue startSearchForFirst;
                }
            }

            // 找到�?
            return i;
        }
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param booleanToFind 要查找的元素
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(boolean[] array, boolean booleanToFind) {
        return lastIndexOf(array, booleanToFind, Integer.MAX_VALUE);
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(boolean[] array, boolean[] arrayToFind) {
        return lastIndexOf(array, arrayToFind, Integer.MAX_VALUE);
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param booleanToFind 要查找的元素
     * @param startIndex 起始索引
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(boolean[] array, boolean booleanToFind, int startIndex) {
        if (array == null) {
            return -1;
        }

        if (startIndex < 0) {
            return -1;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }

        for (int i = startIndex; i >= 0; i--) {
            if (booleanToFind == array[i]) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(boolean[] array, boolean[] arrayToFind, int startIndex) {
        if ((array == null) || (arrayToFind == null)) {
            return -1;
        }

        int sourceLength = array.length;
        int targetLength = arrayToFind.length;

        int rightIndex = sourceLength - targetLength;

        if (startIndex < 0) {
            return -1;
        }

        if (startIndex > rightIndex) {
            startIndex = rightIndex;
        }

        if (targetLength == 0) {
            return startIndex;
        }

        int     lastIndex = targetLength - 1;
        boolean last = arrayToFind[lastIndex];
        int     min  = targetLength - 1;
        int     i    = min + startIndex;

        startSearchForLast: 
        while (true) {
            while ((i >= min) && (array[i] != last)) {
                i--;
            }

            if (i < min) {
                return -1;
            }

            int j     = i - 1;
            int start = j - (targetLength - 1);
            int k     = lastIndex - 1;

            while (j > start) {
                if (array[j--] != arrayToFind[k--]) {
                    i--;
                    continue startSearchForLast;
                }
            }

            return start + 1;
        }
    }

    /**
     * 判断指定对象是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param booleanToFind 要查找的元素
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(boolean[] array, boolean booleanToFind) {
        return indexOf(array, booleanToFind) != -1;
    }

    /**
     * 判断指定元素序列是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(boolean[] array, boolean[] arrayToFind) {
        return indexOf(array, arrayToFind) != -1;
    }

    /* ============================================================================ */
    /*  在数组中查找�?个元素或�?个元素序列�??                                        */
    /*                                                                              */
    /*  类型：char[]                                                                */
    /* ============================================================================ */

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param charToFind 要查找的元素
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(char[] array, char charToFind) {
        return indexOf(array, charToFind, 0);
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(char[] array, char[] arrayToFind) {
        return indexOf(array, arrayToFind, 0);
    }

    /**
     * 在数组中查找�?个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param charToFind 要查找的元素
     * @param startIndex 起始索引
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(char[] array, char charToFind, int startIndex) {
        if (array == null) {
            return -1;
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        for (int i = startIndex; i < array.length; i++) {
            if (charToFind == array[i]) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 在数组中查找�?个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则看�?<code>0</code>，超出数组长度的起始索引则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int indexOf(char[] array, char[] arrayToFind, int startIndex) {
        if ((array == null) || (arrayToFind == null)) {
            return -1;
        }

        int sourceLength = array.length;
        int targetLength = arrayToFind.length;

        if (startIndex >= sourceLength) {
            return (targetLength == 0) ? sourceLength
                                       : (-1);
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        if (targetLength == 0) {
            return startIndex;
        }

        char first = arrayToFind[0];
        int  i   = startIndex;
        int  max = sourceLength - targetLength;

        startSearchForFirst: 
        while (true) {
            // 查找第一个元�?
            while ((i <= max) && (array[i] != first)) {
                i++;
            }

            if (i > max) {
                return -1;
            }

            // 已经找到第一个元素，接着�?
            int j   = i + 1;
            int end = (j + targetLength) - 1;
            int k   = 1;

            while (j < end) {
                if (array[j++] != arrayToFind[k++]) {
                    i++;

                    // 重新查找第一个元�?
                    continue startSearchForFirst;
                }
            }

            // 找到�?
            return i;
        }
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param charToFind 要查找的元素
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(char[] array, char charToFind) {
        return lastIndexOf(array, charToFind, Integer.MAX_VALUE);
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(char[] array, char[] arrayToFind) {
        return lastIndexOf(array, arrayToFind, Integer.MAX_VALUE);
    }

    /**
     * 在数组中从末尾开始查找一个元素�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param charToFind 要查找的元素
     * @param startIndex 起始索引
     *
     * @return 该元素在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(char[] array, char charToFind, int startIndex) {
        if (array == null) {
            return -1;
        }

        if (startIndex < 0) {
            return -1;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }

        for (int i = startIndex; i >= 0; i--) {
            if (charToFind == array[i]) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 在数组中从末尾开始查找一个元素序列�??
     * 
     * <p>
     * 如果未找到或数组�?<code>null</code>则返�?<code>-1</code>�?
     * </p>
     * 
     * <p>
     * 起始索引小于<code>0</code>则返�?<code>-1</code>，超出数组长度的起始索引则从数组末尾�?始找�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     * @param startIndex 起始索引
     *
     * @return 该元素序列在数组中的序号，如果数组为<code>null</code>或未找到，则返回<code>-1</code>�?
     */
    public static int lastIndexOf(char[] array, char[] arrayToFind, int startIndex) {
        if ((array == null) || (arrayToFind == null)) {
            return -1;
        }

        int sourceLength = array.length;
        int targetLength = arrayToFind.length;

        int rightIndex = sourceLength - targetLength;

        if (startIndex < 0) {
            return -1;
        }

        if (startIndex > rightIndex) {
            startIndex = rightIndex;
        }

        if (targetLength == 0) {
            return startIndex;
        }

        int  lastIndex = targetLength - 1;
        char last = arrayToFind[lastIndex];
        int  min  = targetLength - 1;
        int  i    = min + startIndex;

        startSearchForLast: 
        while (true) {
            while ((i >= min) && (array[i] != last)) {
                i--;
            }

            if (i < min) {
                return -1;
            }

            int j     = i - 1;
            int start = j - (targetLength - 1);
            int k     = lastIndex - 1;

            while (j > start) {
                if (array[j--] != arrayToFind[k--]) {
                    i--;
                    continue startSearchForLast;
                }
            }

            return start + 1;
        }
    }

    /**
     * 判断指定对象是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param charToFind 要查找的元素
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(char[] array, char charToFind) {
        return indexOf(array, charToFind) != -1;
    }

    /**
     * 判断指定元素序列是否存在于指定数组中�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>false</code>�?
     * </p>
     *
     * @param array 要扫描的数组
     * @param arrayToFind 要查找的元素序列
     *
     * @return 如果找到则返�?<code>true</code>
     */
    public static boolean contains(char[] array, char[] arrayToFind) {
        return indexOf(array, arrayToFind) != -1;
    }

    /* ============================================================================ */
    /*  将数组转换成易于阅读的字符串表示�?                                          */
    /*                                                                              */
    /*  支持多维数组�?                                                              */
    /* ============================================================================ */

    /**
     * 将数组转换成易于阅读的字符串表示�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返�?<code>[]</code>，支持多维数组�??
     * 如果数组元素�?<code>null</code>，则显示<code>&lt;null&gt;</code>�?
     * <pre>
     * ArrayUtil.toString(null)                              = "[]"
     * ArrayUtil.toString(new int[] {1, 2, 3})               = "[1, 2, 3]"
     * ArrayUtil.toString(new boolean[] {true, false, true}) = "[true, false, true]"
     * ArrayUtil.toString(new Object[] {
     *                       {1, 2, 3},  // 嵌套数组
     *                       hello,      // 嵌套非数�?
     *                       null,       // 嵌套null
     *                       {},         // 嵌套空数�?
     *                       {2, 3, 4}   // 嵌套数组
     *                    })                                 = "[[1, 2, 3], hello, <null>, [], [2, 3, 4]]"
     * </pre>
     * </p>
     *
     * @param array 要转换的数组
     *
     * @return 字符串表示，<code>"[]"</code>表示空数组或<code>null</code>
     */
    public static String toString(Object array) {
        return toString(array, "[]", "<null>");
    }

    /**
     * 将数组转换成易于阅读的字符串表示�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返回指定字符串，支持多维数组�??
     * 如果数组元素�?<code>null</code>，则显示<code>&lt;null&gt;</code>�?
     * <pre>
     * ArrayUtil.toString(null, "null")                              = "null"
     * ArrayUtil.toString(new int[] {1, 2, 3}, "null")               = "[1, 2, 3]"
     * ArrayUtil.toString(new boolean[] {true, false, true}, "null") = "[true, false, true]"
     * ArrayUtil.toString(new Object[] {
     *                       {1, 2, 3},  // 嵌套数组
     *                       hello,      // 嵌套非数�?
     *                       null,       // 嵌套null
     *                       {},         // 嵌套空数�?
     *                       {2, 3, 4}   // 嵌套数组
     *                    }, "null")                                 = "[[1, 2, 3], hello, <null>, [], [2, 3, 4]]"
     * </pre>
     * </p>
     *
     * @param array 要转换的数组
     * @param nullArrayStr 如果数组�?<code>null</code>，则返回此字符串
     *
     * @return 字符串表示，或返回指定字符串表示<code>null</code>
     */
    public static String toString(Object array, String nullArrayStr) {
        return toString(array, nullArrayStr, "<null>");
    }

    /**
     * 将数组转换成易于阅读的字符串表示�?
     * 
     * <p>
     * 如果数组�?<code>null</code>则返回指定字符串，支持多维数组�?? 如果数组元素�?<code>null</code>，则显示指定字符串�??
     * <pre>
     * ArrayUtil.toString(null, "null", "NULL")                              = "null"
     * ArrayUtil.toString(new int[] {1, 2, 3}, "null", "NULL")               = "[1, 2, 3]"
     * ArrayUtil.toString(new boolean[] {true, false, true}, "null", "NULL") = "[true, false, true]"
     * ArrayUtil.toString(new Object[] {
     *                       {1, 2, 3},  // 嵌套数组
     *                       hello,      // 嵌套非数�?
     *                       null,       // 嵌套null
     *                       {},         // 嵌套空数�?
     *                       {2, 3, 4}   // 嵌套数组
     *                    }, "null", "NULL")                                 = "[[1, 2, 3], hello, NULL, [], [2, 3, 4]]"
     * </pre>
     * </p>
     *
     * @param array 要转换的数组
     * @param nullArrayStr 如果数组�?<code>null</code>，则返回此字符串
     * @param nullElementStr 如果数组中的元素�?<code>null</code>，则返回此字符串
     *
     * @return 字符串表示，或返回指定字符串表示<code>null</code>
     */
    public static String toString(Object array, String nullArrayStr, String nullElementStr) {
        if (array == null) {
            return nullArrayStr;
        }

        StringBuffer buffer = new StringBuffer();

        toString(buffer, array, nullArrayStr, nullElementStr);

        return buffer.toString();
    }

    /**
     * 将数组转换成易于阅读的字符串表示�?<code>null</code>将被看作空数组�?? 支持多维数组�?
     *
     * @param buffer 将转换后的字符串加入到这�?<code>StringBuffer</code>�?
     * @param array 要转换的数组
     * @param nullArrayStr 如果数组�?<code>null</code>，则返回此字符串
     * @param nullElementStr 如果数组中的元素�?<code>null</code>，则返回此字符串
     */
    private static void toString(StringBuffer buffer, Object array, String nullArrayStr,
                                 String nullElementStr) {
        if (array == null) {
            buffer.append(nullElementStr);
            return;
        }

        if (!array.getClass().isArray()) {
            buffer.append(ObjectUtil.toString(array, nullElementStr));
            return;
        }

        buffer.append('[');

        // array为数�?
        if (array instanceof long[]) {
            long[] longArray = (long[]) array;
            int    length = longArray.length;

            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    buffer.append(", ");
                }

                buffer.append(longArray[i]);
            }
        } else if (array instanceof int[]) {
            int[] intArray = (int[]) array;
            int   length = intArray.length;

            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    buffer.append(", ");
                }

                buffer.append(intArray[i]);
            }
        } else if (array instanceof short[]) {
            short[] shortArray = (short[]) array;
            int     length = shortArray.length;

            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    buffer.append(", ");
                }

                buffer.append(shortArray[i]);
            }
        } else if (array instanceof byte[]) {
            byte[] byteArray = (byte[]) array;
            int    length = byteArray.length;

            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    buffer.append(", ");
                } else {
                    buffer.append("0x");
                }

                String hexStr = Integer.toHexString(0xFF & byteArray[i]).toUpperCase();

                if (hexStr.length() == 0) {
                    buffer.append("00");
                } else if (hexStr.length() == 1) {
                    buffer.append("0");
                }

                buffer.append(hexStr);
            }
        } else if (array instanceof double[]) {
            double[] doubleArray = (double[]) array;
            int      length = doubleArray.length;

            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    buffer.append(", ");
                }

                buffer.append(doubleArray[i]);
            }
        } else if (array instanceof float[]) {
            float[] floatArray = (float[]) array;
            int     length = floatArray.length;

            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    buffer.append(", ");
                }

                buffer.append(floatArray[i]);
            }
        } else if (array instanceof boolean[]) {
            boolean[] booleanArray = (boolean[]) array;
            int       length = booleanArray.length;

            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    buffer.append(", ");
                }

                buffer.append(booleanArray[i]);
            }
        } else if (array instanceof char[]) {
            char[] charArray = (char[]) array;
            int    length = charArray.length;

            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    buffer.append(", ");
                }

                buffer.append(charArray[i]);
            }
        } else {
            Object[] objectArray = (Object[]) array;
            int      length = objectArray.length;

            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    buffer.append(", ");
                }

                toString(buffer, objectArray[i], nullArrayStr, nullElementStr);
            }
        }

        buffer.append(']');
    }
}

