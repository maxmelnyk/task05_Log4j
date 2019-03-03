package com.melnyk.logging;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class ExampleSMS {

  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACb44800caadc9fb5741cf39392d4263d9";
  public static final String AUTH_TOKEN = "9e87e399f38f73add568a1cbac6a6f41";

  public static void send(String str) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    Message message = Message
        .creator(new PhoneNumber("+380000000000"), /*my phone number*/
            new PhoneNumber("+12489651668"), str)
        .create(); /*attached to me number*/
  }
}
