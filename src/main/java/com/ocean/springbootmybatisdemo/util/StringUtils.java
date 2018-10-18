package com.ocean.springbootmybatisdemo.util;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/18 13:28
 */
public class StringUtils {

    /**
     * 检测字符串是否不为空(null,"","null")
     *
     * @param s
     * @return 不为空则返回true，否则返回false
     */
    public static boolean notEmpty(String s) {
        return s != null && !"".equals(s) && !"null".equals(s);
    }

    /**
     * 检测字符串是否为空(null,"","null")
     *
     * @param s
     * @return 为空则返回true，不否则返回false
     */
    public static boolean isEmpty(String s) {
        return s == null || "".equals(s) || "null".equals(s);
    }

    /**
     * 检查字符串是否是空白：<code>null</code>、空字符串<code>""</code>或只有空白字符。
     *
     * <pre>
     * StringUtil.isBlank(null)      = true
     * StringUtil.isBlank(&quot;&quot;)        = true
     * StringUtil.isBlank(&quot; &quot;)       = true
     * StringUtil.isBlank(&quot;bob&quot;)     = false
     * StringUtil.isBlank(&quot;  bob  &quot;) = false
     * </pre>
     *
     * @param str
     *            要检查的字符串
     *
     * @return 如果为空白, 则返回<code>true</code>
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
     * 判断字符串是否只包含unicode数字。
     *
     * <p>
     * <code>null</code>将返回<code>false</code>，空字符串<code>""</code>将返回
     * <code>true</code>。
     * </p>
     *
     * <pre>
     * StringUtil.isNumeric(null)   = false
     * StringUtil.isNumeric(&quot;&quot;)     = true
     * StringUtil.isNumeric(&quot;  &quot;)   = false
     * StringUtil.isNumeric(&quot;123&quot;)  = true
     * StringUtil.isNumeric(&quot;12 3&quot;) = false
     * StringUtil.isNumeric(&quot;ab2c&quot;) = false
     * StringUtil.isNumeric(&quot;12-3&quot;) = false
     * StringUtil.isNumeric(&quot;12.3&quot;) = false
     * </pre>
     *
     * @param str
     *            要检查的字符串
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
}
