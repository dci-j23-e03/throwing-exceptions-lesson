package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

  public static void main(String[] args) throws InvalidBirthdayException {
    // throwing exception is done like this
    // if we have exception in main without handling (catch), then application will fail
//    throw new OurCustumException("This is an exception in main method, which will close the application");

    SimpleDateFormat formatter = new SimpleDateFormat();

    try {
      Date birthday = formatter.parse("2024 04 15");
      System.out.println(birthday);
    } catch (ParseException e) {
//      System.out.println("Stack trace: " + e.getStackTrace()[0].toString());
      InvalidBirthdayException ourException = new InvalidBirthdayException("The birthday is invalid", e);
      throw ourException;
    }
  }
}