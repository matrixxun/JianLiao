package com.zoulf.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 时间工具类
 *
 * @author Zoulf.
 */
public class DateTimeUtil {

  private static final SimpleDateFormat FORMAT = new SimpleDateFormat("yy-MM-dd", Locale.ENGLISH);

  /**
   * 获取一个简单的时间字符串
   *
   * @param date Date
   * @return 时间字符串
   */
  public static String getSimpleDate(Date date) {
    return FORMAT.format(date);
  }

}
