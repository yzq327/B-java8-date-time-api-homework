package com.thoughtworks.capability.gtb;

import jdk.vm.ci.meta.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    LocalDate festival = LocalDate.of(2020,5,1);
    if(date.isAfter(festival)) {
      LocalDate nextFestival = festival.plusYears(1);
      long result = nextFestival.toEpochDay() - date.toEpochDay();
      return result;
    }
    long result = festival.toEpochDay() - date.toEpochDay();

    return result;
  }
}
