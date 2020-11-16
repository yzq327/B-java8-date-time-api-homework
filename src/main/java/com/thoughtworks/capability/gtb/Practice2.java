package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

  public static LocalDate getNextWorkDate(LocalDate date) {
    int number = date.getDayOfWeek().getValue();
    if( number >=1 && number <=4) {
      LocalDate newWorkday = date.plusDays(1);
      return newWorkday;
    }
    LocalDate newWorkday = date.plusDays(8-number);
    return newWorkday;
  }
}
