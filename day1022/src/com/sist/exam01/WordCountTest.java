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
		
		System.out.print("������ �Է��ϼ���.==>");
		data = sc.nextLine();  
		System.out.println(data);
		 
		StringTokenizer st = new StringTokenizer(data); //�Է¹����� ���鹮�ڷ� �и�
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		//map�� ����ؼ� key���� �ܾ�, value���� �ߺ��� ���� ����
		
		
		while(st.hasMoreTokens()) {    	   //�и��� �ܾŭ �ݺ� ����
			String word = st.nextToken();  // �и��� �ܾ �ϳ��� �����´�
			Integer cnt = map.get(word);   //map���� �� �ܾ��� �󵵼��� �����´�.
			if(cnt == null) {			   //���� �� �ܾ map�� ���ٸ�
			map.put(word, 1);              //�󵵼��� 1�� �����ؼ� map�� �߰�
			}else {						   //�׷����ʴٸ�(�̹� �� �ܾ map�� �ִٸ�)
				map.put(word, cnt+1);      //�� �󵵼��� + 1�� ������ �ٽ� ����
			}
		}
		System.out.println(map);
		
		//map�� �ִ� �ڷḸŭ �ݺ������ϱ� ���� map�� ��� Ű ����� �о�´�.
		//map�� �ִ� ��� key����� set���� ��ȯ�մϴ�.
		Set<String> keyList = map.keySet();
		
		//set��ü���� �ݺ������ϱ� ���� ����� ����.
		//set�� �ڷḦ �ϳ��� ������ ���� ���� Iterator�� �������Ѵ�
		Iterator<String> iter = keyList.iterator();
		
		
		//�ܾ �󵵼��� ��� �ִ� map�� key����� ��� �ִ�
		// iterator�� �����Ͱ� �ִ� ��ŭ �ݺ� ����
		while(iter.hasNext()) {		
			String word = iter.next(); 
			//���ͷ����ͷκ��� �����͸� �������� �ܾ��̴�. �� �ܾ�� map�� key�̴�.
			int cnt = map.get(word);
			//map���κ��� �� �ܾ�(key)�� �󵵼�(value)�� �����´�.
			System.out.printf("%20s ----> %d\n",word,cnt);
		}
	}
}
