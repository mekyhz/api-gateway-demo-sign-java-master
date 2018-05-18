package org.logink.cloud.api.gateway.demo.main;

import org.logink.cloud.api.gateway.demo.util.PostUtil;

/**
* logink cloud gateway api demo 
* github path:https://github.com/huojuntao/api-gateway-demo-sign-java-master
*/
public class MessageSendVerificationCodeDemo {
	public static void main(String[] args) {
		String appkey = "您的appkey";
		String appsecret = "您的appsecret";
		String url = "https://gateway.logink.org/message/sms/sendVerificationCode";
		//请求的body,json格式
		String body = "{\"mobiles\":\"******\","   //手机号码
	    		+ "\"content\":\"******\"}";    //短信内容
		try {
			PostUtil.postString(url, body, appkey, appsecret);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

