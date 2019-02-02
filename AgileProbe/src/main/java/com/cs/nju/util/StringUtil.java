package com.cs.nju.util;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串工具类
 * 
 * @author zym
 * 
 */
public class StringUtil {

	private static final Logger logger = Logger.getLogger(StringUtil.class);
	
	/** 空字符串�? */
	public static final String EMPTY_STRING = "";

	/*
	 * ==========================================================================
	 * ==
	 */
	/* 判空函数�? */
	/*                                                                              */
	/* 以下方法用来判定�?个字符串是否为： */
	/* 1. null */
	/* 2. empty - "" */
	/* 3. blank - "全部是空�?" - 空白由Character.isWhitespace�?定义�? */
	/*
	 * ==========================================================================
	 * ==
	 */

	/**
	 * �?查字符串是否�?<code>null</code>或空字符�?<code>""</code>�?
	 * 
	 * <pre>
	 * StringUtil.isEmpty(null)      = true
	 * StringUtil.isEmpty("")        = true
	 * StringUtil.isEmpty(" ")       = false
	 * StringUtil.isEmpty("bob")     = false
	 * StringUtil.isEmpty("  bob  ") = false
	 * </pre>
	 * 
	 * @param str
	 *            要检查的字符�?
	 * 
	 * @return 如果为空, 则返�?<code>true</code>
	 */
	public static boolean isEmpty(String str) {
		return ((str == null) || (str.length() == 0));
	}

	/**
	 * �?查字符串是否不是<code>null</code>和空字符�?<code>""</code>�?
	 * 
	 * <pre>
	 * StringUtil.isEmpty(null)      = false
	 * StringUtil.isEmpty("")        = false
	 * StringUtil.isEmpty(" ")       = true
	 * StringUtil.isEmpty("bob")     = true
	 * StringUtil.isEmpty("  bob  ") = true
	 * </pre>
	 * 
	 * @param str
	 *            要检查的字符�?
	 * 
	 * @return 如果不为�?, 则返�?<code>true</code>
	 */
	public static boolean isNotEmpty(String str) {
		return ((str != null) && (str.length() > 0));
	}

	/**
	 * �?查字符串是否是空白：<code>null</code>、空字符�?<code>""</code>或只有空白字符�??
	 * 
	 * <pre>
	 * StringUtil.isBlank(null)      = true
	 * StringUtil.isBlank("")        = true
	 * StringUtil.isBlank(" ")       = true
	 * StringUtil.isBlank("bob")     = false
	 * StringUtil.isBlank("  bob  ") = false
	 * </pre>
	 * 
	 * @param str
	 *            要检查的字符�?
	 * 
	 * @return 如果为空�?, 则返�?<code>true</code>
	 */
	public static boolean isBlank(String str) {
		int length;

		if ((str == null) || ((length = str.length()) == 0)) {
			return true;
		}

		for (int i = 0; i < length; i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				return false;
			}
		}

