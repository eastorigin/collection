package com.ktdsuniversity.edu.collection.list.vocabulary;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Vocabulary vocabulary = new Vocabulary();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("핵심 영어 단어장");
		
		int number = 0;
		String english = "";
		String korean = "";
		
		while (true) {
			try {
				System.out.println("원하는 기능은 숫자를 입력하시오");
				System.out.println("1. 단어 등록");
				System.out.println("2. 단어 조회");
				System.out.println("3. 단어 수정");
				System.out.println("4. 단어 삭제");
				System.out.println("5. 종료");
				
				number = scanner.nextInt();
				scanner.nextLine();
				
				if (number == 1) {
					System.out.println("등록하고 싶은 영단어를 입력하시오.");
					english = scanner.nextLine();
					System.out.println("해당 영단어의 뜻을 입력하시오.");
					korean = scanner.nextLine();
					vocabulary.addWord(english, korean);
				}else if (number == 2) {
					System.out.println("찾고 싶은 영단어를 입력하시오");
					english = scanner.nextLine();
					
					korean = vocabulary.getWord(english);
					if (korean != null) {
						System.out.println(english + ": " + korean);
					}
				}else if (number == 3) {
					System.out.println("수정하고 싶은 영단어를 입력하시오");
					english = scanner.nextLine();
					System.out.println("새로운 뜻을 입력하시오");
					korean = scanner.nextLine();
					vocabulary.editWord(english, korean);
				}else if (number == 4) {
					System.out.println("삭제하고 싶은 영단어를 입력하시오.");
					english = scanner.nextLine();
					vocabulary.deleteWord(english);
				}else if (number == 5) {
					System.out.println("단어장 종료");
					System.exit(0);
				}else {
					throw new InvalidInputException("1 ~ 5 중 원하는 숫자를 정확하게 입력하시오");
				}
			} catch (InputMismatchException ime) {
				System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
				scanner.nextLine();
			} catch (InvalidInputException iie) {
				System.out.println(iie.getMessage());
			}
		}
	}
}
