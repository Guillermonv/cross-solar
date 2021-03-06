package com.crossover.techtrial.dto;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.stereotype.Component;

/**
 * DailyElectricity class will hold sum, average,minimum and maximum electricity for a given day.
 * @author Crossover
 *
 */
@Component
public class DailyElectricity implements Serializable {
  
  private static final long serialVersionUID = 3605549122072628877L;

  private Date date;
  
  private Long sum;
  
  private Double average;
  
  private Long min;
  
  private Long max;

  public DailyElectricity() {
  }

  public DailyElectricity(Date date, Long sum, Double average, Long min, Long max) {
    this.date = date;
    this.sum = sum;
    this.average = average;
    this.min = min;
    this.max = max;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Long getSum() {
    return sum;
  }

  public void setSum(Long sum) {
    this.sum = sum;
  }

  public Double getAverage() {
    return average;
  }

  public void setAverage(Double average) {
    this.average = average;
  }

  public Long getMin() {
    return min;
  }

  public void setMin(Long min) {
    this.min = min;
  }

  public Long getMax() {
    return max;
  }

  public void setMax(Long max) {
    this.max = max;
  }

  @Override
  public String toString() {
    return "DailyElectricity [date=" + date + ", sum=" + sum + ", average="
        + average + ", min=" + min + ", max=" + max + "]";
  }

}