		return true;
	}

	/**
	 * �?查字符串是否不是空白�?<code>null</code>、空字符�?<code>""</code>或只有空白字符�??
	 * 
	 * <pre>
	 * StringUtil.isBlank(null)      = false
	 * StringUtil.isBlank("")        = false
	 * StringUtil.isBlank(" ")       = false
	 * StringUtil.isBlank("bob")     = true
	 * StringUtil.isBlank("  bob  ") = true
	 * </pre>
	 * 
	 * @param str
	 *            要检查的字符�?
	 * 
	 * @return 如果为空�?, 则返�?<code>true</code>
	 */
	public static boolean isNotBlank(String str) {
		int length;

		if ((str == null) || ((length = str.length()) == 0)) {
			return false;
		}

		for (int i = 0; i < length; i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				return true;
			}
		}

		return false;
	}

	/*
	 * ==========================================================================
	 * ==
	 */
	/* 比较函数�? */
	/*                                                                              */
	/* 以下方法用来比较两个字符串是否相同�?? */
	/*
	 * ==========================================================================
	 * ==
	 */

	/**
	 * 比较两个字符串（大小写敏感）�?
	 * 
	 * <pre>
	 * StringUtil.equals(null, null)   = true
	 * StringUtil.equals(null, "abc")  = false
	 * StringUtil.equals("abc", null)  = false
	 * StringUtil.equals("abc", "abc") = true
	 * StringUtil.equals("abc", "ABC") = false
	 * </pre>
	 * 
	 * @param str1
	 *            要比较的字符�?1
	 * @param str2
	 *            要比较的字符�?2
	 * 
	 * @return 如果两个字符串相同，或�?�都�?<code>null</code>，则返回<code>true</code>
	 */
	public static boolean equals(String str1, String str2) {
		if (str1 == null) {
			return str2 == null;
		}
		if (str2 == null) {
			return str1 == null;
		}
		str1 = str1.trim();
		str2 = str2.trim();
		return str1.equals(str2);
	}

	/**
	 * 比较两个字符串（大小写敏�?,但剔除两边的空格�?
	 * 
	 * @param str1
	 *            要比较的字符�?1
	 * @param str2
	 *            要比较的字符�?2
	 * 
	 * @return 如果两个字符串相同，或�?�都�?<code>null</code>，则返回<code>true</code>
	 */
	public static boolean equalsIgnoreWhitespace(String str1, String str2) {
		if (str1 == null) {
			return str2 == null;
		}
		str1 = str1.trim();
		str2 = str2.trim();
		return str1.equals(str2);
	}

	/**
	 * 比较两个字符串（大小写不敏感）�??
	 * 
	 * <pre>
	 * StringUtil.equalsIgnoreCase(null, null)   = true
	 * StringUtil.equalsIgnoreCase(null, "abc")  = false
	 * StringUtil.equalsIgnoreCase("abc", null)  = false
	 * StringUtil.equalsIgnoreCase("abc", "abc") = true
	 * StringUtil.equalsIgnoreCase("abc", "ABC") = true
	 * </pre>
	 * 
	 * @param str1
	 *            要比较的字符�?1
	 * @param str2
	 *            要比较的字符�?2
	 * 
	 * @return 如果两个字符串相同，或�?�都�?<code>null</code>，则返回<code>true</code>
	 */
	public static boolean equalsIgnoreCase(String str1, String str2) {
		if (str1 == null) {
			return str2 == null;
		}

		return str1.equalsIgnoreCase(str2);
	}

	/*
	 * ==========================================================================
	 * ==
	 */
	/* 去空白（或指定字符）的函数�?? */
	/*                                                                              */
	/* 以下方法用来除去�?个字串中的空白或指定字符�? */
	/*
	 * ==========================================================================
	 * ==
	 */

	/**
	 * 除去字符串头尾部的空白，如果字符串是<code>null</code>，依然返�?<code>null</code>�?
	 * 
	 * <p>
	 * 注意，和<code>String.trim</code>不同，此方法使用<code>Character.isWhitespace</code>
	 * 来判定空白， 因�?�可以除去英文字符集之外的其它空白，如中文空格�??
	 * 
	 * <pre>
	 * StringUtil.trim(null)          = null
	 * StringUtil.trim("")            = ""
	 * StringUtil.trim("     ")       = ""
	 * StringUtil.trim("abc")         = "abc"
	 * StringUtil.trim("    abc    ") = "abc"
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param str
	 *            要处理的字符�?
	 * 
	 * @return 除去空白的字符串，如果原字串�?<code>null</code>，则返回<code>null</code>
	 */
	public static String trim(String str) {
		return trim(str, null, 0);
	}

	/**
	 * 除去字符串头尾部的指定字符，如果字符串是<code>null</code>，依然返�?<code>null</code>�?
	 * 
	 * <pre>
	 * StringUtil.trim(null, *)          = null
	 * StringUtil.trim("", *)            = ""
	 * StringUtil.trim("abc", null)      = "abc"
	 * StringUtil.trim("  abc", null)    = "abc"
	 * StringUtil.trim("abc  ", null)    = "abc"
	 * StringUtil.trim(" abc ", null)    = "abc"
	 * StringUtil.trim("  abcyx", "xyz") = "  abc"
	 * </pre>
	 * 
	 * @param str
	 *            要处理的字符�?
	 * @param stripChars
	 *            要除去的字符，如果为<code>null</code>表示除去空白字符
	 * 
	 * @return 除去指定字符后的的字符串，如果原字串�?<code>null</code>，则返回<code>null</code>
	 */
	public static String trim(String str, String stripChars) {
		return trim(str, stripChars, 0);
	}

	/**
	 * 除去字符串头部的空白，如果字符串�?<code>null</code>，则返回<code>null</code>�?
	 * 
	 * <p>
	 * 注意，和<code>String.trim</code>不同，此方法使用<code>Character.isWhitespace</code>
	 * 来判定空白， 因�?�可以除去英文字符集之外的其它空白，如中文空格�??
	 * 
	 * <pre>
	 * StringUtil.trimStart(null)         = null
	 * StringUtil.trimStart("")           = ""
	 * StringUtil.trimStart("abc")        = "abc"
	 * StringUtil.trimStart("  abc")      = "abc"
	 * StringUtil.trimStart("abc  ")      = "abc  "
	 * StringUtil.trimStart(" abc ")      = "abc "
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param str
	 *            要处理的字符�?
	 * 
	 * @return 除去空白的字符串，如果原字串�?<code>null</code>或结果字符串�?<code>""</code>，则返回
	 *         <code>null</code>
	 */
	public static String trimStart(String str) {
		return trim(str, null, -1);
	}

	/**
	 * 除去字符串头部的指定字符，如果字符串�?<code>null</code>，依然返�?<code>null</code>�?
	 * 
	 * <pre>
	 * StringUtil.trimStart(null, *)          = null
	 * StringUtil.trimStart("", *)            = ""
	 * StringUtil.trimStart("abc", "")        = "abc"
	 * StringUtil.trimStart("abc", null)      = "abc"
	 * StringUtil.trimStart("  abc", null)    = "abc"
	 * StringUtil.trimStart("abc  ", null)    = "abc  "
	 * StringUtil.trimStart(" abc ", null)    = "abc "
	 * StringUtil.trimStart("yxabc  ", "xyz") = "abc  "
	 * </pre>
	 * 
	 * @param str
	 *            要处理的字符�?
	 * @param stripChars
	 *            要除去的字符，如果为<code>null</code>表示除去空白字符
	 * 
	 * @return 除去指定字符后的的字符串，如果原字串�?<code>null</code>，则返回<code>null</code>
	 */
	public static String trimStart(String str, String stripChars) {
		return trim(str, stripChars, -1);
	}

	/**
	 * 除去字符串尾部的空白，如果字符串�?<code>null</code>，则返回<code>null</code>�?
	 * 
	 * <p>
	 * 注意，和<code>String.trim</code>不同，此方法使用<code>Character.isWhitespace</code>
	 * 来判定空白， 因�?�可以除去英文字符集之外的其它空白，如中文空格�??
	 * 
	 * <pre>
	 * StringUtil.trimEnd(null)       = null
	 * StringUtil.trimEnd("")         = ""
	 * StringUtil.trimEnd("abc")      = "abc"
	 * StringUtil.trimEnd("  abc")    = "  abc"
	 * StringUtil.trimEnd("abc  ")    = "abc"
	 * StringUtil.trimEnd(" abc ")    = " abc"
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param str
	 *            要处理的字符�?
	 * 
	 * @return 除去空白的字符串，如果原字串�?<code>null</code>或结果字符串�?<code>""</code>，则返回
	 *         <code>null</code>
	 */
	public static String trimEnd(String str) {
		return trim(str, null, 1);
	}

	/**
	 * 除去字符串尾部的指定字符，如果字符串�?<code>null</code>，依然返�?<code>null</code>�?
	 * 
	 * <pre>
	 * StringUtil.trimEnd(null, *)          = null
	 * StringUtil.trimEnd("", *)            = ""
	 * StringUtil.trimEnd("abc", "")        = "abc"
	 * StringUtil.trimEnd("abc", null)      = "abc"
	 * StringUtil.trimEnd("  abc", null)    = "  abc"
	 * StringUtil.trimEnd("abc  ", null)    = "abc"
	 * StringUtil.trimEnd(" abc ", null)    = " abc"
	 * StringUtil.trimEnd("  abcyx", "xyz") = "  abc"
	 * </pre>
	 * 
	 * @param str
	 *            要处理的字符�?
	 * @param stripChars
	 *            要除去的字符，如果为<code>null</code>表示除去空白字符
	 * 
	 * @return 除去指定字符后的的字符串，如果原字串�?<code>null</code>，则返回<code>null</code>
	 */
	public static String trimEnd(String str, String stripChars) {
		return trim(str, stripChars, 1);
	}

	/**
	 * 除去字符串头尾部的空白，如果结果字符串是空字符串<code>""</code>，则返回<code>null</code>�?
	 * 
	 * <p>
	 * 注意，和<code>String.trim</code>不同，此方法使用<code>Character.isWhitespace</code>
	 * 来判定空白， 因�?�可以除去英文字符集之外的其它空白，如中文空格�??
	 * 
	 * <pre>
	 * StringUtil.trimToNull(null)          = null
	 * StringUtil.trimToNull("")            = null
	 * StringUtil.trimToNull("     ")       = null
	 * StringUtil.trimToNull("abc")         = "abc"
	 * StringUtil.trimToNull("    abc    ") = "abc"
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param str
	 *            要处理的字符�?
	 * 
	 * @return 除去空白的字符串，如果原字串�?<code>null</code>或结果字符串�?<code>""</code>，则返回
	 *         <code>null</code>
	 */
	public static String trimToNull(String str) {
		return trimToNull(str, null);
	}

	/**
	 * 除去字符串头尾部的空白，如果结果字符串是空字符串<code>""</code>，则返回<code>null</code>�?
	 * 
	 * <p>
	 * 注意，和<code>String.trim</code>不同，此方法使用<code>Character.isWhitespace</code>
	 * 来判定空白， 因�?�可以除去英文字符集之外的其它空白，如中文空格�??
	 * 
	 * <pre>
	 * StringUtil.trim(null, *)          = null
	 * StringUtil.trim("", *)            = null
	 * StringUtil.trim("abc", null)      = "abc"
	 * StringUtil.trim("  abc", null)    = "abc"
	 * StringUtil.trim("abc  ", null)    = "abc"
	 * StringUtil.trim(" abc ", null)    = "abc"
	 * StringUtil.trim("  abcyx", "xyz") = "  abc"
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param str
	 *            要处理的字符�?
	 * @param stripChars
	 *            要除去的字符，如果为<code>null</code>表示除去空白字符
	 * 
	 * @return 除去空白的字符串，如果原字串�?<code>null</code>或结果字符串�?<code>""</code>，则返回
	 *         <code>null</code>
	 */
	public static String trimToNull(String str, String stripChars) {
		String result = trim(str, stripChars);

		if ((result == null) || (result.length() == 0)) {
			return null;
		}

		return result;
	}

	/**
	 * 除去字符串头尾部的空白，如果字符串是<code>null</code>，则返回空字符串<code>""</code>�?
	 * 
	 * <p>
	 * 注意，和<code>String.trim</code>不同，此方法使用<code>Character.isWhitespace</code>
	 * 来判定空白， 因�?�可以除去英文字符集之外的其它空白，如中文空格�??
	 * 
	 * <pre>
	 * StringUtil.trimToEmpty(null)          = ""
	 * StringUtil.trimToEmpty("")            = ""
	 * StringUtil.trimToEmpty("     ")       = ""
	 * StringUtil.trimToEmpty("abc")         = "abc"
	 * StringUtil.trimToEmpty("    abc    ") = "abc"
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param str
	 *            要处理的字符�?
	 * 
	 * @return 除去空白的字符串，如果原字串�?<code>null</code>或结果字符串�?<code>""</code>，则返回
	 *         <code>null</code>
	 */
	public static String trimToEmpty(String str) {
		return trimToEmpty(str, null);
	}

	/**
	 * 除去字符串头尾部的空白，如果字符串是<code>null</code>，则返回空字符串<code>""</code>�?
	 * 
	 * <p>
	 * 注意，和<code>String.trim</code>不同，此方法使用<code>Character.isWhitespace</code>
	 * 来判定空白， 因�?�可以除去英文字符集之外的其它空白，如中文空格�??
	 * 
	 * <pre>
	 * StringUtil.trim(null, *)          = ""
	 * StringUtil.trim("", *)            = ""
	 * StringUtil.trim("abc", null)      = "abc"
	 * StringUtil.trim("  abc", null)    = "abc"
	 * StringUtil.trim("abc  ", null)    = "abc"
	 * StringUtil.trim(" abc ", null)    = "abc"
	 * StringUtil.trim("  abcyx", "xyz") = "  abc"
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param str
	 *            要处理的字符�?
	 * 
	 * @return 除去空白的字符串，如果原字串�?<code>null</code>或结果字符串�?<code>""</code>，则返回
	 *         <code>null</code>
	 */
	public static String trimToEmpty(String str, String stripChars) {
		String result = trim(str, stripChars);

		if (result == null) {
			return EMPTY_STRING;
		}

		return result;
	}

	/**
	 * 除去字符串头尾部的指定字符，如果字符串是<code>null</code>，依然返�?<code>null</code>�?
	 * 
	 * <pre>
	 * StringUtil.trim(null, *)          = null
	 * StringUtil.trim("", *)            = ""
	 * StringUtil.trim("abc", null)      = "abc"
	 * StringUtil.trim("  abc", null)    = "abc"
	 * StringUtil.trim("abc  ", null)    = "abc"
	 * StringUtil.trim(" abc ", null)    = "abc"
	 * StringUtil.trim("  abcyx", "xyz") = "  abc"
	 * </pre>
	 * 
	 * @param str
	 *            要处理的字符�?
	 * @param stripChars
	 *            要除去的字符，如果为<code>null</code>表示除去空白字符
	 * @param mode
	 *            <code>-1</code>表示trimStart�?<code>0</code>表示trim全部�?
	 *            <code>1</code>表示trimEnd
	 * 
	 * @return 除去指定字符后的的字符串，如果原字串�?<code>null</code>，则返回<code>null</code>
	 */
	private static String trim(String str, String stripChars, int mode) {
		if (str == null) {
			return null;
		}

		int length = str.length();
		int start = 0;
		int end = length;

		// 扫描字符串头�?
		if (mode <= 0) {
			if (stripChars == null) {
				while ((start < end)
						&& (Character.isWhitespace(str.charAt(start)))) {
					start++;
				}
			} else if (stripChars.length() == 0) {
				return str;
			} else {
				while ((start < end)
						&& (stripChars.indexOf(str.charAt(start)) != -1)) {
					start++;
				}
			}
		}

		// 扫描字符串尾�?
		if (mode >= 0) {
			if (stripChars == null) {
				while ((start < end)
						&& (Character.isWhitespace(str.charAt(end - 1)))) {
					end--;
				}
			} else if (stripChars.length() == 0) {
				return str;
			} else {
				while ((start < end)
						&& (stripChars.indexOf(str.charAt(end - 1)) != -1)) {
					end--;
				}
			}
		}

		if ((start > 0) || (end < length)) {
			return str.substring(start, end);
		}

		return str;
	}

	/*
	 * ==========================================================================
	 * ==
	 */
	/* 字符串类型判定函数�?? */
	/*                                                                              */
	/* 判定字符串的类型是否为：字母、数字�?�空白等 */
	/*
	 * ==========================================================================
	 * ==
	 */

	/**
	 * 判断字符串是否只包含unicode字母�?
	 * 
	 * <p>
	 * <code>null</code>将返�?<code>false</code>，空字符�?<code>""</code>将返�?
	 * <code>true</code>�?
	 * </p>
	 * 
	 * <pre>
	 * StringUtil.isAlpha(null)   = false
	 * StringUtil.isAlpha("")     = true
	 * StringUtil.isAlpha("  ")   = false
	 * StringUtil.isAlpha("abc")  = true
	 * StringUtil.isAlpha("ab2c") = false
	 * StringUtil.isAlpha("ab-c") = false
	 * </pre>
	 * 
	 * @param str
	 *            要检查的字符�?
	 * 
	 * @return 如果字符串非<code>null</code>并且全由unicode字母组成，则返回<code>true</code>
	 */
	public static boolean isAlpha(String str) {
		if (str == null) {
			return false;
		}

		int length = str.length();

		for (int i = 0; i < length; i++) {
			if (!Character.isLetter(str.charAt(i))) {
				return false;
			}
		}

		return true;
	}

	/**
	 * 判断字符串是否只包含unicode字母和空�?<code>' '</code>�?
	 * 
	 * <p>
	 * <code>null</code>将返�?<code>false</code>，空字符�?<code>""</code>将返�?
	 * <code>true</code>�?
	 * </p>
	 * 
	 * <pre>
	 * StringUtil.isAlphaSpace(null)   = false
	 * StringUtil.isAlphaSpace("")     = true
	 * StringUtil.isAlphaSpace("  ")   = true
	 * StringUtil.isAlphaSpace("abc")  = true
	 * StringUtil.isAlphaSpace("ab c") = true
	 * StringUtil.isAlphaSpace("ab2c") = false
	 * StringUtil.isAlphaSpace("ab-c") = false
	 * </pre>
	 * 
	 * @param str
	 *            要检查的字符�?
	 * 
	 * @return 如果字符串非<code>null</code>并且全由unicode字母和空格组成，则返�?<code>true</code>
	 */
	public static boolean isAlphaSpace(String str) {
		if (str == null) {
			return false;
		}

		int length = str.length();

		for (int i = 0; i < length; i++) {
			if (!Character.isLetter(str.charAt(i)) && (str.charAt(i) != ' ')) {
				return false;
			}
		}

		return true;
	}

	/**
	 * 判断字符串是否只包含unicode字母和数字�??
	 * 
	 * <p>
	 * <code>null</code>将返�?<code>false</code>，空字符�?<code>""</code>将返�?
	 * <code>true</code>�?
	 * </p>
	 * 
	 * <pre>
	 * StringUtil.isAlphanumeric(null)   = false
	 * StringUtil.isAlphanumeric("")     = true
	 * StringUtil.isAlphanumeric("  ")   = false
	 * StringUtil.isAlphanumeric("abc")  = true
	 * StringUtil.isAlphanumeric("ab c") = false
	 * StringUtil.isAlphanumeric("ab2c") = true
	 * StringUtil.isAlphanumeric("ab-c") = false
	 * </pre>
	 * 
	 * @param str
	 *            要检查的字符�?
	 * 
	 * @return 如果字符串非<code>null</code>并且全由unicode字母数字组成，则返回<code>true</code>
	 */
	public static boolean isAlphanumeric(String str) {
		if (str == null) {
			return false;
		}

		int length = str.length();

		for (int i = 0; i < length; i++) {
			if (!Character.isLetterOrDigit(str.charAt(i))) {
				return false;
			}
		}

		return true;
	}

	/**
	 * 判断字符串是否只包含unicode字母数字和空�?<code>' '</code>�?
	 * 
	 * <p>
	 * <code>null</code>将返�?<code>false</code>，空字符�?<code>""</code>将返�?
	 * <code>true</code>�?
	 * </p>
	 * 
	 * <pre>
	 * StringUtil.isAlphanumericSpace(null)   = false
	 * StringUtil.isAlphanumericSpace("")     = true
	 * StringUtil.isAlphanumericSpace("  ")   = true
	 * StringUtil.isAlphanumericSpace("abc")  = true
	 * StringUtil.isAlphanumericSpace("ab c") = true
	 * StringUtil.isAlphanumericSpace("ab2c") = true
	 * StringUtil.isAlphanumericSpace("ab-c") = false
	 * </pre>
	 * 
	 * @param str
	 *            要检查的字符�?
	 * 
	 * @return 如果字符串非<code>null</code>并且全由unicode字母数字和空格组成，则返�?<code>true</code>
	 */
	public static boolean isAlphanumericSpace(String str) {
		if (str == null) {
			return false;
		}

		int length = str.length();

		for (int i = 0; i < length; i++) {
			if (!Character.isLetterOrDigit(str.charAt(i))
					&& (str.charAt(i) != ' ')) {
				return false;
			}
		}

		return true;
	}

	/**
	 * 判断字符串是否只包含unicode数字�?
	 * 
	 * <p>
	 * <code>null</code>将返�?<code>false</code>，空字符�?<code>""</code>将返�?
	 * <code>true</code>�?
	 * </p>
	 * 
	 * <pre>
	 * StringUtil.isNumeric(null)   = false
	 * StringUtil.isNumeric("")     = true
	 * StringUtil.isNumeric("  ")   = false
	 * StringUtil.isNumeric("123")  = true
	 * StringUtil.isNumeric("12 3") = false
	 * StringUtil.isNumeric("ab2c") = false
	 * StringUtil.isNumeric("12-3") = false
	 * StringUtil.isNumeric("12.3") = false
	 * </pre>
	 * 
	 * @param str
	 *            要检查的字符�?
	 * 
	 * @return 如果字符串非<code>null</code>并且全由unicode数字组成，则返回<code>true</code>
	 */
	public static boolean isNumeric(String str) {
		if (str == null) {
			return false;
		}

		int length = str.length();

		for (int i = 0; i < length; i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}

		return true;
	}

	/**
	 * 判断字符串是否只包含unicode数字和空�?<code>' '</code>�?
	 * 
	 * <p>
	 * <code>null</code>将返�?<code>false</code>，空字符�?<code>""</code>将返�?
	 * <code>true</code>�?
	 * </p>
	 * 
	 * <pre>
	 * StringUtil.isNumericSpace(null)   = false
	 * StringUtil.isNumericSpace("")     = true
	 * StringUtil.isNumericSpace("  ")   = true
	 * StringUtil.isNumericSpace("123")  = true
	 * StringUtil.isNumericSpace("12 3") = true
	 * StringUtil.isNumericSpace("ab2c") = false
	 * StringUtil.isNumericSpace("12-3") = false
	 * StringUtil.isNumericSpace("12.3") = false
	 * </pre>
	 * 
	 * @param str
	 *            要检查的字符�?
	 * 
	 * @return 如果字符串非<code>null</code>并且全由unicode数字和空格组成，则返�?<code>true</code>
	 */
	public static boolean isNumericSpace(String str) {
		if (str == null) {
			return false;
		}

		int length = str.length();

		for (int i = 0; i < length; i++) {
			if (!Character.isDigit(str.charAt(i)) && (str.charAt(i) != ' ')) {
				return false;
			}
		}

		return true;
	}

	/**
	 * 判断字符串是否只包含unicode空白�?
	 * 
	 * <p>
	 * <code>null</code>将返�?<code>false</code>，空字符�?<code>""</code>将返�?
	 * <code>true</code>�?
	 * </p>
	 * 
	 * <pre>
	 * StringUtil.isWhitespace(null)   = false
	 * StringUtil.isWhitespace("")     = true
	 * StringUtil.isWhitespace("  ")   = true
	 * StringUtil.isWhitespace("abc")  = false
	 * StringUtil.isWhitespace("ab2c") = false
	 * StringUtil.isWhitespace("ab-c") = false
	 * </pre>
	 * 
	 * @param str
	 *            要检查的字符�?
	 * 
	 * @return 如果字符串非<code>null</code>并且全由unicode空白组成，则返回<code>true</code>
	 */
	public static boolean isWhitespace(String str) {
		if (str == null) {
			return false;
		}

		int length = str.length();

		for (int i = 0; i < length; i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				return false;
			}
		}

		return true;
	}

	/*
	 * ==========================================================================
	 * ==
	 */
	/* 大小写转换�?? */
	/*
	 * ==========================================================================
	 * ==
	 */

	/**
	 * 将字符串转换成大写�??
	 * 
	 * <p>
	 * 如果字符串是<code>null</code>则返�?<code>null</code>�?
	 * 
	 * <pre>
	 * StringUtil.toUpperCase(null)  = null
	 * StringUtil.toUpperCase("")    = ""
	 * StringUtil.toUpperCase("aBc") = "ABC"
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param str
	 *            要转换的字符�?
	 * 
	 * @return 大写字符串，如果原字符串�?<code>null</code>，则返回<code>null</code>
	 */
	public static String toUpperCase(String str) {
		if (str == null) {
			return null;
		}

		return str.toUpperCase();
	}

	/**
	 * 将字符串转换成小写�??
	 * 
	 * <p>
	 * 如果字符串是<code>null</code>则返�?<code>null</code>�?
	 * 
	 * <pre>
	 * StringUtil.toLowerCase(null)  = null
	 * StringUtil.toLowerCase("")    = ""
	 * StringUtil.toLowerCase("aBc") = "abc"
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param str
	 *            要转换的字符�?
	 * 
	 * @return 大写字符串，如果原字符串�?<code>null</code>，则返回<code>null</code>
	 */
	public static String toLowerCase(String str) {
		if (str == null) {
			return null;
		}

		return str.toLowerCase();
	}

	/**
	 * 将字符串的首字符转成大写�?<code>Character.toTitleCase</code>），其它字符不变�?
	 * 
	 * <p>
	 * 如果字符串是<code>null</code>则返�?<code>null</code>�?
	 * 
	 * <pre>
	 * StringUtil.capitalize(null)  = null
	 * StringUtil.capitalize("")    = ""
	 * StringUtil.capitalize("cat") = "Cat"
	 * StringUtil.capitalize("cAt") = "CAt"
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param str
	 *            要转换的字符�?
	 * 
	 * @return 首字符为大写的字符串，如果原字符串为<code>null</code>，则返回<code>null</code>
	 */
	public static String capitalize(String str) {
		int strLen;

		if ((str == null) || ((strLen = str.length()) == 0)) {
			return str;
		}

		return new StringBuffer(strLen)
				.append(Character.toTitleCase(str.charAt(0)))
				.append(str.substring(1)).toString();
	}

	/**
	 * 将字符串的首字符转成小写，其它字符不变�??
	 * 
	 * <p>
	 * 如果字符串是<code>null</code>则返�?<code>null</code>�?
	 * 
	 * <pre>
	 * StringUtil.uncapitalize(null)  = null
	 * StringUtil.uncapitalize("")    = ""
	 * StringUtil.uncapitalize("Cat") = "cat"
	 * StringUtil.uncapitalize("CAT") = "cAT"
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param str
	 *            要转换的字符�?
	 * 
	 * @return 首字符为小写的字符串，如果原字符串为<code>null</code>，则返回<code>null</code>
	 */
	public static String uncapitalize(String str) {
		int strLen;

		if ((str == null) || ((strLen = str.length()) == 0)) {
			return str;
		}

		return new StringBuffer(strLen)
				.append(Character.toLowerCase(str.charAt(0)))
				.append(str.substring(1)).toString();
	}

	/**
	 * 反转字符串的大小写�??
	 * 
	 * <p>
	 * 如果字符串是<code>null</code>则返�?<code>null</code>�?
	 * 
	 * <pre>
	 * StringUtil.swapCase(null)                 = null
	 * StringUtil.swapCase("")                   = ""
	 * StringUtil.swapCase("The dog has a BONE") = "tHE DOG HAS A bone"
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param str
	 *            要转换的字符�?
	 * 
	 * @return 大小写被反转的字符串，如果原字符串为<code>null</code>，则返回<code>null</code>
	 */
	public static String swapCase(String str) {
		int strLen;

		if ((str == null) || ((strLen = str.length()) == 0)) {
			return str;
		}

		StringBuffer buffer = new StringBuffer(strLen);

		char ch = 0;

		for (int i = 0; i < strLen; i++) {
			ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else if (Character.isTitleCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			}

			buffer.append(ch);
		}

		return buffer.toString();
	}

	/*
	 * ==========================================================================
	 * ==
	 */
	/* 字符串分割函数�?? */
	/*                                                                              */
	/* 将字符串按指定分隔符分割�? */
	/*
	 * ==========================================================================
	 * ==
	 */

	/**
	 * 将字符串按空白字符分割�??
	 * 
	 * <p>
	 * 分隔符不会出现在目标数组中，连续的分隔符就被看作�?个�?�如果字符串�?<code>null</code>，则返回<code>null</code>�?
	 * 
	 * <pre>
	 * StringUtil.split(null)       = null
	 * StringUtil.split("")         = []
	 * StringUtil.split("abc def")  = ["abc", "def"]
	 * StringUtil.split("abc  def") = ["abc", "def"]
	 * StringUtil.split(" abc ")    = ["abc"]
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param str
	 *            要分割的字符�?
	 * 
	 * @return 分割后的字符串数组，如果原字符串�?<code>null</code>，则返回<code>null</code>
	 */
	public static String[] split(String str) {
		return split(str, null, -1);
	}

	/**
	 * 将字符串按指定字符分割�??
	 * 
	 * <p>
	 * 分隔符不会出现在目标数组中，连续的分隔符就被看作�?个�?�如果字符串�?<code>null</code>，则返回<code>null</code>�?
	 * 
	 * <pre>
	 * StringUtil.split(null, *)         = null
	 * StringUtil.split("", *)           = []
	 * StringUtil.split("a.b.c", '.')    = ["a", "b", "c"]
	 * StringUtil.split("a..b.c", '.')   = ["a", "b", "c"]
	 * StringUtil.split("a:b:c", '.')    = ["a:b:c"]
	 * StringUtil.split("a b c", ' ')    = ["a", "b", "c"]
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param str
	 *            要分割的字符�?
	 * @param separatorChar
	 *            分隔�?
	 * 
	 * @return 分割后的字符串数组，如果原字符串�?<code>null</code>，则返回<code>null</code>
	 */
	public static String[] split(String str, char separatorChar) {
		if (str == null) {
			return null;
		}

		int length = str.length();

		if (length == 0) {
			return ArrayUtil.EMPTY_STRING_ARRAY;
		}

		List<String> list = new ArrayList<String>();
		int i = 0;
		int start = 0;
		boolean match = false;

		while (i < length) {
			if (str.charAt(i) == separatorChar) {
				if (match) {
					list.add(str.substring(start, i));
					match = false;
				}

				start = ++i;
				continue;
			}

			match = true;
			i++;
		}

		if (match) {
			list.add(str.substring(start, i));
		}

		return (String[]) list.toArray(new String[list.size()]);
	}

	/**
	 * 以分隔符为分界线 将str分割 重复的分隔符算独立的分割
	 * @param str
	 * @param separatorChar
	 * @return
	 */
	public static String[] splitInsqe(String str, char separatorChar){
		if (str == null) {
			return null;
		}

		int length = str.length();

		if (length == 0) {
			return ArrayUtil.EMPTY_STRING_ARRAY;
		}

		List<String> list = new ArrayList<String>();
		boolean isIn = false;
		int pre = -1;
		
		for(int i=0;i<length;i++){
			 if(str.charAt(i) == separatorChar){
				 isIn = true;
				 if(i == 0){
					 if(length == 1){
						 list.add("");
						 list.add("");
					 }
					 else{
						 list.add("");
						 pre = 0;
					 }
				 }
				 else if(i > 0 && i < (length-1)){
					 if(pre == -1){
						 list.add(str.substring(0,i));
						 pre = i;
					 }
					 else{
						 list.add(str.substring(pre+1,i));
						 pre = i;
					 }
				 }
				 else{
					 if(pre == -1){
						 list.add(str.substring(0,i));
						 list.add("");
						 pre = i;
					 }
					 else{
						 list.add(str.substring(pre+1,i));
						 list.add("");
						 pre = i;
					 }
				 }
			 }
		}
		//判断pre的位�? 是否全部分割
		if(pre != length-1){
			list.add(str.substring(pre+1,length));
		}
		//不存在分隔符
		if(!isIn){
			list.add(str);
		}
		return (String[])list.toArray(new String[list.size()]);
	}
	
	/**
	 * 将字符串按指定字符分割�??
	 * 
	 * <p>
	 * 分隔符不会出现在目标数组中，连续的分隔符就被看作�?个�?�如果字符串�?<code>null</code>，则返回<code>null</code>�?
	 * 
	 * <pre>
	 * StringUtil.split(null, *)                = null
	 * StringUtil.split("", *)                  = []
	 * StringUtil.split("abc def", null)        = ["abc", "def"]
	 * StringUtil.split("abc def", " ")         = ["abc", "def"]
	 * StringUtil.split("abc  def", " ")        = ["abc", "def"]
	 * StringUtil.split(" ab:  cd::ef  ", ":")  = ["ab", "cd", "ef"]
	 * StringUtil.split("abc.def", "")          = ["abc.def"]
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param str
	 *            要分割的字符�?
	 * @param separatorChars
	 *            分隔�?
	 * 
	 * @return 分割后的字符串数组，如果原字符串�?<code>null</code>，则返回<code>null</code>
	 */
	public static String[] split(String str, String separatorChars) {
		return split(str, separatorChars, -1);
	}

	/**
	 * 将字符串按指定字符分割�??
	 * 
	 * <p>
	 * 分隔符不会出现在目标数组中，连续的分隔符就被看作�?个�?�如果字符串�?<code>null</code>，则返回<code>null</code>�?
	 * 
	 * <pre>
	 * StringUtil.split(null, *, *)                 = null
	 * StringUtil.split("", *, *)                   = []
	 * StringUtil.split("ab cd ef", null, 0)        = ["ab", "cd", "ef"]
	 * StringUtil.split("  ab   cd ef  ", null, 0)  = ["ab", "cd", "ef"]
	 * StringUtil.split("ab:cd::ef", ":", 0)        = ["ab", "cd", "ef"]
	 * StringUtil.split("ab:cd:ef", ":", 2)         = ["ab", "cdef"]
	 * StringUtil.split("abc.def", "", 2)           = ["abc.def"]
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param str
	 *            要分割的字符�?
	 * @param separatorChars
	 *            分隔�?
	 * @param max
	 *            返回的数组的�?大个数，如果小于等于0，则表示无限�?
	 * 
	 * @return 分割后的字符串数组，如果原字符串�?<code>null</code>，则返回<code>null</code>
	 */
	public static String[] split(String str, String separatorChars, int max) {
		if (str == null) {
			return null;
		}

		int length = str.length();

		if (length == 0) {
			return ArrayUtil.EMPTY_STRING_ARRAY;
		}

		List<String> list = new ArrayList<String>();
		int sizePlus1 = 1;
		int i = 0;
		int start = 0;
		boolean match = false;

		if (separatorChars == null) {
			// null表示使用空白作为分隔�?
			while (i < length) {
				if (Character.isWhitespace(str.charAt(i))) {
					if (match) {
						if (sizePlus1++ == max) {
							i = length;
						}

						list.add(str.substring(start, i));
						match = false;
					}

					start = ++i;
					continue;
				}

				match = true;
				i++;
			}
		} else if (separatorChars.length() == 1) {
			// 优化分隔符长度为1的情�?
			char sep = separatorChars.charAt(0);

			while (i < length) {
				if (str.charAt(i) == sep) {
					if (match) {
						if (sizePlus1++ == max) {
							i = length;
						}

						list.add(str.substring(start, i));
						match = false;
					}

					start = ++i;
					continue;
				}

				match = true;
				i++;
			}
		} else {
			// �?般情�?
			while (i < length) {
				if (separatorChars.indexOf(str.charAt(i)) >= 0) {
					if (match) {
						if (sizePlus1++ == max) {
							i = length;
						}

						list.add(str.substring(start, i));
						match = false;
					}

					start = ++i;
					continue;
				}

				match = true;
				i++;
			}
		}

		if (match) {
			list.add(str.substring(start, i));
		}

		return (String[]) list.toArray(new String[list.size()]);
	}
	
	//取得状如 '21,13,4,4;12,3,56;12,3,5'字符串中第no个以separatorChars分割的子�?
	//EG: getlist('21,13,4,4;12,3,56;12,3,5',';',3) = '12,3,5'
	public static String getsub(String str, String separatorChars, int index) {
		if (str == null) {
			return "";
		}
		int pos = 0, count =0, nextPos = 0;
		pos = str.indexOf(separatorChars);
		if (pos == -1 && index == 1) {
			return str;
		}
		if (pos == -1 && index > 1) {
			return "";
		}
		
		while (pos >= 0 && count != index - 1) {
			count++;
			if (count == index - 1) {
				break;
			}
			pos = str.indexOf(separatorChars, pos + separatorChars.length());
		}
		
		if (index == 1) {
			nextPos = pos;
			pos = 0 - separatorChars.length();
		}else {
			nextPos = str.indexOf(separatorChars, pos + separatorChars.length());
			if (nextPos == -1) {
				nextPos = str.length();
			}
		}
		
		return str.substring(pos + separatorChars.length(), nextPos);
	}

	/*
	 * ==========================================================================
	 * ==
	 */
	/* 字符串查找函�? —�?? 字符或字符串�? */
	/*                                                                              */
	/* 在字符串中查找指定字符或字符串�?? */
	/*
	 * ==========================================================================
	 * ==
	 */

	/**
	 * 在字符串中查找指定字符，并返回第�?个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回<code>-1</code>�?
	 * 
	 * <pre>
	 * StringUtil.indexOf(null, *)         = -1
	 * StringUtil.indexOf("", *)           = -1
	 * StringUtil.indexOf("aabaabaa", 'a') = 0
	 * StringUtil.indexOf("aabaabaa", 'b') = 2
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param searchChar
	 *            要查找的字符
	 * 
	 * @return 第一个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回<code>-1</code>
	 */
	public static int indexOf(String str, char searchChar) {
		if ((str == null) || (str.length() == 0)) {
			return -1;
		}

		return str.indexOf(searchChar);
	}

	/**
	 * 在字符串中查找指定字符，并返回第�?个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回<code>-1</code>�?
	 * 
	 * <pre>
	 * StringUtil.indexOf(null, *, *)          = -1
	 * StringUtil.indexOf("", *, *)            = -1
	 * StringUtil.indexOf("aabaabaa", 'b', 0)  = 2
	 * StringUtil.indexOf("aabaabaa", 'b', 3)  = 5
	 * StringUtil.indexOf("aabaabaa", 'b', 9)  = -1
	 * StringUtil.indexOf("aabaabaa", 'b', -1) = 2
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param searchChar
	 *            要查找的字符
	 * @param startPos
	 *            �?始搜索的索引值，如果小于0，则看作0
	 * 
	 * @return 第一个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回<code>-1</code>
	 */
	public static int indexOf(String str, char searchChar, int startPos) {
		if ((str == null) || (str.length() == 0)) {
			return -1;
		}

		return str.indexOf(searchChar, startPos);
	}

	/**
	 * 在字符串中查找指定字符串，并返回第一个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回<code>-1</code>�?
	 * 
	 * <pre>
	 * StringUtil.indexOf(null, *)          = -1
	 * StringUtil.indexOf(*, null)          = -1
	 * StringUtil.indexOf("", "")           = 0
	 * StringUtil.indexOf("aabaabaa", "a")  = 0
	 * StringUtil.indexOf("aabaabaa", "b")  = 2
	 * StringUtil.indexOf("aabaabaa", "ab") = 1
	 * StringUtil.indexOf("aabaabaa", "")   = 0
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param searchStr
	 *            要查找的字符�?
	 * 
	 * @return 第一个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回<code>-1</code>
	 */
	public static int indexOf(String str, String searchStr) {
		if ((str == null) || (searchStr == null)) {
			return -1;
		}

		return str.indexOf(searchStr);
	}

	/**
	 * 在字符串中查找指定字符串，并返回第一个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回<code>-1</code>�?
	 * 
	 * <pre>
	 * StringUtil.indexOf(null, *, *)          = -1
	 * StringUtil.indexOf(*, null, *)          = -1
	 * StringUtil.indexOf("", "", 0)           = 0
	 * StringUtil.indexOf("aabaabaa", "a", 0)  = 0
	 * StringUtil.indexOf("aabaabaa", "b", 0)  = 2
	 * StringUtil.indexOf("aabaabaa", "ab", 0) = 1
	 * StringUtil.indexOf("aabaabaa", "b", 3)  = 5
	 * StringUtil.indexOf("aabaabaa", "b", 9)  = -1
	 * StringUtil.indexOf("aabaabaa", "b", -1) = 2
	 * StringUtil.indexOf("aabaabaa", "", 2)   = 2
	 * StringUtil.indexOf("abc", "", 9)        = 3
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param searchStr
	 *            要查找的字符�?
	 * @param startPos
	 *            �?始搜索的索引值，如果小于0，则看作0
	 * 
	 * @return 第一个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回<code>-1</code>
	 */
	public static int indexOf(String str, String searchStr, int startPos) {
		if ((str == null) || (searchStr == null)) {
			return -1;
		}

		// JDK1.3及以下版本的bug：不能正确处理下面的情况
		if ((searchStr.length() == 0) && (startPos >= str.length())) {
			return str.length();
		}

		return str.indexOf(searchStr, startPos);
	}

	/**
	 * 在字符串中查找指定字符集合中的字符，并返回第�?个匹配的起始索引�? 如果字符串为<code>null</code>，则返回
	 * <code>-1</code>�? 如果字符集合�?<code>null</code>或空，也返回<code>-1</code>�?
	 * 
	 * <pre>
	 * StringUtil.indexOfAny(null, *)                = -1
	 * StringUtil.indexOfAny("", *)                  = -1
	 * StringUtil.indexOfAny(*, null)                = -1
	 * StringUtil.indexOfAny(*, [])                  = -1
	 * StringUtil.indexOfAny("zzabyycdxx",['z','a']) = 0
	 * StringUtil.indexOfAny("zzabyycdxx",['b','y']) = 3
	 * StringUtil.indexOfAny("aba", ['z'])           = -1
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param searchChars
	 *            要搜索的字符集合
	 * 
	 * @return 第一个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回<code>-1</code>
	 */
	public static int indexOfAny(String str, char[] searchChars) {
		if ((str == null) || (str.length() == 0) || (searchChars == null)
				|| (searchChars.length == 0)) {
			return -1;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			for (int j = 0; j < searchChars.length; j++) {
				if (searchChars[j] == ch) {
					return i;
				}
			}
		}

		return -1;
	}

	/**
	 * 在字符串中查找指定字符集合中的字符，并返回第�?个匹配的起始索引�? 如果字符串为<code>null</code>，则返回
	 * <code>-1</code>�? 如果字符集合�?<code>null</code>或空，也返回<code>-1</code>�?
	 * 
	 * <pre>
	 * StringUtil.indexOfAny(null, *)            = -1
	 * StringUtil.indexOfAny("", *)              = -1
	 * StringUtil.indexOfAny(*, null)            = -1
	 * StringUtil.indexOfAny(*, "")              = -1
	 * StringUtil.indexOfAny("zzabyycdxx", "za") = 0
	 * StringUtil.indexOfAny("zzabyycdxx", "by") = 3
	 * StringUtil.indexOfAny("aba","z")          = -1
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param searchChars
	 *            要搜索的字符集合
	 * 
	 * @return 第一个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回<code>-1</code>
	 */
	public static int indexOfAny(String str, String searchChars) {
		if ((str == null) || (str.length() == 0) || (searchChars == null)
				|| (searchChars.length() == 0)) {
			return -1;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			for (int j = 0; j < searchChars.length(); j++) {
				if (searchChars.charAt(j) == ch) {
					return i;
				}
			}
		}

		return -1;
	}

	/**
	 * 在字符串中查找指定字符串集合中的字符串，并返回第�?个匹配的起始索引�? 如果字符串为<code>null</code>，则返回
	 * <code>-1</code>�? 如果字符串集合为<code>null</code>或空，也返回<code>-1</code>�?
	 * 如果字符串集合包�?<code>""</code>，并且字符串不为<code>null</code>，则返回
	 * <code>str.length()</code>
	 * 
	 * <pre>
	 * StringUtil.indexOfAny(null, *)                     = -1
	 * StringUtil.indexOfAny(*, null)                     = -1
	 * StringUtil.indexOfAny(*, [])                       = -1
	 * StringUtil.indexOfAny("zzabyycdxx", ["ab","cd"])   = 2
	 * StringUtil.indexOfAny("zzabyycdxx", ["cd","ab"])   = 2
	 * StringUtil.indexOfAny("zzabyycdxx", ["mn","op"])   = -1
	 * StringUtil.indexOfAny("zzabyycdxx", ["zab","aby"]) = 1
	 * StringUtil.indexOfAny("zzabyycdxx", [""])          = 0
	 * StringUtil.indexOfAny("", [""])                    = 0
	 * StringUtil.indexOfAny("", ["a"])                   = -1
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param searchStrs
	 *            要搜索的字符串集�?
	 * 
	 * @return 第一个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回<code>-1</code>
	 */
	public static int indexOfAny(String str, String[] searchStrs) {
		if ((str == null) || (searchStrs == null)) {
			return -1;
		}

		int sz = searchStrs.length;

		// String's can't have a MAX_VALUEth index.
		int ret = Integer.MAX_VALUE;

		int tmp = 0;

		for (int i = 0; i < sz; i++) {
			String search = searchStrs[i];

			if (search == null) {
				continue;
			}

			tmp = str.indexOf(search);

			if (tmp == -1) {
				continue;
			}

			if (tmp < ret) {
				ret = tmp;
			}
		}

		return (ret == Integer.MAX_VALUE) ? (-1) : ret;
	}

	/**
	 * 在字符串中查找不在指定字符集合中的字符，并返回第�?个匹配的起始索引�? 如果字符串为<code>null</code>，则返回
	 * <code>-1</code>�? 如果字符集合�?<code>null</code>或空，也返回<code>-1</code>�?
	 * 
	 * <pre>
	 * StringUtil.indexOfAnyBut(null, *)             = -1
	 * StringUtil.indexOfAnyBut("", *)               = -1
	 * StringUtil.indexOfAnyBut(*, null)             = -1
	 * StringUtil.indexOfAnyBut(*, [])               = -1
	 * StringUtil.indexOfAnyBut("zzabyycdxx",'za')   = 3
	 * StringUtil.indexOfAnyBut("zzabyycdxx", 'by')  = 0
	 * StringUtil.indexOfAnyBut("aba", 'ab')         = -1
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param searchChars
	 *            要搜索的字符集合
	 * 
	 * @return 第一个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回<code>-1</code>
	 */
	public static int indexOfAnyBut(String str, char[] searchChars) {
		if ((str == null) || (str.length() == 0) || (searchChars == null)
				|| (searchChars.length == 0)) {
			return -1;
		}

		outer: for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			for (int j = 0; j < searchChars.length; j++) {
				if (searchChars[j] == ch) {
					continue outer;
				}
			}

			return i;
		}

		return -1;
	}

	/**
	 * 在字符串中查找不在指定字符集合中的字符，并返回第�?个匹配的起始索引�? 如果字符串为<code>null</code>，则返回
	 * <code>-1</code>�? 如果字符集合�?<code>null</code>或空，也返回<code>-1</code>�?
	 * 
	 * <pre>
	 * StringUtil.indexOfAnyBut(null, *)            = -1
	 * StringUtil.indexOfAnyBut("", *)              = -1
	 * StringUtil.indexOfAnyBut(*, null)            = -1
	 * StringUtil.indexOfAnyBut(*, "")              = -1
	 * StringUtil.indexOfAnyBut("zzabyycdxx", "za") = 3
	 * StringUtil.indexOfAnyBut("zzabyycdxx", "by") = 0
	 * StringUtil.indexOfAnyBut("aba","ab")         = -1
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param searchChars
	 *            要搜索的字符集合
	 * 
	 * @return 第一个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回<code>-1</code>
	 */
	public static int indexOfAnyBut(String str, String searchChars) {
		if ((str == null) || (str.length() == 0) || (searchChars == null)
				|| (searchChars.length() == 0)) {
			return -1;
		}

		for (int i = 0; i < str.length(); i++) {
			if (searchChars.indexOf(str.charAt(i)) < 0) {
				return i;
			}
		}

		return -1;
	}

	/**
	 * 从字符串尾部�?始查找指定字符，并返回第�?个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回
	 * <code>-1</code>�?
	 * 
	 * <pre>
	 * StringUtil.lastIndexOf(null, *)         = -1
	 * StringUtil.lastIndexOf("", *)           = -1
	 * StringUtil.lastIndexOf("aabaabaa", 'a') = 7
	 * StringUtil.lastIndexOf("aabaabaa", 'b') = 5
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param searchChar
	 *            要查找的字符
	 * 
	 * @return 第一个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回<code>-1</code>
	 */
	public static int lastIndexOf(String str, char searchChar) {
		if ((str == null) || (str.length() == 0)) {
			return -1;
		}

		return str.lastIndexOf(searchChar);
	}

	/**
	 * 从字符串尾部�?始查找指定字符，并返回第�?个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回
	 * <code>-1</code>�?
	 * 
	 * <pre>
	 * StringUtil.lastIndexOf(null, *, *)          = -1
	 * StringUtil.lastIndexOf("", *,  *)           = -1
	 * StringUtil.lastIndexOf("aabaabaa", 'b', 8)  = 5
	 * StringUtil.lastIndexOf("aabaabaa", 'b', 4)  = 2
	 * StringUtil.lastIndexOf("aabaabaa", 'b', 0)  = -1
	 * StringUtil.lastIndexOf("aabaabaa", 'b', 9)  = 5
	 * StringUtil.lastIndexOf("aabaabaa", 'b', -1) = -1
	 * StringUtil.lastIndexOf("aabaabaa", 'a', 0)  = 0
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param searchChar
	 *            要查找的字符
	 * @param startPos
	 *            从指定索引开始向前搜�?
	 * 
	 * @return 第一个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回<code>-1</code>
	 */
	public static int lastIndexOf(String str, char searchChar, int startPos) {
		if ((str == null) || (str.length() == 0)) {
			return -1;
		}

		return str.lastIndexOf(searchChar, startPos);
	}

	/**
	 * 从字符串尾部�?始查找指定字符串，并返回第一个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回
	 * <code>-1</code>�?
	 * 
	 * <pre>
	 * StringUtil.lastIndexOf(null, *)         = -1
	 * StringUtil.lastIndexOf("", *)           = -1
	 * StringUtil.lastIndexOf("aabaabaa", 'a') = 7
	 * StringUtil.lastIndexOf("aabaabaa", 'b') = 5
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param searchStr
	 *            要查找的字符�?
	 * 
	 * @return 第一个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回<code>-1</code>
	 */
	public static int lastIndexOf(String str, String searchStr) {
		if ((str == null) || (searchStr == null)) {
			return -1;
		}

		return str.lastIndexOf(searchStr);
	}

	/**
	 * 从字符串尾部�?始查找指定字符串，并返回第一个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回
	 * <code>-1</code>�?
	 * 
	 * <pre>
	 * StringUtil.lastIndexOf(null, *, *)          = -1
	 * StringUtil.lastIndexOf(*, null, *)          = -1
	 * StringUtil.lastIndexOf("aabaabaa", "a", 8)  = 7
	 * StringUtil.lastIndexOf("aabaabaa", "b", 8)  = 5
	 * StringUtil.lastIndexOf("aabaabaa", "ab", 8) = 4
	 * StringUtil.lastIndexOf("aabaabaa", "b", 9)  = 5
	 * StringUtil.lastIndexOf("aabaabaa", "b", -1) = -1
	 * StringUtil.lastIndexOf("aabaabaa", "a", 0)  = 0
	 * StringUtil.lastIndexOf("aabaabaa", "b", 0)  = -1
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param searchStr
	 *            要查找的字符�?
	 * @param startPos
	 *            从指定索引开始向前搜�?
	 * 
	 * @return 第一个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回<code>-1</code>
	 */
	public static int lastIndexOf(String str, String searchStr, int startPos) {
		if ((str == null) || (searchStr == null)) {
			return -1;
		}

		return str.lastIndexOf(searchStr, startPos);
	}

	/**
	 * 从字符串尾部�?始查找指定字符串集合中的字符串，并返回第�?个匹配的起始索引�? 如果字符串为<code>null</code>，则返回
	 * <code>-1</code>�? 如果字符串集合为<code>null</code>或空，也返回<code>-1</code>�?
	 * 如果字符串集合包�?<code>""</code>，并且字符串不为<code>null</code>，则返回
	 * <code>str.length()</code>
	 * 
	 * <pre>
	 * StringUtil.lastIndexOfAny(null, *)                   = -1
	 * StringUtil.lastIndexOfAny(*, null)                   = -1
	 * StringUtil.lastIndexOfAny(*, [])                     = -1
	 * StringUtil.lastIndexOfAny(*, [null])                 = -1
	 * StringUtil.lastIndexOfAny("zzabyycdxx", ["ab","cd"]) = 6
	 * StringUtil.lastIndexOfAny("zzabyycdxx", ["cd","ab"]) = 6
	 * StringUtil.lastIndexOfAny("zzabyycdxx", ["mn","op"]) = -1
	 * StringUtil.lastIndexOfAny("zzabyycdxx", ["mn","op"]) = -1
	 * StringUtil.lastIndexOfAny("zzabyycdxx", ["mn",""])   = 10
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param searchStrs
	 *            要搜索的字符串集�?
	 * 
	 * @return 第一个匹配的索引值�?�如果字符串�?<code>null</code>或未找到，则返回<code>-1</code>
	 */
	public static int lastIndexOfAny(String str, String[] searchStrs) {
		if ((str == null) || (searchStrs == null)) {
			return -1;
		}

		int searchStrsLength = searchStrs.length;
		int index = -1;
		int tmp = 0;

		for (int i = 0; i < searchStrsLength; i++) {
			String search = searchStrs[i];

			if (search == null) {
				continue;
			}

			tmp = str.lastIndexOf(search);

			if (tmp > index) {
				index = tmp;
			}
		}

		return index;
	}

	/**
	 * �?查字符串中是否包含指定的字符。如果字符串�?<code>null</code>，将返回<code>false</code>�?
	 * 
	 * <pre>
	 * StringUtil.contains(null, *)    = false
	 * StringUtil.contains("", *)      = false
	 * StringUtil.contains("abc", 'a') = true
	 * StringUtil.contains("abc", 'z') = false
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param searchChar
	 *            要查找的字符
	 * 
	 * @return 如果找到，则返回<code>true</code>
	 */
	public static boolean contains(String str, char searchChar) {
		if ((str == null) || (str.length() == 0)) {
			return false;
		}

		return str.indexOf(searchChar) >= 0;
	}

	/**
	 * �?查字符串中是否包含指定的字符串�?�如果字符串�?<code>null</code>，将返回<code>false</code>�?
	 * 
	 * <pre>
	 * StringUtil.contains(null, *)     = false
	 * StringUtil.contains(*, null)     = false
	 * StringUtil.contains("", "")      = true
	 * StringUtil.contains("abc", "")   = true
	 * StringUtil.contains("abc", "a")  = true
	 * StringUtil.contains("abc", "z")  = false
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param searchStr
	 *            要查找的字符�?
	 * 
	 * @return 如果找到，则返回<code>true</code>
	 */
	public static boolean contains(String str, String searchStr) {
		if ((str == null) || (searchStr == null)) {
			return false;
		}

		return str.indexOf(searchStr) >= 0;
	}

	/**
	 * �?查字符串是是否只包含指定字符集合中的字符�?
	 * 
	 * <p>
	 * 如果字符串为<code>null</code>，则返回<code>false</code>�? 如果字符集合�?<code>null</code>
	 * 则返�?<code>false</code>�? 但是空字符串永远返回<code>true</code>.
	 * </p>
	 * 
	 * <pre>
	 * StringUtil.containsOnly(null, *)       = false
	 * StringUtil.containsOnly(*, null)       = false
	 * StringUtil.containsOnly("", *)         = true
	 * StringUtil.containsOnly("ab", '')      = false
	 * StringUtil.containsOnly("abab", 'abc') = true
	 * StringUtil.containsOnly("ab1", 'abc')  = false
	 * StringUtil.containsOnly("abz", 'abc')  = false
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param valid
	 *            要查找的字符�?
	 * 
	 * @return 如果找到，则返回<code>true</code>
	 */
	public static boolean containsOnly(String str, char[] valid) {
		if ((valid == null) || (str == null)) {
			return false;
		}

		if (str.length() == 0) {
			return true;
		}

		if (valid.length == 0) {
			return false;
		}

		return indexOfAnyBut(str, valid) == -1;
	}

	/**
	 * �?查字符串是是否只包含指定字符集合中的字符�?
	 * 
	 * <p>
	 * 如果字符串为<code>null</code>，则返回<code>false</code>�? 如果字符集合�?<code>null</code>
	 * 则返�?<code>false</code>�? 但是空字符串永远返回<code>true</code>.
	 * </p>
	 * 
	 * <pre>
	 * StringUtil.containsOnly(null, *)       = false
	 * StringUtil.containsOnly(*, null)       = false
	 * StringUtil.containsOnly("", *)         = true
	 * StringUtil.containsOnly("ab", "")      = false
	 * StringUtil.containsOnly("abab", "abc") = true
	 * StringUtil.containsOnly("ab1", "abc")  = false
	 * StringUtil.containsOnly("abz", "abc")  = false
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param valid
	 *            要查找的字符�?
	 * 
	 * @return 如果找到，则返回<code>true</code>
	 */
	public static boolean containsOnly(String str, String valid) {
		if ((str == null) || (valid == null)) {
			return false;
		}

		return containsOnly(str, valid.toCharArray());
	}

	/**
	 * �?查字符串是是否不包含指定字符集合中的字符�?
	 * 
	 * <p>
	 * 如果字符串为<code>null</code>，则返回<code>false</code>�? 如果字符集合�?<code>null</code>
	 * 则返�?<code>true</code>�? 但是空字符串永远返回<code>true</code>.
	 * </p>
	 * 
	 * <pre>
	 * StringUtil.containsNone(null, *)       = true
	 * StringUtil.containsNone(*, null)       = true
	 * StringUtil.containsNone("", *)         = true
	 * StringUtil.containsNone("ab", '')      = true
	 * StringUtil.containsNone("abab", 'xyz') = true
	 * StringUtil.containsNone("ab1", 'xyz')  = true
	 * StringUtil.containsNone("abz", 'xyz')  = false
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param invalid
	 *            要查找的字符�?
	 * 
	 * @return 如果找到，则返回<code>true</code>
	 */
	public static boolean containsNone(String str, char[] invalid) {
		if ((str == null) || (invalid == null)) {
			return true;
		}

		int strSize = str.length();
		int validSize = invalid.length;

		for (int i = 0; i < strSize; i++) {
			char ch = str.charAt(i);

			for (int j = 0; j < validSize; j++) {
				if (invalid[j] == ch) {
					return false;
				}
			}
		}

		return true;
	}

	/**
	 * �?查字符串是是否不包含指定字符集合中的字符�?
	 * 
	 * <p>
	 * 如果字符串为<code>null</code>，则返回<code>false</code>�? 如果字符集合�?<code>null</code>
	 * 则返�?<code>true</code>�? 但是空字符串永远返回<code>true</code>.
	 * </p>
	 * 
	 * <pre>
	 * StringUtil.containsNone(null, *)       = true
	 * StringUtil.containsNone(*, null)       = true
	 * StringUtil.containsNone("", *)         = true
	 * StringUtil.containsNone("ab", "")      = true
	 * StringUtil.containsNone("abab", "xyz") = true
	 * StringUtil.containsNone("ab1", "xyz")  = true
	 * StringUtil.containsNone("abz", "xyz")  = false
	 * </pre>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param invalidChars
	 *            要查找的字符�?
	 * 
	 * @return 如果找到，则返回<code>true</code>
	 */
	public static boolean containsNone(String str, String invalidChars) {
		if ((str == null) || (invalidChars == null)) {
			return true;
		}

		return containsNone(str, invalidChars.toCharArray());
	}

	/**
	 * 取得指定子串在字符串中出现的次数�?
	 * 
	 * <p>
	 * 如果字符串为<code>null</code>或空，则返回<code>0</code>�?
	 * 
	 * <pre>
	 * StringUtil.countMatches(null, *)       = 0
	 * StringUtil.countMatches("", *)         = 0
	 * StringUtil.countMatches("abba", null)  = 0
	 * StringUtil.countMatches("abba", "")    = 0
	 * StringUtil.countMatches("abba", "a")   = 2
	 * StringUtil.countMatches("abba", "ab")  = 1
	 * StringUtil.countMatches("abba", "xxx") = 0
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param str
	 *            要扫描的字符�?
	 * @param subStr
	 *            子字符串
	 * 
	 * @return 子串在字符串中出现的次数，如果字符串�?<code>null</code>或空，则返回<code>0</code>
	 */
	public static int countMatches(String str, String subStr) {
		if ((str == null) || (str.length() == 0) || (subStr == null)
				|| (subStr.length() == 0)) {
			return 0;
		}

		int count = 0;
		int index = 0;

		while ((index = str.indexOf(subStr, index)) != -1) {
			count++;
			index += subStr.length();
		}

		return count;
	}
	
	/*//added
	public static String getsub(String from, String div, int index){
		if(from==null || div == null) return null;
		StringTokenizer tokenizer = new StringTokenizer(from,div);
		
		String token = null;
		for(int i = 0; i<index; ++i){
			if(tokenizer.hasMoreTokens()){
				token = tokenizer.nextToken();
			}else{
				token = null;
				break;
			}
		}
		return token;
	}*/
	
	/**
	 * 判断�?个字符串是否是数字类�?
	 * <pre>
	 *1122.2.2:false
	 *111:true
     *111.2:true
     *111s:false
     *111.s:false
     *1s11:false
	 * </pre>
	 * @param str 要处理的字符�?
	 * @return
	 */
	public static boolean isNum(String str){
		if(str == null)
			return false;
		return str.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
	}

	public static String Decode(String str){
		if (str==null)
			return "";
		String re="";
		try{
			re=new String(str.getBytes("iso-8859-1"));
			
			return re;
		}catch(Exception e){
			logger.error(e);
			return "";
		}
		
	}
	
	/**
	 * 若str为null，则返回""�? 否则返回原字符串
	 * @return
	 */
	public static String NullToEmpty(String str) {
		if (StringUtil.isEmpty(str)) {
			return "";
		}else {
			return str;
		}
	}

	
	/**
	 * 替换指定的子串，替换�?有出现的子串�?
	 * 
	 * <p>
	 * 如果字符串为<code>null</code>则返�?<code>null</code>，如果指定子串为<code>null</code>
	 * ，则返回原字符串�?
	 * 
	 * <pre>
	 * StringUtil.replace(null, *, *)        = null
	 * StringUtil.replace("", *, *)          = ""
	 * StringUtil.replace("aba", null, null) = "aba"
	 * StringUtil.replace("aba", null, null) = "aba"
	 * StringUtil.replace("aba", "a", null)  = "aba"
	 * StringUtil.replace("aba", "a", "")    = "b"
	 * StringUtil.replace("aba", "a", "z")   = "zbz"
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param text
	 *            要扫描的字符�?
	 * @param repl
	 *            要搜索的子串
	 * @param with
	 *            替换字符�?
	 * 
	 * @return 被替换后的字符串，如果原始字符串�?<code>null</code>，则返回<code>null</code>
	 */
	public static String replace(String text, String repl, String with) {
		return replace(text, repl, with, -1);
	}

	/**
	 * 替换指定的子串，替换指定的次数�??
	 * 
	 * <p>
	 * 如果字符串为<code>null</code>则返�?<code>null</code>，如果指定子串为<code>null</code>
	 * ，则返回原字符串�?
	 * 
	 * <pre>
	 * StringUtil.replace(null, *, *, *)         = null
	 * StringUtil.replace("", *, *, *)           = ""
	 * StringUtil.replace("abaa", null, null, 1) = "abaa"
	 * StringUtil.replace("abaa", null, null, 1) = "abaa"
	 * StringUtil.replace("abaa", "a", null, 1)  = "abaa"
	 * StringUtil.replace("abaa", "a", "", 1)    = "baa"
	 * StringUtil.replace("abaa", "a", "z", 0)   = "abaa"
	 * StringUtil.replace("abaa", "a", "z", 1)   = "zbaa"
	 * StringUtil.replace("abaa", "a", "z", 2)   = "zbza"
	 * StringUtil.replace("abaa", "a", "z", -1)  = "zbzz"
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param text
	 *            要扫描的字符�?
	 * @param repl
	 *            要搜索的子串
	 * @param with
	 *            替换字符�?
	 * @param max
	 *            maximum number of values to replace, or <code>-1</code> if no
	 *            maximum
	 * 
	 * @return 被替换后的字符串，如果原始字符串�?<code>null</code>，则返回<code>null</code>
	 */
	public static String replace(String text, String repl, String with, int max) {
		if ((text == null) || (repl == null) || (with == null)
				|| (repl.length() == 0) || (max == 0)) {
			return text;
		}

		StringBuffer buf = new StringBuffer(text.length());
		int start = 0;
		int end = 0;

		while ((end = text.indexOf(repl, start)) != -1) {
			buf.append(text.substring(start, end)).append(with);
			start = end + repl.length();

			if (--max == 0) {
				break;
			}
		}

		buf.append(text.substring(start));
		return buf.toString();
	}
	
	public static String delLastComma(String str) {
		if (isEmpty(str)) {
			return str;
		}
		
		if (lastIndexOf(str, "�?") == str.length() - 1) {
			str = str.substring(0, str.length() - 1);
		}
		
		return str;
	}
	
	public static String addLastComma(String str) {
		if (isEmpty(str)) {
			return str + "�?";
		}
		
		if (lastIndexOf(str, "�?") != str.length() - 1) {
			str += "�?";
		}
		
		return str;
	}
	
	public static boolean isNumberic(String str){
		for(int i=str.length();--i>=0;){
			if(!Character.isDigit(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
/*	public static int compareTo(String v1, String v2) {
		if (StringUtil.isBlank(v1)) {
    		v1 = "";
    	}
    	if (StringUtil.isBlank(v2)) {
    		v2 = "";
    	}
    	
    	if (v1.equals(v2)) {
    		return 0;
    	}
    	
    	return v1.compareTo(v2) > 0 ? 1 : -1;
	}*/
	public static int compareTo(String v1, String v2) {
		boolean v1_isnum=false;
    	boolean v2_isnum=false;
    	long v1_long;
		long v2_long;
		//对字符串做第�?位的处理
		String v1_first;
		String v1_other;
		String v2_first;
		String v2_other;
		if (StringUtil.isBlank(v1)) {
    		v1 = "";
    		v1_long=0;
    		v1_isnum=true;
    	}else{
    		//先判断第�?位是不是负号，如果是就可以进行接下来的的判断，如果不是，就直接判断是不是数字字符�?
    		v1_first=v1.substring(0, 1);
    		
    		if(v1_first.equals("-")){//负号�?�?
    			v1_other=v1.substring(1);
    			if(isNumberic(v1_other)){
        			v1_isnum=true;
        			v1_long=-Long.parseLong(v1_other);
        		}else{
        			v1_long=1;
        		}
    		}else{//如果不是负号�?始，那就可以直接判断是不是数字字符串�?
    			if(isNumberic(v1)){
        			v1_isnum=true;
        			v1_long=Long.parseLong(v1);
        		}else{
        			v1_long=1;
        		}
    		}
    		
    		
    	}
    	if (StringUtil.isBlank(v2)) {
    		v2 = "";
    		v2_isnum=true;
    		v2_long=0;
    	}else{
    		v2_first=v2.substring(0, 1);
    		if(v2_first.equals("-")){//负号�?�?
    			v2_other=v2.substring(1);
    			if(isNumberic(v2_other)){
        			v2_isnum=true;
        			v2_long=-Long.parseLong(v2_other);
        		}else{
        			v2_long=2;
        		}
    		}else{//如果不是负号�?始，那就可以直接判断是不是数字字符串�?
    			if(isNumberic(v2)){
        			v2_isnum=true;
        			v2_long=Long.parseLong(v2);
        		}else{
        			v2_long=2;
        		}
    		}
    	}
    	
    	
    	if(v1_isnum&&v2_isnum){
    		if (v1_long==v2_long) {
				return 0;
			}
    		return (v1_long-v2_long) > 0 ? 1 : -1;
    	}else{
    		if (v1.equals(v2)) {
        		return 0;
        	}
    		return v1.compareTo(v2) > 0 ? 1 : -1;
    	}
    	
	}

}
