package com.sist.exam01;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class WordCountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String data;
		
		System.out.print("문장을 입력하세요.==>");
		data = sc.nextLine();  
		System.out.println(data);
		 
		StringTokenizer st = new StringTokenizer(data); //입력문장을 공백문자로 분리
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		//map을 사용해서 key값에 단어, value값에 중복값 수를 저장
		
		
		while(st.hasMoreTokens()) {    	   //분리한 단어만큼 반복 실행
			String word = st.nextToken();  // 분리한 단어를 하나씩 가져온다
			Integer cnt = map.get(word);   //map으로 그 단어의 빈도수를 꺼내온다.
			if(cnt == null) {			   //만약 그 단어가 map에 없다면
			map.put(word, 1);              //빈도수를 1로 설정해서 map에 추가
			}else {						   //그렇지않다면(이미 그 단어가 map에 있다면)
				map.put(word, cnt+1);      //그 빈도수에 + 1한 값으로 다시 설정
			}
		}
		System.out.println(map);
		
		//map에 있는 자료만큼 반복수행하기 위해 map의 모든 키 목록을 읽어온다.
		//map에 있는 모든 key목록을 set으로 반환합니다.
		Set<String> keyList = map.keySet();
		
		//set자체에는 반복수행하기 위한 기능이 없다.
		//set의 자료를 하나씩 끄집어 내기 위해 Iterator로 만들어야한다
		Iterator<String> iter = keyList.iterator();
		
		
		//단어별 빈도수가 담겨 있는 map의 key목록을 담고 있는
		// iterator의 데이터가 있는 만큼 반복 실행
		while(iter.hasNext()) {		
			String word = iter.next(); 
			//이터레이터로부터 데이터를 꺼내오면 단어이다. 그 단어는 map의 key이다.
			int cnt = map.get(word);
			//map으로부터 그 단어(key)의 빈도수(value)를 꺼내온다.
			System.out.printf("%20s ----> %d\n",word,cnt);
		}
	}
}
