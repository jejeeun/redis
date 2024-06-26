package com.example.redis.fetcher;

import org.springframework.stereotype.Component;

import com.example.redis.service.AuthService;

@Component
public class AuthDataFetcher implements DataFetcher{
	
	private final AuthService authService;
	
	public AuthDataFetcher(AuthService authService) {
		System.out.println("AuthDataFetcher 객체를 생성합니다.");
		this.authService = authService;
	}

	@Override
	public String fetchData(String group, String key) {
		// TODO Auto-generated method stub

		System.out.println("AuthDataFetcher 에서 DB로부터 데이터를 가져옵니다.");
		//String data = authService.getClientInfo();
		return "DBDATA";
	}

	@Override
	public String fetchData(String group, String key, String searchKey) {
		// TODO Auto-generated method stub
		System.out.println("AuthDataFetcher 에서 데이터를 가져옵니다.");
		//String data = authService.getClientInfo();
		return "";
	}

	@Override
	public void saveData(String group, String key, String value) {
		// TODO Auto-generated method stub
		System.out.println("AuthDataFetcher 에서 DB에 데이터를 저장합니다.");
		
	}
}
