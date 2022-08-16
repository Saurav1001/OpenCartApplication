package com.qa.opencart.constant;

import java.util.Arrays;
import java.util.List;

public class AppConstant {
	
	public static final int SMALL_TIMEOUT=5;
	public static final int MEDIUM_TIMEOUT=10;
	public static final int LONG_TIMEOUT=20;
	
	public static final String LOGIN_TITLE="Account Login";
	public static final String LOGIN_URL_FRACTION="route=account/login";
	public static final String HOME_TITLE="My Account";
	
	public static final List<String> ACC_PAGE_HEADERS_LIST= 
			Arrays.asList("My Account", "My Orders","My Affiliate Account", "Newsletter");

}
